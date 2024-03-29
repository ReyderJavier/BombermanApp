/************************************************
  * Autores: Reyder                             *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Se creo el Frame de bienvenida *
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
package view;

import view.MenuFrame;
import java.awt.event.KeyEvent;

public class BienvenidaFrame extends javax.swing.JFrame {

    public BienvenidaFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbInstruccion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lbTitulo.setText("BOMBERMAN");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        lbInstruccion.setText("Presiona el botòn ESPACIO para continuar");
        getContentPane().add(lbInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                              
        //Obtener el código de la tecla presionada
        int keyCode = evt.getKeyCode();
    
        //Verificar si la tecla presionada es la tecla de espacio
        if(keyCode == KeyEvent.VK_SPACE) {
        
            //Crear un nuevo JFrame y hacerlo visible
            
        
            //Ocultar el JFrame actual
            this.setVisible(false);
        }
     //Aquí se le asigno la función de siguiente a la tecla ESPACIO  
    }//GEN-LAST:event_formKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BienvenidaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbInstruccion;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
