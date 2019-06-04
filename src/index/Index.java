package index;

import controlador.Login;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vista.Vistas;

public class Index extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Vistas vista =new Vistas();
        FXMLLoader fxml=vista.vista("Login");
        Login logi=new Login();
        fxml.setController(logi);
        Parent root=(Parent)fxml.load();
        Scene scena=new Scene(root);
        primaryStage.setScene(scena);
        primaryStage.setTitle("HJCSoft - Inicio de sesión");
        logi.setLogin(primaryStage);
        primaryStage.show();
    }
    public static void main (String arg[]){
        launch(arg);
    }
}
