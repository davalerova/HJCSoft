package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TipoProblemaProducto{
    private IntegerProperty idTipoProblemaProducto;
    private StringProperty nombreTipoProblemaProducto;

    public TipoProblemaProducto(int idTipoProblemaProducto, String nombreTipoProblemaProducto) {
        this.idTipoProblemaProducto = new SimpleIntegerProperty(idTipoProblemaProducto);
        this.nombreTipoProblemaProducto = new SimpleStringProperty(nombreTipoProblemaProducto);
    }

    //Metodos atributo: idTipoProblemaProducto
    public int getIdTipoProblemaProducto() {
        return idTipoProblemaProducto.get();
    }
    public void setIdTipoProblemaProducto(int idTipoProblemaProducto) {
        this.idTipoProblemaProducto = new SimpleIntegerProperty(idTipoProblemaProducto);
    }
    public IntegerProperty IdTipoProblemaProductoProperty() {
        return idTipoProblemaProducto;
    }
    //Metodos atributo: nombreTipoProblemaProducto
    public String getNombreTipoProblemaProducto() {
        return nombreTipoProblemaProducto.get();
    }
    public void setNombreTipoProblemaProducto(String nombreTipoProblemaProducto) {
        this.nombreTipoProblemaProducto = new SimpleStringProperty(nombreTipoProblemaProducto);
    }
    public StringProperty NombreTipoProblemaProductoProperty() {
        return nombreTipoProblemaProducto;
    }
}