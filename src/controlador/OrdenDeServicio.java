package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.sql.Date;

public class OrdenDeServicio{
    private IntegerProperty idOrdenDeServicio;
    private StringProperty folioOrdenDeServicio;
    private Date fechaSolicitudOrdenDeServicio;
    private TipoCliente tipoClienteOrdenDeServicio;
    private TipoServicio tipoServicioOrdenDeServicio;
    private StringProperty distribuidorOrdenDeServicio;
    private Date fechaCompraOrdenDeServicio;
    private Date fechaCompromisoOrdenDeServicio;
    private Jornada jornadaCompromisoOrdenDeServicio;
    private Cliente clienteOrdenDeServicio;
    private Producto productoOrdenDeServicio;
    private TipoProblemaProducto tipoProblemaProductoOrdenDeServicio;
    private StringProperty descripcionProblemaProductoOrdenDeServicio;
    private LugarReparacion lugarReparacionOrdenDeServicio;

    public OrdenDeServicio(int idOrdenDeServicio, String folioOrdenDeServicio, Date fechaSolicitudOrdenDeServicio,
                           TipoCliente tipoClienteOrdenDeServicio, TipoServicio tipoServicioOrdenDeServicio, String distribuidorOrdenDeServicio,
                           Date fechaCompraOrdenDeServicio, Date fechaCompromisoOrdenDeServicio, Jornada jornadaCompromisoOrdenDeServicio,
                           Cliente clienteOrdenDeServicio, Producto productoOrdenDeServicio, TipoProblemaProducto tipoProblemaProductoOrdenDeServicio,
                           String descripcionProblemaProductoOrdenDeServicio, LugarReparacion lugarReparacionOrdenDeServicio) {
        this.idOrdenDeServicio = new SimpleIntegerProperty(idOrdenDeServicio);
        this.folioOrdenDeServicio = new SimpleStringProperty(folioOrdenDeServicio);
        this.fechaSolicitudOrdenDeServicio = fechaSolicitudOrdenDeServicio;
        this.tipoClienteOrdenDeServicio = tipoClienteOrdenDeServicio;
        this.tipoServicioOrdenDeServicio = tipoServicioOrdenDeServicio;
        this.distribuidorOrdenDeServicio = new SimpleStringProperty(distribuidorOrdenDeServicio);
        this.fechaCompraOrdenDeServicio = fechaCompraOrdenDeServicio;
        this.fechaCompromisoOrdenDeServicio = fechaCompromisoOrdenDeServicio;
        this.jornadaCompromisoOrdenDeServicio = jornadaCompromisoOrdenDeServicio;
        this.clienteOrdenDeServicio = clienteOrdenDeServicio;
        this.productoOrdenDeServicio = productoOrdenDeServicio;
        this.tipoProblemaProductoOrdenDeServicio = tipoProblemaProductoOrdenDeServicio;
        this.descripcionProblemaProductoOrdenDeServicio = new SimpleStringProperty(descripcionProblemaProductoOrdenDeServicio);
        this.lugarReparacionOrdenDeServicio = lugarReparacionOrdenDeServicio;
    }

