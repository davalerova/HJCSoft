package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TipoCliente{
    private IntegerProperty idTipoCliente;
    private StringProperty nombreTipoCliente;

    public TipoCliente(int idTipoCliente, String nombreTipoCliente) {
        this.idTipoCliente = new SimpleIntegerProperty(idTipoCliente);
        this.nombreTipoCliente = new SimpleStringProperty(nombreTipoCliente);
    }

    //Metodos atributo: idTipoCliente
    public int getIdTipoCliente() {
        return idTipoCliente.get();
    }
    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = new SimpleIntegerProperty(idTipoCliente);
    }
    public IntegerProperty IdTipoClienteProperty() {
        return idTipoCliente;
    }
    //Metodos atributo: nombreTipoCliente
    public String getNombreTipoCliente() {
        return nombreTipoCliente.get();
    }
    public void setNombreTipoCliente(String nombreTipoCliente) {
        this.nombreTipoCliente = new SimpleStringProperty(nombreTipoCliente);
    }
    public StringProperty NombreTipoClienteProperty() {
        return nombreTipoCliente;
    }
}