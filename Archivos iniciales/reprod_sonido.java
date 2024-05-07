import java.io.File;
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
public class reprod_sonido extends javax.swing.JFrame {
    long empezar_reproduccion_en=0;
    Clip sonido;
    public reprod_sonido() {
        initComponents();
        try{
            sonido = AudioSystem.getClip();
        }catch (Exception error){
            System.out.println("Error en la reproducción de audio");
        }           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_opcion = new javax.swing.JToggleButton();
        Etiqueta = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reproductor de sonidos");
        setType(java.awt.Window.Type.UTILITY);

        boton_opcion.setText("Pulsar para cambiar reproducción");
        boton_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_opcionActionPerformed(evt);
            }
        });

        Etiqueta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta.setText("Reproducir Violín");

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stop.jpg"))); // NOI18N
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.jpg"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(play)
                        .addGap(28, 28, 28)
                        .addComponent(stop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(boton_opcion)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_opcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_opcionActionPerformed
        if (boton_opcion.isSelected()==true)//Se elige sonido instrumental
            Etiqueta.setText("Reproducir instrumental");
        else //Se elige sonido violin
            Etiqueta.setText("Reproducir violín");
        empezar_reproduccion_en=0; //Poner a cero la reproducción
        sonido.close(); //Cierra el sonido
    }//GEN-LAST:event_boton_opcionActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        boton_opcion.setEnabled(false); //Bloquea la selección del archivo de audio
        try{
            if (boton_opcion.isSelected()==true) //Se elige sonido instrumental
            {
                if (empezar_reproduccion_en==0) //Si el sonido estaba abierto no se vuelve a abrir
                    sonido.open(AudioSystem.getAudioInputStream(new File("src/instrumental.aif")));      
                //Establece el punto desde el que reproducir
                sonido.setMicrosecondPosition (empezar_reproduccion_en);
                sonido.start(); //Arranca la reproducción
            }
            else //Se elige sonido violin
            {
                if (empezar_reproduccion_en==0 ) //Si el sonido estaba abierto no se vuelve a abrir
                    sonido.open(AudioSystem.getAudioInputStream(new File("src/violin.wav")));
                //Establece el punto desde el que reproducir
                sonido.setMicrosecondPosition (empezar_reproduccion_en);
                sonido.start(); //Arranca la reproducción
            }
        }catch (Exception error){
            System.out.println("Error en la reproducción de audio");
        }       
    }//GEN-LAST:event_playActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        //Recoge el punto donde estaba la reproducción
        empezar_reproduccion_en=sonido.getMicrosecondPosition();
        sonido.stop(); //Detiene reproducción
        boton_opcion.setEnabled(true);//Activa la selección del archivo de audio
    }//GEN-LAST:event_stopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reprod_sonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reprod_sonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reprod_sonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reprod_sonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reprod_sonido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JToggleButton boton_opcion;
    private javax.swing.JButton play;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
