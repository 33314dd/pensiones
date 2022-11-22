
package Clases;


import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import ConexionBase.Conexion;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Cliente {
    private int idCliente;
    private int rutCliente;
    private String dvCliente;
    private String nombreComletoCliente;
    private int telefonoCliente;
    private String razonSocialCliente,direccionCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, int rutCliente, String dvCliente, String nombreComletoCliente, int telefonoCliente, String razonSocialCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.dvCliente = dvCliente;
        this.nombreComletoCliente = nombreComletoCliente;
        this.telefonoCliente = telefonoCliente;
        this.razonSocialCliente = razonSocialCliente;
        this.direccionCliente = direccionCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDvCliente() {
        return dvCliente;
    }

    public void setDvCliente(String dvCliente) {
        this.dvCliente = dvCliente;
    }

    public String getNombreComletoCliente() {
        return nombreComletoCliente;
    }

    public void setNombreComletoCliente(String nombreComletoCliente) {
        this.nombreComletoCliente = nombreComletoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getRazonSocialCliente() {
        return razonSocialCliente;
    }

    public void setRazonSocialCliente(String razonSocialCliente) {
        this.razonSocialCliente = razonSocialCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    



    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", rutCliente=" + rutCliente + ", dvCliente=" + dvCliente + ", nombreComletoCliente=" + nombreComletoCliente + ", telefonoCliente=" + telefonoCliente + ", razonSocialCliente=" + razonSocialCliente + ", direccionCliente=" + direccionCliente + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    public void insertarCliente(JTextField paramRut,JTextField paramDv,JTextField paramNombres,JTextField paramTelefono,JTextField paramRazonSocial, JTextField paramDireccion){
        
        setRutCliente(Integer.parseInt(paramRut.getText()));
        setDvCliente(paramDv.getText());
        setNombreComletoCliente(paramNombres.getText());
        setTelefonoCliente(Integer.parseInt(paramTelefono.getText()));
        setRazonSocialCliente(paramRazonSocial.getText());
        setDireccionCliente(paramDireccion.getText());
        
        Conexion objetoConexion = new Conexion();
        
        String consulta = ("INSERT INTO cliente (Rut_cliente,Dv_Cliente,Nombre_Cliente,Telefono_Cliente,Direccion_cliente,RazonSocial_cliente) values (?,?,?,?,?,?);");
        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setInt(1, getRutCliente());
            cs.setString(2, getDvCliente());
            cs.setString(3,getNombreComletoCliente());
            cs.setInt(4,getTelefonoCliente());
            cs.setString(5, getRazonSocialCliente());
            cs.setString(6,getDireccionCliente());
            
            cs.execute();
            JOptionPane.showMessageDialog(null,"Se inserto correctamente la informacion");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No fue posible ingresar la informacion, erro: "+ e.toString());
        }
        
    }
//    public void guardarCliente(){
//        
//        try {
//            String strSQL = "INSERT into cliente values("+idCliente+",'"+rutCliente+"','"+dvCliente+"','"+nombreComletoCliente+"',"+telefonoCliente+",'"+nombreComletoCliente+"','"+direccionCliente+"'')";
//            Conexion.conectar();
//            Conexion.sentencia =(Statement) Conexion.conexion.prepareStatement(strSQL);
//            Conexion.sentencia.execute(strSQL);
//             System.out.println("Datos Almacenados");
//            Conexion.desconectar();
//            
//        } catch (Exception e) {
//            System.out.println("Hay un error en el metodo guardar cliente");
//        }
//    }
    
    
}
