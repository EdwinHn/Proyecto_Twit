
package com.mycompany.twit;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu_Inicio extends javax.swing.JFrame {

    public Menu_Inicio() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(Color.BLACK);

        //Logo
        ImageIcon iconLogo = new ImageIcon("Logo3.png");
        Image imgLogo = iconLogo.getImage();
        Image imgScaleLogo = imgLogo.getScaledInstance(LabelLogo.getWidth(), LabelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconLogo = new ImageIcon(imgScaleLogo);
        LabelLogo.setIcon(scaledIconLogo);

        //Botoón Iniciar Sesión
        ImageIcon iconIniciar = new ImageIcon("Iniciar_Sesión.png");
        Image imgIniciar = iconIniciar.getImage();
        Image imgScaleIniciar = imgIniciar.getScaledInstance(btn_IniciarSesión.getWidth(), btn_IniciarSesión.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconIniciar = new ImageIcon(imgScaleIniciar);
        btn_IniciarSesión.setIcon(scaledIconIniciar);
        
        //Botón Registrar
        ImageIcon iconRegistrar = new ImageIcon("Registrate.png");
        Image imgRegistrar = iconRegistrar.getImage();
        Image imgScaleRegistrar = imgRegistrar.getScaledInstance(btn_Registrate.getWidth(), btn_Registrate.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconRegistrar = new ImageIcon(imgScaleRegistrar);
        btn_Registrate.setIcon(scaledIconRegistrar);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        jLabelTwit = new javax.swing.JLabel();
        btn_IniciarSesión = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        jLabelRegistrar = new javax.swing.JLabel();
        btn_Registrate = new javax.swing.JLabel();
        Terminos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LabelLogo.setText("Logo");
        LabelLogo.setBounds(new java.awt.Rectangle(70, 50, 50, 50));

        jLabelTwit.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTwit.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabelTwit.setForeground(new java.awt.Color(0, 255, 255));
        jLabelTwit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTwit.setText("Twit");
        jLabelTwit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTwit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTwitMouseClicked(evt);
            }
        });

        btn_IniciarSesión.setText("Iniciar Sesíon");
        btn_IniciarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_IniciarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IniciarSesiónMouseClicked(evt);
            }
        });

        o.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o.setText("- O -");

        jLabelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrar.setText("¿No tienes una cuenta? Registrate Aquí");

        btn_Registrate.setText("Registrate");
        btn_Registrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Registrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegistrateMouseClicked(evt);
            }
        });

        Terminos.setForeground(new java.awt.Color(153, 153, 153));
        Terminos.setText("Al registrarte, aceptas los Términos de servicio y la Política de privacidad, incluida la política de Uso de Cookies.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabelRegistrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Registrate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTwit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_IniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Terminos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTwit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btn_IniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(o)
                .addGap(18, 18, 18)
                .addComponent(jLabelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Registrate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Terminos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IniciarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IniciarSesiónMouseClicked
        new Iniciar_Sesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_IniciarSesiónMouseClicked

    private void btn_RegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegistrateMouseClicked
        new Registrar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegistrateMouseClicked

    private void jLabelTwitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTwitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTwitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel Terminos;
    private javax.swing.JLabel btn_IniciarSesión;
    private javax.swing.JLabel btn_Registrate;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JLabel jLabelTwit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel o;
    // End of variables declaration//GEN-END:variables
}
