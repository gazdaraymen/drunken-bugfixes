/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.gui;

/**
 *
 * @author dell
 */
public class GererCommentaires extends javax.swing.JFrame {

    /**
     * Creates new form GererCommentaires
     */
    public GererCommentaires() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        jGererClient.setFont(new java.awt.Font("Century Gothic", 1, 10));
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
        jGererRestaurateurs.setFont(new java.awt.Font("Century Gothic", 1, 10));
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
        jGererCommentaires.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jGererCommentaires.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGererCommentaires.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon7small.gif"))); // NOI18N
        jGererCommentaires.setText("Gérer Les Commentaires");
        jGererCommentaires.setOpaque(true);
        getContentPane().add(jGererCommentaires);
        jGererCommentaires.setBounds(400, 30, 180, 60);

        jModifierMonCompte.setBackground(new java.awt.Color(172, 71, 173));
        jModifierMonCompte.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jModifierMonCompte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jModifierMonCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon5small.gif"))); // NOI18N
        jModifierMonCompte.setText("Modifier Mon Compte");
        jModifierMonCompte.setOpaque(true);
        jModifierMonCompte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModifierMonCompteMouseClicked(evt);
            }
        });
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

        jLabel7.setBackground(new java.awt.Color(148, 211, 58));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon4small.gif"))); // NOI18N
        jLabel7.setText("Gérer \nComptes Clients");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 30, 161, 60);

        jLabel9.setBackground(new java.awt.Color(225, 50, 55));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon6small.gif"))); // NOI18N
        jLabel9.setText("Gérer Comptes Restaurateurs");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 30, 200, 60);

        jLabel10.setBackground(new java.awt.Color(255, 127, 44));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon7small.gif"))); // NOI18N
        jLabel10.setText("Gérer Les Commentaires");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 30, 180, 60);

        jLabel11.setBackground(new java.awt.Color(172, 71, 173));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon5small.gif"))); // NOI18N
        jLabel11.setText("Consulter Statistiques");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 30, 170, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Created by");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(630, 530, 70, 14);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/jboss.gif"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(710, 500, 60, 60);

        jLabel14.setBackground(new java.awt.Color(148, 211, 58));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon4small.gif"))); // NOI18N
        jLabel14.setText("Gérer \nComptes Clients");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 30, 161, 60);

        jLabel15.setBackground(new java.awt.Color(225, 50, 55));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon6small.gif"))); // NOI18N
        jLabel15.setText("Gérer Comptes Restaurateurs");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 30, 200, 60);

        jLabel16.setBackground(new java.awt.Color(255, 127, 44));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon7small.gif"))); // NOI18N
        jLabel16.setText("Gérer Les Commentaires");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(400, 30, 180, 60);

        jLabel17.setBackground(new java.awt.Color(172, 71, 173));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 10));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon5small.gif"))); // NOI18N
        jLabel17.setText("Consulter Statistiques");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(590, 30, 170, 60);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Created by");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(630, 530, 70, 14);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/jboss.gif"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(710, 500, 60, 60);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gérer Les Commentaires");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 110, 280, 19);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel21.setText("<html>Veuillez saisir au minimum un champ afin de trouver un commentaires</html>");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(70, 170, 510, 30);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel22.setText("Nom Client: *");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(90, 230, 90, 16);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel23.setText("Nom Restaurants: *");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(90, 270, 120, 14);

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Entrer votre Prénom");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(220, 270, 160, 20);

        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Entrer votre Nom");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(220, 230, 160, 20);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 10));
        jLabel24.setText("Les champs marqués d'un * sont obligatoires.\n");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(70, 320, 300, 14);

        jButton2.setText("Trouver");
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 360, 90, 23);

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 360, 90, 23);

        AjouterClientLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche Commentaire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        getContentPane().add(AjouterClientLabel);
        AjouterClientLabel.setBounds(50, 140, 640, 320);

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

    private void jModifierMonCompteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModifierMonCompteMouseClicked
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
                }

        });
         this.dispose();
    }//GEN-LAST:event_jModifierMonCompteMouseClicked


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
            java.util.logging.Logger.getLogger(GererCommentaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererCommentaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererCommentaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererCommentaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererCommentaires().setVisible(true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jModifierMonCompte;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
