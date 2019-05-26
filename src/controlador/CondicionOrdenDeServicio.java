package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CondicionOrdenDeServicio{
    private IntegerProperty idCondicionOrdenDeServicio;
    private StringProperty nombreCondicionOrdenDeServicio;

    public CondicionOrdenDeServicio(int idCondicionOrdenDeServicio, String nombreCondicionOrdenDeServicio) {
        this.idCondicionOrdenDeServicio = new SimpleIntegerProperty(idCondicionOrdenDeServicio);
        this.nombreCondicionOrdenDeServicio = new SimpleStringProperty(nombreCondicionOrdenDeServicio);
    }

    //Metodos atributo: idCondicionOrdenDeServicio
    public int getIdCondicionOrdenDeServicio() {
        return idCondicionOrdenDeServicio.get();
    }
    public void setIdCondicionOrdenDeServicio(int idCondicionOrdenDeServicio) {
        this.idCondicionOrdenDeServicio = new SimpleIntegerProperty(idCondicionOrdenDeServicio);
    }
    public IntegerProperty IdCondicionOrdenDeServicioProperty() {
        return idCondicionOrdenDeServicio;
    }
    //Metodos atributo: nombreCondicionOrdenDeServicio
    public String getNombreCondicionOrdenDeServicio() {
        return nombreCondicionOrdenDeServicio.get();
    }
    public void setNombreCondicionOrdenDeServicio(String nombreCondicionOrdenDeServicio) {
        this.nombreCondicionOrdenDeServicio = new SimpleStringProperty(nombreCondicionOrdenDeServicio);
    }
    public StringProperty NombreCondicionOrdenDeServicioProperty() {
        return nombreCondicionOrdenDeServicio;
    }
}