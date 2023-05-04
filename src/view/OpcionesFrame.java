/************************************************
  * Autores: Cristopher Alexis Zarate Valencia  *
  * Fecha de creación: 2/05/2023                *
  * Fecha de modificación:3/05/2023             *
  * Descripción: Fue creado el frame de opciones*
 ************************************************/

package view;


public class OpcionesFrame extends javax.swing.JFrame {

   
    public OpcionesFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnSoundtrack = new javax.swing.JButton();
        btnSfx = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        btnSoundtrack.setForeground(new java.awt.Color(51, 51, 51));
        btnSoundtrack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnSoundtrack.setText("Soundtrack: On");
        btnSoundtrack.setContentAreaFilled(false);
        btnSoundtrack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnSoundtrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 30));

        btnSfx.setForeground(new java.awt.Color(51, 51, 51));
        btnSfx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnSfx.setText("SFX: On");
        btnSfx.setContentAreaFilled(false);
        btnSfx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnSfx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 30));

        btnCreditos.setForeground(new java.awt.Color(51, 51, 51));
        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnCreditos.setText("Creditos");
        btnCreditos.setContentAreaFilled(false);
        btnCreditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreditosMouseClicked(evt);
            }
        });
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creditos_opciones.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        lbFondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbFondo.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //Ocultar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreditosMouseClicked
        // instanciamos la nueva ventana
        CreditosFrame win = new CreditosFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);

        //Ocultar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_btnCreditosMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnSfx;
    private javax.swing.JButton btnSoundtrack;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
