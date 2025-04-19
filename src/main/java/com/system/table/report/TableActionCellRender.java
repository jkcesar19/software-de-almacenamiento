package com.system.table.report;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author llagu
 */
public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        PanelAction action = new PanelAction();
        if (isSelected == false && row % 2 == 0) {
          action:setBackground(Color.WHITE);  
        }
        action:setBackground(com.getBackground());
        return action;
    }

}
