package controlador;

import javafx.beans.property.*;
import javafx.collections.ObservableList;

import java.sql.*;


public class Empleado {
    private IntegerProperty idEmpleado;
    private Rol rolEmpleadoId;
    private Date fechaIngresoEmpleado;
    private StringProperty nacionalidadEmpleado;
    private SimpleBooleanProperty empleadoEsUsuarioSistema;
    private TipoDocumentoIdentidad tipoDocumentoIdEmpleado;
    private StringProperty numeroDocumentoIdentidadEmpleado;
    private StringProperty lugarExpedicionDocumentoIdentiadEmpleado;
    private Date fechaExpedicionDocumentoIdentiadEmpleado;
    private StringProperty lugarNacimientoEmpleado;
    private Date fechaNacimientoEmpleado;
    private StringProperty nombresEmpleado;
    private StringProperty apellidosEmpleado;
    private StringProperty emailEmpleado;
    private StringProperty codigoPostalEmpleado;
    private StringProperty telefonoEmpleado;
    private StringProperty celularEmpleado;
    private StringProperty telefonoAlternativoEmpleado;
    private StringProperty direccionEmpleado;
    private StringProperty barrioEmpleado;
    private StringProperty upzEmpleado;
    private StringProperty localidadEmpleado;
    private StringProperty municipioEmpleado;
    private StringProperty departamentoEmpleado;
    private StringProperty nombrePersonaContactoEmpleado;
    private StringProperty celualarPersonaContactoEmpleado;
    private TipoSalario tipoSalarioEmpleado;
    private IntegerProperty sueldoBaseEmpleado;

    public Empleado(int idEmpleado, Rol rolEmpleadoId, Date fechaIngresoEmpleado,
                    String nacionalidadEmpleado, boolean empleadoEsUsuarioSistema, TipoDocumentoIdentidad tipoDocumentoIdEmpleado,
                    String numeroDocumentoIdentidadEmpleado, String lugarExpediciónDocumentoIdentiadEmpleado, Date fechaExpediciónDocumentoIdentiadEmpleado,
                    String lugarNacimientoEmpleado, Date fechaNacimientoEmpleado, String nombresEmpleado,
                    String apellidosEmpleado, String emailEmpleado, String codigoPostalEmpleado,
                    String telefonoEmpleado, String celularEmpleado, String telefonoAlternativoEmpleado,
                    String direccionEmpleado, String barrioEmpleado, String upzEmpleado,
                    String localidadEmpleado, String municipioEmpleado, String departamentoEmpleado,
                    String nombrePersonaContactoEmpleado, String celualarPersonaContactoEmpleado, TipoSalario tipoSalarioEmpleado,
                    int sueldoBaseEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
        this.rolEmpleadoId = rolEmpleadoId;
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
        this.nacionalidadEmpleado = new SimpleStringProperty(nacionalidadEmpleado);
        this.empleadoEsUsuarioSistema = new SimpleBooleanProperty(empleadoEsUsuarioSistema);
        this.tipoDocumentoIdEmpleado = tipoDocumentoIdEmpleado;
        this.numeroDocumentoIdentidadEmpleado = new SimpleStringProperty(numeroDocumentoIdentidadEmpleado);
        this.lugarExpedicionDocumentoIdentiadEmpleado = new SimpleStringProperty(lugarExpediciónDocumentoIdentiadEmpleado);
        this.fechaExpedicionDocumentoIdentiadEmpleado = fechaExpediciónDocumentoIdentiadEmpleado;
        this.lugarNacimientoEmpleado = new SimpleStringProperty(lugarNacimientoEmpleado);
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
        this.nombresEmpleado = new SimpleStringProperty(nombresEmpleado);
        this.apellidosEmpleado = new SimpleStringProperty(apellidosEmpleado);
        this.emailEmpleado = new SimpleStringProperty(emailEmpleado);
        this.codigoPostalEmpleado = new SimpleStringProperty(codigoPostalEmpleado);
        this.telefonoEmpleado = new SimpleStringProperty(telefonoEmpleado);
        this.celularEmpleado = new SimpleStringProperty(celularEmpleado);
        this.telefonoAlternativoEmpleado = new SimpleStringProperty(telefonoAlternativoEmpleado);
        this.direccionEmpleado = new SimpleStringProperty(direccionEmpleado);
        this.barrioEmpleado = new SimpleStringProperty(barrioEmpleado);
        this.upzEmpleado = new SimpleStringProperty(upzEmpleado);
        this.localidadEmpleado = new SimpleStringProperty(localidadEmpleado);
        this.municipioEmpleado = new SimpleStringProperty(municipioEmpleado);
        this.departamentoEmpleado = new SimpleStringProperty(departamentoEmpleado);
        this.nombrePersonaContactoEmpleado = new SimpleStringProperty(nombrePersonaContactoEmpleado);
        this.celualarPersonaContactoEmpleado = new SimpleStringProperty(celualarPersonaContactoEmpleado);
        this.tipoSalarioEmpleado = tipoSalarioEmpleado;
        this.sueldoBaseEmpleado = new SimpleIntegerProperty(sueldoBaseEmpleado);
    }

