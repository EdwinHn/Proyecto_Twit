package com.mycompany.twit;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class InternalMandarTweet extends javax.swing.JInternalFrame {

    private UsuarioInfo usuarioInfo = new UsuarioInfo();
    private Twit twits = new Twit();

    String tweet;
    String twit;
    String fechaActual;
    String usuario;
    String hashtag = "";

    public InternalMandarTweet() {
        initComponents();

        UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
        String perfil = usuarioLogueado.getusuario();
        UsuarioInfo cuentaInfo = gestionCuentas.obtenerInformacion(perfil);

        if (usuarioLogueado != null && cuentaInfo != null) {
            usuario = usuarioLogueado.getusuario();
        }

    }

    UsuarioInfo mandarTwit = new UsuarioInfo();

    Gestion_Cuenta gestionCuentas = new Gestion_Cuenta();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMandarTweet = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TweetTextArea = new javax.swing.JTextArea();
        btn_Cancelar = new javax.swing.JButton();
        jLabelMax = new javax.swing.JLabel();
        btn_Mandar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabelMandarTweet.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabelMandarTweet.setForeground(new java.awt.Color(0, 255, 255));
        jLabelMandarTweet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMandarTweet.setText("Mandar Tweet");

        TweetTextArea.setBackground(new java.awt.Color(0, 0, 0));
        TweetTextArea.setColumns(20);
        TweetTextArea.setFont(new java.awt.Font("Helvetica Neue", 0, 28)); // NOI18N
        TweetTextArea.setForeground(new java.awt.Color(0, 255, 255));
        TweetTextArea.setLineWrap(true);
        TweetTextArea.setRows(5);
        TweetTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jScrollPane1.setViewportView(TweetTextArea);

        btn_Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Cancelar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseClicked(evt);
            }
        });
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabelMax.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMax.setText("(Max. 140 caracteres)");

        btn_Mandar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Mandar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Mandar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Mandar.setText("Mandar");
        btn_Mandar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        btn_Mandar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Mandar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MandarMouseClicked(evt);
            }
        });
        btn_Mandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MandarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabelMandarTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Mandar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelMandarTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMax)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mandar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed

    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseClicked
        TweetTextArea.setText("");
    }//GEN-LAST:event_btn_CancelarMouseClicked

    private void btn_MandarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MandarMouseClicked
        
        String contenido = TweetTextArea.getText();
        if (contenido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El tweet no puede estar vacío.");
        } else {
            UsuarioInfo usuarioActual = user_actual.getUsuarioActual();
            usuarioActual.mandarTweet(contenido);
            TweetTextArea.setText(""); // Limpiar el campo de texto

        }
    }//GEN-LAST:event_btn_MandarMouseClicked

    private void btn_MandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MandarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TweetTextArea;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Mandar;
    private javax.swing.JLabel jLabelMandarTweet;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
