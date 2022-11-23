package VistasPrograma;


import java.awt.Color;

/**
 *
 * @author diego
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //nos permite iniciar la ventana del programa en medio del pc
        

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        textoBajoLogo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        fondoSuperior = new javax.swing.JLabel();
        textoInicioSesion = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        fondoInferior = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoblanco.png"))); // NOI18N
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 120));

        textoBajoLogo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        textoBajoLogo.setForeground(new java.awt.Color(255, 255, 255));
        textoBajoLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBajoLogo.setText("Bodega e Invetario");
        textoBajoLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(textoBajoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 70));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        fondoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nube2.jpg"))); // NOI18N
        fondoSuperior.setText("jLabel2");
        background.add(fondoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 26, 800, 160));

        textoInicioSesion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textoInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInicioSesion.setText("INICIAR SESIÓN");
        textoInicioSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(textoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, -1));

        textoUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoUsuario.setText("USUARIO");
        textoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 800, -1));

        TxtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUsuario.setText("Ingrese nombre  de  usuario");
        TxtUsuario.setBorder(null);
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioMousePressed(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        background.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 200, 40));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 180, 10));

        passLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLabel.setText("CONTRASEÑA");
        passLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 790, -1));

        TxtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        TxtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtContraseña.setText("********");
        TxtContraseña.setBorder(null);
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaMousePressed(evt);
            }
        });
        background.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 180, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 10));

        fondoInferior.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        background.add(fondoInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 216, 800, 290));

        jButton1.setBackground(new java.awt.Color(144, 153, 162));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONECTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 412, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        // Este codigo permite saber la posicion del mause para la barra superior
        // TODO add your handling code here:
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        //este codigo es para poder mover la ventana del programa hacia donde queramos
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
        // Permite que el boton que cree pueda cerrar el programa
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
        //cambia el color del boton al pasar el mause por encima
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
        //permite que el color del boton se restaure al momento de dejar de pasar el mause sobre el
    }//GEN-LAST:event_exitTxtMouseExited

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        if (TxtUsuario.getText().equals("Ingrese nombre  de  usuario")) {
            TxtUsuario.setText("");
            TxtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(TxtContraseña.getPassword()).isEmpty()) {
            TxtContraseña.setText("********");
            TxtContraseña.setForeground(Color.gray);
        }

    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed

        if (String.valueOf(TxtContraseña.getPassword()).equals("********")) {
            TxtContraseña.setText("");
            TxtContraseña.setForeground(Color.black);
        }
        if (TxtUsuario.getText().isEmpty()) {
            TxtUsuario.setText("Ingrese nombre  de  usuario");
            TxtUsuario.setForeground(Color.gray);
        }


    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ConexionBase.LoginValidar login = new ConexionBase.LoginValidar();
        login.validarUsuario(TxtUsuario, TxtContraseña);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoInferior;
    private javax.swing.JLabel fondoSuperior;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel textoBajoLogo;
    private javax.swing.JLabel textoInicioSesion;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