    public Empleado(int idEmpleado,
            String nombresEmpleado,
                    String apellidosEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
        this.nombresEmpleado = new SimpleStringProperty(nombresEmpleado);
        this.apellidosEmpleado = new SimpleStringProperty(apellidosEmpleado);
    }

    public Empleado(int idEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
    }

    //Metodos atributo: idEmpleado
    public int getIdEmpleado() {
        return idEmpleado.get();
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = new SimpleIntegerProperty(idEmpleado);
    }

    public IntegerProperty IdEmpleadoProperty() {
        return idEmpleado;
    }

    //Metodos atributo: rolEmpleadoId
    public Rol getRolEmpleadoId() {
        return rolEmpleadoId;
    }

    public void setRolEmpleadoId(Rol rolEmpleadoId) {
        this.rolEmpleadoId = rolEmpleadoId;
    }

    //Metodos atributo: fechaIngresoEmpleado
    public Date getFechaIngresoEmpleado() {
        return fechaIngresoEmpleado;
    }

    public void setFechaIngresoEmpleado(Date fechaIngresoEmpleado) {
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    //Metodos atributo: nacionalidadEmpleado
    public String getNacionalidadEmpleado() {
        return nacionalidadEmpleado.get();
    }

    public void setNacionalidadEmpleado(String nacionalidadEmpleado) {
        this.nacionalidadEmpleado = new SimpleStringProperty(nacionalidadEmpleado);
    }

    public StringProperty NacionalidadEmpleadoProperty() {
        return nacionalidadEmpleado;
    }

    //Metodos atributo: empleadoEsUsuarioSistema
    public boolean getEmpleadoEsUsuarioSistema() {
        return empleadoEsUsuarioSistema.get();
    }

    public void setEmpleadoEsUsuarioSistema(boolean empleadoEsUsuarioSistema) {
        this.empleadoEsUsuarioSistema = new SimpleBooleanProperty(empleadoEsUsuarioSistema);
    }

    public BooleanProperty EmpleadoEsUsuarioSistemaProperty() {
        return empleadoEsUsuarioSistema;
    }

    //Metodos atributo: tipoDocumentoIdEmpleado
    public TipoDocumentoIdentidad getTipoDocumentoIdEmpleado() {
        return tipoDocumentoIdEmpleado;
    }

    public void setTipoDocumentoIdEmpleado(TipoDocumentoIdentidad tipoDocumentoIdEmpleado) {
        this.tipoDocumentoIdEmpleado = tipoDocumentoIdEmpleado;
    }

    //Metodos atributo: numeroDocumentoIdentidadEmpleado
    public String getNumeroDocumentoIdentidadEmpleado() {
        return numeroDocumentoIdentidadEmpleado.get();
    }

    public void setNumeroDocumentoIdentidadEmpleado(String numeroDocumentoIdentidadEmpleado) {
        this.numeroDocumentoIdentidadEmpleado = new SimpleStringProperty(numeroDocumentoIdentidadEmpleado);
    }

    public StringProperty NumeroDocumentoIdentidadEmpleadoProperty() {
        return numeroDocumentoIdentidadEmpleado;
    }

    //Metodos atributo: lugarExpediciónDocumentoIdentiadEmpleado
    public String getLugarExpediciónDocumentoIdentiadEmpleado() {
        return lugarExpedicionDocumentoIdentiadEmpleado.get();
    }

    public void setLugarExpediciónDocumentoIdentiadEmpleado(String lugarExpediciónDocumentoIdentiadEmpleado) {
        this.lugarExpedicionDocumentoIdentiadEmpleado = new SimpleStringProperty(lugarExpediciónDocumentoIdentiadEmpleado);
    }

    public StringProperty LugarExpediciónDocumentoIdentiadEmpleadoProperty() {
        return lugarExpedicionDocumentoIdentiadEmpleado;
    }

    //Metodos atributo: fechaExpedicionDocumentoIdentiadEmpleado
    public Date getFechaExpedicionDocumentoIdentiadEmpleado() {
        return fechaExpedicionDocumentoIdentiadEmpleado;
    }

    public void setFechaExpedicionDocumentoIdentiadEmpleado(Date fechaExpedicionDocumentoIdentiadEmpleado) {
        this.fechaExpedicionDocumentoIdentiadEmpleado = fechaExpedicionDocumentoIdentiadEmpleado;
    }

    //Metodos atributo: lugarNacimientoEmpleado
    public String getLugarNacimientoEmpleado() {
        return lugarNacimientoEmpleado.get();
    }

    public void setLugarNacimientoEmpleado(String lugarNacimientoEmpleado) {
        this.lugarNacimientoEmpleado = new SimpleStringProperty(lugarNacimientoEmpleado);
    }

    public StringProperty LugarNacimientoEmpleadoProperty() {
        return lugarNacimientoEmpleado;
    }

    //Metodos atributo: fechaNacimientoEmpleado
    public Date getFechaNacimientoEmpleado() {
        return fechaNacimientoEmpleado;
    }

    public void setFechaNacimientoEmpleado(Date fechaNacimientoEmpleado) {
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
    }

    //Metodos atributo: nombresEmpleado
    public String getNombresEmpleado() {
        return nombresEmpleado.get();
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = new SimpleStringProperty(nombresEmpleado);
    }

    public StringProperty NombresEmpleadoProperty() {
        return nombresEmpleado;
    }

    //Metodos atributo: apellidosEmpleado
    public String getApellidosEmpleado() {
        return apellidosEmpleado.get();
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = new SimpleStringProperty(apellidosEmpleado);
    }

    public StringProperty ApellidosEmpleadoProperty() {
        return apellidosEmpleado;
    }

    //Metodos atributo: emailEmpleado
    public String getEmailEmpleado() {
        return emailEmpleado.get();
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = new SimpleStringProperty(emailEmpleado);
    }

    public StringProperty EmailEmpleadoProperty() {
        return emailEmpleado;
    }

    //Metodos atributo: codigoPostalEmpleado
    public String getCodigoPostalEmpleado() {
        return codigoPostalEmpleado.get();
    }

    public void setCodigoPostalEmpleado(String codigoPostalEmpleado) {
        this.codigoPostalEmpleado = new SimpleStringProperty(codigoPostalEmpleado);
    }

    public StringProperty CodigoPostalEmpleadoProperty() {
        return codigoPostalEmpleado;
    }

    //Metodos atributo: telefonoEmpleado
    public String getTelefonoEmpleado() {
        return telefonoEmpleado.get();
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = new SimpleStringProperty(telefonoEmpleado);
    }

    public StringProperty TelefonoEmpleadoProperty() {
        return telefonoEmpleado;
    }

    //Metodos atributo: celularEmpleado
    public String getCelularEmpleado() {
        return celularEmpleado.get();
    }

    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = new SimpleStringProperty(celularEmpleado);
    }

