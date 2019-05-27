package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vista.Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Principal implements Initializable {
    Stage principal;
    Vistas vista= new Vistas();

    public Stage getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stage principal) {
        this.principal = principal;
    }

    @FXML
    public void salir(ActionEvent e){
        getPrincipal().close();
    }

    @FXML
    public void cerrarSesion(ActionEvent evt){
        getPrincipal().hide();
        Stage login = new Stage();
        FXMLLoader loginn=vista.vista("Login");
        Login log = new Login();
        loginn.setController(log);

        try{
            Parent root = (Parent)loginn.load();
            Scene escena=new Scene(root);
            login.setScene(escena);
            log.setLogin(login);
            login.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
