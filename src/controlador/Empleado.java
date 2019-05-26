package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.sql.Date;

public class Empleado{
    private IntegerProperty idEmpleado;
    private StringProperty nombresEmpleado;
    private StringProperty apellidosEmpleado;
    private StringProperty nacionalidadEmpleado;
    private DocumentoIdentidad documentoIdentidadEmpleado;
    private IntegerProperty numeroDocumentoIdentidadEmpleado;
    private StringProperty lugarExpedicionDocumentoIdentidadEmpleado;
    private Date fechaExpedicionDocumentoIdentidadEmpleado;
    private StringProperty lugarNacimientoEmpleado;
    private Date fechaNacimientoEmpleado;
    private StringProperty emailEmpleado;
    private StringProperty telefonoFijoEmpleado;
    private StringProperty telefonoCelularEmpleado;
    private StringProperty direccionResidenciaEmpleado;
    private StringProperty nombrePersonaContactoEmpleado;
    private StringProperty celularPersonaContactoEmpleado;
    private TipoContrato tipoContratoEmpleado;
    private IntegerProperty sueldoBaseEmpleado;

    public Empleado(int idEmpleado, String nombresEmpleado, String apellidosEmpleado,
                    String nacionalidadEmpleado, DocumentoIdentidad documentoIdentidadEmpleado, int numeroDocumentoIdentidadEmpleado,
                    String lugarExpedicionDocumentoIdentidadEmpleado, Date fechaExpedicionDocumentoIdentidadEmpleado, String lugarNacimientoEmpleado,
                    Date fechaNacimientoEmpleado, String emailEmpleado, String telefonoFijoEmpleado,
                    String telefonoCelularEmpleado, String direccionResidenciaEmpleado, String nombrePersonaContactoEmpleado,
                    String celularPersonaContactoEmpleado, TipoContrato tipoContratoEmpleado, int sueldoBaseEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
        this.nombresEmpleado = new SimpleStringProperty(nombresEmpleado);
        this.apellidosEmpleado = new SimpleStringProperty(apellidosEmpleado);
        this.nacionalidadEmpleado = new SimpleStringProperty(nacionalidadEmpleado);
        this.documentoIdentidadEmpleado = documentoIdentidadEmpleado;
        this.numeroDocumentoIdentidadEmpleado = new SimpleIntegerProperty(numeroDocumentoIdentidadEmpleado);
        this.lugarExpedicionDocumentoIdentidadEmpleado = new SimpleStringProperty(lugarExpedicionDocumentoIdentidadEmpleado);
        this.fechaExpedicionDocumentoIdentidadEmpleado = fechaExpedicionDocumentoIdentidadEmpleado;
        this.lugarNacimientoEmpleado = new SimpleStringProperty(lugarNacimientoEmpleado);
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
        this.emailEmpleado = new SimpleStringProperty(emailEmpleado);
        this.telefonoFijoEmpleado = new SimpleStringProperty(telefonoFijoEmpleado);
        this.telefonoCelularEmpleado = new SimpleStringProperty(telefonoCelularEmpleado);
        this.direccionResidenciaEmpleado = new SimpleStringProperty(direccionResidenciaEmpleado);
        this.nombrePersonaContactoEmpleado = new SimpleStringProperty(nombrePersonaContactoEmpleado);
        this.celularPersonaContactoEmpleado = new SimpleStringProperty(celularPersonaContactoEmpleado);
        this.tipoContratoEmpleado = tipoContratoEmpleado;
        this.sueldoBaseEmpleado = new SimpleIntegerProperty(sueldoBaseEmpleado);
    }

