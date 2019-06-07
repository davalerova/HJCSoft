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


public class Rol{
    private IntegerProperty idRolEmpleado;
    private StringProperty nombreRolEmpleado;

    public Rol(int idRolEmpleado, String nombreRolEmpleado) {
        this.idRolEmpleado = new SimpleIntegerProperty(idRolEmpleado);
        this.nombreRolEmpleado = new SimpleStringProperty(nombreRolEmpleado);
    }

    //Metodos atributo: idRolEmpleado
    public int getIdRolEmpleado() {
        return idRolEmpleado.get();
    }
    public void setIdRolEmpleado(int idRolEmpleado) {
        this.idRolEmpleado = new SimpleIntegerProperty(idRolEmpleado);
    }
    public IntegerProperty IdRolProperty() {
        return idRolEmpleado;
    }
    //Metodos atributo: nombreRolEmpleado
    public String getNombreRolEmpleado() {
        return nombreRolEmpleado.get();
    }
    public void setNombreRolEmpleado(String nombreRolEmpleado) {
        this.nombreRolEmpleado = new SimpleStringProperty(nombreRolEmpleado);
    }
    public StringProperty NombreRolProperty() {
        return nombreRolEmpleado;
    }

    public static void llenarInformacion(Connection connection, ObservableList<Rol> lista){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT idrolempleado, nombrerolempleado FROM rolempleado;");
            while (resultado.next()){
                lista.add(
                    new Rol(
                            resultado.getInt("idrolempleado"),
                            resultado.getString("nombrerolempleado")
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return nombreRolEmpleado.get();
    }
}
