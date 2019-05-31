package modelo;

/**
 *
 * @author sala1
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import controlador.Sesion;

public class ProcesoInformacionCliente {

    private DbConnection conexion;

    public ProcesoInformacionCliente() {
        this.conexion = new DbConnection();
    }

    public void listarCliente() {
        String strConsulta = "SELECT*FROM cliente";
        int registros = 0;
        try {
            PreparedStatement pstm
                    = conexion.getConnection().prepareStatement(strConsulta);
            ResultSet res = pstm.executeQuery();

            String codigo = "";
            String nombre = "";
            String apellido = "";
            String telefono = "";
            String correo = "";

            int i = 0;
            while (res.next()) {
                codigo = res.getString("codigocli");
                nombre = res.getString("nombrecli");
                apellido = res.getString("apellidocli");
                telefono = res.getString("telefonocli");
                correo = res.getString("correocli");
                i++;
                System.out.println(codigo + "\t" + nombre + "\t" + apellido + "\t" + telefono + "\t" + correo);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void registrarCliente(Cliente unCliente) {
        String codigo = unCliente.getCodigo();
        String nombre = unCliente.getNombre();
        String apellido = unCliente.getApellido();
        String telefono = unCliente.getTelefono();
        String correo = unCliente.getCorreo();
        String registroCliente = "INSERT INTO cliente(codigocli,nombrecli,apellidocli,telefonocli,correocli) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(registroCliente);
            inst.setString(1, codigo);
            inst.setString(2, nombre);
            inst.setString(3, apellido);
            inst.setString(4, telefono);
            inst.setString(5, correo);
            inst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void consultarCliente(String codigoCliente) {
        String codigo = codigoCliente;
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String correo = "";
        String consultaSql = "SELECT*FROM cliente WHERE codigocli=?";
        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(consultaSql);
            inst.setString(1, codigo);
            ResultSet rs = inst.executeQuery();

            while (rs.next() == true) {
                nombre = rs.getString(2);
                apellido = rs.getString(3);

                telefono = rs.getString(4);
                correo = rs.getString(5);

                System.out.println(codigo + " " + nombre + " " + apellido + " " + telefono + " " + correo);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void actualizarDatosCliente(String codigo, String nombre, String apellido, String telefono, String correo) {
        String actualizaSql = "UPDATE cliente SET nombrecli=?,apellidocli=?,telefonocli=?,correocli=? WHERE codigocli=?";
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(actualizaSql);
            inst.setString(5, codigo);
            inst.setString(1, nombre);
            inst.setString(2, apellido);
            inst.setString(3, telefono);
            inst.setString(4, correo);
            inst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void borrarDatosCliente(String codigoCliente) {
        String codigo = codigoCliente;
        String borraSql = "DELETE FROM cliente WHERE codigocli=?";
        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(borraSql);
            inst.setString(1, codigo);
            inst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public String validarUsuario(Sesion sesion) {
        String usuario = "";
        String contrasena = sesion.getContrasena();
        String consultaSql = "SELECT*FROM usuario WHERE passwordusu=md5(?)";
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(consultaSql);
            inst.setString(1, contrasena);
            ResultSet rs = inst.executeQuery();

            while (rs.next() == true) {
                usuario = rs.getString(4);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return usuario;
    }

    public boolean usuarioExiste(Usuario unUsuario) {
        String usuario = unUsuario.getUsuario();
        String consultaSql = "SELECT*FROM usuario WHERE loginusu=?";
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(consultaSql);
            inst.setString(1, usuario);
            ResultSet rs = inst.executeQuery();
            usuario = "";
            while (rs.next() == true) {
                usuario = rs.getString(4);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        if (usuario.equals(unUsuario.usuario)) {
            if(usuario.length()!=0)System.out.println("Este usuario ya existe, por favor ingrese un nuevo usuario");
            else System.out.println("Debe introducir los datos completos");
            return true;
        }
        registrarUsuario(unUsuario);
        return false;

    }
    public void registrarUsuario(Usuario unUsuario) {
        String nombre = unUsuario.getNombre();
        String apellido = unUsuario.getApellido();
        String correo = unUsuario.getCorreo();
        String usuario = unUsuario.getUsuario();
        String clave = unUsuario.getClave();
        String registroCliente = "INSERT INTO usuario(nombreusu,apellidousu,correousu,loginusu,passwordusu) VALUES(?,?,?,?,md5(?))";

        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(registroCliente);
            inst.setString(1, nombre);
            inst.setString(2, apellido);
            inst.setString(3, correo);
            inst.setString(4, usuario);
            inst.setString(5, clave);
            inst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    public void registrarLoginFallido(Sesion sesion) {
        String usuario = sesion.getUsuario();
        String clave = sesion.getContrasena();
        String registroCliente = "INSERT INTO loginfaillog(loginlog,passwordlog) VALUES(?,?)";

        try {
            PreparedStatement inst
                    = conexion.getConnection().prepareStatement(registroCliente);
            inst.setString(1, usuario);
            inst.setString(2, clave);
            inst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
