/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.java06.UI;

/**
 *
 * @author thepo
 */
public class FeatureMenu extends javax.swing.JFrame {

    /**
     * Creates new form FeatureMenu
     */
    public FeatureMenu() {
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

        jDailyTicketButton = new javax.swing.JButton();
        jMonthlyTicketButton = new javax.swing.JButton();
        jFilterTicket = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDailyTicketButton.setText("Bán vé ngày");
        jDailyTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDailyTicketButtonActionPerformed(evt);
            }
        });

        jMonthlyTicketButton.setText("Bán vé tháng");
        jMonthlyTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMonthlyTicketButtonActionPerformed(evt);
            }
        });

        jFilterTicket.setText("Thống kê");
        jFilterTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilterTicketActionPerformed(evt);
            }
        });

        jExitButton.setText("Thoát");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jMonthlyTicketButton)
                            .addComponent(jDailyTicketButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jExitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jFilterTicket)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jDailyTicketButton)
                .addGap(18, 18, 18)
                .addComponent(jMonthlyTicketButton)
                .addGap(18, 18, 18)
                .addComponent(jFilterTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jExitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDailyTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDailyTicketButtonActionPerformed
        SellDailyTicket sellDailyTicket = new SellDailyTicket();
        sellDailyTicket.setVisible(true);
    }//GEN-LAST:event_jDailyTicketButtonActionPerformed

    private void jMonthlyTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMonthlyTicketButtonActionPerformed
        // TODO add your handling code here:
        SellMonthlyTicket monthly = new SellMonthlyTicket();
        monthly.setVisible(true);
    }//GEN-LAST:event_jMonthlyTicketButtonActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jFilterTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilterTicketActionPerformed
        // TODO add your handling code here:
        TicketStatistic ticketStatistic = new TicketStatistic();
        ticketStatistic.setVisible(true);
    }//GEN-LAST:event_jFilterTicketActionPerformed

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
            java.util.logging.Logger.getLogger(FeatureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeatureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeatureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeatureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeatureMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDailyTicketButton;
    private javax.swing.JButton jExitButton;
    private javax.swing.JButton jFilterTicket;
    private javax.swing.JButton jMonthlyTicketButton;
    // End of variables declaration//GEN-END:variables
}
