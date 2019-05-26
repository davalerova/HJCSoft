package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Permiso{
    private IntegerProperty idPermiso;
    private StringProperty nombrePermiso;
    private StringProperty detallePermiso;

    public Permiso(int idPermiso, String nombrePermiso, String detallePermiso) {
        this.idPermiso = new SimpleIntegerProperty(idPermiso);
        this.nombrePermiso = new SimpleStringProperty(nombrePermiso);
        this.detallePermiso = new SimpleStringProperty(detallePermiso);
    }

    //Metodos atributo: idPermiso
    public int getIdPermiso() {
        return idPermiso.get();
    }
    public void setIdPermiso(int idPermiso) {
        this.idPermiso = new SimpleIntegerProperty(idPermiso);
    }
    public IntegerProperty IdPermisoProperty() {
        return idPermiso;
    }
    //Metodos atributo: nombrePermiso
    public String getNombrePermiso() {
        return nombrePermiso.get();
    }
    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = new SimpleStringProperty(nombrePermiso);
    }
    public StringProperty NombrePermisoProperty() {
        return nombrePermiso;
    }
    //Metodos atributo: detallePermiso
    public String getDetallePermiso() {
        return detallePermiso.get();
    }
    public void setDetallePermiso(String detallePermiso) {
        this.detallePermiso = new SimpleStringProperty(detallePermiso);
    }
    public StringProperty DetallePermisoProperty() {
        return detallePermiso;
    }
}