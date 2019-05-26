package controlador;

import javafx.beans.property.*;


public class Usuario{
    private IntegerProperty idUsuario;
    private Empleado idEmpleadoUsuario;
    private Rol idRolUsuario;
    private StringProperty nombreUsuario;
    private StringProperty contrasenaUsuario;
    private BooleanProperty esActivoUsuario;

    public Usuario(int idUsuario, Empleado idEmpleadoUsuario, Rol idRolUsuario,
                   String nombreUsuario, String contrasenaUsuario, Boolean esActivoUsuario) {
        this.idUsuario = new SimpleIntegerProperty(idUsuario);
        this.idEmpleadoUsuario = idEmpleadoUsuario;
        this.idRolUsuario = idRolUsuario;
        this.nombreUsuario = new SimpleStringProperty(nombreUsuario);
        this.contrasenaUsuario = new SimpleStringProperty(contrasenaUsuario);
        this.esActivoUsuario = new SimpleBooleanProperty(esActivoUsuario);
    }

    //Metodos atributo: idUsuario
    public int getIdUsuario() {
        return idUsuario.get();
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = new SimpleIntegerProperty(idUsuario);
    }
    public IntegerProperty IdUsuarioProperty() {
        return idUsuario;
    }
    //Metodos atributo: idEmpleadoUsuario
    public Empleado getIdEmpleadoUsuario() {
        return idEmpleadoUsuario;
    }
    public void setIdEmpleadoUsuario(Empleado idEmpleadoUsuario) {
        this.idEmpleadoUsuario = idEmpleadoUsuario;
    }
    //Metodos atributo: idRolUsuario
    public Rol getIdRolUsuario() {
        return idRolUsuario;
    }
    public void setIdRolUsuario(Rol idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }
    //Metodos atributo: nombreUsuario
    public String getNombreUsuario() {
        return nombreUsuario.get();
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = new SimpleStringProperty(nombreUsuario);
    }
    public StringProperty NombreUsuarioProperty() {
        return nombreUsuario;
    }
    //Metodos atributo: contrasenaUsuario
    public String getContrasenaUsuario() {
        return contrasenaUsuario.get();
    }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = new SimpleStringProperty(contrasenaUsuario);
    }
    public StringProperty ContrasenaUsuarioProperty() {
        return contrasenaUsuario;
    }
    //Metodos atributo: esActivoUsuario
    public Boolean getEsActivoUsuario() {
        return esActivoUsuario.get();
    }
    public void setEsActivoUsuario(Boolean esActivoUsuario) {
        this.esActivoUsuario = new SimpleBooleanProperty(esActivoUsuario);
    }
    public BooleanProperty EsActivoUsuarioProperty() {
        return esActivoUsuario;
    }
}