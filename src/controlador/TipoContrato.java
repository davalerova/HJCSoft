package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TipoContrato{
    private IntegerProperty idTipoContrato;
    private StringProperty nombreTipoContrato;

    public TipoContrato(int idTipoContrato, String nombreTipoContrato) {
        this.idTipoContrato = new SimpleIntegerProperty(idTipoContrato);
        this.nombreTipoContrato = new SimpleStringProperty(nombreTipoContrato);
    }

    //Metodos atributo: idTipoContrato
    public int getIdTipoContrato() {
        return idTipoContrato.get();
    }
    public void setIdTipoContrato(int idTipoContrato) {
        this.idTipoContrato = new SimpleIntegerProperty(idTipoContrato);
    }
    public IntegerProperty IdTipoContratoProperty() {
        return idTipoContrato;
    }
    //Metodos atributo: nombreTipoContrato
    public String getNombreTipoContrato() {
        return nombreTipoContrato.get();
    }
    public void setNombreTipoContrato(String nombreTipoContrato) {
        this.nombreTipoContrato = new SimpleStringProperty(nombreTipoContrato);
    }
    public StringProperty NombreTipoContratoProperty() {
        return nombreTipoContrato;
    }
}
