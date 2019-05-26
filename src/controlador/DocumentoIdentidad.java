package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class DocumentoIdentidad{
    private IntegerProperty idDocumentoIdentidad;
    private IntegerProperty nombreDocumentoIdentidad;

    public DocumentoIdentidad(int idDocumentoIdentidad, int nombreDocumentoIdentidad) {
        this.idDocumentoIdentidad = new SimpleIntegerProperty(idDocumentoIdentidad);
        this.nombreDocumentoIdentidad = new SimpleIntegerProperty(nombreDocumentoIdentidad);
    }

    //Metodos atributo: idDocumentoIdentidad
    public int getIdDocumentoIdentidad() {
        return idDocumentoIdentidad.get();
    }
    public void setIdDocumentoIdentidad(int idDocumentoIdentidad) {
        this.idDocumentoIdentidad = new SimpleIntegerProperty(idDocumentoIdentidad);
    }
    public IntegerProperty IdDocumentoIdentidadProperty() {
        return idDocumentoIdentidad;
    }
    //Metodos atributo: nombreDocumentoIdentidad
    public int getNombreDocumentoIdentidad() {
        return nombreDocumentoIdentidad.get();
    }
    public void setNombreDocumentoIdentidad(int nombreDocumentoIdentidad) {
        this.nombreDocumentoIdentidad = new SimpleIntegerProperty(nombreDocumentoIdentidad);
    }
    public IntegerProperty NombreDocumentoIdentidadProperty() {
        return nombreDocumentoIdentidad;
    }
}