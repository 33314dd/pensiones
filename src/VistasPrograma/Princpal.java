package VistasPrograma;

import Clases.Cliente;
import Clases.Usuario;
import ConexionBase.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Princpal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Princpal() {
        initComponents();
        this.setLocationRelativeTo(null); //nos permite iniciar la ventana del programa en medio del pc
//    Conexion objetoConexion = new Conexion();
//    objetoConexion.estableceConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        BtnCliente = new javax.swing.JButton();
        BtnInforme = new javax.swing.JButton();
        BtnProducto = new javax.swing.JButton();
        BtnCotizar = new javax.swing.JButton();
        TablaGeneralTpb = new javax.swing.JTabbedPane();
        CotizarTpb = new javax.swing.JPanel();
        IdCotizarTxt = new javax.swing.JTextField();
        NombreCotizarTxt = new javax.swing.JTextField();
        MarcaCotizarTxt = new javax.swing.JTextField();
        PrecioCotizarTxt = new javax.swing.JTextField();
        CategoriaCotizarTxt = new javax.swing.JTextField();
        CantidadCotizarTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RutClienteCotizarTxt = new javax.swing.JTextField();
        TotalCotizarTxt = new javax.swing.JLabel();
        TotalLbl = new javax.swing.JLabel();
        btnGenerarCotizar = new javax.swing.JButton();
        BtnEliminarCotizar = new javax.swing.JButton();
        ClienteTpb = new javax.swing.JPanel();
        TxtRutCliente = new javax.swing.JTextField();
        TxtNombreCliente = new javax.swing.JTextField();
        TxtTelefonoCliente = new javax.swing.JTextField();
        TxtRazonSocialCliente = new javax.swing.JTextField();
        TxtDireccionCliente = new javax.swing.JTextField();
        ClienteScrollPanel = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TxtDvCliente = new javax.swing.JTextField();
        BtnEliminarCliente = new javax.swing.JButton();
        BtnAgregarCliente = new javax.swing.JButton();
        BtnActualizarCliente = new javax.swing.JButton();
        BtnNuevoCliente = new javax.swing.JButton();
        ProductosTpb = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        NombrePorductoTxt = new javax.swing.JTextField();
        MarcaPorductoTxt = new javax.swing.JTextField();
        PrecioPorductoTxt = new javax.swing.JTextField();
        CategoriaPorductoTxt = new javax.swing.JTextField();
        CantidadPorductoTxt = new javax.swing.JTextField();
        BtnActualizarProducto = new javax.swing.JButton();
        BtnEliminarProducto = new javax.swing.JButton();
        BtnNuevoProducto1 = new javax.swing.JButton();
        BtnAgregarProducto1 = new javax.swing.JButton();
        InformeTpb = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        BtnGenerarInforme = new javax.swing.JButton();
        fondoSuperior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoblanco.png"))); // NOI18N
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 790, 100));

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

        BtnCliente.setBackground(new java.awt.Color(144, 153, 162));
        BtnCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BtnCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnCliente.setText("CLIENTE");
        background.add(BtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 180, 40));

        BtnInforme.setBackground(new java.awt.Color(144, 153, 162));
        BtnInforme.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BtnInforme.setForeground(new java.awt.Color(255, 255, 255));
        BtnInforme.setText("INFORME");
        background.add(BtnInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 180, 40));

        BtnProducto.setBackground(new java.awt.Color(144, 153, 162));
        BtnProducto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BtnProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnProducto.setText("PRODUCTOS");
        background.add(BtnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 180, 40));

        BtnCotizar.setBackground(new java.awt.Color(144, 153, 162));
        BtnCotizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BtnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCotizar.setText("COTIZAR");
        background.add(BtnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 180, 40));

        TablaGeneralTpb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaGeneralTpb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        CotizarTpb.setBackground(new java.awt.Color(255, 255, 255));
        CotizarTpb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        IdCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        IdCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        IdCotizarTxt.setText("ID");
        IdCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdCotizarTxtMousePressed(evt);
            }
        });
        IdCotizarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdCotizarTxtActionPerformed(evt);
            }
        });

        NombreCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        NombreCotizarTxt.setText("Nombre");
        NombreCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreCotizarTxtMousePressed(evt);
            }
        });
        NombreCotizarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCotizarTxtActionPerformed(evt);
            }
        });

        MarcaCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MarcaCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        MarcaCotizarTxt.setText("Marca");
        MarcaCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaCotizarTxtMousePressed(evt);
            }
        });

        PrecioCotizarTxt.setEditable(false);
        PrecioCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PrecioCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        PrecioCotizarTxt.setText("Precio");
        PrecioCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrecioCotizarTxtMousePressed(evt);
            }
        });

        CategoriaCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CategoriaCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        CategoriaCotizarTxt.setText("Categoria");
        CategoriaCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoriaCotizarTxtMousePressed(evt);
            }
        });

        CantidadCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CantidadCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        CantidadCotizarTxt.setText("Cantidad");
        CantidadCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CantidadCotizarTxtMousePressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Precio", "Categoria", "Cantidad"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        RutClienteCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RutClienteCotizarTxt.setForeground(new java.awt.Color(153, 153, 153));
        RutClienteCotizarTxt.setText("Rut Cliente");
        RutClienteCotizarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RutClienteCotizarTxtMousePressed(evt);
            }
        });
        RutClienteCotizarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutClienteCotizarTxtActionPerformed(evt);
            }
        });

        TotalCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TotalCotizarTxt.setText("Total:");

        TotalLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TotalLbl.setText("------");

        btnGenerarCotizar.setBackground(new java.awt.Color(144, 153, 162));
        btnGenerarCotizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGenerarCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCotizar.setText("GENERAR");
        btnGenerarCotizar.setBorderPainted(false);
        btnGenerarCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCotizarActionPerformed(evt);
            }
        });

        BtnEliminarCotizar.setBackground(new java.awt.Color(144, 153, 162));
        BtnEliminarCotizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnEliminarCotizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCotizar.setText("ELIMINAR");

        javax.swing.GroupLayout CotizarTpbLayout = new javax.swing.GroupLayout(CotizarTpb);
        CotizarTpb.setLayout(CotizarTpbLayout);
        CotizarTpbLayout.setHorizontalGroup(
            CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(CotizarTpbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CotizarTpbLayout.createSequentialGroup()
                        .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CotizarTpbLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(PrecioCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CategoriaCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CotizarTpbLayout.createSequentialGroup()
                                .addComponent(IdCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MarcaCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CotizarTpbLayout.createSequentialGroup()
                        .addComponent(RutClienteCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnGenerarCotizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarCotizar)
                        .addGap(94, 94, 94)
                        .addComponent(TotalCotizarTxt)
                        .addGap(18, 18, 18)
                        .addComponent(TotalLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CotizarTpbLayout.setVerticalGroup(
            CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CotizarTpbLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TotalLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(TotalCotizarTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RutClienteCotizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerarCotizar)
                        .addComponent(BtnEliminarCotizar)))
                .addGap(10, 10, 10))
        );

        TablaGeneralTpb.addTab("Cotizar", CotizarTpb);

        ClienteTpb.setBackground(new java.awt.Color(255, 255, 255));
        ClienteTpb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClienteTpbMousePressed(evt);
            }
        });

        TxtRutCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtRutCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtRutCliente.setText("Rut sin Guion");
        TxtRutCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtRutCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtRutCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtRutClienteMousePressed(evt);
            }
        });
        TxtRutCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutClienteActionPerformed(evt);
            }
        });

        TxtNombreCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtNombreCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtNombreCliente.setText("Nombre");
        TxtNombreCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtNombreCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtNombreCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNombreClienteMousePressed(evt);
            }
        });

        TxtTelefonoCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtTelefonoCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtTelefonoCliente.setText("Telefono");
        TxtTelefonoCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtTelefonoCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtTelefonoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtTelefonoClienteMousePressed(evt);
            }
        });

        TxtRazonSocialCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtRazonSocialCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtRazonSocialCliente.setText("Razon Social");
        TxtRazonSocialCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtRazonSocialCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtRazonSocialCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtRazonSocialClienteMousePressed(evt);
            }
        });

        TxtDireccionCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtDireccionCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtDireccionCliente.setText("Direccion");
        TxtDireccionCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtDireccionCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtDireccionCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtDireccionClienteMousePressed(evt);
            }
        });

        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Telefono", "Razon social", "Direccion"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        ClienteScrollPanel.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(15);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        TxtDvCliente.setForeground(new java.awt.Color(153, 153, 153));
        TxtDvCliente.setText("Dv");
        TxtDvCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        TxtDvCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtDvClienteMousePressed(evt);
            }
        });
        TxtDvCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDvClienteActionPerformed(evt);
            }
        });

        BtnEliminarCliente.setBackground(new java.awt.Color(144, 153, 162));
        BtnEliminarCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarCliente.setText("ELIMINAR");
        BtnEliminarCliente.setBorderPainted(false);

        BtnAgregarCliente.setBackground(new java.awt.Color(144, 153, 162));
        BtnAgregarCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarCliente.setText("AGREGAR");
        BtnAgregarCliente.setBorderPainted(false);
        BtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarClienteActionPerformed(evt);
            }
        });

        BtnActualizarCliente.setBackground(new java.awt.Color(144, 153, 162));
        BtnActualizarCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnActualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizarCliente.setText("ACTUALIZAR");
        BtnActualizarCliente.setBorderPainted(false);

        BtnNuevoCliente.setBackground(new java.awt.Color(144, 153, 162));
        BtnNuevoCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevoCliente.setText("NUEVO");
        BtnNuevoCliente.setBorderPainted(false);
        BtnNuevoCliente.setPreferredSize(new java.awt.Dimension(87, 21));

        javax.swing.GroupLayout ClienteTpbLayout = new javax.swing.GroupLayout(ClienteTpb);
        ClienteTpb.setLayout(ClienteTpbLayout);
        ClienteTpbLayout.setHorizontalGroup(
            ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTpbLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreCliente)
                            .addComponent(TxtRazonSocialCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTelefonoCliente)
                            .addComponent(TxtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addComponent(TxtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDvCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(46, 46, 46))
            .addComponent(ClienteScrollPanel)
        );
        ClienteTpbLayout.setVerticalGroup(
            ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTpbLayout.createSequentialGroup()
                .addComponent(ClienteScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDvCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRazonSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(BtnActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );

        TablaGeneralTpb.addTab("Cliente", ClienteTpb);

        ProductosTpb.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Categoria", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        NombrePorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombrePorductoTxt.setForeground(new java.awt.Color(153, 153, 153));
        NombrePorductoTxt.setText("Nombre");
        NombrePorductoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombrePorductoTxtMousePressed(evt);
            }
        });
        NombrePorductoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePorductoTxtActionPerformed(evt);
            }
        });

        MarcaPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MarcaPorductoTxt.setForeground(new java.awt.Color(153, 153, 153));
        MarcaPorductoTxt.setText("Marca");
        MarcaPorductoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaPorductoTxtMousePressed(evt);
            }
        });

        PrecioPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PrecioPorductoTxt.setForeground(new java.awt.Color(153, 153, 153));
        PrecioPorductoTxt.setText("Precio");
        PrecioPorductoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrecioPorductoTxtMousePressed(evt);
            }
        });

        CategoriaPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CategoriaPorductoTxt.setForeground(new java.awt.Color(153, 153, 153));
        CategoriaPorductoTxt.setText("Categoria");
        CategoriaPorductoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CategoriaPorductoTxtMousePressed(evt);
            }
        });

        CantidadPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CantidadPorductoTxt.setForeground(new java.awt.Color(153, 153, 153));
        CantidadPorductoTxt.setText("Cantidad");
        CantidadPorductoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CantidadPorductoTxtMousePressed(evt);
            }
        });

        BtnActualizarProducto.setBackground(new java.awt.Color(144, 153, 162));
        BtnActualizarProducto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizarProducto.setText("ACTUALIZAR");
        BtnActualizarProducto.setBorderPainted(false);
        BtnActualizarProducto.setPreferredSize(new java.awt.Dimension(87, 21));
        BtnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarProductoActionPerformed(evt);
            }
        });

        BtnEliminarProducto.setBackground(new java.awt.Color(144, 153, 162));
        BtnEliminarProducto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarProducto.setText("ELIMINAR");
        BtnEliminarProducto.setBorderPainted(false);
        BtnEliminarProducto.setPreferredSize(new java.awt.Dimension(87, 21));
        BtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarProductoActionPerformed(evt);
            }
        });

        BtnNuevoProducto1.setBackground(new java.awt.Color(144, 153, 162));
        BtnNuevoProducto1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnNuevoProducto1.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevoProducto1.setText("NUEVO");
        BtnNuevoProducto1.setBorderPainted(false);
        BtnNuevoProducto1.setPreferredSize(new java.awt.Dimension(87, 21));
        BtnNuevoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoProducto1ActionPerformed(evt);
            }
        });

        BtnAgregarProducto1.setBackground(new java.awt.Color(144, 153, 162));
        BtnAgregarProducto1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnAgregarProducto1.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarProducto1.setText("AGREGAR");
        BtnAgregarProducto1.setBorderPainted(false);
        BtnAgregarProducto1.setPreferredSize(new java.awt.Dimension(87, 21));
        BtnAgregarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProducto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductosTpbLayout = new javax.swing.GroupLayout(ProductosTpb);
        ProductosTpb.setLayout(ProductosTpbLayout);
        ProductosTpbLayout.setHorizontalGroup(
            ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosTpbLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevoProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombrePorductoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(MarcaPorductoTxt)
                    .addComponent(PrecioPorductoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategoriaPorductoTxt)
                    .addComponent(CantidadPorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        ProductosTpbLayout.setVerticalGroup(
            ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosTpbLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosTpbLayout.createSequentialGroup()
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombrePorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoriaPorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MarcaPorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadPorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecioPorductoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductosTpbLayout.createSequentialGroup()
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAgregarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNuevoProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        TablaGeneralTpb.addTab("Productos", ProductosTpb);

        InformeTpb.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable4.setForeground(new java.awt.Color(102, 102, 102));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Cliente", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        BtnGenerarInforme.setBackground(new java.awt.Color(144, 153, 162));
        BtnGenerarInforme.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnGenerarInforme.setForeground(new java.awt.Color(255, 255, 255));
        BtnGenerarInforme.setText("GENERAR INFORME");
        BtnGenerarInforme.setBorderPainted(false);
        BtnGenerarInforme.setPreferredSize(new java.awt.Dimension(87, 21));
        BtnGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformeTpbLayout = new javax.swing.GroupLayout(InformeTpb);
        InformeTpb.setLayout(InformeTpbLayout);
        InformeTpbLayout.setHorizontalGroup(
            InformeTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(InformeTpbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformeTpbLayout.setVerticalGroup(
            InformeTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeTpbLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnGenerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        TablaGeneralTpb.addTab("Informe", InformeTpb);

        background.add(TablaGeneralTpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 580, 370));

        fondoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nube3.png"))); // NOI18N
        background.add(fondoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 810, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void IdCotizarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCotizarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCotizarTxtActionPerformed

    private void NombreCotizarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCotizarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCotizarTxtActionPerformed

    private void RutClienteCotizarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutClienteCotizarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutClienteCotizarTxtActionPerformed

    private void TxtNombreClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNombreClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtNombreCliente.getText().equals("Nombre")) {
            TxtNombreCliente.setText("");
            TxtNombreCliente.setForeground(Color.black);
        }
        if (TxtRutCliente.getText().isEmpty()) {
            TxtRutCliente.setText("Rut sin Guion");
            TxtRutCliente.setForeground(Color.gray);
        }
        if (TxtRazonSocialCliente.getText().isEmpty()) {
            TxtRazonSocialCliente.setText("Razon Social");
            TxtRazonSocialCliente.setForeground(Color.gray);
        }
        if (TxtDireccionCliente.getText().isEmpty()) {
            TxtDireccionCliente.setText("Direccion");
            TxtDireccionCliente.setForeground(Color.gray);
        }
        if (TxtDvCliente.getText().isEmpty()) {
            TxtDvCliente.setText("Dv");
            TxtDvCliente.setForeground(Color.gray);
        }
        if (TxtTelefonoCliente.getText().isEmpty()) {
            TxtTelefonoCliente.setText("Telefono");
            TxtTelefonoCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtNombreClienteMousePressed

    private void TxtRutClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRutClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtRutCliente.getText().equals("Rut sin Guion")) {
            TxtRutCliente.setText("");
            TxtRutCliente.setForeground(Color.black);
        }
        if (TxtNombreCliente.getText().isEmpty()) {
            TxtNombreCliente.setText("Nombre");
            TxtNombreCliente.setForeground(Color.gray);
        }
        if (TxtRazonSocialCliente.getText().isEmpty()) {
            TxtRazonSocialCliente.setText("Razon Social");
            TxtRazonSocialCliente.setForeground(Color.gray);
        }
        if (TxtDireccionCliente.getText().isEmpty()) {
            TxtDireccionCliente.setText("Direccion");
            TxtDireccionCliente.setForeground(Color.gray);
        }
        if (TxtDvCliente.getText().isEmpty()) {
            TxtDvCliente.setText("Dv");
            TxtDvCliente.setForeground(Color.gray);
        }
        if (TxtTelefonoCliente.getText().isEmpty()) {
            TxtTelefonoCliente.setText("Telefono");
            TxtTelefonoCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtRutClienteMousePressed

    private void TxtRazonSocialClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRazonSocialClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtRazonSocialCliente.getText().equals("Razon Social")) {
            TxtRazonSocialCliente.setText("");
            TxtRazonSocialCliente.setForeground(Color.black);
        }
        if (TxtRutCliente.getText().isEmpty()) {
            TxtRutCliente.setText("Rut sin Guion");
            TxtRutCliente.setForeground(Color.gray);
        }
        if (TxtNombreCliente.getText().isEmpty()) {
            TxtNombreCliente.setText("Nombre");
            TxtNombreCliente.setForeground(Color.gray);
        }
        if (TxtDireccionCliente.getText().isEmpty()) {
            TxtDireccionCliente.setText("Direccion");
            TxtDireccionCliente.setForeground(Color.gray);
        }
        if (TxtDvCliente.getText().isEmpty()) {
            TxtDvCliente.setText("Dv");
            TxtDvCliente.setForeground(Color.gray);
        }
        if (TxtTelefonoCliente.getText().isEmpty()) {
            TxtTelefonoCliente.setText("Telefono");
            TxtTelefonoCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtRazonSocialClienteMousePressed

    private void TxtDireccionClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDireccionClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtDireccionCliente.getText().equals("Direccion")) {
            TxtDireccionCliente.setText("");
            TxtDireccionCliente.setForeground(Color.black);
        }
        if (TxtRutCliente.getText().isEmpty()) {
            TxtRutCliente.setText("Rut sin Guion");
            TxtRutCliente.setForeground(Color.gray);
        }
        if (TxtRazonSocialCliente.getText().isEmpty()) {
            TxtRazonSocialCliente.setText("Razon Social");
            TxtRazonSocialCliente.setForeground(Color.gray);
        }
        if (TxtNombreCliente.getText().isEmpty()) {
            TxtNombreCliente.setText("Nombre");
            TxtNombreCliente.setForeground(Color.gray);
        }
        if (TxtDvCliente.getText().isEmpty()) {
            TxtDvCliente.setText("Dv");
            TxtDvCliente.setForeground(Color.gray);
        }
        if (TxtTelefonoCliente.getText().isEmpty()) {
            TxtTelefonoCliente.setText("Telefono");
            TxtTelefonoCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtDireccionClienteMousePressed

    private void ClienteTpbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteTpbMousePressed

    }//GEN-LAST:event_ClienteTpbMousePressed

    private void TxtDvClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDvClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtDvCliente.getText().equals("Dv")) {
            TxtDvCliente.setText("");
            TxtDvCliente.setForeground(Color.black);
        }
        if (TxtRutCliente.getText().isEmpty()) {
            TxtRutCliente.setText("Rut sin Guion");
            TxtRutCliente.setForeground(Color.gray);
        }
        if (TxtRazonSocialCliente.getText().isEmpty()) {
            TxtRazonSocialCliente.setText("Razon Social");
            TxtRazonSocialCliente.setForeground(Color.gray);
        }
        if (TxtDireccionCliente.getText().isEmpty()) {
            TxtDireccionCliente.setText("Direccion");
            TxtDireccionCliente.setForeground(Color.gray);
        }
        if (TxtNombreCliente.getText().isEmpty()) {
            TxtNombreCliente.setText("Nombre");
            TxtNombreCliente.setForeground(Color.gray);
        }
        if (TxtTelefonoCliente.getText().isEmpty()) {
            TxtTelefonoCliente.setText("Telefono");
            TxtTelefonoCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtDvClienteMousePressed

    private void TxtDvClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDvClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDvClienteActionPerformed

    private void TxtTelefonoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTelefonoClienteMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TxtTelefonoCliente.getText().equals("Telefono")) {
            TxtTelefonoCliente.setText("");
            TxtTelefonoCliente.setForeground(Color.black);
        }
        if (TxtRutCliente.getText().isEmpty()) {
            TxtRutCliente.setText("Rut sin Guion");
            TxtRutCliente.setForeground(Color.gray);
        }
        if (TxtRazonSocialCliente.getText().isEmpty()) {
            TxtRazonSocialCliente.setText("Razon Social");
            TxtRazonSocialCliente.setForeground(Color.gray);
        }
        if (TxtDireccionCliente.getText().isEmpty()) {
            TxtDireccionCliente.setText("Direccion");
            TxtDireccionCliente.setForeground(Color.gray);
        }
        if (TxtDvCliente.getText().isEmpty()) {
            TxtDvCliente.setText("Dv");
            TxtDvCliente.setForeground(Color.gray);
        }
        if (TxtNombreCliente.getText().isEmpty()) {
            TxtNombreCliente.setText("Nombre");
            TxtNombreCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtTelefonoClienteMousePressed

    private void NombrePorductoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePorductoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePorductoTxtActionPerformed

    private void IdCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdCotizarTxtMousePressed
        // TODO add your handling code here:
        if (IdCotizarTxt.getText().equals("ID")) {
            IdCotizarTxt.setText("");
            IdCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("Rut Cliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_IdCotizarTxtMousePressed

    private void NombreCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreCotizarTxtMousePressed
        // TODO add your handling code here:
        if (NombreCotizarTxt.getText().equals("Nombre")) {
            NombreCotizarTxt.setText("");
            NombreCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("Rut Cliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_NombreCotizarTxtMousePressed

    private void MarcaCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaCotizarTxtMousePressed
        // TODO add your handling code here:
        if (MarcaCotizarTxt.getText().equals("Marca")) {
            MarcaCotizarTxt.setText("");
            MarcaCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("Rut Cliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_MarcaCotizarTxtMousePressed

    private void CategoriaCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaCotizarTxtMousePressed
        // TODO add your handling code here:
        if (CategoriaCotizarTxt.getText().equals("Categoria")) {
            CategoriaCotizarTxt.setText("");
            CategoriaCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("Rut Cliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_CategoriaCotizarTxtMousePressed

    private void CantidadCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantidadCotizarTxtMousePressed
        // TODO add your handling code here:
        if (CantidadCotizarTxt.getText().equals("Cantidad")) {
            CantidadCotizarTxt.setText("");
            CantidadCotizarTxt.setForeground(Color.black);
        }
        
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("Rut Cliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CantidadCotizarTxtMousePressed

    private void NombrePorductoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombrePorductoTxtMousePressed
        
        if (NombrePorductoTxt.getText().equals("Nombre")) {
            NombrePorductoTxt.setText("");
            NombrePorductoTxt.setForeground(Color.black);
        }
        if (MarcaPorductoTxt.getText().isEmpty()) {
            MarcaPorductoTxt.setText("Marca");
            MarcaPorductoTxt.setForeground(Color.gray);
        }
        if (PrecioPorductoTxt.getText().isEmpty()) {
            PrecioPorductoTxt.setText("Precio");
            PrecioPorductoTxt.setForeground(Color.gray);
        }
        if (CategoriaPorductoTxt.getText().isEmpty()) {
            CategoriaPorductoTxt.setText("Categoria");
            CategoriaPorductoTxt.setForeground(Color.gray);
        }
        if (CantidadPorductoTxt.getText().isEmpty()) {
            CantidadPorductoTxt.setText("Cantidad");
            CantidadPorductoTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_NombrePorductoTxtMousePressed

    private void MarcaPorductoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaPorductoTxtMousePressed
        if (MarcaPorductoTxt.getText().equals("Marca")) {
            MarcaPorductoTxt.setText("");
            MarcaPorductoTxt.setForeground(Color.black);
        }
        if (NombrePorductoTxt.getText().isEmpty()) {
            NombrePorductoTxt.setText("Nombre");
            NombrePorductoTxt.setForeground(Color.gray);
        }
        if (PrecioPorductoTxt.getText().isEmpty()) {
            PrecioPorductoTxt.setText("Precio");
            PrecioPorductoTxt.setForeground(Color.gray);
        }
        if (CategoriaPorductoTxt.getText().isEmpty()) {
            CategoriaPorductoTxt.setText("Categoria");
            CategoriaPorductoTxt.setForeground(Color.gray);
        }
        if (CantidadPorductoTxt.getText().isEmpty()) {
            CantidadPorductoTxt.setText("Cantidad");
            CantidadPorductoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_MarcaPorductoTxtMousePressed

    private void PrecioPorductoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecioPorductoTxtMousePressed
        if (PrecioPorductoTxt.getText().equals("Precio")) {
            PrecioPorductoTxt.setText("");
            PrecioPorductoTxt.setForeground(Color.black);
        }
        if (NombrePorductoTxt.getText().isEmpty()) {
            NombrePorductoTxt.setText("Nombre");
            NombrePorductoTxt.setForeground(Color.gray);
        }
        if (MarcaPorductoTxt.getText().isEmpty()) {
            MarcaPorductoTxt.setText("Marca");
            MarcaPorductoTxt.setForeground(Color.gray);
        }
        if (CategoriaPorductoTxt.getText().isEmpty()) {
            CategoriaPorductoTxt.setText("Categoria");
            CategoriaPorductoTxt.setForeground(Color.gray);
        }
        if (CantidadPorductoTxt.getText().isEmpty()) {
            CantidadPorductoTxt.setText("Dv");
            CantidadPorductoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PrecioPorductoTxtMousePressed

    private void CategoriaPorductoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaPorductoTxtMousePressed
        if (CategoriaPorductoTxt.getText().equals("Categoria")) {
            CategoriaPorductoTxt.setText("");
            CategoriaPorductoTxt.setForeground(Color.black);
        }
        if (NombrePorductoTxt.getText().isEmpty()) {
            NombrePorductoTxt.setText("Nombre");
            NombrePorductoTxt.setForeground(Color.gray);
        }
        if (MarcaPorductoTxt.getText().isEmpty()) {
            MarcaPorductoTxt.setText("Marca");
            MarcaPorductoTxt.setForeground(Color.gray);
        }
        if (PrecioPorductoTxt.getText().isEmpty()) {
            PrecioPorductoTxt.setText("Precio");
            PrecioPorductoTxt.setForeground(Color.gray);
        }
        if (CantidadPorductoTxt.getText().isEmpty()) {
            CantidadPorductoTxt.setText("Cantidad");
            CantidadPorductoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CategoriaPorductoTxtMousePressed

    private void CantidadPorductoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantidadPorductoTxtMousePressed
        if (CantidadPorductoTxt.getText().equals("Cantidad")) {
            CantidadPorductoTxt.setText("");
            CantidadPorductoTxt.setForeground(Color.black);
        }
        if (NombrePorductoTxt.getText().isEmpty()) {
            NombrePorductoTxt.setText("Nombre");
            NombrePorductoTxt.setForeground(Color.gray);
        }
        if (MarcaPorductoTxt.getText().isEmpty()) {
            MarcaPorductoTxt.setText("Marca");
            MarcaPorductoTxt.setForeground(Color.gray);
        }
        if (PrecioPorductoTxt.getText().isEmpty()) {
            PrecioPorductoTxt.setText("Precio");
            PrecioPorductoTxt.setForeground(Color.gray);
        }
        if (CategoriaPorductoTxt.getText().isEmpty()) {
            CategoriaPorductoTxt.setText("Categoria");
            CategoriaPorductoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CantidadPorductoTxtMousePressed

    private void RutClienteCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutClienteCotizarTxtMousePressed
        // TODO add your handling code here:
        if (RutClienteCotizarTxt.getText().equals("Rut Cliente")) {
            RutClienteCotizarTxt.setText("");
            RutClienteCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (PrecioCotizarTxt.getText().isEmpty()) {
            PrecioCotizarTxt.setText("Precio");
            PrecioCotizarTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_RutClienteCotizarTxtMousePressed

    private void PrecioCotizarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecioCotizarTxtMousePressed
        // TODO add your handling code here:
        if (PrecioCotizarTxt.getText().equals("Precio")) {
            PrecioCotizarTxt.setText("");
            PrecioCotizarTxt.setForeground(Color.black);
        }
        if (CantidadCotizarTxt.getText().isEmpty()) {
            CantidadCotizarTxt.setText("Cantidad");
            CantidadCotizarTxt.setForeground(Color.gray);
        }
        if (IdCotizarTxt.getText().isEmpty()) {
            IdCotizarTxt.setText("ID");
            IdCotizarTxt.setForeground(Color.gray);
        }
        if (NombreCotizarTxt.getText().isEmpty()) {
            NombreCotizarTxt.setText("Nombre");
            NombreCotizarTxt.setForeground(Color.gray);
        }
        if (CategoriaCotizarTxt.getText().isEmpty()) {
            CategoriaCotizarTxt.setText("Categoria");
            CategoriaCotizarTxt.setForeground(Color.gray);
        }
        if (MarcaCotizarTxt.getText().isEmpty()) {
            MarcaCotizarTxt.setText("Marca");
            MarcaCotizarTxt.setForeground(Color.gray);
        }
        if (RutClienteCotizarTxt.getText().isEmpty()) {
            RutClienteCotizarTxt.setText("RutCliente");
            RutClienteCotizarTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PrecioCotizarTxtMousePressed

    private void TxtRutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutClienteActionPerformed
        
       
    }//GEN-LAST:event_TxtRutClienteActionPerformed

    private void btnGenerarCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCotizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarCotizarActionPerformed

    private void BtnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarProductoActionPerformed

    private void BtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarProductoActionPerformed

    private void BtnNuevoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoProducto1ActionPerformed

    private void BtnAgregarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarProducto1ActionPerformed

    private void BtnGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarInformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGenerarInformeActionPerformed

    private void BtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarClienteActionPerformed
        Cliente cliente = new Cliente();
        cliente.insertarCliente(TxtRutCliente, TxtDvCliente, TxtNombreCliente, TxtTelefonoCliente, TxtRazonSocialCliente, TxtDireccionCliente);
        
    }//GEN-LAST:event_BtnAgregarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Princpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Princpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Princpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Princpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Princpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarCliente;
    private javax.swing.JButton BtnActualizarProducto;
    private javax.swing.JButton BtnAgregarCliente;
    private javax.swing.JButton BtnAgregarProducto1;
    private javax.swing.JButton BtnCliente;
    private javax.swing.JButton BtnCotizar;
    private javax.swing.JButton BtnEliminarCliente;
    private javax.swing.JButton BtnEliminarCotizar;
    private javax.swing.JButton BtnEliminarProducto;
    private javax.swing.JButton BtnGenerarInforme;
    private javax.swing.JButton BtnInforme;
    private javax.swing.JButton BtnNuevoCliente;
    private javax.swing.JButton BtnNuevoProducto1;
    private javax.swing.JButton BtnProducto;
    private javax.swing.JTextField CantidadCotizarTxt;
    private javax.swing.JTextField CantidadPorductoTxt;
    private javax.swing.JTextField CategoriaCotizarTxt;
    private javax.swing.JTextField CategoriaPorductoTxt;
    private javax.swing.JScrollPane ClienteScrollPanel;
    private javax.swing.JPanel ClienteTpb;
    private javax.swing.JPanel CotizarTpb;
    private javax.swing.JTextField IdCotizarTxt;
    private javax.swing.JPanel InformeTpb;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField MarcaCotizarTxt;
    private javax.swing.JTextField MarcaPorductoTxt;
    private javax.swing.JTextField NombreCotizarTxt;
    private javax.swing.JTextField NombrePorductoTxt;
    private javax.swing.JTextField PrecioCotizarTxt;
    private javax.swing.JTextField PrecioPorductoTxt;
    private javax.swing.JPanel ProductosTpb;
    private javax.swing.JTextField RutClienteCotizarTxt;
    private javax.swing.JTabbedPane TablaGeneralTpb;
    private javax.swing.JLabel TotalCotizarTxt;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JTextField TxtDireccionCliente;
    private javax.swing.JTextField TxtDvCliente;
    private javax.swing.JTextField TxtNombreCliente;
    private javax.swing.JTextField TxtRazonSocialCliente;
    private javax.swing.JTextField TxtRutCliente;
    private javax.swing.JTextField TxtTelefonoCliente;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnGenerarCotizar;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoSuperior;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
