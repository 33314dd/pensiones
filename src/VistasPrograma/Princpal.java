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
        ImprimirBtn = new javax.swing.JPanel();
        ImprimirBtnTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        ClienteTpb = new javax.swing.JPanel();
        RutClienteTxt = new javax.swing.JTextField();
        NombreClienteTxt = new javax.swing.JTextField();
        TelefonoTxt = new javax.swing.JTextField();
        RazonSocialTxt = new javax.swing.JTextField();
        DireccionTxt = new javax.swing.JTextField();
        ClienteScrollPanel = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        AgregarClienteBtn = new javax.swing.JPanel();
        AgregarClienteBtnTxt = new javax.swing.JLabel();
        ActualizarClienteBtn = new javax.swing.JPanel();
        ActualizarClienteBtnTxt = new javax.swing.JLabel();
        NuevoClienteBtn = new javax.swing.JPanel();
        NuevoClienteBtnTxt = new javax.swing.JLabel();
        EliminarClienteBtn = new javax.swing.JPanel();
        EliminarClienteBtnTxt = new javax.swing.JLabel();
        DvTxt = new javax.swing.JTextField();
        ProductosTpb = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
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
        background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 790, 100));

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
        AgregarBtnTxt.setText("CLIENTE");
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

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        idTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idTxt.setText("ID");

        NombreTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreTxt.setText("Nombre");

        MarcaTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MarcaTxt.setText("Marca");

        PrecioTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PrecioTxt.setText("Precio");

        CategoriaTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CategoriaTxt.setText("Categoria");

        CantidadTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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

        ImprimirBtn.setBackground(new java.awt.Color(144, 153, 162));

        ImprimirBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        ImprimirBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ImprimirBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImprimirBtnTxt.setText("IMPRIMIR");
        ImprimirBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImprimirBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImprimirBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImprimirBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ImprimirBtnLayout = new javax.swing.GroupLayout(ImprimirBtn);
        ImprimirBtn.setLayout(ImprimirBtnLayout);
        ImprimirBtnLayout.setHorizontalGroup(
            ImprimirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImprimirBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImprimirBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        ImprimirBtnLayout.setVerticalGroup(
            ImprimirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImprimirBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ImprimirBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("RUT CLIENTE");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(240, 240, 240)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(idTxt)
                                        .addGap(44, 44, 44)
                                        .addComponent(NombreTxt)
                                        .addGap(143, 143, 143)
                                        .addComponent(PrecioTxt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CategoriaTxt)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MarcaTxt)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadTxt)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ImprimirBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(9, 9, 9))
        );

        jTabbedPane1.addTab("Cotizar", jPanel4);

        ClienteTpb.setBackground(new java.awt.Color(255, 255, 255));
        ClienteTpb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClienteTpbMousePressed(evt);
            }
        });

        RutClienteTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RutClienteTxt.setForeground(new java.awt.Color(153, 153, 153));
        RutClienteTxt.setText("Rut sin Guion");
        RutClienteTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        RutClienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RutClienteTxtMousePressed(evt);
            }
        });

        NombreClienteTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreClienteTxt.setForeground(new java.awt.Color(153, 153, 153));
        NombreClienteTxt.setText("Nombre");
        NombreClienteTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreClienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreClienteTxtMousePressed(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TelefonoTxt.setForeground(new java.awt.Color(153, 153, 153));
        TelefonoTxt.setText("Telefono");
        TelefonoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TelefonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoTxtMousePressed(evt);
            }
        });

        RazonSocialTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RazonSocialTxt.setForeground(new java.awt.Color(153, 153, 153));
        RazonSocialTxt.setText("Razon Social");
        RazonSocialTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        RazonSocialTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RazonSocialTxtMousePressed(evt);
            }
        });

        DireccionTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DireccionTxt.setForeground(new java.awt.Color(153, 153, 153));
        DireccionTxt.setText("Direccion");
        DireccionTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DireccionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DireccionTxtMousePressed(evt);
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

        AgregarClienteBtn.setBackground(new java.awt.Color(144, 153, 162));

        AgregarClienteBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        AgregarClienteBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        AgregarClienteBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgregarClienteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarClienteBtnTxt.setText("AGREGAR");
        AgregarClienteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarClienteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarClienteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarClienteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarClienteBtnLayout = new javax.swing.GroupLayout(AgregarClienteBtn);
        AgregarClienteBtn.setLayout(AgregarClienteBtnLayout);
        AgregarClienteBtnLayout.setHorizontalGroup(
            AgregarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(AgregarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AgregarClienteBtnLayout.setVerticalGroup(
            AgregarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(AgregarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ActualizarClienteBtn.setBackground(new java.awt.Color(144, 153, 162));

        ActualizarClienteBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        ActualizarClienteBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ActualizarClienteBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarClienteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActualizarClienteBtnTxt.setText("ACTUALIZAR");
        ActualizarClienteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarClienteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarClienteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarClienteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ActualizarClienteBtnLayout = new javax.swing.GroupLayout(ActualizarClienteBtn);
        ActualizarClienteBtn.setLayout(ActualizarClienteBtnLayout);
        ActualizarClienteBtnLayout.setHorizontalGroup(
            ActualizarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ActualizarClienteBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        ActualizarClienteBtnLayout.setVerticalGroup(
            ActualizarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarClienteBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ActualizarClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NuevoClienteBtn.setBackground(new java.awt.Color(144, 153, 162));

        NuevoClienteBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        NuevoClienteBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        NuevoClienteBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        NuevoClienteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevoClienteBtnTxt.setText("NUEVO");
        NuevoClienteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevoClienteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevoClienteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevoClienteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NuevoClienteBtnLayout = new javax.swing.GroupLayout(NuevoClienteBtn);
        NuevoClienteBtn.setLayout(NuevoClienteBtnLayout);
        NuevoClienteBtnLayout.setHorizontalGroup(
            NuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(NuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevoClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevoClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NuevoClienteBtnLayout.setVerticalGroup(
            NuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(NuevoClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevoClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevoClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        EliminarClienteBtn.setBackground(new java.awt.Color(144, 153, 162));

        EliminarClienteBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        EliminarClienteBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        EliminarClienteBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        EliminarClienteBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarClienteBtnTxt.setText("ELIMINAR");
        EliminarClienteBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarClienteBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarClienteBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarClienteBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarClienteBtnLayout = new javax.swing.GroupLayout(EliminarClienteBtn);
        EliminarClienteBtn.setLayout(EliminarClienteBtnLayout);
        EliminarClienteBtnLayout.setHorizontalGroup(
            EliminarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(EliminarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EliminarClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EliminarClienteBtnLayout.setVerticalGroup(
            EliminarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(EliminarClienteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarClienteBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EliminarClienteBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        DvTxt.setForeground(new java.awt.Color(153, 153, 153));
        DvTxt.setText("Dv");
        DvTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DvTxtMousePressed(evt);
            }
        });
        DvTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DvTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteTpbLayout = new javax.swing.GroupLayout(ClienteTpb);
        ClienteTpb.setLayout(ClienteTpbLayout);
        ClienteTpbLayout.setHorizontalGroup(
            ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClienteScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(ClienteTpbLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RazonSocialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RutClienteTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarClienteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoClienteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        ClienteTpbLayout.setVerticalGroup(
            ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTpbLayout.createSequentialGroup()
                .addComponent(ClienteScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RutClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AgregarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NuevoClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EliminarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RazonSocialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", ClienteTpb);

        ProductosTpb.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Categoria", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jTextField8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField8.setText("Nombre");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField9.setText("Marca");

        jTextField10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField10.setText("Precio");

        jTextField11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField11.setText("Categoria");

        jTextField12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField12.setText("Cantidad");

        javax.swing.GroupLayout ProductosTpbLayout = new javax.swing.GroupLayout(ProductosTpb);
        ProductosTpb.setLayout(ProductosTpbLayout);
        ProductosTpbLayout.setHorizontalGroup(
            ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosTpbLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(jTextField9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jTextField12))
                .addGap(14, 14, 14))
        );
        ProductosTpbLayout.setVerticalGroup(
            ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosTpbLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", ProductosTpb);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Informe", jPanel3);

        background.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 580, 370));

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
        
        AgregarBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_AgregarBtnTxtMouseEntered

    private void AgregarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnTxtMouseExited
        
        AgregarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_AgregarBtnTxtMouseExited

    private void ProductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBtnTxtMouseEntered
        
        ProductoBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_ProductoBtnTxtMouseEntered

    private void ProductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBtnTxtMouseExited
        
        ProductoBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_ProductoBtnTxtMouseExited

    private void InformeBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeBtnTxtMouseEntered
        
        InformeBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_InformeBtnTxtMouseEntered

    private void InformeBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeBtnTxtMouseExited
        
        InformeBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_InformeBtnTxtMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void EliminarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseEntered
        
        EliminarBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_EliminarBtnTxtMouseEntered

    private void EliminarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseExited
        // TODO add your handling code here:
        EliminarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_EliminarBtnTxtMouseExited

    private void ImprimirBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirBtnTxtMouseEntered
        
        ImprimirBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_ImprimirBtnTxtMouseEntered

    private void ImprimirBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirBtnTxtMouseExited
        
        ImprimirBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_ImprimirBtnTxtMouseExited

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void EliminarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClienteBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarClienteBtnTxtMouseExited

    private void EliminarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarClienteBtnTxtMouseEntered

    private void NuevoClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClienteBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoClienteBtnTxtMouseExited

    private void NuevoClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClienteBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoClienteBtnTxtMouseEntered

    private void ActualizarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarClienteBtnTxtMouseExited

    private void ActualizarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarClienteBtnTxtMouseEntered

    private void AgregarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarClienteBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarClienteBtnTxtMouseExited

    private void AgregarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarClienteBtnTxtMouseEntered

    private void NombreClienteTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreClienteTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (NombreClienteTxt.getText().equals("Nombre")) {
            NombreClienteTxt.setText("");
            NombreClienteTxt.setForeground(Color.black);
        }
        if (RutClienteTxt.getText().isEmpty()) {
            RutClienteTxt.setText("Rut sin Guion");
            RutClienteTxt.setForeground(Color.gray);
        }
        if (RazonSocialTxt.getText().isEmpty()) {
            RazonSocialTxt.setText("Razon Social");
            RazonSocialTxt.setForeground(Color.gray);
        }
        if (DireccionTxt.getText().isEmpty()) {
            DireccionTxt.setText("Direccion");
            DireccionTxt.setForeground(Color.gray);
        }
        if (DvTxt.getText().isEmpty()) {
            DvTxt.setText("Dv");
            DvTxt.setForeground(Color.gray);
        }
        if (TelefonoTxt.getText().isEmpty()) {
            TelefonoTxt.setText("Telefono");
            TelefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NombreClienteTxtMousePressed

    private void RutClienteTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutClienteTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (RutClienteTxt.getText().equals("Rut sin Guion")) {
            RutClienteTxt.setText("");
            RutClienteTxt.setForeground(Color.black);
        }
        if (NombreClienteTxt.getText().isEmpty()) {
            NombreClienteTxt.setText("Nombre");
            NombreClienteTxt.setForeground(Color.gray);
        }
        if (RazonSocialTxt.getText().isEmpty()) {
            RazonSocialTxt.setText("Razon Social");
            RazonSocialTxt.setForeground(Color.gray);
        }
        if (DireccionTxt.getText().isEmpty()) {
            DireccionTxt.setText("Direccion");
            DireccionTxt.setForeground(Color.gray);
        }
        if (DvTxt.getText().isEmpty()) {
            DvTxt.setText("Dv");
            DvTxt.setForeground(Color.gray);
        }
        if (TelefonoTxt.getText().isEmpty()) {
            TelefonoTxt.setText("Telefono");
            TelefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_RutClienteTxtMousePressed

    private void RazonSocialTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RazonSocialTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (RazonSocialTxt.getText().equals("Razon Social")) {
            RazonSocialTxt.setText("");
            RazonSocialTxt.setForeground(Color.black);
        }
        if (RutClienteTxt.getText().isEmpty()) {
            RutClienteTxt.setText("Rut sin Guion");
            RutClienteTxt.setForeground(Color.gray);
        }
        if (NombreClienteTxt.getText().isEmpty()) {
            NombreClienteTxt.setText("Nombre");
            NombreClienteTxt.setForeground(Color.gray);
        }
        if (DireccionTxt.getText().isEmpty()) {
            DireccionTxt.setText("Direccion");
            DireccionTxt.setForeground(Color.gray);
        }
        if (DvTxt.getText().isEmpty()) {
            DvTxt.setText("Dv");
            DvTxt.setForeground(Color.gray);
        }
        if (TelefonoTxt.getText().isEmpty()) {
            TelefonoTxt.setText("Telefono");
            TelefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_RazonSocialTxtMousePressed

    private void DireccionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (DireccionTxt.getText().equals("Direccion")) {
            DireccionTxt.setText("");
            DireccionTxt.setForeground(Color.black);
        }
        if (RutClienteTxt.getText().isEmpty()) {
            RutClienteTxt.setText("Rut sin Guion");
            RutClienteTxt.setForeground(Color.gray);
        }
        if (RazonSocialTxt.getText().isEmpty()) {
            RazonSocialTxt.setText("Razon Social");
            RazonSocialTxt.setForeground(Color.gray);
        }
        if (NombreClienteTxt.getText().isEmpty()) {
            NombreClienteTxt.setText("Nombre");
            NombreClienteTxt.setForeground(Color.gray);
        }
        if (DvTxt.getText().isEmpty()) {
            DvTxt.setText("Dv");
            DvTxt.setForeground(Color.gray);
        }
        if (TelefonoTxt.getText().isEmpty()) {
            TelefonoTxt.setText("Telefono");
            TelefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DireccionTxtMousePressed

    private void ClienteTpbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteTpbMousePressed

    }//GEN-LAST:event_ClienteTpbMousePressed

    private void DvTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DvTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (DvTxt.getText().equals("Dv")) {
            DvTxt.setText("");
            DvTxt.setForeground(Color.black);
        }
        if (RutClienteTxt.getText().isEmpty()) {
            RutClienteTxt.setText("Rut sin Guion");
            RutClienteTxt.setForeground(Color.gray);
        }
        if (RazonSocialTxt.getText().isEmpty()) {
            RazonSocialTxt.setText("Razon Social");
            RazonSocialTxt.setForeground(Color.gray);
        }
        if (DireccionTxt.getText().isEmpty()) {
            DireccionTxt.setText("Direccion");
            DireccionTxt.setForeground(Color.gray);
        }
        if (NombreClienteTxt.getText().isEmpty()) {
            NombreClienteTxt.setText("Nombre");
            NombreClienteTxt.setForeground(Color.gray);
        }
        if (TelefonoTxt.getText().isEmpty()) {
            TelefonoTxt.setText("Telefono");
            TelefonoTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DvTxtMousePressed

    private void DvTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DvTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DvTxtActionPerformed

    private void TelefonoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoTxtMousePressed
        //Permite que el texto dentro del jTexfield vuelva al texto original si los demas campos estan vacios
        if (TelefonoTxt.getText().equals("Telefono")) {
            TelefonoTxt.setText("");
            TelefonoTxt.setForeground(Color.black);
        }
        if (RutClienteTxt.getText().isEmpty()) {
            RutClienteTxt.setText("Rut sin Guion");
            RutClienteTxt.setForeground(Color.gray);
        }
        if (RazonSocialTxt.getText().isEmpty()) {
            RazonSocialTxt.setText("Razon Social");
            RazonSocialTxt.setForeground(Color.gray);
        }
        if (DireccionTxt.getText().isEmpty()) {
            DireccionTxt.setText("Direccion");
            DireccionTxt.setForeground(Color.gray);
        }
        if (DvTxt.getText().isEmpty()) {
            DvTxt.setText("Dv");
            DvTxt.setForeground(Color.gray);
        }
        if (NombreClienteTxt.getText().isEmpty()) {
            NombreClienteTxt.setText("Nombre");
            NombreClienteTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TelefonoTxtMousePressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

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
    private javax.swing.JPanel ActualizarClienteBtn;
    private javax.swing.JLabel ActualizarClienteBtnTxt;
    private javax.swing.JPanel AgregarBtn;
    private javax.swing.JLabel AgregarBtnTxt;
    private javax.swing.JPanel AgregarClienteBtn;
    private javax.swing.JLabel AgregarClienteBtnTxt;
    private javax.swing.JLabel CantidadTxt;
    private javax.swing.JLabel CategoriaTxt;
    private javax.swing.JScrollPane ClienteScrollPanel;
    private javax.swing.JPanel ClienteTpb;
    private javax.swing.JPanel CotizarBtn;
    private javax.swing.JLabel CotizarBtnTxt;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JTextField DvTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel EliminarBtnTxt;
    private javax.swing.JPanel EliminarClienteBtn;
    private javax.swing.JLabel EliminarClienteBtnTxt;
    private javax.swing.JPanel ImprimirBtn;
    private javax.swing.JLabel ImprimirBtnTxt;
    private javax.swing.JPanel InformeBtn;
    private javax.swing.JLabel InformeBtnTxt;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MarcaTxt;
    private javax.swing.JTextField NombreClienteTxt;
    private javax.swing.JLabel NombreTxt;
    private javax.swing.JPanel NuevoClienteBtn;
    private javax.swing.JLabel NuevoClienteBtnTxt;
    private javax.swing.JLabel PrecioTxt;
    private javax.swing.JPanel ProductoBtn;
    private javax.swing.JLabel ProductoBtnTxt;
    private javax.swing.JPanel ProductosTpb;
    private javax.swing.JTextField RazonSocialTxt;
    private javax.swing.JTextField RutClienteTxt;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoSuperior;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
