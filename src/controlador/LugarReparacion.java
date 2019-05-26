package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LugarReparacion{
    private IntegerProperty idLugarReparacion;
    private StringProperty nombreLugarReparacion;

    public LugarReparacion(int idLugarReparacion, String nombreLugarReparacion) {
        this.idLugarReparacion = new SimpleIntegerProperty(idLugarReparacion);
        this.nombreLugarReparacion = new SimpleStringProperty(nombreLugarReparacion);
    }

    //Metodos atributo: idLugarReparacion
    public int getIdLugarReparacion() {
        return idLugarReparacion.get();
    }
    public void setIdLugarReparacion(int idLugarReparacion) {
        this.idLugarReparacion = new SimpleIntegerProperty(idLugarReparacion);
    }
    public IntegerProperty IdLugarReparacionProperty() {
        return idLugarReparacion;
    }
    //Metodos atributo: nombreLugarReparacion
    public String getNombreLugarReparacion() {
        return nombreLugarReparacion.get();
    }
    public void setNombreLugarReparacion(String nombreLugarReparacion) {
        this.nombreLugarReparacion = new SimpleStringProperty(nombreLugarReparacion);
    }
    public StringProperty NombreLugarReparacionProperty() {
        return nombreLugarReparacion;
    }
}