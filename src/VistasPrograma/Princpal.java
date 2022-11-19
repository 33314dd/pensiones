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
        EliminarBtn = new javax.swing.JPanel();
        EliminarBtnTxt = new javax.swing.JLabel();
        GenerarBtn = new javax.swing.JPanel();
        GenerarBtnTxt = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        TotalCotizarTxt = new javax.swing.JLabel();
        TotalLbl = new javax.swing.JLabel();
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
        NombrePorductoTxt = new javax.swing.JTextField();
        MarcaPorductoTxt = new javax.swing.JTextField();
        PrecioPorductoTxt = new javax.swing.JTextField();
        CategoriaPorductoTxt = new javax.swing.JTextField();
        CantidadPorductoTxt = new javax.swing.JTextField();
        AgregarPorductoBtn = new javax.swing.JPanel();
        AgregarPorductoBtnTxt = new javax.swing.JLabel();
        ActualizarPorductoBtn = new javax.swing.JPanel();
        ActualizarProductoBtnTxt = new javax.swing.JLabel();
        NuevoProductoBtn = new javax.swing.JPanel();
        NuevoProductoBtnTxt = new javax.swing.JLabel();
        EliminarProductoBtn = new javax.swing.JPanel();
        EliminarProductoBtnTxt = new javax.swing.JLabel();
        InformeTpb = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        EliminarProductoBtn1 = new javax.swing.JPanel();
        EliminarProductoBtnTxt1 = new javax.swing.JLabel();
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

        GenerarBtn.setBackground(new java.awt.Color(144, 153, 162));

        GenerarBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        GenerarBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        GenerarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        GenerarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenerarBtnTxt.setText("GENERAR");
        GenerarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenerarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenerarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GenerarBtnLayout = new javax.swing.GroupLayout(GenerarBtn);
        GenerarBtn.setLayout(GenerarBtnLayout);
        GenerarBtnLayout.setHorizontalGroup(
            GenerarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenerarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        GenerarBtnLayout.setVerticalGroup(
            GenerarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenerarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GenerarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jTextField7.setText("Rut Cliente");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        TotalCotizarTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TotalCotizarTxt.setText("Total:");

        TotalLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TotalLbl.setText("------");

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
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(GenerarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(TotalCotizarTxt)
                        .addGap(18, 18, 18)
                        .addComponent(TotalLbl)))
                .addContainerGap(59, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(GenerarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CotizarTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TotalLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TotalCotizarTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EliminarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        TablaGeneralTpb.addTab("Cotizar", CotizarTpb);

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
        RutClienteTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        RutClienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RutClienteTxtMousePressed(evt);
            }
        });

        NombreClienteTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        NombreClienteTxt.setForeground(new java.awt.Color(153, 153, 153));
        NombreClienteTxt.setText("Nombre");
        NombreClienteTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NombreClienteTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        NombreClienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreClienteTxtMousePressed(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TelefonoTxt.setForeground(new java.awt.Color(153, 153, 153));
        TelefonoTxt.setText("Telefono");
        TelefonoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TelefonoTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        TelefonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoTxtMousePressed(evt);
            }
        });

        RazonSocialTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RazonSocialTxt.setForeground(new java.awt.Color(153, 153, 153));
        RazonSocialTxt.setText("Razon Social");
        RazonSocialTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        RazonSocialTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
        RazonSocialTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RazonSocialTxtMousePressed(evt);
            }
        });

        DireccionTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        DireccionTxt.setForeground(new java.awt.Color(153, 153, 153));
        DireccionTxt.setText("Direccion");
        DireccionTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DireccionTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
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
        ActualizarClienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarClienteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarClienteBtnMouseExited(evt);
            }
        });

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
        DvTxt.setSelectionColor(new java.awt.Color(153, 153, 153));
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
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreClienteTxt)
                            .addComponent(RazonSocialTxt))
                        .addGap(18, 18, 18)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TelefonoTxt)
                            .addComponent(DireccionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addComponent(RutClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarClienteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoClienteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        ClienteTpbLayout.setVerticalGroup(
            ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteTpbLayout.createSequentialGroup()
                .addComponent(ClienteScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteTpbLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RutClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RazonSocialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteTpbLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActualizarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClienteTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NuevoClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        NombrePorductoTxt.setText("Nombre");
        NombrePorductoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePorductoTxtActionPerformed(evt);
            }
        });

        MarcaPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        MarcaPorductoTxt.setText("Marca");

        PrecioPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        PrecioPorductoTxt.setText("Precio");

        CategoriaPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CategoriaPorductoTxt.setText("Categoria");

        CantidadPorductoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CantidadPorductoTxt.setText("Cantidad");

        AgregarPorductoBtn.setBackground(new java.awt.Color(144, 153, 162));

        AgregarPorductoBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        AgregarPorductoBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        AgregarPorductoBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgregarPorductoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarPorductoBtnTxt.setText("AGREGAR");
        AgregarPorductoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarPorductoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarPorductoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarPorductoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarPorductoBtnLayout = new javax.swing.GroupLayout(AgregarPorductoBtn);
        AgregarPorductoBtn.setLayout(AgregarPorductoBtnLayout);
        AgregarPorductoBtnLayout.setHorizontalGroup(
            AgregarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(AgregarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarPorductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarPorductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AgregarPorductoBtnLayout.setVerticalGroup(
            AgregarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(AgregarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AgregarPorductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AgregarPorductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ActualizarPorductoBtn.setBackground(new java.awt.Color(144, 153, 162));

        ActualizarProductoBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        ActualizarProductoBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ActualizarProductoBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarProductoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActualizarProductoBtnTxt.setText("ACTUALIZAR");
        ActualizarProductoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarProductoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarProductoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarProductoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ActualizarPorductoBtnLayout = new javax.swing.GroupLayout(ActualizarPorductoBtn);
        ActualizarPorductoBtn.setLayout(ActualizarPorductoBtnLayout);
        ActualizarPorductoBtnLayout.setHorizontalGroup(
            ActualizarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ActualizarProductoBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        ActualizarPorductoBtnLayout.setVerticalGroup(
            ActualizarPorductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarPorductoBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ActualizarProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NuevoProductoBtn.setBackground(new java.awt.Color(144, 153, 162));

        NuevoProductoBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        NuevoProductoBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        NuevoProductoBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        NuevoProductoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevoProductoBtnTxt.setText("NUEVO");
        NuevoProductoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevoProductoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevoProductoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevoProductoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NuevoProductoBtnLayout = new javax.swing.GroupLayout(NuevoProductoBtn);
        NuevoProductoBtn.setLayout(NuevoProductoBtnLayout);
        NuevoProductoBtnLayout.setHorizontalGroup(
            NuevoProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(NuevoProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevoProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevoProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NuevoProductoBtnLayout.setVerticalGroup(
            NuevoProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(NuevoProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevoProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NuevoProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        EliminarProductoBtn.setBackground(new java.awt.Color(144, 153, 162));

        EliminarProductoBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        EliminarProductoBtnTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        EliminarProductoBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        EliminarProductoBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarProductoBtnTxt.setText("ELIMINAR");
        EliminarProductoBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarProductoBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarProductoBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarProductoBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarProductoBtnLayout = new javax.swing.GroupLayout(EliminarProductoBtn);
        EliminarProductoBtn.setLayout(EliminarProductoBtnLayout);
        EliminarProductoBtnLayout.setHorizontalGroup(
            EliminarProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(EliminarProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EliminarProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EliminarProductoBtnLayout.setVerticalGroup(
            EliminarProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(EliminarProductoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarProductoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EliminarProductoBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ProductosTpbLayout = new javax.swing.GroupLayout(ProductosTpb);
        ProductosTpb.setLayout(ProductosTpbLayout);
        ProductosTpbLayout.setHorizontalGroup(
            ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosTpbLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarPorductoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoProductoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarPorductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombrePorductoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(MarcaPorductoTxt)
                    .addComponent(PrecioPorductoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarPorductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActualizarPorductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductosTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NuevoProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarProductoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        EliminarProductoBtn1.setBackground(new java.awt.Color(144, 153, 162));

        EliminarProductoBtnTxt1.setBackground(new java.awt.Color(255, 255, 255));
        EliminarProductoBtnTxt1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        EliminarProductoBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        EliminarProductoBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EliminarProductoBtnTxt1.setText("GENERAR INFORME");
        EliminarProductoBtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarProductoBtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarProductoBtnTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarProductoBtnTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarProductoBtn1Layout = new javax.swing.GroupLayout(EliminarProductoBtn1);
        EliminarProductoBtn1.setLayout(EliminarProductoBtn1Layout);
        EliminarProductoBtn1Layout.setHorizontalGroup(
            EliminarProductoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
            .addGroup(EliminarProductoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarProductoBtn1Layout.createSequentialGroup()
                    .addComponent(EliminarProductoBtnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        EliminarProductoBtn1Layout.setVerticalGroup(
            EliminarProductoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(EliminarProductoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EliminarProductoBtnTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InformeTpbLayout = new javax.swing.GroupLayout(InformeTpb);
        InformeTpb.setLayout(InformeTpbLayout);
        InformeTpbLayout.setHorizontalGroup(
            InformeTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(InformeTpbLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EliminarProductoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformeTpbLayout.setVerticalGroup(
            InformeTpbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeTpbLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EliminarProductoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

    private void IdCotizarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdCotizarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdCotizarTxtActionPerformed

    private void NombreCotizarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCotizarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCotizarTxtActionPerformed

    private void EliminarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseEntered
        
        EliminarBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_EliminarBtnTxtMouseEntered

    private void EliminarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnTxtMouseExited
        // TODO add your handling code here:
        
        EliminarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_EliminarBtnTxtMouseExited

    private void GenerarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarBtnTxtMouseEntered
        
        GenerarBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_GenerarBtnTxtMouseEntered

    private void GenerarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarBtnTxtMouseExited
        
        GenerarBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_GenerarBtnTxtMouseExited

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void EliminarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClienteBtnTxtMouseExited
        // TODO add your handling code here:
        EliminarClienteBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_EliminarClienteBtnTxtMouseExited

    private void EliminarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
        EliminarClienteBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_EliminarClienteBtnTxtMouseEntered

    private void NuevoClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClienteBtnTxtMouseExited
        // TODO add your handling code here:
        
        NuevoClienteBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_NuevoClienteBtnTxtMouseExited

    private void NuevoClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoClienteBtnTxtMouseEntered
        // TODO add your handling code here:
        NuevoClienteBtn.setBackground(new Color(110, 122, 147));
        
    }//GEN-LAST:event_NuevoClienteBtnTxtMouseEntered

    private void ActualizarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnTxtMouseExited
        // TODO add your handling code here:
        
        ActualizarClienteBtn.setBackground(new Color(144, 153, 162));
    }//GEN-LAST:event_ActualizarClienteBtnTxtMouseExited

    private void ActualizarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
        ActualizarClienteBtn.setBackground(new Color(110, 122, 147));
    }//GEN-LAST:event_ActualizarClienteBtnTxtMouseEntered

    private void AgregarClienteBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarClienteBtnTxtMouseExited
        // TODO add your handling code here:
        AgregarClienteBtn.setBackground(new Color(144, 153, 162));
        
    }//GEN-LAST:event_AgregarClienteBtnTxtMouseExited

    private void AgregarClienteBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarClienteBtnTxtMouseEntered
        // TODO add your handling code here:
        AgregarClienteBtn.setBackground(new Color(110, 122, 147));
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

    private void NombrePorductoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePorductoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePorductoTxtActionPerformed

    private void AgregarPorductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarPorductoBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarPorductoBtnTxtMouseEntered

    private void AgregarPorductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarPorductoBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarPorductoBtnTxtMouseExited

    private void ActualizarProductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarProductoBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarProductoBtnTxtMouseEntered

    private void ActualizarProductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarProductoBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarProductoBtnTxtMouseExited

    private void NuevoProductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoProductoBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoProductoBtnTxtMouseEntered

    private void NuevoProductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoProductoBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoProductoBtnTxtMouseExited

    private void EliminarProductoBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarProductoBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarProductoBtnTxtMouseEntered

    private void EliminarProductoBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarProductoBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarProductoBtnTxtMouseExited

    private void EliminarProductoBtnTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarProductoBtnTxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarProductoBtnTxt1MouseEntered

    private void EliminarProductoBtnTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarProductoBtnTxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarProductoBtnTxt1MouseExited

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
    }//GEN-LAST:event_CantidadCotizarTxtMousePressed

    private void ActualizarClienteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnMouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_ActualizarClienteBtnMouseEntered

    private void ActualizarClienteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarClienteBtnMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ActualizarClienteBtnMouseExited

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
    private javax.swing.JPanel ActualizarPorductoBtn;
    private javax.swing.JLabel ActualizarProductoBtnTxt;
    private javax.swing.JPanel AgregarBtn;
    private javax.swing.JLabel AgregarBtnTxt;
    private javax.swing.JPanel AgregarClienteBtn;
    private javax.swing.JLabel AgregarClienteBtnTxt;
    private javax.swing.JPanel AgregarPorductoBtn;
    private javax.swing.JLabel AgregarPorductoBtnTxt;
    private javax.swing.JTextField CantidadCotizarTxt;
    private javax.swing.JTextField CantidadPorductoTxt;
    private javax.swing.JTextField CategoriaCotizarTxt;
    private javax.swing.JTextField CategoriaPorductoTxt;
    private javax.swing.JScrollPane ClienteScrollPanel;
    private javax.swing.JPanel ClienteTpb;
    private javax.swing.JPanel CotizarBtn;
    private javax.swing.JLabel CotizarBtnTxt;
    private javax.swing.JPanel CotizarTpb;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JTextField DvTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel EliminarBtnTxt;
    private javax.swing.JPanel EliminarClienteBtn;
    private javax.swing.JLabel EliminarClienteBtnTxt;
    private javax.swing.JPanel EliminarProductoBtn;
    private javax.swing.JPanel EliminarProductoBtn1;
    private javax.swing.JLabel EliminarProductoBtnTxt;
    private javax.swing.JLabel EliminarProductoBtnTxt1;
    private javax.swing.JPanel GenerarBtn;
    private javax.swing.JLabel GenerarBtnTxt;
    private javax.swing.JTextField IdCotizarTxt;
    private javax.swing.JPanel InformeBtn;
    private javax.swing.JLabel InformeBtnTxt;
    private javax.swing.JPanel InformeTpb;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField MarcaCotizarTxt;
    private javax.swing.JTextField MarcaPorductoTxt;
    private javax.swing.JTextField NombreClienteTxt;
    private javax.swing.JTextField NombreCotizarTxt;
    private javax.swing.JTextField NombrePorductoTxt;
    private javax.swing.JPanel NuevoClienteBtn;
    private javax.swing.JLabel NuevoClienteBtnTxt;
    private javax.swing.JPanel NuevoProductoBtn;
    private javax.swing.JLabel NuevoProductoBtnTxt;
    private javax.swing.JTextField PrecioCotizarTxt;
    private javax.swing.JTextField PrecioPorductoTxt;
    private javax.swing.JPanel ProductoBtn;
    private javax.swing.JLabel ProductoBtnTxt;
    private javax.swing.JPanel ProductosTpb;
    private javax.swing.JTextField RazonSocialTxt;
    private javax.swing.JTextField RutClienteTxt;
    private javax.swing.JTabbedPane TablaGeneralTpb;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel TotalCotizarTxt;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JPanel background;
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
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
