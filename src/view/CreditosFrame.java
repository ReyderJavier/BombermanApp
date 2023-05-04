/************************************************
  * Autores: Cristopher                         *
  * Fecha de creación: 2 de mayo                *
  * Fecha de modificación:3 de mayo             *
  * Descripción: Fue creado el fram de creditos *
 ************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */
package view;


public class CreditosFrame extends javax.swing.JFrame {

    
    public CreditosFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        lbCreditos = new javax.swing.JLabel();
        lbCreadores = new javax.swing.JLabel();
        pnlCreadores = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lbMusica = new javax.swing.JLabel();
        pnlMusica = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 0, 50, 50));

        lbCreditos.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lbCreditos.setForeground(new java.awt.Color(51, 51, 51));
        lbCreditos.setText("Créditos");
        getContentPane().add(lbCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lbCreadores.setForeground(new java.awt.Color(51, 51, 51));
        lbCreadores.setText("Programadores y diseñadores");
        getContentPane().add(lbCreadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pnlCreadores.setViewportView(jList1);

        getContentPane().add(pnlCreadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 388, 89));

        lbMusica.setForeground(new java.awt.Color(51, 51, 51));
        lbMusica.setText("Música y sonidos");
        getContentPane().add(lbMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 161, -1, -1));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pnlMusica.setViewportView(jList2);

        getContentPane().add(pnlMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, 388, 98));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creditos_opciones.png"))); // NOI18N
        lbFondo.setText("jLabel4");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //Se le asigno la acción de cerrar ventana
         System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JLabel lbCreadores;
    private javax.swing.JLabel lbCreditos;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbMusica;
    private javax.swing.JScrollPane pnlCreadores;
    private javax.swing.JScrollPane pnlMusica;
    // End of variables declaration//GEN-END:variables
}
