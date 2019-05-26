package controlador;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.sql.Date;

public class FacturaCompraProducto{
    private IntegerProperty idFacturaCompraProducto;
    private IntegerProperty numeroFacturaCompraProducto;
    private Date fechaFacturaCompraProducto;
    private Distribuidor distribuidorFacturaCompraProducto;
    private DoubleProperty valorProductoFacturaCompraProducto;
    private DoubleProperty valorTotalFacturaCompraProducto;

    public FacturaCompraProducto(int idFacturaCompraProducto, int numeroFacturaCompraProducto, Date fechaFacturaCompraProducto,
                                 Distribuidor distribuidorFacturaCompraProducto, Double valorProductoFacturaCompraProducto, Double valorTotalFacturaCompraProducto) {
        this.idFacturaCompraProducto = new SimpleIntegerProperty(idFacturaCompraProducto);
        this.numeroFacturaCompraProducto = new SimpleIntegerProperty(numeroFacturaCompraProducto);
        this.fechaFacturaCompraProducto = fechaFacturaCompraProducto;
        this.distribuidorFacturaCompraProducto = distribuidorFacturaCompraProducto;
        this.valorProductoFacturaCompraProducto = new SimpleDoubleProperty(valorProductoFacturaCompraProducto);
        this.valorTotalFacturaCompraProducto = new SimpleDoubleProperty(valorTotalFacturaCompraProducto);
    }

    //Metodos atributo: idFacturaCompraProducto
    public int getIdFacturaCompraProducto() {
        return idFacturaCompraProducto.get();
    }
    public void setIdFacturaCompraProducto(int idFacturaCompraProducto) {
        this.idFacturaCompraProducto = new SimpleIntegerProperty(idFacturaCompraProducto);
    }
    public IntegerProperty IdFacturaCompraProductoProperty() {
        return idFacturaCompraProducto;
    }
    //Metodos atributo: numeroFacturaCompraProducto
    public int getNumeroFacturaCompraProducto() {
        return numeroFacturaCompraProducto.get();
    }
    public void setNumeroFacturaCompraProducto(int numeroFacturaCompraProducto) {
        this.numeroFacturaCompraProducto = new SimpleIntegerProperty(numeroFacturaCompraProducto);
    }
    public IntegerProperty NumeroFacturaCompraProductoProperty() {
        return numeroFacturaCompraProducto;
    }
    //Metodos atributo: fechaFacturaCompraProducto
    public Date getFechaFacturaCompraProducto() {
        return fechaFacturaCompraProducto;
    }
    public void setFechaFacturaCompraProducto(Date fechaFacturaCompraProducto) {
        this.fechaFacturaCompraProducto = fechaFacturaCompraProducto;
    }
    //Metodos atributo: distribuidorFacturaCompraProducto
    public Distribuidor getDistribuidorFacturaCompraProducto() {
        return distribuidorFacturaCompraProducto;
    }
    public void setDistribuidorFacturaCompraProducto(Distribuidor distribuidorFacturaCompraProducto) {
        this.distribuidorFacturaCompraProducto = distribuidorFacturaCompraProducto;
    }
    //Metodos atributo: valorProductoFacturaCompraProducto
    public Double getValorProductoFacturaCompraProducto() {
        return valorProductoFacturaCompraProducto.get();
    }
    public void setValorProductoFacturaCompraProducto(Double valorProductoFacturaCompraProducto) {
        this.valorProductoFacturaCompraProducto = new SimpleDoubleProperty(valorProductoFacturaCompraProducto);
    }
    public DoubleProperty ValorProductoFacturaCompraProductoProperty() {
        return valorProductoFacturaCompraProducto;
    }
    //Metodos atributo: valorTotalFacturaCompraProducto
    public Double getValorTotalFacturaCompraProducto() {
        return valorTotalFacturaCompraProducto.get();
    }
    public void setValorTotalFacturaCompraProducto(Double valorTotalFacturaCompraProducto) {
        this.valorTotalFacturaCompraProducto = new SimpleDoubleProperty(valorTotalFacturaCompraProducto);
    }
    public DoubleProperty ValorTotalFacturaCompraProductoProperty() {
        return valorTotalFacturaCompraProducto;
    }
}