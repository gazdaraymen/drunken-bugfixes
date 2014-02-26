/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.gui;

/**
 *
 * @author dell
 */
public class AccueilClient extends javax.swing.JFrame {

    /**
     * Creates new form AccueilClient
     */
    public AccueilClient() {
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

        LogoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/logo2big.gif"))); // NOI18N
        LogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoLabelMouseClicked(evt);
            }
        });
        getContentPane().add(LogoLabel);
        LogoLabel.setBounds(200, 160, 400, 260);

        jLabel4.setBackground(new java.awt.Color(172, 71, 173));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon5small.gif"))); // NOI18N
        jLabel4.setText("Gérer Mes Commentaires");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 30, 190, 60);

        jLabel6.setBackground(new java.awt.Color(255, 127, 44));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon7small.gif"))); // NOI18N
        jLabel6.setText("Modifier Mon Compte");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 30, 180, 60);

        jLabel7.setBackground(new java.awt.Color(225, 50, 55));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon6small.gif"))); // NOI18N
        jLabel7.setText("Mes Reservations");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 30, 200, 60);

        jLabel8.setBackground(new java.awt.Color(148, 211, 58));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/icon4small.gif"))); // NOI18N
        jLabel8.setText("Trouver un Restaurant");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 30, 161, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto/gui/jboss.gif"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(710, 500, 60, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Created by");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(630, 530, 70, 14);

        CloseLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
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

    private void LogoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoLabelMouseClicked

    }//GEN-LAST:event_LogoLabelMouseClicked

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AccueilClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccueilClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
