package Clases;

import com.mysql.cj.xdevapi.Statement;

import ConexionBase.Conexion;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {

    private int idCliente;
    private int rutCliente;
    private String dvCliente;
    private String nombreComletoCliente;
    private int telefonoCliente;
    private String razonSocialCliente, direccionCliente;

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

    public void imprimir() {
        System.out.println(toString());
    }

    public void insertarCliente(JTextField paramRut, JTextField paramDv, JTextField paramNombres, JTextField paramTelefono, JTextField paramRazonSocial, JTextField paramDireccion) {

        setRutCliente(Integer.parseInt(paramRut.getText()));
        setDvCliente(paramDv.getText());
        setNombreComletoCliente(paramNombres.getText());
        setTelefonoCliente(Integer.parseInt(paramTelefono.getText()));
        setRazonSocialCliente(paramRazonSocial.getText());
        setDireccionCliente(paramDireccion.getText());

        Conexion conexion = new Conexion();

        String insertar = ("INSERT INTO cliente (Rut_cliente,Dv_Cliente,Nombre_Cliente,Telefono_Cliente,Direccion_cliente,RazonSocial_cliente) values (?,?,?,?,?,?);");
        try {
            CallableStatement cs = conexion.estableceConexion().prepareCall(insertar);

            cs.setInt(1, getRutCliente());
            cs.setString(2, getDvCliente());
            cs.setString(3, getNombreComletoCliente());
            cs.setInt(4, getTelefonoCliente());
            cs.setString(5, getRazonSocialCliente());
            cs.setString(6, getDireccionCliente());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Se inserto correctamente la informacion");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No fue posible ingresar la informacion, erro: " + e.toString());
        }

    }

    public void mostrarCliente(JTable paramTablaTotalClientes) {

        Conexion conexion = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);//Me permite ordenar los datos en la tabla
        paramTablaTotalClientes.setRowSorter(OrdenarTabla);

        String sql = "";

        modelo.addColumn("ID");
        modelo.addColumn("Rut");
        modelo.addColumn("Dv");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Razon Social");

        paramTablaTotalClientes.setModel(modelo);
        //sql = "select idCliente,concat(Rut_cliente,'-',Dv_Cliente),Nombre_Cliente,Telefono_Cliente,Direccion_cliente,RazonSocial_cliente from cliente;";
        sql = "select * from cliente;";

        String[] datos = new String[7];
        java.sql.Statement st;

        try {
            st = conexion.estableceConexion().createStatement();

            ResultSet resul = st.executeQuery(sql);

            while (resul.next()) {

                datos[0] = resul.getString(1);
                datos[1] = resul.getString(2);
                datos[2] = resul.getString(3);
                datos[3] = resul.getString(4);
                datos[4] = resul.getString(5);
                datos[5] = resul.getString(6);
                datos[6] = resul.getString(7);

                modelo.addRow(datos);
            }

            paramTablaTotalClientes.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pueden mostrar registros, error: " + e.toString());
        }

    }
    
    
    
    public void seleccionarDatosCliente(JTable paramTablaCliente,JTextField paramID, JTextField paramRut, JTextField paramDv, JTextField paramNombres, JTextField paramTelefono, JTextField paramDireccion,JTextField paramRazonSocial){
        //TxtIdCliente
        try {
            int fila = paramTablaCliente.getSelectedRow();
            
            if (fila >=0) {
                paramID.setText((paramTablaCliente.getValueAt(fila, 0).toString()));
                paramRut.setText((paramTablaCliente.getValueAt(fila, 1).toString()));
                paramDv.setText((paramTablaCliente.getValueAt(fila, 2).toString()));
                paramNombres.setText((paramTablaCliente.getValueAt(fila, 3).toString()));
                paramTelefono.setText((paramTablaCliente.getValueAt(fila, 4).toString()));
                //paramDireccion.setText((paramTablaCliente.getValueAt(fila, 5).toString()));
                paramRazonSocial.setText((paramTablaCliente.getValueAt(fila, 5).toString()));
                paramDireccion.setText((paramTablaCliente.getValueAt(fila, 6).toString()));
            }
            else{
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar, Error: "+e.toString());
        }
        
    }
    

    public void eliminarClienete(JTextField paramID){
    
        setIdCliente(Integer.parseInt(paramID.getText()));
        
        Conexion conexion = new Conexion();
        
        String consulta = "DELETE FROM cliente WHERE cliente.IdCliente=?;";
        
        try {
             CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);
             cs.setInt(1, getIdCliente());
             cs.execute();
             
             JOptionPane.showMessageDialog(null,"Se eliminó correctamente el Alumno");
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo eliminar, error: "+ e.toString());
        }
        
    }


    public void modificarDatosCliente(JTable paramTablaCliente,JTextField paramID, JTextField paramRut, JTextField paramDv, JTextField paramNombres, JTextField paramTelefono, JTextField paramRazonSocial, JTextField paramDireccion) {

        setIdCliente(Integer.parseInt(paramID.getText()));
        setRutCliente(Integer.parseInt(paramRut.getText()));
        setDvCliente(paramDv.getText());
        setNombreComletoCliente(paramNombres.getText());
        setTelefonoCliente(Integer.parseInt(paramTelefono.getText()));
        setRazonSocialCliente(paramRazonSocial.getText());
        setDireccionCliente(paramDireccion.getText());

        Conexion conexion = new Conexion();

        String consulta = "UPDATE cliente SET cliente.Rut_cliente = ?, cliente.Dv_cliente = ?, cliente.Nombre_cliente = ?, cliente.Telefono_cliente = ?, cliente.Direccion_cliente = ?, cliente.RazonSocial_cliente = ? WHERE cliente.IdCliente = ?;";

        try {

            CallableStatement calla = conexion.estableceConexion().prepareCall(consulta);

            
            calla.setInt(1, getRutCliente());
            calla.setString(2, getDvCliente());
            calla.setString(3, getNombreComletoCliente());
            calla.setInt(4, getTelefonoCliente());
            calla.setString(5, getRazonSocialCliente());
            calla.setString(6, getDireccionCliente());
            calla.setInt(7, getIdCliente());

            calla.execute();

            JOptionPane.showMessageDialog(null, "Modificación Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }
    }

}
