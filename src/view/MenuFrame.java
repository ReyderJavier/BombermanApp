/************************************************
  * Autores: Reyder                             *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Fue creado el frame de menú    *
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
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
       
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        
    }//GEN-LAST:event_btnConfigActionPerformed

    
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
