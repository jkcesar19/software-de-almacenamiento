package com.system.view;

import com.system.view.cliente.VistaCliente;
import com.system.view.trabajador.VistaPers;
import com.system.view.product.VistaProduc;
import com.system.view.proveedor.VistaProveedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

public class jpRegistro extends javax.swing.JPanel {

    public static int tipo_persona = 0;
    private int op = 0;

    public jpRegistro() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMaterial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelSegundario = new javax.swing.JPanel();
        btnProveedor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 520));

        btnMaterial.setBackground(new java.awt.Color(21, 67, 96));
        btnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaterialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaterialMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\material.png")); // NOI18N
        jLabel2.setText("Material");

        javax.swing.GroupLayout btnMaterialLayout = new javax.swing.GroupLayout(btnMaterial);
        btnMaterial.setLayout(btnMaterialLayout);
        btnMaterialLayout.setHorizontalGroup(
            btnMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaterialLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2))
        );
        btnMaterialLayout.setVerticalGroup(
            btnMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaterialLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnPersonal.setBackground(new java.awt.Color(21, 67, 96));
        btnPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPersonalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPersonalMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\person.png")); // NOI18N
        jLabel1.setText("Trabajador");

        javax.swing.GroupLayout btnPersonalLayout = new javax.swing.GroupLayout(btnPersonal);
        btnPersonal.setLayout(btnPersonalLayout);
        btnPersonalLayout.setHorizontalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        btnPersonalLayout.setVerticalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPersonalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSegundario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelSegundarioLayout = new javax.swing.GroupLayout(panelSegundario);
        panelSegundario.setLayout(panelSegundarioLayout);
        panelSegundarioLayout.setHorizontalGroup(
            panelSegundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        panelSegundarioLayout.setVerticalGroup(
            panelSegundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        btnProveedor.setBackground(new java.awt.Color(21, 67, 96));
        btnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProveedorMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\person.png")); // NOI18N
        jLabel5.setText("Proveedor");

        javax.swing.GroupLayout btnProveedorLayout = new javax.swing.GroupLayout(btnProveedor);
        btnProveedor.setLayout(btnProveedorLayout);
        btnProveedorLayout.setHorizontalGroup(
            btnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProveedorLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );
        btnProveedorLayout.setVerticalGroup(
            btnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProveedorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCliente.setBackground(new java.awt.Color(21, 67, 96));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClienteMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\person.png")); // NOI18N
        jLabel6.setText("Cliente");

        javax.swing.GroupLayout btnClienteLayout = new javax.swing.GroupLayout(btnCliente);
        btnCliente.setLayout(btnClienteLayout);
        btnClienteLayout.setHorizontalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnClienteLayout.setVerticalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panelSegundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSegundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMousePressed
        this.btnPersonal.setBackground(new Color(40, 116, 166));
        op = 1;
        color_select(op);
        // Abrir sección
        tipo_persona = 1;
        VistaPers p1 = new VistaPers();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnPersonalMousePressed

    private void btnMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMousePressed
        this.btnMaterial.setBackground(new Color(40, 116, 166));
//img_regis.setVisible(false);
        // Abrir sección
        VistaProduc p1 = new VistaProduc();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnMaterialMousePressed

    private void btnPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMouseEntered
        this.btnPersonal.setBackground(new Color(40, 116, 166));
        this.btnPersonal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPersonalMouseEntered

    private void btnPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMouseExited
        this.btnPersonal.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btnPersonalMouseExited

    private void btnMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseEntered
        this.btnMaterial.setBackground(new Color(40, 116, 166));
        this.btnMaterial.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnMaterialMouseEntered

    private void btnMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseExited
        this.btnMaterial.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btnMaterialMouseExited

    private void btnProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseEntered
//        this.btnProveedor.setBackground(new Color(40, 116, 166));
        this.btnProveedor.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnProveedorMouseEntered

    private void btnProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMouseExited
        this.btnProveedor.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btnProveedorMouseExited

    private void btnProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedorMousePressed
         op = 2;
        color_select(op);
        // Abrir sección
        tipo_persona = 2;
        VistaProveedor p1 = new VistaProveedor();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnProveedorMousePressed

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
//        this.btnCliente.setBackground(new Color(40, 116, 166));
        this.btnCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        this.btnCliente.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed
        op = 3;
        color_select(op);
          tipo_persona = 3;
        VistaCliente p1 = new VistaCliente();
        p1.setSize(789, 449);
        p1.setLocation(0, 0);

        panelSegundario.removeAll();
        panelSegundario.add(p1, BorderLayout.CENTER);
        panelSegundario.revalidate();
        panelSegundario.repaint();
    }//GEN-LAST:event_btnClienteMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCliente;
    private javax.swing.JPanel btnMaterial;
    private javax.swing.JPanel btnPersonal;
    private javax.swing.JPanel btnProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSegundario;
    // End of variables declaration//GEN-END:variables

    private void color_select(int op) {
        switch (op) {
            case 1:
               this.btnPersonal.setBackground(new Color(40, 116, 166));
                System.out.println("HOla animal 1");
                break;
            case 2:
               this.btnProveedor.setBackground(new Color(40, 116, 166));
                System.out.println("HOla animal 2");
                break;
            case 3:
                this.btnCliente.setBackground(new Color(40, 116, 166));
                System.out.println("HOla animal 3");
                break;
            case 4:
                // secuencia de sentencias.
                break;
            case 5:
                // secuencia de sentencias.
                break;
            case 6:
                // secuencia de sentencias.
                break;
        }
    }

//    class FondoPanel extends JPanel {
//
//        private Image imagen;
//
//        public void paint(Graphics g) {
//            imagen = new ImageIcon(getClass().getResource("src/com/system/img/img1.jpg")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            super.paint(g);
//
//        }
//    }
}