    //Metodos atributo: idEmpleado
    public int getIdEmpleado() {
        return idEmpleado.get();
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
    }
    public IntegerProperty IdEmpleadoProperty() {
        return idEmpleado;
    }
    //Metodos atributo: nombresEmpleado
    public String getNombresEmpleado() {
        return nombresEmpleado.get();
    }
    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = new SimpleStringProperty(nombresEmpleado);
    }
    public StringProperty NombresEmpleadoProperty() {
        return nombresEmpleado;
    }
    //Metodos atributo: apellidosEmpleado
    public String getApellidosEmpleado() {
        return apellidosEmpleado.get();
    }
    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = new SimpleStringProperty(apellidosEmpleado);
    }
    public StringProperty ApellidosEmpleadoProperty() {
        return apellidosEmpleado;
    }
    //Metodos atributo: nacionalidadEmpleado
    public String getNacionalidadEmpleado() {
        return nacionalidadEmpleado.get();
    }
    public void setNacionalidadEmpleado(String nacionalidadEmpleado) {
        this.nacionalidadEmpleado = new SimpleStringProperty(nacionalidadEmpleado);
    }
    public StringProperty NacionalidadEmpleadoProperty() {
        return nacionalidadEmpleado;
    }
    //Metodos atributo: documentoIdentidadEmpleado
    public DocumentoIdentidad getDocumentoIdentidadEmpleado() {
        return documentoIdentidadEmpleado;
    }
    public void setDocumentoIdentidadEmpleado(DocumentoIdentidad documentoIdentidadEmpleado) {
        this.documentoIdentidadEmpleado = documentoIdentidadEmpleado;
    }
    //Metodos atributo: numeroDocumentoIdentidadEmpleado
    public int getNumeroDocumentoIdentidadEmpleado() {
        return numeroDocumentoIdentidadEmpleado.get();
    }
    public void setNumeroDocumentoIdentidadEmpleado(int numeroDocumentoIdentidadEmpleado) {
        this.numeroDocumentoIdentidadEmpleado = new SimpleIntegerProperty(numeroDocumentoIdentidadEmpleado);
    }
    public IntegerProperty NumeroDocumentoIdentidadEmpleadoProperty() {
        return numeroDocumentoIdentidadEmpleado;
    }
    //Metodos atributo: lugarExpedicionDocumentoIdentidadEmpleado
    public String getLugarExpedicionDocumentoIdentidadEmpleado() {
        return lugarExpedicionDocumentoIdentidadEmpleado.get();
    }
    public void setLugarExpedicionDocumentoIdentidadEmpleado(String lugarExpedicionDocumentoIdentidadEmpleado) {
        this.lugarExpedicionDocumentoIdentidadEmpleado = new SimpleStringProperty(lugarExpedicionDocumentoIdentidadEmpleado);
    }
    public StringProperty LugarExpedicionDocumentoIdentidadEmpleadoProperty() {
        return lugarExpedicionDocumentoIdentidadEmpleado;
    }
    //Metodos atributo: fechaExpedicionDocumentoIdentidadEmpleado
    public Date getFechaExpedicionDocumentoIdentidadEmpleado() {
        return fechaExpedicionDocumentoIdentidadEmpleado;
    }
    public void setFechaExpedicionDocumentoIdentidadEmpleado(Date fechaExpedicionDocumentoIdentidadEmpleado) {
        this.fechaExpedicionDocumentoIdentidadEmpleado = fechaExpedicionDocumentoIdentidadEmpleado;
    }
    //Metodos atributo: lugarNacimientoEmpleado
    public String getLugarNacimientoEmpleado() {
        return lugarNacimientoEmpleado.get();
    }
    public void setLugarNacimientoEmpleado(String lugarNacimientoEmpleado) {
        this.lugarNacimientoEmpleado = new SimpleStringProperty(lugarNacimientoEmpleado);
    }
    public StringProperty LugarNacimientoEmpleadoProperty() {
        return lugarNacimientoEmpleado;
    }
    //Metodos atributo: fechaNacimientoEmpleado
    public Date getFechaNacimientoEmpleado() {
        return fechaNacimientoEmpleado;
    }
    public void setFechaNacimientoEmpleado(Date fechaNacimientoEmpleado) {
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
    }
    //Metodos atributo: emailEmpleado
    public String getEmailEmpleado() {
        return emailEmpleado.get();
    }
    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = new SimpleStringProperty(emailEmpleado);
    }
    public StringProperty EmailEmpleadoProperty() {
        return emailEmpleado;
    }
    //Metodos atributo: telefonoFijoEmpleado
    public String getTelefonoFijoEmpleado() {
        return telefonoFijoEmpleado.get();
    }
    public void setTelefonoFijoEmpleado(String telefonoFijoEmpleado) {
        this.telefonoFijoEmpleado = new SimpleStringProperty(telefonoFijoEmpleado);
    }
    public StringProperty TelefonoFijoEmpleadoProperty() {
        return telefonoFijoEmpleado;
    }
    //Metodos atributo: telefonoCelularEmpleado
    public String getTelefonoCelularEmpleado() {
        return telefonoCelularEmpleado.get();
    }
    public void setTelefonoCelularEmpleado(String telefonoCelularEmpleado) {
        this.telefonoCelularEmpleado = new SimpleStringProperty(telefonoCelularEmpleado);
    }
    public StringProperty TelefonoCelularEmpleadoProperty() {
        return telefonoCelularEmpleado;
    }
    //Metodos atributo: direccionResidenciaEmpleado
    public String getDireccionResidenciaEmpleado() {
        return direccionResidenciaEmpleado.get();
    }
    public void setDireccionResidenciaEmpleado(String direccionResidenciaEmpleado) {
        this.direccionResidenciaEmpleado = new SimpleStringProperty(direccionResidenciaEmpleado);
    }
    public StringProperty DireccionResidenciaEmpleadoProperty() {
        return direccionResidenciaEmpleado;
    }
    //Metodos atributo: nombrePersonaContactoEmpleado
    public String getNombrePersonaContactoEmpleado() {
        return nombrePersonaContactoEmpleado.get();
    }
    public void setNombrePersonaContactoEmpleado(String nombrePersonaContactoEmpleado) {
        this.nombrePersonaContactoEmpleado = new SimpleStringProperty(nombrePersonaContactoEmpleado);
    }
    public StringProperty NombrePersonaContactoEmpleadoProperty() {
        return nombrePersonaContactoEmpleado;
    }
    //Metodos atributo: celularPersonaContactoEmpleado
    public String getCelularPersonaContactoEmpleado() {
        return celularPersonaContactoEmpleado.get();
    }
    public void setCelularPersonaContactoEmpleado(String celularPersonaContactoEmpleado) {
        this.celularPersonaContactoEmpleado = new SimpleStringProperty(celularPersonaContactoEmpleado);
    }
    public StringProperty CelularPersonaContactoEmpleadoProperty() {
        return celularPersonaContactoEmpleado;
    }
    //Metodos atributo: tipoContratoEmpleado
    public TipoContrato getTipoContratoEmpleado() {
        return tipoContratoEmpleado;
    }
    public void setTipoContratoEmpleado(TipoContrato tipoContratoEmpleado) {
        this.tipoContratoEmpleado = tipoContratoEmpleado;
    }
    //Metodos atributo: sueldoBaseEmpleado
    public int getSueldoBaseEmpleado() {
        return sueldoBaseEmpleado.get();
    }
    public void setSueldoBaseEmpleado(int sueldoBaseEmpleado) {
        this.sueldoBaseEmpleado = new SimpleIntegerProperty(sueldoBaseEmpleado);
    }
    public IntegerProperty SueldoBaseEmpleadoProperty() {
        return sueldoBaseEmpleado;
    }
}

