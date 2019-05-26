package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EvidenciaTecnica{
    private IntegerProperty idEvidenciaTecnica;
    private StringProperty fotoProductoEvidenciaTecnica;
    private StringProperty fotoPlacaTecnicaEvidenciaTecnica;
    private StringProperty fotoFallaEvidenciaTecnica;
    private StringProperty fotoRepuestoEvidenciaTecnica;
    private StringProperty fotoFacturaCompraEvidenciaTecnica;
    private StringProperty fotoOrdenServicioEvidenciaTecnica;
    private StringProperty fotoEntradaDomicilioEvidenciaTecnica;
    private StringProperty otraFotoEvidenciaTecnica;

    public EvidenciaTecnica(int idEvidenciaTecnica, String fotoProductoEvidenciaTecnica, String fotoPlacaTecnicaEvidenciaTecnica,
                            String fotoFallaEvidenciaTecnica, String fotoRepuestoEvidenciaTecnica, String fotoFacturaCompraEvidenciaTecnica,
                            String fotoOrdenServicioEvidenciaTecnica, String fotoEntradaDomicilioEvidenciaTecnica, String otraFotoEvidenciaTecnica) {
        this.idEvidenciaTecnica = new SimpleIntegerProperty(idEvidenciaTecnica);
        this.fotoProductoEvidenciaTecnica = new SimpleStringProperty(fotoProductoEvidenciaTecnica);
        this.fotoPlacaTecnicaEvidenciaTecnica = new SimpleStringProperty(fotoPlacaTecnicaEvidenciaTecnica);
        this.fotoFallaEvidenciaTecnica = new SimpleStringProperty(fotoFallaEvidenciaTecnica);
        this.fotoRepuestoEvidenciaTecnica = new SimpleStringProperty(fotoRepuestoEvidenciaTecnica);
        this.fotoFacturaCompraEvidenciaTecnica = new SimpleStringProperty(fotoFacturaCompraEvidenciaTecnica);
        this.fotoOrdenServicioEvidenciaTecnica = new SimpleStringProperty(fotoOrdenServicioEvidenciaTecnica);
        this.fotoEntradaDomicilioEvidenciaTecnica = new SimpleStringProperty(fotoEntradaDomicilioEvidenciaTecnica);
        this.otraFotoEvidenciaTecnica = new SimpleStringProperty(otraFotoEvidenciaTecnica);
    }

    //Metodos atributo: idEvidenciaTecnica
    public int getIdEvidenciaTecnica() {
        return idEvidenciaTecnica.get();
    }
    public void setIdEvidenciaTecnica(int idEvidenciaTecnica) {
        this.idEvidenciaTecnica = new SimpleIntegerProperty(idEvidenciaTecnica);
    }
    public IntegerProperty IdEvidenciaTecnicaProperty() {
        return idEvidenciaTecnica;
    }
    //Metodos atributo: fotoProductoEvidenciaTecnica
    public String getFotoProductoEvidenciaTecnica() {
        return fotoProductoEvidenciaTecnica.get();
    }
    public void setFotoProductoEvidenciaTecnica(String fotoProductoEvidenciaTecnica) {
        this.fotoProductoEvidenciaTecnica = new SimpleStringProperty(fotoProductoEvidenciaTecnica);
    }
    public StringProperty FotoProductoEvidenciaTecnicaProperty() {
        return fotoProductoEvidenciaTecnica;
    }
    //Metodos atributo: fotoPlacaTecnicaEvidenciaTecnica
    public String getFotoPlacaTecnicaEvidenciaTecnica() {
        return fotoPlacaTecnicaEvidenciaTecnica.get();
    }
    public void setFotoPlacaTecnicaEvidenciaTecnica(String fotoPlacaTecnicaEvidenciaTecnica) {
        this.fotoPlacaTecnicaEvidenciaTecnica = new SimpleStringProperty(fotoPlacaTecnicaEvidenciaTecnica);
    }
    public StringProperty FotoPlacaTecnicaEvidenciaTecnicaProperty() {
        return fotoPlacaTecnicaEvidenciaTecnica;
    }
    //Metodos atributo: fotoFallaEvidenciaTecnica
    public String getFotoFallaEvidenciaTecnica() {
        return fotoFallaEvidenciaTecnica.get();
    }
    public void setFotoFallaEvidenciaTecnica(String fotoFallaEvidenciaTecnica) {
        this.fotoFallaEvidenciaTecnica = new SimpleStringProperty(fotoFallaEvidenciaTecnica);
    }
    public StringProperty FotoFallaEvidenciaTecnicaProperty() {
        return fotoFallaEvidenciaTecnica;
    }
    //Metodos atributo: fotoRepuestoEvidenciaTecnica
    public String getFotoRepuestoEvidenciaTecnica() {
        return fotoRepuestoEvidenciaTecnica.get();
    }
    public void setFotoRepuestoEvidenciaTecnica(String fotoRepuestoEvidenciaTecnica) {
        this.fotoRepuestoEvidenciaTecnica = new SimpleStringProperty(fotoRepuestoEvidenciaTecnica);
    }
    public StringProperty FotoRepuestoEvidenciaTecnicaProperty() {
        return fotoRepuestoEvidenciaTecnica;
    }
    //Metodos atributo: fotoFacturaCompraEvidenciaTecnica
    public String getFotoFacturaCompraEvidenciaTecnica() {
        return fotoFacturaCompraEvidenciaTecnica.get();
    }
    public void setFotoFacturaCompraEvidenciaTecnica(String fotoFacturaCompraEvidenciaTecnica) {
        this.fotoFacturaCompraEvidenciaTecnica = new SimpleStringProperty(fotoFacturaCompraEvidenciaTecnica);
    }
    public StringProperty FotoFacturaCompraEvidenciaTecnicaProperty() {
        return fotoFacturaCompraEvidenciaTecnica;
    }
    //Metodos atributo: fotoOrdenServicioEvidenciaTecnica
    public String getFotoOrdenServicioEvidenciaTecnica() {
        return fotoOrdenServicioEvidenciaTecnica.get();
    }
    public void setFotoOrdenServicioEvidenciaTecnica(String fotoOrdenServicioEvidenciaTecnica) {
        this.fotoOrdenServicioEvidenciaTecnica = new SimpleStringProperty(fotoOrdenServicioEvidenciaTecnica);
    }
    public StringProperty FotoOrdenServicioEvidenciaTecnicaProperty() {
        return fotoOrdenServicioEvidenciaTecnica;
    }
    //Metodos atributo: fotoEntradaDomicilioEvidenciaTecnica
    public String getFotoEntradaDomicilioEvidenciaTecnica() {
        return fotoEntradaDomicilioEvidenciaTecnica.get();
    }
    public void setFotoEntradaDomicilioEvidenciaTecnica(String fotoEntradaDomicilioEvidenciaTecnica) {
        this.fotoEntradaDomicilioEvidenciaTecnica = new SimpleStringProperty(fotoEntradaDomicilioEvidenciaTecnica);
    }
    public StringProperty FotoEntradaDomicilioEvidenciaTecnicaProperty() {
        return fotoEntradaDomicilioEvidenciaTecnica;
    }
    //Metodos atributo: otraFotoEvidenciaTecnica
    public String getOtraFotoEvidenciaTecnica() {
        return otraFotoEvidenciaTecnica.get();
    }
    public void setOtraFotoEvidenciaTecnica(String otraFotoEvidenciaTecnica) {
        this.otraFotoEvidenciaTecnica = new SimpleStringProperty(otraFotoEvidenciaTecnica);
    }
    public StringProperty OtraFotoEvidenciaTecnicaProperty() {
        return otraFotoEvidenciaTecnica;
    }
}