    public StringProperty CelularEmpleadoProperty() {
        return celularEmpleado;
    }

    //Metodos atributo: telefonoAlternativoEmpleado
    public String getTelefonoAlternativoEmpleado() {
        return telefonoAlternativoEmpleado.get();
    }

    public void setTelefonoAlternativoEmpleado(String telefonoAlternativoEmpleado) {
        this.telefonoAlternativoEmpleado = new SimpleStringProperty(telefonoAlternativoEmpleado);
    }

    public StringProperty TelefonoAlternativoEmpleadoProperty() {
        return telefonoAlternativoEmpleado;
    }

    //Metodos atributo: direccionEmpleado
    public String getDireccionEmpleado() {
        return direccionEmpleado.get();
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = new SimpleStringProperty(direccionEmpleado);
    }

    public StringProperty DireccionEmpleadoProperty() {
        return direccionEmpleado;
    }

    //Metodos atributo: barrioEmpleado
    public String getBarrioEmpleado() {
        return barrioEmpleado.get();
    }

    public void setBarrioEmpleado(String barrioEmpleado) {
        this.barrioEmpleado = new SimpleStringProperty(barrioEmpleado);
    }

    public StringProperty BarrioEmpleadoProperty() {
        return barrioEmpleado;
    }

    //Metodos atributo: upzEmpleado
    public String getUpzEmpleado() {
        return upzEmpleado.get();
    }

