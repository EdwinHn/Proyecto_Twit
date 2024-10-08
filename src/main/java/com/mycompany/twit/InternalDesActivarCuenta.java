/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.twit;

import javax.swing.JOptionPane;

/**
 *
 * @author edwinhernandezlopez
 */
public class InternalDesActivarCuenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalDesActivarCuenta
     */
    public InternalDesActivarCuenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMandarTweet = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);

        jLabelMandarTweet.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabelMandarTweet.setForeground(new java.awt.Color(0, 255, 255));
        jLabelMandarTweet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMandarTweet.setText("Desactivar Cuenta");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Desactivar/Activar Cuenta");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabelMandarTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelMandarTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        UsuarioInfo usuarioActual = user_actual.getUsuarioActual();

        if (usuarioActual == null) {
            JOptionPane.showMessageDialog(null, "No hay un usuario logueado.");
            return;
        }

        if (usuarioActual.isCuentaActiva()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas desactivar tu cuenta?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                usuarioActual.desactivarCuenta();
                actualizarEstadoCuenta();

            }
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas activar tu cuenta?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                usuarioActual.activarCuenta();
                actualizarEstadoCuenta();

            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void actualizarEstadoCuenta() {
        UsuarioInfo usuarioActual = user_actual.getUsuarioActual();

        if (usuarioActual != null) {
            if (usuarioActual.isCuentaActiva()) {
                JOptionPane.showMessageDialog(null, "Tu cuenta está activa.");
            } else {
                JOptionPane.showMessageDialog(null, "Tu cuenta está desactivada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay un usuario logueado.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelMandarTweet;
    // End of variables declaration//GEN-END:variables
}
