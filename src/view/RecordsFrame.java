/**************************************
* Autor: Tineo Tineo Reyder Javier    * 
* Fecha Creación: 03/05/23            * 
* Fecha Actualización: 04/05/23       * 
* Descripción: Se creo en JFrame la   *
*              ventana de Records del * 
*              proyecto del Bomberman * 
**************************************/

package view;

public class RecordsFrame extends javax.swing.JFrame {

    public RecordsFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlPanle1 = new javax.swing.JPanel();
        lbPrimero = new javax.swing.JLabel();
        lbPrimero1 = new javax.swing.JLabel();
        pnlPanel2 = new javax.swing.JPanel();
        lbSegundo = new javax.swing.JLabel();
        lbSegundo2 = new javax.swing.JLabel();
        pnlPanel3 = new javax.swing.JPanel();
        lbTercero = new javax.swing.JLabel();
        lbTercero3 = new javax.swing.JLabel();
        pnlPanel4 = new javax.swing.JPanel();
        lbCuatro = new javax.swing.JLabel();
        lbCuarto4 = new javax.swing.JLabel();
        pnlPanel5 = new javax.swing.JPanel();
        lbQuinto = new javax.swing.JLabel();
        lbQuinto5 = new javax.swing.JLabel();
        lbRecords = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Records");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 70, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botonrec.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        jLayeredPane1.setAutoscrolls(true);
        jLayeredPane1.setLayout(new java.awt.FlowLayout());

        pnlPanle1.setPreferredSize(new java.awt.Dimension(300, 50));

        lbPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Primero.png"))); // NOI18N

        lbPrimero1.setText("1°Puesto");

        javax.swing.GroupLayout pnlPanle1Layout = new javax.swing.GroupLayout(pnlPanle1);
        pnlPanle1.setLayout(pnlPanle1Layout);
        pnlPanle1Layout.setHorizontalGroup(
            pnlPanle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanle1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPrimero1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlPanle1Layout.setVerticalGroup(
            pnlPanle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlPanle1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbPrimero1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(pnlPanle1);

        pnlPanel2.setPreferredSize(new java.awt.Dimension(300, 50));

        lbSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Segundo.png"))); // NOI18N

        lbSegundo2.setText("2°Puesto");

        javax.swing.GroupLayout pnlPanel2Layout = new javax.swing.GroupLayout(pnlPanel2);
        pnlPanel2.setLayout(pnlPanel2Layout);
        pnlPanel2Layout.setHorizontalGroup(
            pnlPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbSegundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSegundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPanel2Layout.setVerticalGroup(
            pnlPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel2Layout.createSequentialGroup()
                .addGroup(pnlPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addGroup(pnlPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbSegundo2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLayeredPane1.add(pnlPanel2);

        pnlPanel3.setPreferredSize(new java.awt.Dimension(300, 50));

        lbTercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tercero.png"))); // NOI18N

        lbTercero3.setText("3°Puesto");

        javax.swing.GroupLayout pnlPanel3Layout = new javax.swing.GroupLayout(pnlPanel3);
        pnlPanel3.setLayout(pnlPanel3Layout);
        pnlPanel3Layout.setHorizontalGroup(
            pnlPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTercero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTercero3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPanel3Layout.setVerticalGroup(
            pnlPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel3Layout.createSequentialGroup()
                .addGroup(pnlPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTercero, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addGroup(pnlPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbTercero3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLayeredPane1.add(pnlPanel3);

        pnlPanel4.setPreferredSize(new java.awt.Dimension(300, 50));

        lbCuatro.setText("4");

        lbCuarto4.setText("4°Puesto");

        javax.swing.GroupLayout pnlPanel4Layout = new javax.swing.GroupLayout(pnlPanel4);
        pnlPanel4.setLayout(pnlPanel4Layout);
        pnlPanel4Layout.setHorizontalGroup(
            pnlPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCuarto4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlPanel4Layout.setVerticalGroup(
            pnlPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lbCuarto4))
                .addContainerGap())
        );

        jLayeredPane1.add(pnlPanel4);

        pnlPanel5.setPreferredSize(new java.awt.Dimension(300, 50));

        lbQuinto.setText("5");

        lbQuinto5.setText("5°Puesto");

        javax.swing.GroupLayout pnlPanel5Layout = new javax.swing.GroupLayout(pnlPanel5);
        pnlPanel5.setLayout(pnlPanel5Layout);
        pnlPanel5Layout.setHorizontalGroup(
            pnlPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbQuinto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbQuinto5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlPanel5Layout.setVerticalGroup(
            pnlPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuinto, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lbQuinto5))
                .addContainerGap())
        );

        jLayeredPane1.add(pnlPanel5);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 330, 290));

        lbRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Record.png"))); // NOI18N
        getContentPane().add(lbRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 800, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbCuarto4;
    private javax.swing.JLabel lbCuatro;
    private javax.swing.JLabel lbPrimero;
    private javax.swing.JLabel lbPrimero1;
    private javax.swing.JLabel lbQuinto;
    private javax.swing.JLabel lbQuinto5;
    private javax.swing.JLabel lbRecords;
    private javax.swing.JLabel lbSegundo;
    private javax.swing.JLabel lbSegundo2;
    private javax.swing.JLabel lbTercero;
    private javax.swing.JLabel lbTercero3;
    private javax.swing.JPanel pnlPanel2;
    private javax.swing.JPanel pnlPanel3;
    private javax.swing.JPanel pnlPanel4;
    private javax.swing.JPanel pnlPanel5;
    private javax.swing.JPanel pnlPanle1;
    // End of variables declaration//GEN-END:variables
}