    public void setUpzEmpleado(String upzEmpleado) {
        this.upzEmpleado = new SimpleStringProperty(upzEmpleado);
    }

    public StringProperty UpzEmpleadoProperty() {
        return upzEmpleado;
    }

    //Metodos atributo: localidadEmpleado
    public String getLocalidadEmpleado() {
        return localidadEmpleado.get();
    }

    public void setLocalidadEmpleado(String localidadEmpleado) {
        this.localidadEmpleado = new SimpleStringProperty(localidadEmpleado);
    }

    public StringProperty LocalidadEmpleadoProperty() {
        return localidadEmpleado;
    }

    //Metodos atributo: municipioEmpleado
    public String getMunicipioEmpleado() {
        return municipioEmpleado.get();
    }

    public void setMunicipioEmpleado(String municipioEmpleado) {
        this.municipioEmpleado = new SimpleStringProperty(municipioEmpleado);
    }

    public StringProperty MunicipioEmpleadoProperty() {
        return municipioEmpleado;
    }

    //Metodos atributo: departamentoEmpleado
    public String getDepartamentoEmpleado() {
        return departamentoEmpleado.get();
    }

    public void setDepartamentoEmpleado(String departamentoEmpleado) {
        this.departamentoEmpleado = new SimpleStringProperty(departamentoEmpleado);
    }

    public StringProperty DepartamentoEmpleadoProperty() {
        return departamentoEmpleado;
    }

    //Metodos atributo: nombrePersonaContactoEmpleado
    public String getNombrePersonaContactoEmpleado() {
        return nombrePersonaContactoEmpleado.get();
    }

    public void setNombrePersonaContactoEmpleado(String nombrePersonaContactoEmpleado) {
        this.nombrePersonaContactoEmpleado = new SimpleStringProperty(nombrePersonaContactoEmpleado);
    }

    public StringProperty NombrePersonaContactoEmpleadoProperty() {
        return nombrePersonaContactoEmpleado;
    }

    //Metodos atributo: celualarPersonaContactoEmpleado
    public String getCelualarPersonaContactoEmpleado() {
        return celualarPersonaContactoEmpleado.get();
    }

    public void setCelualarPersonaContactoEmpleado(String celualarPersonaContactoEmpleado) {
        this.celualarPersonaContactoEmpleado = new SimpleStringProperty(celualarPersonaContactoEmpleado);
    }

    public StringProperty CelualarPersonaContactoEmpleadoProperty() {
        return celualarPersonaContactoEmpleado;
    }

    //Metodos atributo: tipoSalarioEmpleado
    public TipoSalario getTipoSalarioEmpleado() {
        return tipoSalarioEmpleado;
    }

    public void setTipoSalarioEmpleado(TipoSalario tipoSalarioEmpleado) {
        this.tipoSalarioEmpleado = tipoSalarioEmpleado;
    }

    //Metodos atributo: sueldoBaseEmpleado
    public int getSueldoBaseEmpleado() {
        return sueldoBaseEmpleado.get();
    }

    public void setSueldoBaseEmpleado(int sueldoBaseEmpleado) {
        this.sueldoBaseEmpleado = new SimpleIntegerProperty(sueldoBaseEmpleado);
    }

    public IntegerProperty SueldoBaseEmpleadoProperty() {
        return sueldoBaseEmpleado;
    }

