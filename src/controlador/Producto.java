package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto{
    private IntegerProperty idProducto;
    private StringProperty nombreProducto;
    private StringProperty modeloProducto;
    private StringProperty serieProducto;
    private StringProperty marcaProducto;
    private StringProperty gamaProducto;
    private StringProperty colorProducto;
    private StringProperty capacidadProducto;
    private StringProperty fuenteEnergiaProducto;

    public Producto(int idProducto, String nombreProducto, String modeloProducto,
                    String serieProducto, String marcaProducto, String gamaProducto,
                    String colorProducto, String capacidadProducto, String fuenteEnergiaProducto) {
        this.idProducto = new SimpleIntegerProperty(idProducto);
        this.nombreProducto = new SimpleStringProperty(nombreProducto);
        this.modeloProducto = new SimpleStringProperty(modeloProducto);
        this.serieProducto = new SimpleStringProperty(serieProducto);
        this.marcaProducto = new SimpleStringProperty(marcaProducto);
        this.gamaProducto = new SimpleStringProperty(gamaProducto);
        this.colorProducto = new SimpleStringProperty(colorProducto);
        this.capacidadProducto = new SimpleStringProperty(capacidadProducto);
        this.fuenteEnergiaProducto = new SimpleStringProperty(fuenteEnergiaProducto);
    }

    //Metodos atributo: idProducto
    public int getIdProducto() {
        return idProducto.get();
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = new SimpleIntegerProperty(idProducto);
    }
    public IntegerProperty IdProductoProperty() {
        return idProducto;
    }
    //Metodos atributo: nombreProducto
    public String getNombreProducto() {
        return nombreProducto.get();
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = new SimpleStringProperty(nombreProducto);
    }
    public StringProperty NombreProductoProperty() {
        return nombreProducto;
    }
    //Metodos atributo: modeloProducto
    public String getModeloProducto() {
        return modeloProducto.get();
    }
    public void setModeloProducto(String modeloProducto) {
        this.modeloProducto = new SimpleStringProperty(modeloProducto);
    }
    public StringProperty ModeloProductoProperty() {
        return modeloProducto;
    }
    //Metodos atributo: serieProducto
    public String getSerieProducto() {
        return serieProducto.get();
    }
    public void setSerieProducto(String serieProducto) {
        this.serieProducto = new SimpleStringProperty(serieProducto);
    }
    public StringProperty SerieProductoProperty() {
        return serieProducto;
    }
    //Metodos atributo: marcaProducto
    public String getMarcaProducto() {
        return marcaProducto.get();
    }
    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = new SimpleStringProperty(marcaProducto);
    }
    public StringProperty MarcaProductoProperty() {
        return marcaProducto;
    }
    //Metodos atributo: gamaProducto
    public String getGamaProducto() {
        return gamaProducto.get();
    }
    public void setGamaProducto(String gamaProducto) {
        this.gamaProducto = new SimpleStringProperty(gamaProducto);
    }
    public StringProperty GamaProductoProperty() {
        return gamaProducto;
    }
    //Metodos atributo: colorProducto
    public String getColorProducto() {
        return colorProducto.get();
    }
    public void setColorProducto(String colorProducto) {
        this.colorProducto = new SimpleStringProperty(colorProducto);
    }
    public StringProperty ColorProductoProperty() {
        return colorProducto;
    }
    //Metodos atributo: capacidadProducto
    public String getCapacidadProducto() {
        return capacidadProducto.get();
    }
    public void setCapacidadProducto(String capacidadProducto) {
        this.capacidadProducto = new SimpleStringProperty(capacidadProducto);
    }
    public StringProperty CapacidadProductoProperty() {
        return capacidadProducto;
    }
    //Metodos atributo: fuenteEnergiaProducto
    public String getFuenteEnergiaProducto() {
        return fuenteEnergiaProducto.get();
    }
    public void setFuenteEnergiaProducto(String fuenteEnergiaProducto) {
        this.fuenteEnergiaProducto = new SimpleStringProperty(fuenteEnergiaProducto);
    }
    public StringProperty FuenteEnergiaProductoProperty() {
        return fuenteEnergiaProducto;
    }
}
