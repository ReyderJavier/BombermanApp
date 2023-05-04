
/************************************************
  * Autor: Cristopher Alexis Zarate Valencia    *
  * Fecha de creación: 04/05/2023               *
  * Fecha de modificación: 04/05/2023           *
  * Descripción: Este frame muestra en que 
  *     nivel vas.
 ************************************************/
package view;

public class NivelesFrame extends javax.swing.JFrame {

    public NivelesFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNivel1 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNivel1MouseClicked(evt);
            }
        });
        getContentPane().add(lbNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 110));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelectNiveles.png"))); // NOI18N
        lbFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFondoMouseClicked(evt);
            }
        });
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFondoMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lbFondoMouseClicked

    private void lbNivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNivel1MouseClicked
        // instanciamos la nueva ventana
        NivelFrame win = new NivelFrame();
        // Hacemos visible esta nueva ventana
        win.setVisible(true);

        //Ocultar el JFrame actual
        this.dispose();
    }//GEN-LAST:event_lbNivel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNivel1;
    // End of variables declaration//GEN-END:variables
}