    public static void listarEmpleados(Connection connection, ObservableList<Empleado> lista) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT idempleado, nombresempleado , apellidosempleado  FROM empleado");
            while (resultado.next()) {
                lista.add(
                        new Empleado(
                                resultado.getInt("idempleado"),
                                resultado.getString("nombresempleado"),
                                resultado.getString("apellidosempleado")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void llenarInformacionEmpleados(Connection connection, ObservableList<Empleado> lista) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT " +
                    "A.idempleado, " +
                    "A.rolempleadoid, " +
                    "A.fechaingresoempleado, " +
                    "A.nacionalidadempleado, " +
                    "A.empleadoesusuariosistema, " +
                    "A.tipodocumentoempleadoid, " +
                    "A.numerodocumentoidentidadempleado, " +
                    "A.lugarexpediciondocumentoidentiadempleado, " +
                    "A.fechaexpediciondocumentoidentiadempleado," +
                    "A.lugarnacimientoempleado, " +
                    "A.fechanacimientoempleado, " +
                    "A.nombresempleado, " +
                    "A.apellidosempleado, " +
                    "A.emailempleado, " +
                    "A.codigopostalempleado, " +
                    "A.telefonoempleado, " +
                    "A.celularempleado, " +
                    "A.telefonoalternativoempleado, " +
                    "A.direccionempleado, " +
                    "A.departamentoempleado, " +
                    "A.municipioempleado, " +
                    "A.localidadempleado, " +
                    "A.upzempleado, " +
                    "A.barrioempleado, " +
                    "A.nombrepersonacontactoempleado, " +
                    "A.celualarpersonacontactoempleado, " +
                    "A.tiposalarioempleadoid, " +
                    "A.sueldobaseempleado, " +
                    "rolempleado.nombrerolempleado, " +
                    "documentoidentidad.nombredocumentoidentidad, " +
                    "tiposalario.nombretiposalario " +
                    "FROM empleado A " +
                    "INNER JOIN rolempleado " +
                    "ON(A.rolempleadoid = rolempleado.idrolempleado) " +
                    "INNER JOIN documentoidentidad " +
                    "ON(A.tipodocumentoempleadoid = documentoidentidad.iddocumentoidentidad) " +
                    "INNER JOIN tiposalario " +
                    "ON(A.tiposalarioempleadoid = tiposalario.idtiposalario);");
            while (resultado.next()) {
                lista.add(
                        new Empleado(
                                resultado.getInt("idempleado"),
                                new Rol(resultado.getInt("rolempleadoid"), resultado.getString("nombrerolempleado")),
                                resultado.getDate("fechaingresoempleado"),
                                resultado.getString("nacionalidadempleado"),
                                resultado.getBoolean("empleadoesusuariosistema"),
                                new TipoDocumentoIdentidad(
                                        resultado.getInt("tipodocumentoempleadoid"),
                                        resultado.getString("nombredocumentoidentidad")
                                ),
                                resultado.getString("numerodocumentoidentidadempleado"),
                                resultado.getString("lugarexpediciondocumentoidentiadempleado"),
                                resultado.getDate("fechaexpediciondocumentoidentiadempleado"),
                                resultado.getString("lugarnacimientoempleado"),
                                resultado.getDate("fechanacimientoempleado"),
                                resultado.getString("nombresempleado"),
                                resultado.getString("apellidosempleado"),
                                resultado.getString("emailempleado"),
                                resultado.getString("codigopostalempleado"),
                                resultado.getString("telefonoempleado"),
                                resultado.getString("celularempleado"),
                                resultado.getString("telefonoalternativoempleado"),
                                resultado.getString("direccionempleado"),
                                resultado.getString("barrioempleado"),
                                resultado.getString("upzempleado"),
                                resultado.getString("localidadempleado"),
                                resultado.getString("municipioempleado"),
                                resultado.getString("departamentoempleado"),
                                resultado.getString("nombrepersonacontactoempleado"),
                                resultado.getString("celualarpersonacontactoempleado"),
                                new TipoSalario(
                                        resultado.getInt("tiposalarioempleadoid"),
                                        resultado.getString("nombretiposalario")
                                ),
                                resultado.getInt("sueldobaseempleado")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int registrarEmpleado(Connection connection) {
        try {
            System.out.println("INSERT INTO empleado(" +
                    "rolempleadoid, " +
                    "fechaingresoempleado, " +
                    "nacionalidadempleado, " +
                    "empleadoesusuariosistema, " +
                    "tipodocumentoempleadoid, " +
                    "numerodocumentoidentidadempleado, " +
                    "lugarexpediciondocumentoidentiadempleado, " +
                    "fechaexpediciondocumentoidentiadempleado, " +
                    "lugarnacimientoempleado, " +
                    "fechanacimientoempleado, " +
                    "nombresempleado, " +
                    "apellidosempleado, " +
                    "emailempleado, " +
                    "codigopostalempleado, " +
                    "telefonoempleado, " +
                    "celularempleado, " +
                    "telefonoalternativoempleado, " +
                    "direccionempleado, " +
                    "departamentoempleado, " +
                    "municipioempleado, " +
                    "localidadempleado, " +
                    "upzempleado, " +
                    "barrioempleado, " +
                    "nombrepersonacontactoempleado, " +
                    "celualarpersonacontactoempleado, " +
                    "tiposalarioempleadoid, " +
                    "sueldobaseempleado)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            PreparedStatement instruccion =connection.prepareStatement("INSERT INTO empleado(" +
                    "rolempleadoid, " +
                    "fechaingresoempleado, " +
                    "nacionalidadempleado, " +
                    "empleadoesusuariosistema, " +
                    "tipodocumentoempleadoid, " +
                    "numerodocumentoidentidadempleado, " +
                    "lugarexpediciondocumentoidentiadempleado, " +
                    "fechaexpediciondocumentoidentiadempleado, " +
                    "lugarnacimientoempleado, " +
                    "fechanacimientoempleado, " +
                    "nombresempleado, " +
                    "apellidosempleado, " +
                    "emailempleado, " +
                    "codigopostalempleado, " +
                    "telefonoempleado, " +
                    "celularempleado, " +
                    "telefonoalternativoempleado, " +
                    "direccionempleado, " +
                    "departamentoempleado, " +
                    "municipioempleado, " +
                    "localidadempleado, " +
                    "upzempleado, " +
                    "barrioempleado, " +
                    "nombrepersonacontactoempleado, " +
                    "celualarpersonacontactoempleado, " +
                    "tiposalarioempleadoid, " +
                    "sueldobaseempleado)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            instruccion.setInt(1, rolEmpleadoId.getIdRolEmpleado());
            instruccion.setDate(2,fechaIngresoEmpleado);
            instruccion.setString(3,nacionalidadEmpleado.get());
            instruccion.setBoolean(4,empleadoEsUsuarioSistema.get());
            instruccion.setInt(5,tipoDocumentoIdEmpleado.getIdDocumentoIdentidad());
            instruccion.setString(6,numeroDocumentoIdentidadEmpleado.get());
            instruccion.setString(7,lugarExpedicionDocumentoIdentiadEmpleado.get());
            instruccion.setDate(8,fechaExpedicionDocumentoIdentiadEmpleado);
            instruccion.setString(9,lugarNacimientoEmpleado.get());
            instruccion.setDate(10,fechaNacimientoEmpleado);
            instruccion.setString(11,nombresEmpleado.get());
            instruccion.setString(12,apellidosEmpleado.get());
            instruccion.setString(13,emailEmpleado.get());
            instruccion.setString(14,codigoPostalEmpleado.get());
            instruccion.setString(15,telefonoEmpleado.get());
            instruccion.setString(16,celularEmpleado.get());
            instruccion.setString(17,telefonoAlternativoEmpleado.get());
            instruccion.setString(18,direccionEmpleado.get());
            instruccion.setString(19,departamentoEmpleado.get());
            instruccion.setString(20,municipioEmpleado.get());
            instruccion.setString(21,localidadEmpleado.get());
            instruccion.setString(22,upzEmpleado.get());
            instruccion.setString(23,barrioEmpleado.get());
            instruccion.setString(24,nombrePersonaContactoEmpleado.get());
            instruccion.setString(25,celualarPersonaContactoEmpleado.get());
            instruccion.setInt(26,tipoSalarioEmpleado.getIdTipoSalario());
            instruccion.setInt(27,sueldoBaseEmpleado.get());

            return instruccion.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }


    }

    public void actualizarEmpleado() {

    }

    public void eliminarEmpleado() {

    }



    @Override
    public String toString(){
        return nombresEmpleado.get()+" "+apellidosEmpleado.get();
    }
}
