package com.mycompany.twit;

import javax.swing.JOptionPane;

public class InternalBuscarHashtag extends javax.swing.JInternalFrame {

    public InternalBuscarHashtag() {
        initComponents();

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldBuscarHashtag = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        jLabelInstrucciones = new javax.swing.JLabel();
        jLabelBuscarHashtag = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HashtagResultados = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);

        jTextFieldBuscarHashtag.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldBuscarHashtag.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextFieldBuscarHashtag.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarHashtag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        btnBuscar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabelInstrucciones.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabelInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstrucciones.setText("Ingresa el hashtag que deseas buscar:");

        jLabelBuscarHashtag.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabelBuscarHashtag.setForeground(new java.awt.Color(0, 255, 255));
        jLabelBuscarHashtag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscarHashtag.setText("Buscar Hashtag");

        HashtagResultados.setEditable(false);
        HashtagResultados.setBackground(new java.awt.Color(0, 0, 0));
        HashtagResultados.setColumns(20);
        HashtagResultados.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        HashtagResultados.setForeground(new java.awt.Color(255, 255, 255));
        HashtagResultados.setLineWrap(true);
        HashtagResultados.setRows(5);
        HashtagResultados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jScrollPane1.setViewportView(HashtagResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabelBuscarHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelBuscarHashtag)
                .addGap(41, 41, 41)
                .addComponent(jLabelInstrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
         String hashtag = jTextFieldBuscarHashtag.getText().trim();
        if (hashtag.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El hashtag no puede estar vacío.");
            return;
        }

        // Obtener los tweets que contienen el hashtag
        String[] tweetsConHashtag = obtenerTweetsConHashtag(hashtag);

        // Mostrar los tweets en el área de texto
        if (tweetsConHashtag.length == 0) {
            HashtagResultados.setText("No se encontraron tweets con el hashtag #" + hashtag);
        } else {
            HashtagResultados.setText("Tweets con el hashtag #" + hashtag + ":\n\n");
            for (String tweet : tweetsConHashtag) {
                HashtagResultados.append(tweet + "\n\n");
            }
        } 
    }//GEN-LAST:event_btnBuscarMouseClicked

    private String[] obtenerTweetsConHashtag(String hashtag) {
        final int MAX_TWEETS = 100; // Ajusta el tamaño según sea necesario
        String[] tweetsConHashtag = new String[MAX_TWEETS];
        int index = 0;

        // Recorre todos los usuarios para buscar tweets con el hashtag
        int contador = UsuarioInfo.getContador();
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = UsuarioInfo.getCuenta(i);
            String[] timeline = usuario.obtenerTimeline();
            for (String tweet : timeline) {
                if (tweet.contains("#" + hashtag)) {
                    if (index < MAX_TWEETS) {
                        tweetsConHashtag[index++] = tweet;
                    }
                }
            }
        }

        // Redimensionar el arreglo a la cantidad de tweets encontrados
        String[] resultadoFinal = new String[index];
        System.arraycopy(tweetsConHashtag, 0, resultadoFinal, 0, index);

        return resultadoFinal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HashtagResultados;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel jLabelBuscarHashtag;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBuscarHashtag;
    // End of variables declaration//GEN-END:variables
}
