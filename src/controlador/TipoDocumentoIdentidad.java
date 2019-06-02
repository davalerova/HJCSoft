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

public class TipoDocumentoIdentidad {
    private IntegerProperty idDocumentoIdentidad;
    private StringProperty nombreDocumentoIdentidad;

    public TipoDocumentoIdentidad(int idDocumentoIdentidad, String nombreDocumentoIdentidad) {
        this.idDocumentoIdentidad = new SimpleIntegerProperty(idDocumentoIdentidad);
        this.nombreDocumentoIdentidad = new SimpleStringProperty(nombreDocumentoIdentidad);
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
    public String getNombreDocumentoIdentidad() {
        return nombreDocumentoIdentidad.get();
    }
    public void setNombreDocumentoIdentidad(String nombreDocumentoIdentidad) {
        this.nombreDocumentoIdentidad = new SimpleStringProperty(nombreDocumentoIdentidad);
    }
    public StringProperty NombreDocumentoIdentidadProperty() {
        return nombreDocumentoIdentidad;
    }

    public static void llenarInformacion(Connection connection, ObservableList<TipoDocumentoIdentidad> lista){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT iddocumentoidentidad, nombredocumentoidentidad FROM documentoidentidad;");
            while (resultado.next()){
                lista.add(
                        new TipoDocumentoIdentidad(
                                resultado.getInt("iddocumentoidentidad"),
                                resultado.getString("nombredocumentoidentidad")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return nombreDocumentoIdentidad.get();
    }
}