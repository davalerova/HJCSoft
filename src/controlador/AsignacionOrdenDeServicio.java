package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.sql.Date;

public class AsignacionOrdenDeServicio{
    private IntegerProperty idAsignacionOrdenDeServicio;
    private OrdenDeServicio idOrdenDeServicioAsignacionOrdenDeServicio;
    private Empleado idEmpleadoAsignacionOrdenDeServicio;
    private Date fechaCompromisoAsignacionOrdenDeServicio;
    private Jornada jornadaCompromisoAsignacionOrdenDeServicio;
    private SucesoOS susesoOSAsignacionOrdenDeServicio;

    public AsignacionOrdenDeServicio(int idAsignacionOrdenDeServicio, OrdenDeServicio idOrdenDeServicioAsignacionOrdenDeServicio, Empleado idEmpleadoAsignacionOrdenDeServicio,
                                     Date fechaCompromisoAsignacionOrdenDeServicio, Jornada jornadaCompromisoAsignacionOrdenDeServicio, SucesoOS susesoOSAsignacionOrdenDeServicio) {
        this.idAsignacionOrdenDeServicio = new SimpleIntegerProperty(idAsignacionOrdenDeServicio);
        this.idOrdenDeServicioAsignacionOrdenDeServicio = idOrdenDeServicioAsignacionOrdenDeServicio;
        this.idEmpleadoAsignacionOrdenDeServicio = idEmpleadoAsignacionOrdenDeServicio;
        this.fechaCompromisoAsignacionOrdenDeServicio = fechaCompromisoAsignacionOrdenDeServicio;
        this.jornadaCompromisoAsignacionOrdenDeServicio = jornadaCompromisoAsignacionOrdenDeServicio;
        this.susesoOSAsignacionOrdenDeServicio = susesoOSAsignacionOrdenDeServicio;
    }

    //Metodos atributo: idAsignacionOrdenDeServicio
    public int getIdAsignacionOrdenDeServicio() {
        return idAsignacionOrdenDeServicio.get();
    }
    public void setIdAsignacionOrdenDeServicio(int idAsignacionOrdenDeServicio) {
        this.idAsignacionOrdenDeServicio = new SimpleIntegerProperty(idAsignacionOrdenDeServicio);
    }
    public IntegerProperty IdAsignacionOrdenDeServicioProperty() {
        return idAsignacionOrdenDeServicio;
    }
    //Metodos atributo: idOrdenDeServicioAsignacionOrdenDeServicio
    public OrdenDeServicio getIdOrdenDeServicioAsignacionOrdenDeServicio() {
        return idOrdenDeServicioAsignacionOrdenDeServicio;
    }
    public void setIdOrdenDeServicioAsignacionOrdenDeServicio(OrdenDeServicio idOrdenDeServicioAsignacionOrdenDeServicio) {
        this.idOrdenDeServicioAsignacionOrdenDeServicio = idOrdenDeServicioAsignacionOrdenDeServicio;
    }
    //Metodos atributo: idEmpleadoAsignacionOrdenDeServicio
    public Empleado getIdEmpleadoAsignacionOrdenDeServicio() {
        return idEmpleadoAsignacionOrdenDeServicio;
    }
    public void setIdEmpleadoAsignacionOrdenDeServicio(Empleado idEmpleadoAsignacionOrdenDeServicio) {
        this.idEmpleadoAsignacionOrdenDeServicio = idEmpleadoAsignacionOrdenDeServicio;
    }
    //Metodos atributo: fechaCompromisoAsignacionOrdenDeServicio
    public Date getFechaCompromisoAsignacionOrdenDeServicio() {
        return fechaCompromisoAsignacionOrdenDeServicio;
    }
    public void setFechaCompromisoAsignacionOrdenDeServicio(Date fechaCompromisoAsignacionOrdenDeServicio) {
        this.fechaCompromisoAsignacionOrdenDeServicio = fechaCompromisoAsignacionOrdenDeServicio;
    }
    //Metodos atributo: jornadaCompromisoAsignacionOrdenDeServicio
    public Jornada getJornadaCompromisoAsignacionOrdenDeServicio() {
        return jornadaCompromisoAsignacionOrdenDeServicio;
    }
    public void setJornadaCompromisoAsignacionOrdenDeServicio(Jornada jornadaCompromisoAsignacionOrdenDeServicio) {
        this.jornadaCompromisoAsignacionOrdenDeServicio = jornadaCompromisoAsignacionOrdenDeServicio;
    }
    //Metodos atributo: susesoOSAsignacionOrdenDeServicio
    public SucesoOS getSusesoOSAsignacionOrdenDeServicio() {
        return susesoOSAsignacionOrdenDeServicio;
    }
    public void setSusesoOSAsignacionOrdenDeServicio(SucesoOS susesoOSAsignacionOrdenDeServicio) {
        this.susesoOSAsignacionOrdenDeServicio = susesoOSAsignacionOrdenDeServicio;
    }
}
