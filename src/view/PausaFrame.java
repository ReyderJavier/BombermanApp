/************************************************
  * Autores: Cristopher                         *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Fue creado el frame de pausa   *
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, 50));

        btnContinuar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 78, 130, 50));

        btnOpciones.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonRec.png"))); // NOI18N
        btnOpciones.setText("Opciones");
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
