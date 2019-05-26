package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FallaProducto{
    private IntegerProperty idFallaProducto;
    private StringProperty nombreFallaProducto;

    public FallaProducto(int idFallaProducto, String nombreFallaProducto) {
        this.idFallaProducto = new SimpleIntegerProperty(idFallaProducto);
        this.nombreFallaProducto = new SimpleStringProperty(nombreFallaProducto);
    }

    //Metodos atributo: idFallaProducto
    public int getIdFallaProducto() {
        return idFallaProducto.get();
    }
    public void setIdFallaProducto(int idFallaProducto) {
        this.idFallaProducto = new SimpleIntegerProperty(idFallaProducto);
    }
    public IntegerProperty IdFallaProductoProperty() {
        return idFallaProducto;
    }
    //Metodos atributo: nombreFallaProducto
    public String getNombreFallaProducto() {
        return nombreFallaProducto.get();
    }
    public void setNombreFallaProducto(String nombreFallaProducto) {
        this.nombreFallaProducto = new SimpleStringProperty(nombreFallaProducto);
    }
    public StringProperty NombreFallaProductoProperty() {
        return nombreFallaProducto;
    }
}