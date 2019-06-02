package controlador;



import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente{
    private IntegerProperty idCliente;
    private StringProperty codigoCliente;
    private StringProperty nombresCliente;
    private StringProperty apellidosCliente;
    private StringProperty direccionResidenciaCliente;
    private StringProperty telefonoFijoCliente;
    private StringProperty telefonoCelularCliente;
    private StringProperty telefonoAlternativoCliente;
    private StringProperty emailCliente;
    private StringProperty departamentoResidenciaCliente;
    private StringProperty cuidadResidenciaCliente;
    private StringProperty LocalidadResidenciaCliente;
    private StringProperty upzResidenciaCliente;
    private StringProperty barrioResidenciaCliente;
    private StringProperty codigoPostalResidenciaCliente;
    private TipoCliente tipoCliente;
    private Cliente remitidoPor;

    public Cliente(int idCliente, String codigoCliente, String nombresCliente,
                   String apellidosCliente, String direccionResidenciaCliente, String telefonoFijoCliente,
                   String telefonoCelularCliente, String telefonoAlternativoCliente, String emailCliente,
                   String departamentoResidenciaCliente, String cuidadResidenciaCliente, String LocalidadResidenciaCliente,
                   String upzResidenciaCliente, String barrioResidenciaCliente, String codigoPostalResidenciaCliente,
                   TipoCliente tipoCliente, Cliente remitidoPor) {
        this.idCliente = new SimpleIntegerProperty(idCliente);
        this.codigoCliente = new SimpleStringProperty(codigoCliente);
        this.nombresCliente = new SimpleStringProperty(nombresCliente);
        this.apellidosCliente = new SimpleStringProperty(apellidosCliente);
        this.direccionResidenciaCliente = new SimpleStringProperty(direccionResidenciaCliente);
        this.telefonoFijoCliente = new SimpleStringProperty(telefonoFijoCliente);
        this.telefonoCelularCliente = new SimpleStringProperty(telefonoCelularCliente);
        this.telefonoAlternativoCliente = new SimpleStringProperty(telefonoAlternativoCliente);
        this.emailCliente = new SimpleStringProperty(emailCliente);
        this.departamentoResidenciaCliente = new SimpleStringProperty(departamentoResidenciaCliente);
        this.cuidadResidenciaCliente = new SimpleStringProperty(cuidadResidenciaCliente);
        this.LocalidadResidenciaCliente = new SimpleStringProperty(LocalidadResidenciaCliente);
        this.upzResidenciaCliente = new SimpleStringProperty(upzResidenciaCliente);
        this.barrioResidenciaCliente = new SimpleStringProperty(barrioResidenciaCliente);
        this.codigoPostalResidenciaCliente = new SimpleStringProperty(codigoPostalResidenciaCliente);
        this.tipoCliente = tipoCliente;
        this.remitidoPor = remitidoPor;
    }

    //Metodos atributo: idCliente
    public int getIdCliente() {
        return idCliente.get();
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = new SimpleIntegerProperty(idCliente);
    }
    public IntegerProperty IdClienteProperty() {
        return idCliente;
    }
    //Metodos atributo: codigoCliente
    public String getCodigoCliente() {
        return codigoCliente.get();
    }
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = new SimpleStringProperty(codigoCliente);
    }
    public StringProperty CodigoClienteProperty() {
        return codigoCliente;
    }
    //Metodos atributo: nombresCliente
    public String getNombresCliente() {
        return nombresCliente.get();
    }
    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = new SimpleStringProperty(nombresCliente);
    }
    public StringProperty NombresClienteProperty() {
        return nombresCliente;
    }
    //Metodos atributo: apellidosCliente
    public String getApellidosCliente() {
        return apellidosCliente.get();
    }
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = new SimpleStringProperty(apellidosCliente);
    }
    public StringProperty ApellidosClienteProperty() {
        return apellidosCliente;
    }
    //Metodos atributo: direccionResidenciaCliente
    public String getDireccionResidenciaCliente() {
        return direccionResidenciaCliente.get();
    }
    public void setDireccionResidenciaCliente(String direccionResidenciaCliente) {
        this.direccionResidenciaCliente = new SimpleStringProperty(direccionResidenciaCliente);
    }
    public StringProperty DireccionResidenciaClienteProperty() {
        return direccionResidenciaCliente;
    }
    //Metodos atributo: telefonoFijoCliente
    public String getTelefonoFijoCliente() {
        return telefonoFijoCliente.get();
    }
    public void setTelefonoFijoCliente(String telefonoFijoCliente) {
        this.telefonoFijoCliente = new SimpleStringProperty(telefonoFijoCliente);
    }
    public StringProperty TelefonoFijoClienteProperty() {
        return telefonoFijoCliente;
    }
    //Metodos atributo: telefonoCelularCliente
    public String getTelefonoCelularCliente() {
        return telefonoCelularCliente.get();
    }
    public void setTelefonoCelularCliente(String telefonoCelularCliente) {
        this.telefonoCelularCliente = new SimpleStringProperty(telefonoCelularCliente);
    }
    public StringProperty TelefonoCelularClienteProperty() {
        return telefonoCelularCliente;
    }
    //Metodos atributo: telefonoAlternativoCliente
    public String getTelefonoAlternativoCliente() {
        return telefonoAlternativoCliente.get();
    }
    public void setTelefonoAlternativoCliente(String telefonoAlternativoCliente) {
        this.telefonoAlternativoCliente = new SimpleStringProperty(telefonoAlternativoCliente);
    }
    public StringProperty TelefonoAlternativoClienteProperty() {
        return telefonoAlternativoCliente;
    }
    //Metodos atributo: emailCliente
    public String getEmailCliente() {
        return emailCliente.get();
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = new SimpleStringProperty(emailCliente);
    }
    public StringProperty EmailClienteProperty() {
        return emailCliente;
    }
    //Metodos atributo: departamentoResidenciaCliente
    public String getDepartamentoResidenciaCliente() {
        return departamentoResidenciaCliente.get();
    }
    public void setDepartamentoResidenciaCliente(String departamentoResidenciaCliente) {
        this.departamentoResidenciaCliente = new SimpleStringProperty(departamentoResidenciaCliente);
    }
    public StringProperty DepartamentoResidenciaClienteProperty() {
        return departamentoResidenciaCliente;
    }
    //Metodos atributo: cuidadResidenciaCliente
    public String getCuidadResidenciaCliente() {
        return cuidadResidenciaCliente.get();
    }
    public void setCuidadResidenciaCliente(String cuidadResidenciaCliente) {
        this.cuidadResidenciaCliente = new SimpleStringProperty(cuidadResidenciaCliente);
    }
    public StringProperty CuidadResidenciaClienteProperty() {
        return cuidadResidenciaCliente;
    }
    //Metodos atributo: LocalidadResidenciaCliente
    public String getLocalidadResidenciaCliente() {
        return LocalidadResidenciaCliente.get();
    }
    public void setLocalidadResidenciaCliente(String LocalidadResidenciaCliente) {
        this.LocalidadResidenciaCliente = new SimpleStringProperty(LocalidadResidenciaCliente);
    }
    public StringProperty LocalidadResidenciaClienteProperty() {
        return LocalidadResidenciaCliente;
    }
    //Metodos atributo: upzResidenciaCliente
    public String getUpzResidenciaCliente() {
        return upzResidenciaCliente.get();
    }
    public void setUpzResidenciaCliente(String upzResidenciaCliente) {
        this.upzResidenciaCliente = new SimpleStringProperty(upzResidenciaCliente);
    }
    public StringProperty UpzResidenciaClienteProperty() {
        return upzResidenciaCliente;
    }
    //Metodos atributo: barrioResidenciaCliente
    public String getBarrioResidenciaCliente() {
        return barrioResidenciaCliente.get();
    }
    public void setBarrioResidenciaCliente(String barrioResidenciaCliente) {
        this.barrioResidenciaCliente = new SimpleStringProperty(barrioResidenciaCliente);
    }
    public StringProperty BarrioResidenciaClienteProperty() {
        return barrioResidenciaCliente;
    }
    //Metodos atributo: codigoPostalResidenciaCliente
    public String getCodigoPostalResidenciaCliente() {
        return codigoPostalResidenciaCliente.get();
    }
    public void setCodigoPostalResidenciaCliente(String codigoPostalResidenciaCliente) {
        this.codigoPostalResidenciaCliente = new SimpleStringProperty(codigoPostalResidenciaCliente);
    }
    public StringProperty CodigoPostalResidenciaClienteProperty() {
        return codigoPostalResidenciaCliente;
    }
    //Metodos atributo: tipoCliente
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    //Metodos atributo: remitidoPor
    public Cliente getRemitidoPor() {
        return remitidoPor;
    }
    public void setRemitidoPor(Cliente remitidoPor) {
        this.remitidoPor = remitidoPor;
    }
    public void llenarInformacion(){

    }
}
