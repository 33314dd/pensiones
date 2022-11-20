package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static void main(String[] args) {
        connect();
    }

    public static void connect() {
        Connection conexion = null;
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            System.out.println("Driver cargado con exito");
            try {
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba1?useUnicode=true&useJDBCCompliantTimezoneShift=true&&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
                if (conexion != null) {
                    System.out.println("Conexion realizada con exito");
                }
            }catch(Exception e){
                System.out.println("Ha ocurrido un error al intentar conectarse con la base de datos , "+e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al cargar el driver, " + e.getLocalizedMessage());
        }
    }

//    Connection conexion;
//
//    public Connection getConnection() {
//        try {
//            String BaseDatos = "jdbc.mysql://localhost:3306/inventarioCotizacion?serverTimezone=UTC";
//            conexion = DriverManager.getConnection(BaseDatos, "root", "");
//            return conexion;
//
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        }
//        return null;
//    }
}
