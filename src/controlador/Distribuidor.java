package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Distribuidor{
    private IntegerProperty idDistribuidor;
    private StringProperty nombreDistribuidor;
    private StringProperty direccionDistribuidor;
    private StringProperty telefonoDistribuidor;
    private StringProperty emailDistribuidor;

    public Distribuidor(int idDistribuidor, String nombreDistribuidor, String direccionDistribuidor,
                        String telefonoDistribuidor, String emailDistribuidor) {
        this.idDistribuidor = new SimpleIntegerProperty(idDistribuidor);
        this.nombreDistribuidor = new SimpleStringProperty(nombreDistribuidor);
        this.direccionDistribuidor = new SimpleStringProperty(direccionDistribuidor);
        this.telefonoDistribuidor = new SimpleStringProperty(telefonoDistribuidor);
        this.emailDistribuidor = new SimpleStringProperty(emailDistribuidor);
    }

    //Metodos atributo: idDistribuidor
    public int getIdDistribuidor() {
        return idDistribuidor.get();
    }
    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = new SimpleIntegerProperty(idDistribuidor);
    }
    public IntegerProperty IdDistribuidorProperty() {
        return idDistribuidor;
    }
    //Metodos atributo: nombreDistribuidor
    public String getNombreDistribuidor() {
        return nombreDistribuidor.get();
    }
    public void setNombreDistribuidor(String nombreDistribuidor) {
        this.nombreDistribuidor = new SimpleStringProperty(nombreDistribuidor);
    }
    public StringProperty NombreDistribuidorProperty() {
        return nombreDistribuidor;
    }
    //Metodos atributo: direccionDistribuidor
    public String getDireccionDistribuidor() {
        return direccionDistribuidor.get();
    }
    public void setDireccionDistribuidor(String direccionDistribuidor) {
        this.direccionDistribuidor = new SimpleStringProperty(direccionDistribuidor);
    }
    public StringProperty DireccionDistribuidorProperty() {
        return direccionDistribuidor;
    }
    //Metodos atributo: telefonoDistribuidor
    public String getTelefonoDistribuidor() {
        return telefonoDistribuidor.get();
    }
    public void setTelefonoDistribuidor(String telefonoDistribuidor) {
        this.telefonoDistribuidor = new SimpleStringProperty(telefonoDistribuidor);
    }
    public StringProperty TelefonoDistribuidorProperty() {
        return telefonoDistribuidor;
    }
    //Metodos atributo: emailDistribuidor
    public String getEmailDistribuidor() {
        return emailDistribuidor.get();
    }
    public void setEmailDistribuidor(String emailDistribuidor) {
        this.emailDistribuidor = new SimpleStringProperty(emailDistribuidor);
    }
    public StringProperty EmailDistribuidorProperty() {
        return emailDistribuidor;
    }
}