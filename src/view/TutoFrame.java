/************************************************
  * Autores: Elio Justino Cruz Ortega           *
  * Fecha de creación: 2/05/2023                *
  * Fecha de modificación: 3/05/2023            *
  * Descripción: Fue creado el frame del tutorial*
 ************************************************/
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
        btnOmitir = new javax.swing.JButton();
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

        btnOmitir.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btnOmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnOmitir.setText("OMITIR");
        btnOmitir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmitirActionPerformed(evt);
            }
        });
        getContentPane().add(btnOmitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 20));

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

    private void btnOmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmitirActionPerformed
        // instanciamos la nueva ventana
        NivelesFrame win = new NivelesFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);

        //Ocultar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_btnOmitirActionPerformed

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
    private javax.swing.JButton btnOmitir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lbComoSeJuega;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel pnlTuto;
    // End of variables declaration//GEN-END:variables
}
