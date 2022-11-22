package ConexionBase;

import com.mysql.cj.xdevapi.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
            JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"La conexion  ha fallado");
        }
        return conectar;
    }

//    public static String bd = "inventariocotizacion";
//    public static String login = "root";
//    public static String pass = "";
//
//    public static String url = "jdbc:mysql://localhost:3306/" + bd;
//    public static Connection conexion ;
//    public static Statement sentencia ;
//
//    public static void conectar() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conexion = DriverManager.getConnection(url, login, pass);
//            if (conexion != null) {
//                System.out.println("Conexion establecida con "+bd);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Hubo un problema al conectar");
//        }catch(ClassNotFoundException ex){
//            System.out.println(ex);
//        }
//    }
//    
//    public static void desconectar() throws SQLException{
//        conexion.close();
//    }

//    public static void main(String[] args) {
//        Connection conexion;
//        String jdbc ="jdbc:mysql://localhost:3306/prueba1";
//        try {
//            conexion = DriverManager.getConnection(jdbc, "root", "1234");
//            System.out.println("Conexion exitosa");
//        } catch (SQLException sql) {
//            System.out.println("Hubo un problema en la conexion");
//        }
//    }

//    public static void connect() {
//        Connection conexion = null;
//        String driver = "com.mysql.cj.jdbc.Driver";
//        try {
//            Class.forName(driver);
//            System.out.println("Driver cargado con exito");
//            try {
//                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba1?useUnicode=true&useJDBCCompliantTimezoneShift=true&&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
//                if (conexion != null) {
//                    System.out.println("Conexion realizada con exito");
//                }
//            }catch(Exception e){
//                System.out.println("Ha ocurrido un error al intentar conectarse con la base de datos , "+e.getMessage());
//            }
//        } catch (Exception e) {
//            System.out.println("Ha ocurrido un error al cargar el driver, " + e.getLocalizedMessage());
//        }
//    }

}
