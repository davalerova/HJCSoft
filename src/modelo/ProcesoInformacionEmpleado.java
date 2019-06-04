package modelo;

/**
 *
 * @author sala1
 */
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.Empleado;
import controlador.Usuario;
import modelo.Cliente;
import controlador.Sesion;

public class ProcesoInformacionEmpleado {

    private DbConnection conexion;

    public ProcesoInformacionEmpleado() {
        this.conexion = new DbConnection();
    }

    public void listarCliente() {
        String strConsulta = "SELECT*FROM empleado";
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

    public int registrarEmpleado(Empleado unEmpleado) {
        int idempleado = unEmpleado.getIdEmpleado();
        int rolid = unEmpleado.getRolIdEmpleado().getIdRol();
        Date fechaingresoempleado = unEmpleado.getFechaIngresoEmpleado();
        String nacionalidadempleado = unEmpleado.getNacionalidadEmpleado();
        boolean empleadoesusuariosistema = unEmpleado.getEmpleadoEsUsuarioSistema();
        int documentoid = Integer.valueOf(unEmpleado.getTipoDocumentoIdEmpleado().getIdDocumentoIdentidad());
        String numerodocumentoidentidadempleado = unEmpleado.getNumeroDocumentoIdentidadEmpleado();
        String lugarexpediciondocumentoidentiadempleado = unEmpleado.getLugarExpediciónDocumentoIdentiadEmpleado();
        Date fechaexpediciondocumentoidentiadempleado = unEmpleado.getFechaExpedicionDocumentoIdentiadEmpleado();
        String lugarnacimientoempleado = unEmpleado.getLugarNacimientoEmpleado();
        Date fechanacimientoempleado = unEmpleado.getFechaNacimientoEmpleado();
        String nombresempleado = unEmpleado.getNombresEmpleado();
        String apellidosempleado = unEmpleado.getApellidosEmpleado();
        String emailempleado = unEmpleado.getEmailEmpleado();
        String codigopostalempleado = unEmpleado.getCodigoPostalEmpleado();
        String telefonoempleado = unEmpleado.getTelefonoEmpleado();
        String celularempleado = unEmpleado.getCelularEmpleado();
        String telefonoalternativoempleado = unEmpleado.getTelefonoAlternativoEmpleado();
        String direccionempleado = unEmpleado.getDireccionEmpleado();
        String departamentoempleado = unEmpleado.getDepartamentoEmpleado();
        String municipioempleado = unEmpleado.getMunicipioEmpleado();
        String localidadempleado = unEmpleado.getLocalidadEmpleado();
        String upzempleado = unEmpleado.getUpzEmpleado();
        String barrioempleado = unEmpleado.getBarrioEmpleado();
        String nombrepersonacontactoempleado = unEmpleado.getNombrePersonaContactoEmpleado();
        String celualarpersonacontactoempleado = unEmpleado.getCelualarPersonaContactoEmpleado();
        int tipocontratoempleado = Integer.valueOf(unEmpleado.getTipoSalarioEmpleado().getIdTipoContrato());
        int sueldobaseempleado = Integer.valueOf(unEmpleado.getSueldoBaseEmpleado());

        String registroEmpleado = "INSERT INTO empleado(rolid,fechaingresoempleado,nacionalidadempleado," +
                "empleadoesusuariosistema,documentoid,numerodocumentoidentidadempleado,lugarexpediciondocumentoidentiadempleado," +
                "fechaexpediciondocumentoidentiadempleado,lugarnacimientoempleado,fechanacimientoempleado," +
                "nombresempleado,apellidosempleado,emailempleado,codigopostalempleado,telefonoempleado,celularempleado," +
                "telefonoalternativoempleado,direccionempleado,departamentoempleado,municipioempleado,localidadempleado," +
                "upzempleado,barrioempleado,nombrepersonacontactoempleado,celualarpersonacontactoempleado,tipocontratoempleado,sueldobaseempleado) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(registroEmpleado);
            inst.setInt(1, rolid);
            inst.setDate(2, fechaingresoempleado);
            inst.setString(3, nacionalidadempleado);
            inst.setBoolean(4, empleadoesusuariosistema);
            inst.setInt(5, documentoid);
            inst.setString(6, numerodocumentoidentidadempleado);
            inst.setString(7, lugarexpediciondocumentoidentiadempleado);
            inst.setDate(8, fechaexpediciondocumentoidentiadempleado);
            inst.setString(9, lugarnacimientoempleado);
            inst.setDate(10, fechanacimientoempleado);
            inst.setString(11, nombresempleado);
            inst.setString(12, apellidosempleado);
            inst.setString(13, emailempleado);
            inst.setString(14, codigopostalempleado);
            inst.setString(15, telefonoempleado);
            inst.setString(16, celularempleado);
            inst.setString(17, telefonoalternativoempleado);
            inst.setString(18, direccionempleado);
            inst.setString(19, departamentoempleado);
            inst.setString(20, municipioempleado);
            inst.setString(21, localidadempleado);
            inst.setString(22, upzempleado);
            inst.setString(23, barrioempleado);
            inst.setString(24, nombrepersonacontactoempleado);
            inst.setString(25, celualarpersonacontactoempleado);
            inst.setInt(26, tipocontratoempleado);
            inst.setInt(27, sueldobaseempleado);

            return inst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
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
    public void llenarInformacionEmpleado(){

    }
}
