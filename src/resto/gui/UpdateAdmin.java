/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.gui;

/**
 *
 * @author dell
 */
public class UpdateAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAdmin
     */
    public UpdateAdmin() {
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

        jGererClient = new javax.swing.JLabel();
        jGererRestaurateurs = new javax.swing.JLabel();
        jGererCommentaires = new javax.swing.JLabel();
        jModifierMonCompte = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        AjouterClientLabel = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jGererClient.setBackground(new java.awt.Color(148, 211, 58));
        jGererClient.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jGererClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGererClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon4small.gif"))); // NOI18N
        jGererClient.setText("Gérer \nComptes Clients");
        jGererClient.setOpaque(true);
        jGererClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGererClientMouseClicked(evt);
            }
        });
        getContentPane().add(jGererClient);
        jGererClient.setBounds(20, 30, 161, 60);

        jGererRestaurateurs.setBackground(new java.awt.Color(225, 50, 55));
        jGererRestaurateurs.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jGererRestaurateurs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGererRestaurateurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon6small.gif"))); // NOI18N
        jGererRestaurateurs.setText("Gérer Comptes Restaurateurs");
        jGererRestaurateurs.setOpaque(true);
        jGererRestaurateurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGererRestaurateursMouseClicked(evt);
            }
        });
        getContentPane().add(jGererRestaurateurs);
        jGererRestaurateurs.setBounds(190, 30, 200, 60);

        jGererCommentaires.setBackground(new java.awt.Color(255, 127, 44));
        jGererCommentaires.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jGererCommentaires.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGererCommentaires.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon7small.gif"))); // NOI18N
        jGererCommentaires.setText("Gérer Les Commentaires");
        jGererCommentaires.setOpaque(true);
        jGererCommentaires.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGererCommentairesMouseClicked(evt);
            }
        });
        getContentPane().add(jGererCommentaires);
        jGererCommentaires.setBounds(400, 30, 180, 60);

        jModifierMonCompte.setBackground(new java.awt.Color(172, 71, 173));
        jModifierMonCompte.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jModifierMonCompte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jModifierMonCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon5small.gif"))); // NOI18N
        jModifierMonCompte.setText("Consulter Statistiques");
        jModifierMonCompte.setOpaque(true);
        getContentPane().add(jModifierMonCompte);
        jModifierMonCompte.setBounds(590, 30, 170, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Created by");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(630, 530, 70, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/jboss.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(710, 500, 60, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Created by");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 530, 70, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/jboss.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 500, 60, 60);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel21.setText("<html>Veuillez remplir ces champs pour mettre à jour votre profil.</html>");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(70, 170, 510, 30);

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Entrer votre Nom");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(250, 220, 160, 20);

        jTextField10.setForeground(new java.awt.Color(204, 204, 204));
        jTextField10.setText("Entrer votre Prénom");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(250, 260, 160, 20);

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("flenbenfoulen@mail.com");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(250, 340, 160, 20);

        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setText("Entrer votre Num de Tél");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(250, 380, 160, 20);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 10));
        jLabel24.setText("Les champs marqués d'un * sont obligatoires.\n");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(70, 430, 300, 14);

        jButton2.setLabel("Confirmer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 450, 110, 23);

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 450, 110, 23);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel10.setText("Ancien Login: *");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 220, 100, 20);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel11.setText("Ancien Mot de Passe: *");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 260, 140, 20);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel12.setText("Nouveau Mot de Passe: *");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 340, 150, 20);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel13.setText("Confirmer Mot de Passe: *");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(90, 380, 160, 20);

        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jTextField11.setText("Entrer votre Prénom");
        getContentPane().add(jTextField11);
        jTextField11.setBounds(250, 300, 160, 20);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel14.setText("Nouveau Login: *");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(90, 300, 140, 20);

        AjouterClientLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Administrateur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        getContentPane().add(AjouterClientLabel);
        AjouterClientLabel.setBounds(50, 140, 700, 350);

        CloseLabel.setFont(new java.awt.Font("Century Gothic", 0, 11));
        CloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLabel.setText("[ X ]");
        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabelMouseClicked(evt);
            }
        });
        getContentPane().add(CloseLabel);
        CloseLabel.setBounds(770, 0, 30, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/fondwood.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseLabelMouseClicked

    private void jGererClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGererClientMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererComptesClients().setVisible(true);
                }

        });
         this.dispose();
    }//GEN-LAST:event_jGererClientMouseClicked

    private void jGererRestaurateursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGererRestaurateursMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererRestaurateurs().setVisible(true);
                }

        });
         this.dispose();
    }//GEN-LAST:event_jGererRestaurateursMouseClicked

    private void jGererCommentairesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGererCommentairesMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererCommentaires().setVisible(true);
                }

        });
         this.dispose();
    }//GEN-LAST:event_jGererCommentairesMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjouterClientLabel;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jGererClient;
    private javax.swing.JLabel jGererCommentaires;
    private javax.swing.JLabel jGererRestaurateurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jModifierMonCompte;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
