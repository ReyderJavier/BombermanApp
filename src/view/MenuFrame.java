/************************************************
  * Autores: Reyder Javier Tineo Tineo          *
  * Fecha de creación: 2/05/2023                *
  * Fecha de modificación: 3/05/2023            *
  * Descripción: Se creo el Frame de menú       *
 ************************************************/

package view;


public class MenuFrame extends javax.swing.JFrame {    
    public MenuFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlay = new javax.swing.JButton();
        btnRecords = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnPlay.setText("PLAY");
        btnPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 110, 30));

        btnRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnRecords.setText("RECORDS");
        btnRecords.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 110, 30));

        btnConfig.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnConfig.setText("Configuración");
        btnConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MENU.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // instanciamos la nueva ventana
        FormularioFrame win = new FormularioFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);
        
        //Ocultar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Le asigne la acción de cerrar ventana al boton
         System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // instanciamos la nueva ventana
        OpcionesFrame win = new OpcionesFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRecords;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
