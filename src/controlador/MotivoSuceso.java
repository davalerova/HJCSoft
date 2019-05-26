package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MotivoSuceso{
    private IntegerProperty idMotivoSuceso;
    private StringProperty nombreMotivoSuceso;

    public MotivoSuceso(int idMotivoSuceso, String nombreMotivoSuceso) {
        this.idMotivoSuceso = new SimpleIntegerProperty(idMotivoSuceso);
        this.nombreMotivoSuceso = new SimpleStringProperty(nombreMotivoSuceso);
    }

    //Metodos atributo: idMotivoSuceso
    public int getIdMotivoSuceso() {
        return idMotivoSuceso.get();
    }
    public void setIdMotivoSuceso(int idMotivoSuceso) {
        this.idMotivoSuceso = new SimpleIntegerProperty(idMotivoSuceso);
    }
    public IntegerProperty IdMotivoSucesoProperty() {
        return idMotivoSuceso;
    }
    //Metodos atributo: nombreMotivoSuceso
    public String getNombreMotivoSuceso() {
        return nombreMotivoSuceso.get();
    }
    public void setNombreMotivoSuceso(String nombreMotivoSuceso) {
        this.nombreMotivoSuceso = new SimpleStringProperty(nombreMotivoSuceso);
    }
    public StringProperty NombreMotivoSucesoProperty() {
        return nombreMotivoSuceso;
    }
}