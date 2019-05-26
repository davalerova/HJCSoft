package controlador;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Rol{
    private IntegerProperty idRol;
    private StringProperty nombreRol;

    public Rol(int idRol, String nombreRol) {
        this.idRol = new SimpleIntegerProperty(idRol);
        this.nombreRol = new SimpleStringProperty(nombreRol);
    }

    //Metodos atributo: idRol
    public int getIdRol() {
        return idRol.get();
    }
    public void setIdRol(int idRol) {
        this.idRol = new SimpleIntegerProperty(idRol);
    }
    public IntegerProperty IdRolProperty() {
        return idRol;
    }
    //Metodos atributo: nombreRol
    public String getNombreRol() {
        return nombreRol.get();
    }
    public void setNombreRol(String nombreRol) {
        this.nombreRol = new SimpleStringProperty(nombreRol);
    }
    public StringProperty NombreRolProperty() {
        return nombreRol;
    }
}
