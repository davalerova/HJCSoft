package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MaterialDocumentalTecnico{
    private IntegerProperty idMaterialDocumentalTecnico;
    private TipoMaterialDocumentalTecnico tipoMaterialDocumentalTecnico;
    private StringProperty enlaceMaterialDocumentalTecnico;

    public MaterialDocumentalTecnico(int idMaterialDocumentalTecnico, TipoMaterialDocumentalTecnico tipoMaterialDocumentalTecnico, String enlaceMaterialDocumentalTecnico) {
        this.idMaterialDocumentalTecnico = new SimpleIntegerProperty(idMaterialDocumentalTecnico);
        this.tipoMaterialDocumentalTecnico = tipoMaterialDocumentalTecnico;
        this.enlaceMaterialDocumentalTecnico = new SimpleStringProperty(enlaceMaterialDocumentalTecnico);
    }

    //Metodos atributo: idMaterialDocumentalTecnico
    public int getIdMaterialDocumentalTecnico() {
        return idMaterialDocumentalTecnico.get();
    }
    public void setIdMaterialDocumentalTecnico(int idMaterialDocumentalTecnico) {
        this.idMaterialDocumentalTecnico = new SimpleIntegerProperty(idMaterialDocumentalTecnico);
    }
    public IntegerProperty IdMaterialDocumentalTecnicoProperty() {
        return idMaterialDocumentalTecnico;
    }
    //Metodos atributo: tipoMaterialDocumentalTecnico
    public TipoMaterialDocumentalTecnico getTipoMaterialDocumentalTecnico() {
        return tipoMaterialDocumentalTecnico;
    }
    public void setTipoMaterialDocumentalTecnico(TipoMaterialDocumentalTecnico tipoMaterialDocumentalTecnico) {
        this.tipoMaterialDocumentalTecnico = tipoMaterialDocumentalTecnico;
    }
    //Metodos atributo: enlaceMaterialDocumentalTecnico
    public String getEnlaceMaterialDocumentalTecnico() {
        return enlaceMaterialDocumentalTecnico.get();
    }
    public void setEnlaceMaterialDocumentalTecnico(String enlaceMaterialDocumentalTecnico) {
        this.enlaceMaterialDocumentalTecnico = new SimpleStringProperty(enlaceMaterialDocumentalTecnico);
    }
    public StringProperty EnlaceMaterialDocumentalTecnicoProperty() {
        return enlaceMaterialDocumentalTecnico;
    }
}