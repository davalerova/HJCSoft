     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String bd = "HJCSoftDB";
    private String password = "postgresqldvd";
    private String url = "jdbc:postgresql://localhost:5432/" + bd;
    Connection conn = null;

    public DbConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, "postgres", password);
        } catch (SQLException e) {
            Alert mensaje=new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("HJCSoft");
            mensaje.setContentText(""+e);
            mensaje.setHeaderText("Error de conexión");
            mensaje.show();
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        this.conn = null;
    }
}
