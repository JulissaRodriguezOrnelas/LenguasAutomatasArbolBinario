/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import arbolesbinarios.ArbolesBinarios;
public class Principal extends javax.swing.JFrame {

    ArbolesBinarios arbolito;
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1Preorden = new javax.swing.JButton();
        jButton2Inorden = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4ConstruirArbol = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Arboles Binarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Expres??n:(5^2+2)+4-3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jButton1Preorden.setBackground(new java.awt.Color(0, 0, 0));
        jButton1Preorden.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1Preorden.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Preorden.setText("PreOrden");
        jButton1Preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PreordenActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Preorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 115, 133, 47));

        jButton2Inorden.setBackground(new java.awt.Color(0, 0, 0));
        jButton2Inorden.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton2Inorden.setForeground(new java.awt.Color(255, 255, 255));
        jButton2Inorden.setText("InOrden");
        jButton2Inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2InordenActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Inorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 168, 133, 43));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PosOrnden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 217, 133, 43));

        jButton4ConstruirArbol.setBackground(new java.awt.Color(0, 0, 0));
        jButton4ConstruirArbol.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton4ConstruirArbol.setForeground(new java.awt.Color(255, 255, 255));
        jButton4ConstruirArbol.setText("Construir Arbol");
        jButton4ConstruirArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ConstruirArbolActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4ConstruirArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 266, 133, 40));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 659, 70));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 50, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 50, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 60, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 60, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 50, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 50, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 50, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\julis\\Documents\\Practicas Damian\\ArbolesBinarios\\src\\vista\\Arbol.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ConstruirArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ConstruirArbolActionPerformed
        jTextField1.setText("+");
        jTextField2.setText("+");
        jTextField3.setText("-");
        jTextField4.setText("??");
        jTextField5.setText("2");
        jTextField6.setText("4");
        jTextField7.setText("3");
        jTextField8.setText("5");
        jTextField9.setText("2");
    }//GEN-LAST:event_jButton4ConstruirArbolActionPerformed

    private void jButton1PreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PreordenActionPerformed
        cargarArbol();
        jTextArea1.setText(arbolito.preOrden(arbolito.getRaiz()));// TODO add your handling code here:
    }//GEN-LAST:event_jButton1PreordenActionPerformed

    private void jButton2InordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2InordenActionPerformed
        cargarArbol();
        jTextArea1.setText(arbolito.inOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_jButton2InordenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       cargarArbol();
        jTextArea1.setText(arbolito.posOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public void cargarArbol(){
        arbolito = new ArbolesBinarios(jTextField1.getText());
        //NIVEL 1
        arbolito.insertarIzquierda(jTextField2.getText(), arbolito.getRaiz());
        arbolito.insertarDerecha(jTextField3.getText(), arbolito.getRaiz());
        //NIVEL 2
        arbolito.insertarIzquierda(jTextField4.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertarDerecha(jTextField5.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertarIzquierda(jTextField6.getText(), arbolito.getRaiz().getDerecha());
        arbolito.insertarDerecha(jTextField7.getText(), arbolito.getRaiz().getDerecha());
        //NIVEL 3
        arbolito.insertarIzquierda(jTextField8.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
        arbolito.insertarDerecha(jTextField9.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Preorden;
    private javax.swing.JButton jButton2Inorden;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4ConstruirArbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
