package com.system.view;

import com.system.business.Tabla_IngresoBo;
import com.system.business.Tabla_SalidaBo;
import com.system.conexion.Conexion;
import com.system.identity.implementation.TablaDao;
import com.system.table.TableArchivoBo;
import com.system.table.report.TableActionCellEditor;
import com.system.table.report.TableActionCellRender;
import com.system.table.report.TableActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Llaguento Carlos Cesar Jk
 */
public class jpReporte extends javax.swing.JPanel {

    private DefaultTableModel ArticuloTableModel;
    private DefaultTableModel ArticuloTableModelsalida;
    TableArchivoBo tabl = new TableArchivoBo();
    TablaDao id_pdf = new TablaDao();
    public int id = -1;
    public static int idp;

    public jpReporte() {
        initComponents();

//        cargarTabla();
        loadTableIngreso();
        tableAccionEntrada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salida = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_ingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ingreso_Salida = new javax.swing.JTable();
        btn_reporte_fecha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_salidaMousePressed(evt);
            }
        });

        jLabel2.setText("Salida");

        javax.swing.GroupLayout btn_salidaLayout = new javax.swing.GroupLayout(btn_salida);
        btn_salida.setLayout(btn_salidaLayout);
        btn_salidaLayout.setHorizontalGroup(
            btn_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_salidaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        btn_salidaLayout.setVerticalGroup(
            btn_salidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_salidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ingresoMousePressed(evt);
            }
        });

        jLabel1.setText("Ingreso");

        javax.swing.GroupLayout btn_ingresoLayout = new javax.swing.GroupLayout(btn_ingreso);
        btn_ingreso.setLayout(btn_ingresoLayout);
        btn_ingresoLayout.setHorizontalGroup(
            btn_ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ingresoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        btn_ingresoLayout.setVerticalGroup(
            btn_ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("REPORTE");

        jTable_ingreso_Salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "RAZON SOCIAL", "DESCRIPCION", "SUB T", "DESC", "IGV", "TOTAL", "FECHA", "PDF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ingreso_Salida.setRowHeight(40);
        jTable_ingreso_Salida.setSelectionBackground(new java.awt.Color(33, 125, 210));
        jScrollPane1.setViewportView(jTable_ingreso_Salida);

        btn_reporte_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reporte_fechaMousePressed(evt);
            }
        });

        jLabel4.setText("Reporte");

        javax.swing.GroupLayout btn_reporte_fechaLayout = new javax.swing.GroupLayout(btn_reporte_fecha);
        btn_reporte_fecha.setLayout(btn_reporte_fechaLayout);
        btn_reporte_fechaLayout.setHorizontalGroup(
            btn_reporte_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_reporte_fechaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        btn_reporte_fechaLayout.setVerticalGroup(
            btn_reporte_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_reporte_fechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_reporte_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_reporte_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresoMousePressed
        loadTableIngreso();
        tableAccionEntrada();
        System.out.println("ingreso");

    }//GEN-LAST:event_btn_ingresoMousePressed

    private void btn_salidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salidaMousePressed
        loadTableMateria();
        personalizarJtable();
        tableAccionsalida();
        System.out.println("salida");

    }//GEN-LAST:event_btn_salidaMousePressed

    private void btn_reporte_fechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_fechaMousePressed
        this.ingresar_fecha();
    }//GEN-LAST:event_btn_reporte_fechaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_ingreso;
    private javax.swing.JPanel btn_reporte_fecha;
    private javax.swing.JPanel btn_salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ingreso_Salida;
    // End of variables declaration//GEN-END:variables

    private void loadTableMateria() {
        try {
            TableColumn columna;
            this.ArticuloTableModel = Tabla_SalidaBo.ListaTable();
            this.jTable_ingreso_Salida.setModel(this.ArticuloTableModel);
            columna = this.jTable_ingreso_Salida.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadTableIngreso() {
        try {
            TableColumn columna;
            this.ArticuloTableModelsalida = Tabla_IngresoBo.ListaTable();
            this.jTable_ingreso_Salida.setModel(this.ArticuloTableModelsalida);
            columna = this.jTable_ingreso_Salida.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void personalizarJtable() {
        this.jTable_ingreso_Salida.getTableHeader().setFont(new Font("Cesar", Font.PLAIN, 14));
        this.jTable_ingreso_Salida.getTableHeader().setBackground(new Color(255, 255, 255));
        this.jTable_ingreso_Salida.getTableHeader().setForeground(Color.BLACK);

        this.jTable_ingreso_Salida.getColumnModel().getColumn(0).setMinWidth(50);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(0).setMaxWidth(50);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(8).setMinWidth(50);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(8).setMaxWidth(50);

        this.jTable_ingreso_Salida.getColumnModel().getColumn(7).setMinWidth(80);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(7).setMaxWidth(80);

        this.jTable_ingreso_Salida.getColumnModel().getColumn(1).setMinWidth(200);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(1).setMaxWidth(200);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(2).setMinWidth(300);
        this.jTable_ingreso_Salida.getColumnModel().getColumn(2).setMaxWidth(300);

    }

    private void tableAccionsalida() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onPdf(int row) {
                cargarid();

            }

        };
        jTable_ingreso_Salida.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        jTable_ingreso_Salida.getColumnModel().getColumn(8).setCellEditor(new TableActionCellEditor(event));
    }

    private void cargarid() {
        try {
            int index = jTable_ingreso_Salida.getSelectedRow();
            id = Integer.parseInt(jTable_ingreso_Salida.getValueAt(index, 0).toString());
            System.out.println(" se tiene el ID del pdf " + id);
        } catch (Exception e) {
        }
    }

    private void cargar_pdf(int id) {
        try {
            Connection con = null;
            JasperReport reporteJasper = null;
            String dir = "C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\report\\reporte_ingreso_unitario.jasper";
            Map parametro = new HashMap();
            parametro.put("paran1", id); // Primer parámetro de texto
            con = Conexion.getConexion();

            reporteJasper = (JasperReport) JRLoader.loadObjectFromFile(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(dir, parametro, con);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception JRException) {
            JOptionPane.showMessageDialog(null, "Error al intentar abrir el reporte");
        }
    }

    private void cargarpfd(String valor1, String valor2) {
        try {
            Connection con = null;
            JasperReport reporteJasper = null;
            String dir = "C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\report\\reporte_ingreso.jasper";
            Map parametro = new HashMap();
            parametro.put("paran1", valor1); // Primer parámetro de texto
            parametro.put("paran2", valor2); // Segundo parámetro de texto
            con = Conexion.getConexion();

            reporteJasper = (JasperReport) JRLoader.loadObjectFromFile(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(dir, parametro, con);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception JRException) {
            JOptionPane.showMessageDialog(null, "Error al intentar abrir el reporte");
        }

    }

    private void ingresar_fecha() {
        // Crear un JPanel para agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // Disposición de 4 filas y 2 columnas

        // Etiquetas y campos de texto
        JLabel label1 = new JLabel("FECHA 1: 02-02-2024");
        JTextField textField1 = new JTextField(10);

        JLabel label3 = new JLabel("FECHA 2: 20-05-2025");
        JTextField textField2 = new JTextField(10);
        textField2.setPreferredSize(new Dimension(200, 25));

        // Agregar los componentes al panel
        panel.add(label1);
        panel.add(textField1);

        panel.add(label3);
        panel.add(textField2);

        // Mostrar el panel en un JOptionPane
        int option = JOptionPane.showConfirmDialog(null, panel, "INGRESO DE FECHAS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Procesar los datos ingresados
        if (option == JOptionPane.OK_OPTION) {
            String valor1 = textField1.getText().trim();
            String valor2 = textField2.getText().trim();

            // Enviar los datos para generar el reporte 
            this.cargarpfd(valor1, valor2);

        }
    }

    private void tableAccionEntrada() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onPdf(int row) {
                cargarid();
                cargar_pdf(id);
            }

        };
        jTable_ingreso_Salida.getColumnModel().getColumn(10).setCellRenderer(new TableActionCellRender());
        jTable_ingreso_Salida.getColumnModel().getColumn(10).setCellEditor(new TableActionCellEditor(event));
    }
}
