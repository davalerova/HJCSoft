package controlador;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.DbConnection;
import vista.Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Principal implements Initializable {
    Stage principal;
    Vistas vista = new Vistas();

    public Stage getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stage principal) {
        this.principal = principal;
    }

    @FXML
    private ComboBox<Rol> cmbRol;
    private ObservableList<Rol> listaRoles;

    @FXML private DatePicker dtpFechaIngresoEmpleado;
    @FXML private TextField tfNacionalidadEmpleado;
    @FXML private RadioButton rbEmpleadoEsUsuarioDelSistema;
    @FXML private RadioButton rbEmpleadoNoEsUsuarioDelSistema;
    @FXML private TextField tfNumeroDocumentoEmpleado;
    @FXML private TextField tfLugarExpedicionDocumentoEmpleado;
    @FXML private DatePicker dtpFechaExpedicionDocumentoEmpleado;
    @FXML private TextField tfLugarNacimientoEmpleado;
    @FXML private DatePicker dtpFechaNacimientoEmpleado;
    @FXML private TextField tfNombresEmpleado;
    @FXML private TextField tfApellidosEmpleado;
    @FXML private TextField tfCorreoEmpleado;
    @FXML private TextField tfCodigoPostalEmpleado;
    @FXML private TextField tfTelefonoFijoEmpleado;
    @FXML private TextField tfTelefonoCelularEmpleado;
    @FXML private TextField tfTelefonoAlternativoEmpleado;
    @FXML private TextField tfDireccionEmpleado;
    @FXML private TextField tfDepartamentoEmpleado;
    @FXML private TextField tfUpzEmpleado;
    @FXML private TextField tfMunicipioEmpleado;
    @FXML private TextField tfLocalidadEmpleado;
    @FXML private TextField tfNombrePersonaContactoEmpleado;
    @FXML private TextField tfNombreTelefonoPersonaContactoEmpleado;
    @FXML private TextField tfSueldoBaseEmpleado;


    @FXML private Button btnAdministrarGuardar;
    @FXML private Button btnAdministrarActualizar;
    @FXML private Button btnAdministrarEliminar;
    @FXML private Button btnAdministrarNuevo;
    @FXML private Button btnAdministrarBuscar;





    @FXML
    private ComboBox<TipoDocumentoIdentidad> cmbTipoDocumentoIdentidad;
    private ObservableList<TipoDocumentoIdentidad> listaTipoDocumentoIdentidad;

    @FXML
    private ComboBox<TipoSalario> cmbTipoContrato;
    private ObservableList<TipoSalario> listaTipoContrato;

    @FXML
    private ComboBox<Empleado> cmbusuarioempleado;
    private ObservableList<Empleado> listaEmpleados;

    @FXML
    private TableView tblvempleado;
    private ObservableList<Empleado> listaInformacionEmpleados;
    @FXML private TableColumn<Empleado, Integer> clmnIdEmpleado;
    @FXML private TableColumn<Empleado, String> clmnNombreEmpleado;
    @FXML private TableColumn<Empleado, String> clmnApellidosEmpleado;
    @FXML private TableColumn<Empleado, Rol> clmnRolEmpleado;
    @FXML private TableColumn<Empleado, TipoSalario> clmnTipoSalarioEmpleado;
    @FXML private TableColumn<Empleado, String> clmnCorreoEmpleado;

    @FXML
    public void salir(ActionEvent e){
        getPrincipal().close();
    }

    @FXML
    public void cerrarSesion(ActionEvent evt){
        getPrincipal().hide();
        Stage login = new Stage();
        FXMLLoader loginn=vista.vista("Login");
        Login log = new Login();
        loginn.setController(log);

        try{
            Parent root = (Parent)loginn.load();
            Scene escena=new Scene(root);
            login.setScene(escena);
            login.setTitle("HJCSoft");
            log.setLogin(login);
            login.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private DbConnection conexion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        conexion = new DbConnection();
        conexion.getConnection();
        listaRoles = FXCollections.observableArrayList();
        Rol.llenarInformacion(conexion.getConnection(), listaRoles);
        cmbRol.setItems(listaRoles);

        listaTipoDocumentoIdentidad = FXCollections.observableArrayList();
        TipoDocumentoIdentidad.llenarInformacion(conexion.getConnection(), listaTipoDocumentoIdentidad);
        cmbTipoDocumentoIdentidad.setItems(listaTipoDocumentoIdentidad);

        listaTipoContrato = FXCollections.observableArrayList();
        TipoSalario.llenarInformacion(conexion.getConnection(), listaTipoContrato);
        cmbTipoContrato.setItems(listaTipoContrato);

        listaEmpleados = FXCollections.observableArrayList();
        Empleado.listarEmpleados(conexion.getConnection(), listaEmpleados);
        cmbusuarioempleado.setItems(listaEmpleados);

        listaInformacionEmpleados = FXCollections.observableArrayList();
        Empleado.llenarInformacionEmpleados(conexion.getConnection(), listaInformacionEmpleados);
        tblvempleado.setItems(listaInformacionEmpleados);

        clmnIdEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,Integer>("idEmpleado"));
        clmnNombreEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("nombresEmpleado"));
        clmnApellidosEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("apellidosEmpleado"));
        clmnRolEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,Rol>("rolIdEmpleado"));
        clmnTipoSalarioEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,TipoSalario>("tipoSalarioEmpleado"));
        clmnCorreoEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("emailEmpleado"));
        gestionarEventos();

        conexion.desconectar();
        //listaRoles.add(new Rol(1,"Admin"));
    }

    public void gestionarEventos(){
        tblvempleado.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Empleado>() {
                    @Override
                    public void changed(ObservableValue<? extends Empleado> observable, Empleado valorAnterior, Empleado valorSeleccionado) {
                        cmbRol.setValue(valorSeleccionado.getRolIdEmpleado());
                        dtpFechaIngresoEmpleado.setValue(valorSeleccionado.getFechaIngresoEmpleado().toLocalDate());
                        tfNacionalidadEmpleado.setText(valorSeleccionado.getNacionalidadEmpleado());
                        if(valorSeleccionado.getEmpleadoEsUsuarioSistema()){
                            rbEmpleadoEsUsuarioDelSistema.setSelected(true);
                            rbEmpleadoNoEsUsuarioDelSistema.setSelected(false);
                        }else{

                            rbEmpleadoEsUsuarioDelSistema.setSelected(false);
                            rbEmpleadoNoEsUsuarioDelSistema.setSelected(true);
                        }
                        cmbTipoDocumentoIdentidad.setValue(valorSeleccionado.getTipoDocumentoIdEmpleado());
                        tfNumeroDocumentoEmpleado.setText(valorSeleccionado.getNumeroDocumentoIdentidadEmpleado());
                        tfLugarExpedicionDocumentoEmpleado.setText(valorSeleccionado.getLugarExpediciónDocumentoIdentiadEmpleado());
                        dtpFechaExpedicionDocumentoEmpleado.setValue(valorSeleccionado.getFechaExpedicionDocumentoIdentiadEmpleado().toLocalDate());
                        tfLugarNacimientoEmpleado.setText(valorSeleccionado.getLugarNacimientoEmpleado());
                        dtpFechaNacimientoEmpleado.setValue(valorSeleccionado.getFechaNacimientoEmpleado().toLocalDate());
                        tfNombresEmpleado.setText(valorSeleccionado.getNombresEmpleado());
                        tfApellidosEmpleado.setText(valorSeleccionado.getApellidosEmpleado());
                        tfCorreoEmpleado.setText(valorSeleccionado.getEmailEmpleado());
                        tfCodigoPostalEmpleado.setText(valorSeleccionado.getCodigoPostalEmpleado());
                        tfTelefonoFijoEmpleado.setText(valorSeleccionado.getTelefonoEmpleado());
                        tfTelefonoCelularEmpleado.setText(valorSeleccionado.getCelularEmpleado());
                        tfTelefonoAlternativoEmpleado.setText(valorSeleccionado.getTelefonoAlternativoEmpleado());
                        tfDireccionEmpleado.setText(valorSeleccionado.getDireccionEmpleado());
                        tfDepartamentoEmpleado.setText(valorSeleccionado.getDepartamentoEmpleado());
                        tfUpzEmpleado.setText(valorSeleccionado.getUpzEmpleado());
                        tfMunicipioEmpleado.setText(valorSeleccionado.getMunicipioEmpleado());
                        tfLocalidadEmpleado.setText(valorSeleccionado.getLocalidadEmpleado());
                        tfNombrePersonaContactoEmpleado.setText(valorSeleccionado.getNombrePersonaContactoEmpleado());
                        tfNombreTelefonoPersonaContactoEmpleado.setText(valorSeleccionado.getCelualarPersonaContactoEmpleado());
                        cmbTipoContrato.setValue(valorSeleccionado.getTipoSalarioEmpleado());
                        tfSueldoBaseEmpleado.setText(String.valueOf(valorSeleccionado.getSueldoBaseEmpleado()));
                        btnAdministrarGuardar.setDisable(true);
                        btnAdministrarActualizar.setDisable(false);
                        btnAdministrarEliminar.setDisable(false);
                    }

            }
        );
    }

    @FXML
    public void limpiarInformacionEmpleado(){
        cmbRol.setValue(null);
        dtpFechaIngresoEmpleado.setValue(null);
        tfNacionalidadEmpleado.setText(null);
        rbEmpleadoEsUsuarioDelSistema.setSelected(false);
        rbEmpleadoNoEsUsuarioDelSistema.setSelected(false);
        cmbTipoDocumentoIdentidad.setValue(null);
        tfNumeroDocumentoEmpleado.setText(null);
        tfLugarExpedicionDocumentoEmpleado.setText(null);
        dtpFechaExpedicionDocumentoEmpleado.setValue(null);
        tfLugarNacimientoEmpleado.setText(null);
        dtpFechaNacimientoEmpleado.setValue(null);
        tfNombresEmpleado.setText(null);
        tfApellidosEmpleado.setText(null);
        tfCorreoEmpleado.setText(null);
        tfCodigoPostalEmpleado.setText(null);
        tfTelefonoFijoEmpleado.setText(null);
        tfTelefonoCelularEmpleado.setText(null);
        tfTelefonoAlternativoEmpleado.setText(null);
        tfDireccionEmpleado.setText(null);
        tfDepartamentoEmpleado.setText(null);
        tfUpzEmpleado.setText(null);
        tfMunicipioEmpleado.setText(null);
        tfLocalidadEmpleado.setText(null);
        tfNombrePersonaContactoEmpleado.setText(null);
        tfNombreTelefonoPersonaContactoEmpleado.setText(null);
        cmbTipoContrato.setValue(null);
        tfSueldoBaseEmpleado.setText(null);
        btnAdministrarGuardar.setDisable(false);
        btnAdministrarActualizar.setDisable(true);
        btnAdministrarEliminar.setDisable(true);
    }
}
