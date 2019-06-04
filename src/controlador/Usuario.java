package controlador;

import javafx.beans.property.*;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Usuario{
    private IntegerProperty idUsuario;
    private Empleado idEmpleadoUsuario;
    private StringProperty nombreUsuario;
    private StringProperty contrasenaUsuario;
    private BooleanProperty esActivoUsuario;

    public Usuario(int idUsuario, Empleado idEmpleadoUsuario,
                   String nombreUsuario, String contrasenaUsuario, Boolean esActivoUsuario) {
        this.idUsuario = new SimpleIntegerProperty(idUsuario);
        this.idEmpleadoUsuario = idEmpleadoUsuario;
        this.nombreUsuario = new SimpleStringProperty(nombreUsuario);
        this.contrasenaUsuario = new SimpleStringProperty(contrasenaUsuario);
        this.esActivoUsuario = new SimpleBooleanProperty(esActivoUsuario);
    }

    public Usuario(String nombreusuario) {
        this.nombreUsuario=new SimpleStringProperty(nombreusuario);
    }




    //Métodos atributo: idUsuario
    public int getIdUsuario() {
        return idUsuario.get();
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = new SimpleIntegerProperty(idUsuario);
    }
    public IntegerProperty IdUsuarioProperty() {
        return idUsuario;
    }
    //Métodos atributo: idEmpleadoUsuario
    public Empleado getIdEmpleadoUsuario() {
        return idEmpleadoUsuario;
    }
    public void setIdEmpleadoUsuario(Empleado idEmpleadoUsuario) {
        this.idEmpleadoUsuario = idEmpleadoUsuario;
    }
    //Métodos atributo: nombreUsuario
    public String getNombreUsuario() {
        return nombreUsuario.get();
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = new SimpleStringProperty(nombreUsuario);
    }
    public StringProperty NombreUsuarioProperty() {
        return nombreUsuario;
    }
    //Métodos atributo: contrasenaUsuario
    public String getContrasenaUsuario() {
        return contrasenaUsuario.get();
    }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = new SimpleStringProperty(contrasenaUsuario);
    }
    public StringProperty ContrasenaUsuarioProperty() {
        return contrasenaUsuario;
    }
    //Métodos atributo: esActivoUsuario
    public Boolean getEsActivoUsuario() {
        return esActivoUsuario.get();
    }
    public void setEsActivoUsuario(Boolean esActivoUsuario) {
        this.esActivoUsuario = new SimpleBooleanProperty(esActivoUsuario);
    }
    public BooleanProperty EsActivoUsuarioProperty() {
        return esActivoUsuario;
    }

    public static void llenarInformacionUsuario(Connection connection, ObservableList<Usuario>lista) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT A.idusuario, A.empleadoid, A.nombreusuario, A.claveusuario, A.esactivo, empleado.nombresempleado,empleado.apellidosempleado\n" +
                    "FROM usuario A " +
                    "INNER JOIN empleado " +
                    "ON(A.empleadoid= empleado.idempleado)");
            while (resultado.next()) {
                lista.add(
                        new Usuario(
                                resultado.getInt("idusuario"),
                                new Empleado(resultado.getInt("empleadoid"),resultado.getString("nombresempleado"),resultado.getString("apellidosempleado")),
                                resultado.getString("nombreusuario"),
                                resultado.getString("claveusuario"),
                                resultado.getBoolean("esactivo")
                                )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void listarUsuarios(Connection connection, ObservableList<Usuario> lista) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT nombreusuario   FROM usuario");
            while (resultado.next()) {
                lista.add(
                        new Usuario(
                                resultado.getString("nombresusuario")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return getNombreUsuario();
    }

}