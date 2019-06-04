package controlador;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.DbConnection;
import modelo.ProcesoInformacionCliente;
import modelo.ProcesoInformacionEmpleado;
import modelo.ProcesoInformacionUsuario;
import sun.plugin2.main.client.DisconnectedExecutionContext;
import vista.Vistas;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class Principal implements Initializable {
    ProcesoInformacionUsuario procesoUsuario;

    Stage principal;
    Vistas vista = new Vistas();

    public static String nombreUsuarioSesion;

    public Stage getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stage principal) {
        this.principal = principal;
    }

    public boolean areaActivaEmpleado = false;
    public boolean areaActivaUsuario = false;

    @FXML
    private Text txtUsuario;

    @FXML
    private Label lbRol;

    @FXML
    private Label lbCsa;

    @FXML
    private ComboBox<Rol> cmbRol;
    private ObservableList<Rol> listaRoles;

    @FXML
    private DatePicker dtpFechaIngresoEmpleado;
    @FXML
    private TextField tfNacionalidadEmpleado;
    @FXML
    private RadioButton rbEmpleadoEsUsuarioDelSistema;
    @FXML
    private RadioButton rbEmpleadoNoEsUsuarioDelSistema;
    @FXML
    private TextField tfNumeroDocumentoEmpleado;
    @FXML
    private TextField tfLugarExpedicionDocumentoEmpleado;
    @FXML
    private DatePicker dtpFechaExpedicionDocumentoEmpleado;
    @FXML
    private TextField tfLugarNacimientoEmpleado;
    @FXML
    private DatePicker dtpFechaNacimientoEmpleado;
    @FXML
    private TextField tfNombresEmpleado;
    @FXML
    private TextField tfApellidosEmpleado;
    @FXML
    private TextField tfCorreoEmpleado;
    @FXML
    private TextField tfCodigoPostalEmpleado;
    @FXML
    private TextField tfTelefonoFijoEmpleado;
    @FXML
    private TextField tfTelefonoCelularEmpleado;
    @FXML
    private TextField tfTelefonoAlternativoEmpleado;
    @FXML
    private TextField tfDireccionEmpleado;
    @FXML
    private TextField tfDepartamentoEmpleado;
    @FXML
    private TextField tfUpzEmpleado;
    @FXML
    private TextField tfMunicipioEmpleado;
    @FXML
    private TextField tfLocalidadEmpleado;
    @FXML
    private TextField tfNombrePersonaContactoEmpleado;
    @FXML
    private TextField tfNombreTelefonoPersonaContactoEmpleado;
    @FXML
    private TextField tfSueldoBaseEmpleado;


    @FXML
    private Button btnAdministrarGuardar;
    @FXML
    private Button btnAdministrarActualizar;
    @FXML
    private Button btnAdministrarEliminar;
    @FXML
    private Button btnAdministrarNuevo;
    @FXML
    private Button btnAdministrarBuscar;


    @FXML
    private RadioButton rbConfirmaInformacionEmpleado;
    @FXML
    private RadioButton rbConfirmaInformacionUsuario;
    @FXML
    private RadioButton rbUsuarioInactivo;


    @FXML
    private ComboBox<TipoDocumentoIdentidad> cmbTipoDocumentoIdentidad;
    private ObservableList<TipoDocumentoIdentidad> listaTipoDocumentoIdentidad;

    @FXML
    private ComboBox<TipoSalario> cmbTipoContrato;
    private ObservableList<TipoSalario> listaTipoContrato;




    @FXML
    private TextField tfIdUsuario;

    @FXML
    private ComboBox<Empleado> cmbUsuarioEmpleado;
    private ObservableList<Empleado> listaEmpleados;



    @FXML
    private TextField tfNombreUsuarioUsuario;

    @FXML
    private PasswordField pfClaveUsuario;

    @FXML
    private RadioButton rbUsuarioActivo;





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
    private TableView tblvUsuario;
    private ObservableList<Usuario> listaInformacionUsuarios;
    @FXML private TableColumn<Usuario, Integer> clmnIdUsuario;
    @FXML private TableColumn<Usuario, String> clmnNombreUsuario;
    @FXML private TableColumn<Usuario, Boolean> clmnEsUsuarioActivo;
    @FXML private TableColumn<Usuario, Rol> clmnNumeroIngresosUsuario;
    @FXML private TableColumn<Usuario, TipoSalario> clmnFechaUltimoIngresoUsuario;
    @FXML private TableColumn<Usuario, String> clmnHoraUltimoIngresoUsuario;

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
        procesoUsuario = new ProcesoInformacionUsuario();
        ProcesoInformacionEmpleado procesoEmpleado = new ProcesoInformacionEmpleado();
        txtUsuario.setText(nombreUsuarioSesion);
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
        cmbUsuarioEmpleado.setItems(listaEmpleados);



        listaInformacionEmpleados = FXCollections.observableArrayList();
        Empleado.llenarInformacionEmpleados(conexion.getConnection(), listaInformacionEmpleados);
        tblvempleado.setItems(listaInformacionEmpleados);

        listaInformacionUsuarios = FXCollections.observableArrayList();
        Usuario.llenarInformacionUsuario(conexion.getConnection(), listaInformacionUsuarios);
        tblvUsuario.setItems(listaInformacionUsuarios);

        clmnIdEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,Integer>("idEmpleado"));
        clmnNombreEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("nombresEmpleado"));
        clmnApellidosEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("apellidosEmpleado"));
        clmnRolEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,Rol>("rolIdEmpleado"));
        clmnTipoSalarioEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,TipoSalario>("tipoSalarioEmpleado"));
        clmnCorreoEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado,String>("emailEmpleado"));

        clmnIdUsuario.setCellValueFactory(new PropertyValueFactory<Usuario,Integer>("idUsuario"));
        clmnNombreUsuario.setCellValueFactory(new PropertyValueFactory<Usuario, String>("nombreUsuario"));
        clmnEsUsuarioActivo.setCellValueFactory(new PropertyValueFactory<Usuario,Boolean>("esActivoUsuario"));

        gestionarEventos();

        conexion.desconectar();
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
                        btnAdministrarNuevo.setDisable(false);
                    }
                }
        );
        tblvUsuario.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Usuario>() {
                    @Override
                    public void changed(ObservableValue<? extends Usuario> observable, Usuario valorAnterior, Usuario valorSeleccionado) {
                        if(valorSeleccionado!=null){
                            tfIdUsuario.setText(String.valueOf(valorSeleccionado.getIdUsuario()));
                            cmbUsuarioEmpleado.setValue(valorSeleccionado.getIdEmpleadoUsuario());
                            tfNombreUsuarioUsuario.setText(valorSeleccionado.getNombreUsuario());
                            if(valorSeleccionado.getEsActivoUsuario()){
                                rbUsuarioActivo.setSelected(true);
                                rbUsuarioInactivo.setSelected(false);
                            }
                            else {
                                rbUsuarioActivo.setSelected(false);
                                rbUsuarioInactivo.setSelected(true);
                            }

                            btnAdministrarGuardar.setDisable(true);
                            btnAdministrarActualizar.setDisable(false);
                            btnAdministrarEliminar.setDisable(false);
                            btnAdministrarNuevo.setDisable(false);
                            tfIdUsuario.setDisable(false);
                            tfIdUsuario.cancelEdit();
                            pfClaveUsuario.setText(null);
                        }

                    }
                }
        );
    }

    @FXML
    public void limpiarInformacionFormularioAdministrar(){
        if (areaActivaEmpleado){
            limpiarInformacionEmpleado();
            rbConfirmaInformacionEmpleado.setSelected(false);
        }
        else if (areaActivaUsuario){
            limpiarInformacionUsuario();
            rbConfirmaInformacionUsuario.setSelected(false);
            tfIdUsuario.setDisable(true);
        }
    }

    @FXML
    void limpiarInformacionUsuario(){
        tfIdUsuario.setText(null);
        cmbUsuarioEmpleado.setValue(null);
        tfNombreUsuarioUsuario.setText(null);
        pfClaveUsuario.setText(null);
        rbUsuarioActivo.setSelected(false);
        rbUsuarioInactivo.setSelected(false);
        btnAdministrarGuardar.setDisable(false);
        btnAdministrarActualizar.setDisable(true);
        btnAdministrarEliminar.setDisable(true);
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



    @FXML
    public void accionBotonAdministrarGuardar(){
        if (areaActivaEmpleado&&rbConfirmaInformacionEmpleado.isSelected()){
            guardarEmpleado();
            rbConfirmaInformacionEmpleado.setSelected(false);
        }
        else if (areaActivaUsuario&&rbConfirmaInformacionUsuario.isSelected()){
            guardarUsuario();
            rbConfirmaInformacionUsuario.setSelected(false);
        }

    }

    @FXML
    public void accionBotonAdministrarActualizar(){
        if (areaActivaEmpleado&&rbConfirmaInformacionEmpleado.isSelected()){
            actualizarEmpleado();
            rbConfirmaInformacionEmpleado.setSelected(false);
        }
        else if (areaActivaUsuario&&rbConfirmaInformacionUsuario.isSelected()){
            actualizarUsuario();
            rbConfirmaInformacionUsuario.setSelected(false);
        }

    }

    private void actualizarUsuario() {
        Usuario u = new Usuario(
                Integer.parseInt(tfIdUsuario.getText()),
                cmbUsuarioEmpleado.getValue(),
                tfNombreUsuarioUsuario.getText(),
                pfClaveUsuario.getText(),
                rbUsuarioActivo.isSelected()
        );
        int resultado = procesoUsuario.actualizarDatosUsuario(u);
        if(resultado==1){
            //listaInformacionUsuarios.set(tblvUsuario.getSelectionModel().getFocusedIndex(),u);
            listaInformacionUsuarios = FXCollections.observableArrayList();
            conexion = new DbConnection();
            conexion.getConnection();
            Usuario.llenarInformacionUsuario(conexion.getConnection(), listaInformacionUsuarios);
            conexion.desconectar();
            tblvUsuario.setItems(listaInformacionUsuarios);
            Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("Registro actualizado");
            mensaje.setContentText("El usuario ha sido actualizado exitosamente");
            mensaje.setHeaderText("Resultado:");
            mensaje.show();
        }
    }

    private void actualizarEmpleado() {

    }

    @FXML
    public void accionBotonAdministrarEliminar(){
        if (areaActivaEmpleado&&rbConfirmaInformacionEmpleado.isSelected()){
            eliminarEmpleado();
            rbConfirmaInformacionEmpleado.setSelected(false);
        }
        else if (areaActivaUsuario&&rbConfirmaInformacionUsuario.isSelected()){
            borrarUsuario();
            rbConfirmaInformacionUsuario.setSelected(false);
        }

    }

    private void borrarUsuario() {
        Usuario u = new Usuario(
                Integer.parseInt(tfIdUsuario.getText()),
                cmbUsuarioEmpleado.getValue(),
                tfNombreUsuarioUsuario.getText(),
                pfClaveUsuario.getText(),
                rbUsuarioActivo.isSelected()
        );
        if(nombreUsuarioSesion.equals(u.getNombreUsuario())){
            Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("No se puede borrar el usuario: "+nombreUsuarioSesion);
            mensaje.setContentText("El usuario "+nombreUsuarioSesion+" tiene la sesión activa, seleccione otro usuario o cierre sesión e inicie con otra cuenta antes de borrarlo.");
            mensaje.setHeaderText("Motivo:");
            mensaje.show();
        }else{
            int resultado = procesoUsuario.borrarDatosUsuario(u);
            if(resultado==1) {
                //listaInformacionUsuarios.remove(tblvUsuario.getSelectionModel().getFocusedIndex());
                listaInformacionUsuarios = FXCollections.observableArrayList();
                conexion = new DbConnection();
                conexion.getConnection();
                Usuario.llenarInformacionUsuario(conexion.getConnection(), listaInformacionUsuarios);
                conexion.desconectar();
                tblvUsuario.setItems(listaInformacionUsuarios);
                limpiarInformacionUsuario();
                Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
                mensaje.setTitle("Registro borrado");
                mensaje.setContentText("El usuario ha sido borrado exitosamente");
                mensaje.setHeaderText("Resultado:");
                mensaje.show();
            }
        }
    }

    private void eliminarEmpleado() {

    }

    @FXML
    public void areaEmpleadoActiva(){
        areaActivaEmpleado=true;
        areaActivaUsuario=false;
        rbConfirmaInformacionUsuario.setSelected(false);
    }

    @FXML
    public void areaUsuarioActiva(){
        areaActivaUsuario=true;
        areaActivaEmpleado=false;
        rbConfirmaInformacionEmpleado.setSelected(false);
    }

    public void guardarEmpleado(){
        System.out.println("Se almacena un empleado");

        Empleado e = new Empleado(
                0,
                cmbRol.getSelectionModel().getSelectedItem(),
                Date.valueOf(dtpFechaIngresoEmpleado.getValue()),
                tfNacionalidadEmpleado.getText(),
                rbEmpleadoEsUsuarioDelSistema.isSelected(),
                cmbTipoDocumentoIdentidad.getSelectionModel().getSelectedItem(),
                tfNumeroDocumentoEmpleado.getText(),
                tfLugarExpedicionDocumentoEmpleado.getText(),
                Date.valueOf(dtpFechaExpedicionDocumentoEmpleado.getValue()),
                tfLugarNacimientoEmpleado.getText(),
                Date.valueOf(dtpFechaNacimientoEmpleado.getValue()),
                tfNombresEmpleado.getText(),
                tfApellidosEmpleado.getText(),
                tfCorreoEmpleado.getText(),
                tfCodigoPostalEmpleado.getText(),
                tfTelefonoFijoEmpleado.getText(),
                tfTelefonoCelularEmpleado.getText(),
                tfTelefonoAlternativoEmpleado.getText(),
                tfDireccionEmpleado.getText(),
                tfSueldoBaseEmpleado.getText(),
                tfUpzEmpleado.getText(),
                tfLocalidadEmpleado.getText(),
                tfMunicipioEmpleado.getText(),
                tfDepartamentoEmpleado.getText(),
                tfNombrePersonaContactoEmpleado.getText(),
                tfNombreTelefonoPersonaContactoEmpleado.getText(),
                cmbTipoContrato.getSelectionModel().getSelectedItem(),
                Integer.parseInt(tfSueldoBaseEmpleado.getText())
        );
        conexion.getConnection();
        int resultado=e.registrarEmpleado(conexion.getConnection());
        conexion.desconectar();
        if(resultado==1){
            Alert mensaje=new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("Registro agregado");
            mensaje.setContentText("El registro ha sido agregado exitosamente");
            mensaje.setHeaderText("Resultado:");
            mensaje.show();
            listaInformacionEmpleados.add(e);
        }
    }
    public void guardarUsuario(){
        Usuario u = new Usuario(
          0,
                cmbUsuarioEmpleado.getValue(),
                tfNombreUsuarioUsuario.getText(),
                pfClaveUsuario.getText(),
                rbUsuarioActivo.isSelected()
        );
        int resultado = procesoUsuario.registrarUsuario(u);
        if(resultado==1){
            //listaInformacionUsuarios.add(u);
            listaInformacionUsuarios = FXCollections.observableArrayList();
            conexion = new DbConnection();
            conexion.getConnection();
            Usuario.llenarInformacionUsuario(conexion.getConnection(), listaInformacionUsuarios);
            conexion.desconectar();
            tblvUsuario.setItems(listaInformacionUsuarios);
            Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("Registro agregado");
            mensaje.setContentText("El usuario ha sido agregado exitosamente");
            mensaje.setHeaderText("Resultado:");
            mensaje.show();
        }
    }


}
