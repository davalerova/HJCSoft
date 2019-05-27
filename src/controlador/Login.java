package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Cliente;
import modelo.ProcesoInformacionCliente;
import vista.Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Login implements Initializable {
    private Scanner input;
    private Cliente cliente;
    private ProcesoInformacionCliente procesoCliente;
    private Login loggin;
    private Captcha cp;
    private boolean robot;
    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.input=new Scanner(System.in);
        this.procesoCliente=new ProcesoInformacionCliente();
        this.cliente=new Cliente();
        this.robot=false;
    }

    public Login() {
        this.usuario=null;
        this.contrasena=null;
    }

    @FXML
    private ImageView logo;

    @FXML
    private TextField usuarioIn;
    @FXML
    private PasswordField claveIn;
    @FXML
    private Button noRobot;
    @FXML
    private TextField captchaOut;
    @FXML
    private TextField captchaIn;
    @FXML
    private Button ingresar;

    Stage login;

    public Stage getLogin() {
        return login;
    }

    public void setLogin(Stage login) {
        this.login = login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image image = new Image("recursos/LogoHJC.png");
        logo.setImage(image);
        System.out.println("Hola javafx");

    }

    @FXML
    public void iniciarSesion(ActionEvent evt){
        String user = usuarioIn.getText();
        String contra = claveIn.getText();
        int captcha = Integer.parseInt(captchaIn.getText());
        setUsuario(user);
        setContrasena(contra);
        if(usuarioIn.getText().equals("daval")&&claveIn.getText().equals("daval")){
            Vistas vista=new Vistas();
            FXMLLoader princi=vista.vista("Principal");
            Principal princ=new Principal();
            princi.setController(princ);
            try {
                Parent root=(Parent)princi.load();
                Scene scena=new Scene(root);
                Stage pricipal= new Stage();
                pricipal.setScene(scena);
                pricipal.setTitle("HJCSoft");
                princ.setPrincipal(pricipal);
                pricipal.show();
                getLogin().hide();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    @FXML
    protected void nuevoCaptcha() {
        this.robot=true;
        cp = new Captcha();
        captchaOut.setText(cp.validarCaptha());
    }
}