    //Metodos atributo: idOrdenDeServicio
    public int getIdOrdenDeServicio() {
        return idOrdenDeServicio.get();
    }
    public void setIdOrdenDeServicio(int idOrdenDeServicio) {
        this.idOrdenDeServicio = new SimpleIntegerProperty(idOrdenDeServicio);
    }
    public IntegerProperty IdOrdenDeServicioProperty() {
        return idOrdenDeServicio;
    }
    //Metodos atributo: folioOrdenDeServicio
    public String getFolioOrdenDeServicio() {
        return folioOrdenDeServicio.get();
    }
    public void setFolioOrdenDeServicio(String folioOrdenDeServicio) {
        this.folioOrdenDeServicio = new SimpleStringProperty(folioOrdenDeServicio);
    }
    public StringProperty FolioOrdenDeServicioProperty() {
        return folioOrdenDeServicio;
    }
    //Metodos atributo: fechaSolicitudOrdenDeServicio
    public Date getFechaSolicitudOrdenDeServicio() {
        return fechaSolicitudOrdenDeServicio;
    }
    public void setFechaSolicitudOrdenDeServicio(Date fechaSolicitudOrdenDeServicio) {
        this.fechaSolicitudOrdenDeServicio = fechaSolicitudOrdenDeServicio;
    }
    //Metodos atributo: tipoClienteOrdenDeServicio
    public TipoCliente getTipoClienteOrdenDeServicio() {
        return tipoClienteOrdenDeServicio;
    }
    public void setTipoClienteOrdenDeServicio(TipoCliente tipoClienteOrdenDeServicio) {
        this.tipoClienteOrdenDeServicio = tipoClienteOrdenDeServicio;
    }
    //Metodos atributo: tipoServicioOrdenDeServicio
    public TipoServicio getTipoServicioOrdenDeServicio() {
        return tipoServicioOrdenDeServicio;
    }
    public void setTipoServicioOrdenDeServicio(TipoServicio tipoServicioOrdenDeServicio) {
        this.tipoServicioOrdenDeServicio = tipoServicioOrdenDeServicio;
    }
    //Metodos atributo: distribuidorOrdenDeServicio
    public String getDistribuidorOrdenDeServicio() {
        return distribuidorOrdenDeServicio.get();
    }
    public void setDistribuidorOrdenDeServicio(String distribuidorOrdenDeServicio) {
        this.distribuidorOrdenDeServicio = new SimpleStringProperty(distribuidorOrdenDeServicio);
    }
    public StringProperty DistribuidorOrdenDeServicioProperty() {
        return distribuidorOrdenDeServicio;
    }
    //Metodos atributo: fechaCompraOrdenDeServicio
    public Date getFechaCompraOrdenDeServicio() {
        return fechaCompraOrdenDeServicio;
    }
    public void setFechaCompraOrdenDeServicio(Date fechaCompraOrdenDeServicio) {
        this.fechaCompraOrdenDeServicio = fechaCompraOrdenDeServicio;
    }
    //Metodos atributo: fechaCompromisoOrdenDeServicio
    public Date getFechaCompromisoOrdenDeServicio() {
        return fechaCompromisoOrdenDeServicio;
    }
    public void setFechaCompromisoOrdenDeServicio(Date fechaCompromisoOrdenDeServicio) {
        this.fechaCompromisoOrdenDeServicio = fechaCompromisoOrdenDeServicio;
    }
    //Metodos atributo: jornadaCompromisoOrdenDeServicio
    public Jornada getJornadaCompromisoOrdenDeServicio() {
        return jornadaCompromisoOrdenDeServicio;
    }
    public void setJornadaCompromisoOrdenDeServicio(Jornada jornadaCompromisoOrdenDeServicio) {
        this.jornadaCompromisoOrdenDeServicio = jornadaCompromisoOrdenDeServicio;
    }
    //Metodos atributo: clienteOrdenDeServicio
    public Cliente getClienteOrdenDeServicio() {
        return clienteOrdenDeServicio;
    }
    public void setClienteOrdenDeServicio(Cliente clienteOrdenDeServicio) {
        this.clienteOrdenDeServicio = clienteOrdenDeServicio;
    }
    //Metodos atributo: productoOrdenDeServicio
    public Producto getProductoOrdenDeServicio() {
        return productoOrdenDeServicio;
    }
    public void setProductoOrdenDeServicio(Producto productoOrdenDeServicio) {
        this.productoOrdenDeServicio = productoOrdenDeServicio;
    }
    //Metodos atributo: tipoProblemaProductoOrdenDeServicio
    public TipoProblemaProducto getTipoProblemaProductoOrdenDeServicio() {
        return tipoProblemaProductoOrdenDeServicio;
    }
    public void setTipoProblemaProductoOrdenDeServicio(TipoProblemaProducto tipoProblemaProductoOrdenDeServicio) {
        this.tipoProblemaProductoOrdenDeServicio = tipoProblemaProductoOrdenDeServicio;
    }
    //Metodos atributo: descripcionProblemaProductoOrdenDeServicio
    public String getDescripcionProblemaProductoOrdenDeServicio() {
        return descripcionProblemaProductoOrdenDeServicio.get();
    }
    public void setDescripcionProblemaProductoOrdenDeServicio(String descripcionProblemaProductoOrdenDeServicio) {
        this.descripcionProblemaProductoOrdenDeServicio = new SimpleStringProperty(descripcionProblemaProductoOrdenDeServicio);
    }
    public StringProperty DescripcionProblemaProductoOrdenDeServicioProperty() {
        return descripcionProblemaProductoOrdenDeServicio;
    }
    //Metodos atributo: lugarReparacionOrdenDeServicio
    public LugarReparacion getLugarReparacionOrdenDeServicio() {
        return lugarReparacionOrdenDeServicio;
    }
    public void setLugarReparacionOrdenDeServicio(LugarReparacion lugarReparacionOrdenDeServicio) {
        this.lugarReparacionOrdenDeServicio = lugarReparacionOrdenDeServicio;
    }
}
