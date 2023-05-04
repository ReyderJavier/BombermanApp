/************************************************
  * Autores: Reyder                             *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Fue creado el frame del tutorial*
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
package view;

public class TutoFrame extends javax.swing.JFrame {

    public TutoFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTuto = new javax.swing.JPanel();
        lbComoSeJuega = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlTutoLayout = new javax.swing.GroupLayout(pnlTuto);
        pnlTuto.setLayout(pnlTutoLayout);
        pnlTutoLayout.setHorizontalGroup(
            pnlTutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        pnlTutoLayout.setVerticalGroup(
            pnlTutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, -1));

        lbComoSeJuega.setText("¿CÒMO SE JUEGA?");
        getContentPane().add(lbComoSeJuega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, 20));

        btnAtras.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 20));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REGISTROJUGADOR(fondo standar).png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
      
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lbComoSeJuega;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel pnlTuto;
    // End of variables declaration//GEN-END:variables
}
