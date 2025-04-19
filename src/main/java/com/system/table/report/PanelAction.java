/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.table.report;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author llagu
 */
public class PanelAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
    }

   public void initEvent(TableActionEvent event,int row){
       verPdf.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               event.onPdf(row);
           }
       });
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verPdf = new com.system.table.report.ActionButton();

        setBackground(new java.awt.Color(255, 255, 255));

        verPdf.setIcon(new javax.swing.ImageIcon("C:\\Users\\llagu\\OneDrive\\Escritorio\\Proyecto 2025\\NetBeans\\sistema_almacenamiento\\src\\main\\java\\com\\system\\img\\pdf.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.system.table.report.ActionButton verPdf;
    // End of variables declaration//GEN-END:variables
}
