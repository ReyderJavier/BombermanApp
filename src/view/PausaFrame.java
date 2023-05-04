/************************************************
  * Autores: Cristopher Alexis Zarate Valencia  *
  * Fecha de creación: 2/05/2023                *
  * Fecha de modificación:3/05/2023             *
  * Descripción: Fue creado el frame de pausa   *
 ************************************************/

package view;


public class PausaFrame extends javax.swing.JFrame {

    
    public PausaFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonCir.png"))); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, 50));

        btnContinuar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 78, 130, 50));

        btnOpciones.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnOpciones.setText("Opciones");
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseClicked(evt);
            }
        });
        getContentPane().add(btnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 50));

        btnMenu.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setContentAreaFilled(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, 50));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pausa.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // Le asignamos la acción de cerrar la ventana
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseClicked
        // instanciamos la nueva ventana
        OpcionesFrame win = new OpcionesFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);
    }//GEN-LAST:event_btnOpcionesMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PausaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
