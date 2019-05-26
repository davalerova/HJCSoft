package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TipoMaterialDocumentalTecnico{
    private IntegerProperty idTipoMaterialDocumentalTecnico;
    private StringProperty nombreTipoMaterialDocumentalTecnico;

    public TipoMaterialDocumentalTecnico(int idTipoMaterialDocumentalTecnico, String nombreTipoMaterialDocumentalTecnico) {
        this.idTipoMaterialDocumentalTecnico = new SimpleIntegerProperty(idTipoMaterialDocumentalTecnico);
        this.nombreTipoMaterialDocumentalTecnico = new SimpleStringProperty(nombreTipoMaterialDocumentalTecnico);
    }

    //Metodos atributo: idTipoMaterialDocumentalTecnico
    public int getIdTipoMaterialDocumentalTecnico() {
        return idTipoMaterialDocumentalTecnico.get();
    }
    public void setIdTipoMaterialDocumentalTecnico(int idTipoMaterialDocumentalTecnico) {
        this.idTipoMaterialDocumentalTecnico = new SimpleIntegerProperty(idTipoMaterialDocumentalTecnico);
    }
    public IntegerProperty IdTipoMaterialDocumentalTecnicoProperty() {
        return idTipoMaterialDocumentalTecnico;
    }
    //Metodos atributo: nombreTipoMaterialDocumentalTecnico
    public String getNombreTipoMaterialDocumentalTecnico() {
        return nombreTipoMaterialDocumentalTecnico.get();
    }
    public void setNombreTipoMaterialDocumentalTecnico(String nombreTipoMaterialDocumentalTecnico) {
        this.nombreTipoMaterialDocumentalTecnico = new SimpleStringProperty(nombreTipoMaterialDocumentalTecnico);
    }
    public StringProperty NombreTipoMaterialDocumentalTecnicoProperty() {
        return nombreTipoMaterialDocumentalTecnico;
    }
}
