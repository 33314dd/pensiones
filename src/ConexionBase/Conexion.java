package ConexionBase;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection  conectar = null;
    
    String usuario ="root";
    String contraseña = "1234";
    String bd = "prueba1";
    String ip = "localhost";
    String puerto = "3306";
    
    String url = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"La conexion  ha fallado");
        }
        return conectar;
    }



}
