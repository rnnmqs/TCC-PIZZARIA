/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas;

/**
 *
 * @author Cesar
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jptelaprincipal = new javax.swing.JPanel();
        jbfunctp = new javax.swing.JButton();
        jllogotp = new javax.swing.JLabel();
        jbnovopedtp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jmbtelaprincipal = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbfunctp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcicon.png"))); // NOI18N
        jbfunctp.setText("    Gerente");
        jbfunctp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfunctpActionPerformed(evt);
            }
        });

        jllogotp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mamuteicon.jpg"))); // NOI18N

        jbnovopedtp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novopedicon.png"))); // NOI18N
        jbnovopedtp.setText("Novo Pedido");
        jbnovopedtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovopedtpActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(121, 33));
        jButton1.setMinimumSize(new java.awt.Dimension(121, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jptelaprincipalLayout = new javax.swing.GroupLayout(jptelaprincipal);
        jptelaprincipal.setLayout(jptelaprincipalLayout);
        jptelaprincipalLayout.setHorizontalGroup(
            jptelaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptelaprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jptelaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbfunctp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jbnovopedtp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addComponent(jllogotp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jptelaprincipalLayout.setVerticalGroup(
            jptelaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptelaprincipalLayout.createSequentialGroup()
                .addGroup(jptelaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jptelaprincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbfunctp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbnovopedtp)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jptelaprincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jllogotp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        setJMenuBar(jmbtelaprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jptelaprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jptelaprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    private void jbnovopedtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovopedtpActionPerformed
     //this.setEnabled(false);
     NovoPedido np = new NovoPedido(this,true);
     np.setVisible(true);
    
    }//GEN-LAST:event_jbnovopedtpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbfunctpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfunctpActionPerformed
       LoginGerente loggerente = new LoginGerente (this,true);
       loggerente.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jbfunctpActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbfunctp;
    private javax.swing.JButton jbnovopedtp;
    private javax.swing.JLabel jllogotp;
    private javax.swing.JMenuBar jmbtelaprincipal;
    private javax.swing.JPanel jptelaprincipal;
    // End of variables declaration//GEN-END:variables
}
