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
    private IntegerProperty idTipoSalario;
    private StringProperty nombreTipoSalario;

    public TipoSalario(int idTipoSalario, String nombreTipoSalario) {
        this.idTipoSalario = new SimpleIntegerProperty(idTipoSalario);
        this.nombreTipoSalario = new SimpleStringProperty(nombreTipoSalario);
    }

    //Metodos atributo: idTipoSalario
    public int getIdTipoSalario() {
        return idTipoSalario.get();
    }
    public void setIdTipoSalario(int idTipoSalario) {
        this.idTipoSalario = new SimpleIntegerProperty(idTipoSalario);
    }
    public IntegerProperty IdTipoContratoProperty() {
        return idTipoSalario;
    }
    //Metodos atributo: nombreTipoSalario
    public String getNombreTipoSalario() {
        return nombreTipoSalario.get();
    }
    public void setNombreTipoSalario(String nombreTipoSalario) {
        this.nombreTipoSalario = new SimpleStringProperty(nombreTipoSalario);
    }
    public StringProperty NombreTipoContratoProperty() {
        return nombreTipoSalario;
    }
    public static void llenarInformacion(Connection connection, ObservableList<TipoSalario> lista){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT idtiposalario, nombretiposalario FROM tiposalario");
            while (resultado.next()){
                lista.add(
                        new TipoSalario(
                                resultado.getInt("idtiposalario"),
                                resultado.getString("nombretiposalario")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return nombreTipoSalario.get();
    }
}
