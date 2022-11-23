package ConexionBase;
import VistasPrograma.Princpal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginValidar {


    public void validarUsuario(JTextField usuario,JPasswordField contrasena) {

        try {
            ResultSet res = null;
            PreparedStatement ps = null;

            ConexionBase.Conexion conexion = new ConexionBase.Conexion();

            String consulta = "SELECT *  FROM usuario WHERE usuario.Correo_usuario = (?) AND usuario.Clave_usuario = (?);";
            ps = conexion.estableceConexion().prepareStatement(consulta);

            String contrase = String.valueOf(contrasena.getPassword());

            ps.setString(1, usuario.getText());
            ps.setString(2, contrase);

            res = ps.executeQuery();

            if (res.next()) {

                JOptionPane.showMessageDialog(null, "Usuario correcto");
                Princpal principal = new Princpal();
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }

}
