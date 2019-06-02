package vista;

import javafx.fxml.FXMLLoader;

public class Vistas {
    public FXMLLoader vista(String nombre){
        return new FXMLLoader(getClass().getResource(nombre+".fxml"));
    }
}
