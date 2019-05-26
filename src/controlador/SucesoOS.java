package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.sql.Date;

public class SucesoOS{
    private IntegerProperty idSucesoOS;
    private MotivoSuceso motivoSucesoOS;
    private Usuario usuarioSucesoOS;
    private Date fechaSucesoOS;

    public SucesoOS(int idSucesoOS, MotivoSuceso motivoSucesoOS, Usuario usuarioSucesoOS,
                    Date fechaSucesoOS) {
        this.idSucesoOS = new SimpleIntegerProperty(idSucesoOS);
        this.motivoSucesoOS = motivoSucesoOS;
        this.usuarioSucesoOS = usuarioSucesoOS;
        this.fechaSucesoOS = fechaSucesoOS;
    }

    //Metodos atributo: idSucesoOS
    public int getIdSucesoOS() {
        return idSucesoOS.get();
    }
    public void setIdSucesoOS(int idSucesoOS) {
        this.idSucesoOS = new SimpleIntegerProperty(idSucesoOS);
    }
    public IntegerProperty IdSucesoOSProperty() {
        return idSucesoOS;
    }
    //Metodos atributo: motivoSucesoOS
    public MotivoSuceso getMotivoSucesoOS() {
        return motivoSucesoOS;
    }
    public void setMotivoSucesoOS(MotivoSuceso motivoSucesoOS) {
        this.motivoSucesoOS = motivoSucesoOS;
    }
    //Metodos atributo: usuarioSucesoOS
    public Usuario getUsuarioSucesoOS() {
        return usuarioSucesoOS;
    }
    public void setUsuarioSucesoOS(Usuario usuarioSucesoOS) {
        this.usuarioSucesoOS = usuarioSucesoOS;
    }
    //Metodos atributo: fechaSucesoOS
    public Date getFechaSucesoOS() {
        return fechaSucesoOS;
    }
    public void setFechaSucesoOS(Date fechaSucesoOS) {
        this.fechaSucesoOS = fechaSucesoOS;
    }
}