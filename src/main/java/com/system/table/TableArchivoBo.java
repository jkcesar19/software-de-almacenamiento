package com.system.table;

import com.system.identity.Archivo;
import com.system.identity.implementation.TablaDao;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TableArchivoBo {

    TablaDao dao = null;

    public void visualizar_pdf(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("RAZON SOCIAL");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("SUB T");
        dt.addColumn("DESC.");
        dt.addColumn("IGV");
        dt.addColumn("TOTAL");
        dt.addColumn("FECHA");
        dt.addColumn("ARCHIVO");
        
        ImageIcon icono1 = new ImageIcon(get_Image("/com/system/img/pdf.png"));

        dao = new TablaDao();
        Archivo vo = new Archivo();
        ArrayList<Archivo> list = dao.Listar_Archivo();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getRazonsocial();
                fila[2] = vo.getDescripcion();
                fila[3] = vo.getSub_total();
                fila[4] = vo.getDescuento();
                fila[5] = vo.getIgv();
                fila[6] = vo.getTotal();
                fila[7] = vo.getFecha_compra();
                fila[8] = new JButton(icono1);

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
