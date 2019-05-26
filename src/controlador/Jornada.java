package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Jornada{
    private IntegerProperty idJornada;
    private StringProperty nombreJornada;
    private StringProperty detalleJornada;

    public Jornada(int idJornada, String nombreJornada, String detalleJornada) {
        this.idJornada = new SimpleIntegerProperty(idJornada);
        this.nombreJornada = new SimpleStringProperty(nombreJornada);
        this.detalleJornada = new SimpleStringProperty(detalleJornada);
    }

    //Metodos atributo: idJornada
    public int getIdJornada() {
        return idJornada.get();
    }
    public void setIdJornada(int idJornada) {
        this.idJornada = new SimpleIntegerProperty(idJornada);
    }
    public IntegerProperty IdJornadaProperty() {
        return idJornada;
    }
    //Metodos atributo: nombreJornada
    public String getNombreJornada() {
        return nombreJornada.get();
    }
    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = new SimpleStringProperty(nombreJornada);
    }
    public StringProperty NombreJornadaProperty() {
        return nombreJornada;
    }
    //Metodos atributo: detalleJornada
    public String getDetalleJornada() {
        return detalleJornada.get();
    }
    public void setDetalleJornada(String detalleJornada) {
        this.detalleJornada = new SimpleStringProperty(detalleJornada);
    }
    public StringProperty DetalleJornadaProperty() {
        return detalleJornada;
    }
}