package com.system.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.time.LocalDate;

public class JFDashboard extends javax.swing.JFrame {

    public static int urgente;
    public static int no_urgente;
    public static int importante;
    public static int no_importante;

    public static int tipo_p = 0;
    public static String adm;
    public static String usuaa;
    public static String usua;
    public static boolean est = false;

    int xMouse;
    int yMouse;

    public JFDashboard() {
        initComponents();

        vita_boton(est);
        this.jlabAdmin.setText(usuaa);
        this.jlabPerfil.setText(adm + ": ");
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        this.jlfecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);

        jpPrincipal.setBackground(new Color(40, 116, 166));
        Principal p1 = new Principal();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpAlta_articulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        app_name1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpDespacho = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpReporte = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jlabAdmin = new javax.swing.JLabel();
        jlfecha = new javax.swing.JLabel();
        jlabPerfil = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(21, 67, 96));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app_name.setText("TESTING");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jpPrincipal.setBackground(new java.awt.Color(40, 116, 166));
        jpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPrincipalMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\1.png")); // NOI18N
        jLabel4.setText("Principal");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jpAlta_articulo.setBackground(new java.awt.Color(21, 67, 96));
        jpAlta_articulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpAlta_articuloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpAlta_articuloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpAlta_articuloMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\5.png")); // NOI18N
        jLabel3.setText("Articulo");

        javax.swing.GroupLayout jpAlta_articuloLayout = new javax.swing.GroupLayout(jpAlta_articulo);
        jpAlta_articulo.setLayout(jpAlta_articuloLayout);
        jpAlta_articuloLayout.setHorizontalGroup(
            jpAlta_articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlta_articuloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpAlta_articuloLayout.setVerticalGroup(
            jpAlta_articuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlta_articuloLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpRegistro.setBackground(new java.awt.Color(21, 67, 96));
        jpRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpRegistroMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\8.png")); // NOI18N
        jLabel2.setText("Registro");

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpUsuario.setBackground(new java.awt.Color(21, 67, 96));
        jpUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpUsuarioMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\8.png")); // NOI18N
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuarioLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        app_name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        app_name1.setForeground(new java.awt.Color(255, 255, 255));
        app_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app_name1.setText("NON DESTRUCTIVE");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\logo_dash.png")); // NOI18N

        jpDespacho.setBackground(new java.awt.Color(21, 67, 96));
        jpDespacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpDespachoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpDespachoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpDespachoMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\venta.png")); // NOI18N
        jLabel6.setText("Despacho");

        javax.swing.GroupLayout jpDespachoLayout = new javax.swing.GroupLayout(jpDespacho);
        jpDespacho.setLayout(jpDespachoLayout);
        jpDespachoLayout.setHorizontalGroup(
            jpDespachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDespachoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpDespachoLayout.setVerticalGroup(
            jpDespachoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDespachoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpReporte.setBackground(new java.awt.Color(21, 67, 96));
        jpReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpReporteMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\report.png")); // NOI18N
        jLabel7.setText("Reporte");

        javax.swing.GroupLayout jpReporteLayout = new javax.swing.GroupLayout(jpReporte);
        jpReporte.setLayout(jpReporteLayout);
        jpReporteLayout.setHorizontalGroup(
            jpReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReporteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jpReporteLayout.setVerticalGroup(
            jpReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReporteLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(app_name))
                    .addComponent(app_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpAlta_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(app_name))
                    .addComponent(app_name1))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpAlta_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(40, 116, 166));

        jlabAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jlabAdmin.setText("Jk Cesar Llaguento Carlos");

        jlfecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setText("Hoy es Jueves 29 de Dicembre de 2022");

        jlabPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jlabPerfil.setText("Adminstrador: ");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jlabPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabAdmin))
                    .addComponent(jlfecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabPerfil)
                    .addComponent(jlabAdmin))
                .addGap(18, 18, 18)
                .addComponent(jlfecha)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Title.setBackground(new java.awt.Color(250, 250, 250));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void jpPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseEntered
        this.jpPrincipal.setBackground(new Color(40, 116, 166));
        this.jpPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jpPrincipalMouseEntered

    private void jpPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseExited
        this.jpPrincipal.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_jpPrincipalMouseExited

    private void jpUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseEntered
        this.jpUsuario.setBackground(new Color(40, 116, 166));
        this.jpUsuario.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jpUsuarioMouseEntered

    private void jpUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMouseExited
        this.jpUsuario.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_jpUsuarioMouseExited

    private void jpRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMouseEntered
        this.jpRegistro.setBackground(new Color(40, 116, 166));
        this.jpRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jpRegistroMouseEntered

    private void jpRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMouseExited
        this.jpRegistro.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_jpRegistroMouseExited

    private void jpAlta_articuloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlta_articuloMouseEntered
        this.jpAlta_articulo.setBackground(new Color(40, 116, 166));
        this.jpAlta_articulo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jpAlta_articuloMouseEntered

    private void jpAlta_articuloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlta_articuloMouseExited
        this.jpAlta_articulo.setBackground(new Color(21, 67, 96));

    }//GEN-LAST:event_jpAlta_articuloMouseExited

    private void jpPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMousePressed
        this.jpPrincipal.setBackground(new Color(40, 116, 166));

        // Abrir sección
        Principal p1 = new Principal();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpPrincipalMousePressed

    private void jpUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuarioMousePressed
        this.jpUsuario.setBackground(new Color(40, 116, 166));
        tipo_p = 1;
        jpUsuario u1 = new jpUsuario();
        u1.setSize(1039, 521);
        u1.setLocation(0, 0);

        content.removeAll();
        content.add(u1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpUsuarioMousePressed

    private void jpRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegistroMousePressed
        this.jpRegistro.setBackground(new Color(40, 116, 166));

        // Abrir sección
        jpRegistro p1 = new jpRegistro();
        p1.setSize(1039, 521);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpRegistroMousePressed

    private void jpAlta_articuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAlta_articuloMousePressed
        this.jpAlta_articulo.setBackground(new Color(40, 116, 166));
        tipo_p = 2;
        // Abrir sección
        jpAlta_articulo p1 = new jpAlta_articulo();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpAlta_articuloMousePressed

    private void jpDespachoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDespachoMouseEntered
        this.jpDespacho.setBackground(new Color(40, 116, 166));
        this.jpDespacho.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jpDespachoMouseEntered

    private void jpDespachoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDespachoMouseExited
        this.jpDespacho.setBackground(new Color(21, 67, 96));

    }//GEN-LAST:event_jpDespachoMouseExited

    private void jpDespachoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDespachoMousePressed
        this.jpDespacho.setBackground(new Color(40, 116, 166));
        tipo_p = 3;
        // Abrir sección
        jpDespacho p1 = new jpDespacho();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpDespachoMousePressed

    private void jpReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMouseEntered
        this.jpReporte.setBackground(new Color(40, 116, 166));
        this.jpReporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jpReporteMouseEntered

    private void jpReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMouseExited
         this.jpReporte.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_jpReporteMouseExited

    private void jpReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpReporteMousePressed
          this.jpReporte.setBackground(new Color(40, 116, 166));
      
        // Abrir sección
        jpReporte p1 = new jpReporte();
        p1.setSize(1039, 520);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jpReporteMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JLabel app_name1;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabAdmin;
    private javax.swing.JLabel jlabPerfil;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JPanel jpAlta_articulo;
    private javax.swing.JPanel jpDespacho;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JPanel jpReporte;
    private javax.swing.JPanel jpUsuario;
    // End of variables declaration//GEN-END:variables

    private void vita_boton(boolean est) {
        if (est == true) {
            this.jpUsuario.setVisible(false);
        }
    }

}
