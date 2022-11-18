package VistasPrograma;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class Princpal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Princpal() {
        initComponents();
        this.setLocationRelativeTo(null); //nos permite iniciar la ventana del programa en medio del pc
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        InformeBtn = new javax.swing.JPanel();
        InformeBtnTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        ProductoBtn = new javax.swing.JPanel();
        ProductoBtnTxt = new javax.swing.JLabel();
        AgregarBtn = new javax.swing.JPanel();
        AgregarBtnTxt = new javax.swing.JLabel();
        CotizarBtn = new javax.swing.JPanel();
        CotizarBtnTxt = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        idTxt = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JLabel();
        MarcaTxt = new javax.swing.JLabel();
        PrecioTxt = new javax.swing.JLabel();
        CategoriaTxt = new javax.swing.JLabel();
        CantidadTxt = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EliminarBtn = new javax.swing.JPanel();
        EliminarBtnTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fondoSuperior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoblanco.png"))); // NOI18N
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 130));

        InformeBtn.setBackground(new java.awt.Color(144, 153, 162));

        InformeBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        InformeBtnTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        InformeBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        InformeBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InformeBtnTxt.setText("INFORME");
        InformeBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InformeBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformeBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InformeBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InformeBtnLayout = new javax.swing.GroupLayout(InformeBtn);
        InformeBtn.setLayout(InformeBtnLayout);
        InformeBtnLayout.setHorizontalGroup(
            InformeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(InformeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformeBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InformeBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        InformeBtnLayout.setVerticalGroup(
            InformeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(InformeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformeBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InformeBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(InformeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 180, 40));

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

        ProductoBtn.setBackground(new java.awt.Color(144, 153, 162));

        ProductoBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        ProductoBtnTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        ProductoBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        ProductoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductoBtnTxt.setText("PRODUCTOS");
        ProductoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ProductoBtnLayout = new javax.swing.GroupLayout(ProductoBtn);
        ProductoBtn.setLayout(ProductoBtnLayout);
        ProductoBtnLayout.setHorizontalGroup(
            ProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(ProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ProductoBtnLayout.setVerticalGroup(
            ProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(ProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(ProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 180, 40));

        AgregarBtn.setBackground(new java.awt.Color(144, 153, 162));

        AgregarBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        AgregarBtnTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        AgregarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarBtnTxt.setText("AGREGAR CLIENTE");
        AgregarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarBtnLayout = new javax.swing.GroupLayout(AgregarBtn);
        AgregarBtn.setLayout(AgregarBtnLayout);
        AgregarBtnLayout.setHorizontalGroup(
            AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AgregarBtnLayout.setVerticalGroup(
            AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(AgregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 180, 40));

        CotizarBtn.setBackground(new java.awt.Color(144, 153, 162));

        CotizarBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        CotizarBtnTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        CotizarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        CotizarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CotizarBtnTxt.setText("COTIZAR");
        CotizarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CotizarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CotizarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CotizarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CotizarBtnLayout = new javax.swing.GroupLayout(CotizarBtn);
        CotizarBtn.setLayout(CotizarBtnLayout);
        CotizarBtnLayout.setHorizontalGroup(
            CotizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(CotizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CotizarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CotizarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CotizarBtnLayout.setVerticalGroup(
            CotizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(CotizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CotizarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CotizarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(CotizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 180, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        idTxt.setText("ID");

        NombreTxt.setText("Nombre");

        MarcaTxt.setText("Marca");

        PrecioTxt.setText("Precio");

        CategoriaTxt.setText("Categoria");

        CantidadTxt.setText("Cantidad");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
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

        EliminarBtn.setBackground(new java.awt.Color(144, 153, 162));

        EliminarBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        EliminarBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        EliminarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        EliminarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarBtnTxt.setText("ELIMINAR");
        EliminarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtnLayout = new javax.swing.GroupLayout(EliminarBtn);
        EliminarBtn.setLayout(EliminarBtnLayout);
        EliminarBtnLayout.setHorizontalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarBtnLayout.createSequentialGroup()
                    .addComponent(EliminarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        EliminarBtnLayout.setVerticalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarBtnLayout.createSequentialGroup()
                    .addComponent(EliminarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(idTxt)
                                .addGap(46, 46, 46)
                                .addComponent(NombreTxt)
                                .addGap(38, 38, 38)
                                .addComponent(MarcaTxt)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(PrecioTxt)
                                        .addGap(64, 64, 64)
                                        .addComponent(CategoriaTxt)
                                        .addGap(64, 64, 64)
                                        .addComponent(CantidadTxt)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jScrollPane1)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTxt)
                    .addComponent(NombreTxt)
                    .addComponent(MarcaTxt)
                    .addComponent(PrecioTxt)
                    .addComponent(CategoriaTxt)
                    .addComponent(CantidadTxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        background.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 580, 360));

        fondoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/nube2.jpg"))); // NOI18N
        fondoSuperior.setText("jLabel2");
        background.add(fondoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 26, 800, 490));

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

    private void CotizarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CotizarBtnTxtMouseEntered
        CotizarBtn.setBackground(new Color(110, 122, 147));
        // 144, 153, 162 color original
        //codigo opara hacer que el boton cambie de color
    }//GEN-LAST:event_CotizarBtnTxtMouseEntered

    private void CotizarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CotizarBtnTxtMouseExited
        //devuele el color del boton al color original
        CotizarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_CotizarBtnTxtMouseExited

    private void AgregarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnTxtMouseEntered
        // TODO add your handling code here:
        AgregarBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_AgregarBtnTxtMouseEntered

    private void AgregarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnTxtMouseExited
        // TODO add your handling code here:
        AgregarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_AgregarBtnTxtMouseExited

    private void ProductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBtnTxtMouseEntered
        // TODO add your handling code here:
        ProductoBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_ProductoBtnTxtMouseEntered

    private void ProductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBtnTxtMouseExited
        // TODO add your handling code here:
        ProductoBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_ProductoBtnTxtMouseExited

    private void InformeBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeBtnTxtMouseEntered
        // TODO add your handling code here:
        InformeBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_InformeBtnTxtMouseEntered

    private void InformeBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeBtnTxtMouseExited
        // TODO add your handling code here:
        InformeBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_InformeBtnTxtMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void EliminarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarBtnTxtMouseEntered

    private void EliminarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarBtnTxtMouseExited

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
    private javax.swing.JPanel AgregarBtn;
    private javax.swing.JLabel AgregarBtnTxt;
    private javax.swing.JLabel CantidadTxt;
    private javax.swing.JLabel CategoriaTxt;
    private javax.swing.JPanel CotizarBtn;
    private javax.swing.JLabel CotizarBtnTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel EliminarBtnTxt;
    private javax.swing.JPanel InformeBtn;
    private javax.swing.JLabel InformeBtnTxt;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MarcaTxt;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JLabel PrecioTxt;
    private javax.swing.JPanel ProductoBtn;
    private javax.swing.JLabel ProductoBtnTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoSuperior;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
