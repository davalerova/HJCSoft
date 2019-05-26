package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EstadoOrdenDeServicio{
    private IntegerProperty idEstadoOrdenDeServicio;
    private StringProperty nombreEstadoOrdenDeServicio;

    public EstadoOrdenDeServicio(int idEstadoOrdenDeServicio, String nombreEstadoOrdenDeServicio) {
        this.idEstadoOrdenDeServicio = new SimpleIntegerProperty(idEstadoOrdenDeServicio);
        this.nombreEstadoOrdenDeServicio = new SimpleStringProperty(nombreEstadoOrdenDeServicio);
    }

    //Metodos atributo: idEstadoOrdenDeServicio
    public int getIdEstadoOrdenDeServicio() {
        return idEstadoOrdenDeServicio.get();
    }
    public void setIdEstadoOrdenDeServicio(int idEstadoOrdenDeServicio) {
        this.idEstadoOrdenDeServicio = new SimpleIntegerProperty(idEstadoOrdenDeServicio);
    }
    public IntegerProperty IdEstadoOrdenDeServicioProperty() {
        return idEstadoOrdenDeServicio;
    }
    //Metodos atributo: nombreEstadoOrdenDeServicio
    public String getNombreEstadoOrdenDeServicio() {
        return nombreEstadoOrdenDeServicio.get();
    }
    public void setNombreEstadoOrdenDeServicio(String nombreEstadoOrdenDeServicio) {
        this.nombreEstadoOrdenDeServicio = new SimpleStringProperty(nombreEstadoOrdenDeServicio);
    }
    public StringProperty NombreEstadoOrdenDeServicioProperty() {
        return nombreEstadoOrdenDeServicio;
    }
}