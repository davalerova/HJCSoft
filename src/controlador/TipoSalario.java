package controlador;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TipoSalario {
    private IntegerProperty idTipoContrato;
    private StringProperty nombreTipoContrato;

    public TipoSalario(int idTipoContrato, String nombreTipoContrato) {
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
    public static void llenarInformacion(Connection connection, ObservableList<TipoSalario> lista){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT idtipocontrato, nombretipocontrato FROM tipocontrato");
            while (resultado.next()){
                lista.add(
                        new TipoSalario(
                                resultado.getInt("idtipocontrato"),
                                resultado.getString("nombretipocontrato")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return nombreTipoContrato.get();
    }
}
