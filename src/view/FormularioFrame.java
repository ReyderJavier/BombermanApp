/************************************************
  * Autores: Cristopher Alexis Zarate Valencia  *
  * Fecha de creación: 2/05/2023                *
  * Fecha de modificación: 3/05/2023             *
  * Descripción: Fue creado el frame de formulario*
 ************************************************/
package view;

public class FormularioFrame extends javax.swing.JFrame {

    public FormularioFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lbContraseña = new javax.swing.JLabel();
        psContraseña = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbCrearPerfil = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 30));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonrec.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 110, 30));

        lbContraseña.setText("Ingresa una contraseña:");
        getContentPane().add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        psContraseña.setText("jPasswordField1");
        psContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(psContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 30));

        lbNombre.setText("Ingresa un nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbCrearPerfil.setText("CREA TU PERFIL DE JUGADOR");
        getContentPane().add(lbCrearPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 220, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REGISTROJUGADOR(fondo standar).png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void psContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psContraseñaActionPerformed
        
    }//GEN-LAST:event_psContraseñaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Le asignamos la acción de cerrar la ventana, pero ademas de eso debe de guardar la info con la que se rellenó
         System.exit(0);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Le asignamos la acción de cerrar la ventana
         System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbCrearPerfil;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPasswordField psContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
