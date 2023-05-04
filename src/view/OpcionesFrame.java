/************************************************
  * Autores: Cristopher                         *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Fue creado el frame de opciones*
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 0, 50, 50));

        btnSoundtrack.setForeground(new java.awt.Color(51, 51, 51));
        btnSoundtrack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnSoundtrack.setText("Soundtrack: On");
        btnSoundtrack.setContentAreaFilled(false);
        btnSoundtrack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnSoundtrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 140, 30));

        btnSfx.setForeground(new java.awt.Color(51, 51, 51));
        btnSfx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnSfx.setText("SFX: On");
        btnSfx.setContentAreaFilled(false);
        btnSfx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnSfx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));

        btnCreditos.setForeground(new java.awt.Color(51, 51, 51));
        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnCreditos.setText("Creditos");
        btnCreditos.setContentAreaFilled(false);
        btnCreditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creditos_opciones.png"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
