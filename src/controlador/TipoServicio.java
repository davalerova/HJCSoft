package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TipoServicio{
    private IntegerProperty idTipoServicio;
    private StringProperty nombreTipoServicio;

    public TipoServicio(int idTipoServicio, String nombreTipoServicio) {
        this.idTipoServicio = new SimpleIntegerProperty(idTipoServicio);
        this.nombreTipoServicio = new SimpleStringProperty(nombreTipoServicio);
    }

    //Metodos atributo: idTipoServicio
    public int getIdTipoServicio() {
        return idTipoServicio.get();
    }
    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = new SimpleIntegerProperty(idTipoServicio);
    }
    public IntegerProperty IdTipoServicioProperty() {
        return idTipoServicio;
    }
    //Metodos atributo: nombreTipoServicio
    public String getNombreTipoServicio() {
        return nombreTipoServicio.get();
    }
    public void setNombreTipoServicio(String nombreTipoServicio) {
        this.nombreTipoServicio = new SimpleStringProperty(nombreTipoServicio);
    }
    public StringProperty NombreTipoServicioProperty() {
        return nombreTipoServicio;
    }
}