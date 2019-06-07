/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import static pkg2048.board.game2048;

/**
 *
 * @author huyph
 */
public class scores extends javax.swing.JFrame {

    public static Game2048 game2048;
    public scores() {
        game2048 = new Game2048();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        score1 = new javax.swing.JTextField();
        score2 = new javax.swing.JTextField();
        score3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leaderbord");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        getContentPane().setLayout(null);

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(130, 280, 80, 23);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel2.setText("Rank 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 130, 50, 30);

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel3.setText("Rank 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 50, 20);

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel4.setText("Rank 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 220, 50, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hall of Fame");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 255), 1, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 140, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(130, 310, 80, 23);

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel6.setText("Score");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 100, 50, 20);

        score1.setText("jTextField1");
        score1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score1ActionPerformed(evt);
            }
        });
        getContentPane().add(score1);
        score1.setBounds(150, 130, 80, 30);

        score2.setText("jTextField2");
        getContentPane().add(score2);
        score2.setBounds(150, 170, 80, 30);

        score3.setText("jTextField4");
        getContentPane().add(score3);
        score3.setBounds(150, 210, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Fractal Wallpapers-part-1 (311).jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 350, 400);

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(366, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        score1.setText(Integer.toString(game2048.getScore1()));
        score2.setText(Integer.toString(game2048.getScore2()));
        score3.setText(Integer.toString(game2048.getScore3()));
    }//GEN-LAST:event_resetActionPerformed

    private void score1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_score1ActionPerformed

    private void setgido(java.awt.event.ActionEvent evt){
        
    }
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
            java.util.logging.Logger.getLogger(scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton reset;
    private javax.swing.JTextField score1;
    private javax.swing.JTextField score2;
    private javax.swing.JTextField score3;
    // End of variables declaration//GEN-END:variables
}
