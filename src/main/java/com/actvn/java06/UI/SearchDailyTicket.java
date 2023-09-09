/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.java06.UI;

import com.actvn.java06.DailyTicket;
import com.actvn.java06.FileSave;
import static com.actvn.java06.PoolManage.dailyTickets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tatcataiso
 */
public class SearchDailyTicket extends javax.swing.JFrame {

    /**
     * Creates new form EditDailyTicket
     */
    public SearchDailyTicket() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dailyTickets.clear();
        try {
            FileSave.ReadArrayDailyTickets(dailyTickets);
        } catch (IOException ex) {
            Logger.getLogger(SearchDailyTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupXoa = new javax.swing.JMenuItem();
        popupSua = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        popupXoa2 = new javax.swing.JMenuItem();
        popupSua2 = new javax.swing.JMenuItem();
        txtTimeSlotID = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDaily = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableDaily1 = new javax.swing.JTable();
        buttonSave = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        popupXoa.setText("Xóa");
        popupXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popupXoaMouseClicked(evt);
            }
        });
        popupXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupXoaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popupXoa);

        popupSua.setText("Sửa");
        popupSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSuaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popupSua);

        popupXoa2.setText("Xóa");
        popupXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupXoa2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(popupXoa2);

        popupSua2.setText("Sửa");
        popupSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSua2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(popupSua2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTimeSlotID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimeSlotID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeSlotIDActionPerformed(evt);
            }
        });
        txtTimeSlotID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimeSlotIDKeyReleased(evt);
            }
        });

        jTableDaily.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Tuổi", "Loại vé", "Khung giờ", "Thời gian bắt đầu", "Thời gian kết thúc", "Giá vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDaily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDailyMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableDaily);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nhập vào khung giờ cần tìm kiếm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhập vào tuổi cần tìm kiếm");

        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        jTableDaily1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Tuổi", "Loại vé", "Khung giờ", "Thời gian bắt đầu", "Thời gian kết thúc", "Giá vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDaily1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDaily1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableDaily1);

        buttonSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonSave.setText("Lưu");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonExit.setText("Thoát");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(buttonExit)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTimeSlotID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimeSlotID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExit)
                    .addComponent(buttonSave))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<DailyTicket> arrayTimeSlot = new ArrayList<>();
    private ArrayList<DailyTicket> arrayAge = new ArrayList<>();


    private void txtTimeSlotIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeSlotIDKeyReleased
        // TODO add your handling code here:
        String key = txtTimeSlotID.getText();
        if (key.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin cần tìm kiếm!");
        } else {
            arrayTimeSlot.clear();
            for (DailyTicket daily : dailyTickets) {
                if (key.equalsIgnoreCase(daily.getTimeSlotID())) {
                    arrayTimeSlot.add(daily);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily.getModel();
            model.setRowCount(0);

            for (DailyTicket ticket : arrayTimeSlot) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }
        }
    }//GEN-LAST:event_txtTimeSlotIDKeyReleased

    private void txtTimeSlotIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeSlotIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeSlotIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String key = txtAge.getText();
        if (key.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin cần tìm kiếm!");
        } else {
            int age = Integer.parseInt(key);
            arrayAge.clear();
            for (DailyTicket daily : dailyTickets) {
                if (age == daily.getAge()) {
                    arrayAge.add(daily);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily1.getModel();
            model.setRowCount(0);

            for (DailyTicket ticket : arrayAge) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }
        }
    }//GEN-LAST:event_txtAgeKeyReleased


    private void popupSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSuaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa thông tin hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTableDaily.getSelectedRow();
            ID = (String) jTableDaily.getValueAt(row, 0);
            ArrayList<DailyTicket> copy = new ArrayList<>(arrayTimeSlot);

            int age = 0;
            String isTicketVip = null;

            for (DailyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    age = (int) jTableDaily.getValueAt(row, 1);
                    isTicketVip = (String) jTableDaily.getValueAt(row, 2);
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                }
            }
            for (DailyTicket ticket : dailyTickets) {
                if (ID.equals(ticket.getTicketID())) {
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily.getModel();
            model.setRowCount(0);

            for (DailyTicket ticket : arrayTimeSlot) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        }
    }//GEN-LAST:event_popupSuaActionPerformed

    private void jTableDailyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDailyMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            jPopupMenu1.show(this, 200, 200 + (jTableDaily.getSelectedRow()) * 10);
        }
    }//GEN-LAST:event_jTableDailyMouseClicked

    private void popupXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupXoaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_popupXoaMouseClicked

    private void popupXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupXoaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTableDaily.getSelectedRow();
            ID = (String) jTableDaily.getValueAt(row, 0);
            ArrayList<DailyTicket> copy = new ArrayList<>(arrayTimeSlot);
            ArrayList<DailyTicket> copy2 = new ArrayList<>(dailyTickets);
            //xóa
            for (DailyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    arrayTimeSlot.remove(ticket);
                }
            }
            for (DailyTicket ticket : copy2) {
                if (ID.equals(ticket.getTicketID())) {
                    dailyTickets.remove(ticket);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily.getModel();

            model.setRowCount(0);
            for (DailyTicket ticket : arrayTimeSlot) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }

            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }
    }//GEN-LAST:event_popupXoaActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu các thay đổi không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            buttonSaveActionPerformed(evt);
            dispose();
        } else {
            dispose();
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void jTableDaily1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDaily1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            jPopupMenu2.show(this, 400, 400 + (jTableDaily1.getSelectedRow()) * 10);
        }
    }//GEN-LAST:event_jTableDaily1MouseClicked

    private void popupXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupXoa2ActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTableDaily1.getSelectedRow();
            ID = (String) jTableDaily1.getValueAt(row, 0);
            ArrayList<DailyTicket> copy = new ArrayList<>(arrayAge);
            ArrayList<DailyTicket> copy2 = new ArrayList<>(dailyTickets);

            for (DailyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    arrayAge.remove(ticket);
                }
            }
            for (DailyTicket ticket : copy2) {
                if (ID.equals(ticket.getTicketID())) {
                    dailyTickets.remove(ticket);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily1.getModel();

            model.setRowCount(0);
            for (DailyTicket ticket : arrayAge) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }

            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }
    }//GEN-LAST:event_popupXoa2ActionPerformed

    private void popupSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSua2ActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa thông tin hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTableDaily1.getSelectedRow();
            ID = (String) jTableDaily1.getValueAt(row, 0);
            ArrayList<DailyTicket> copy = new ArrayList<>(arrayAge);

            int age = 0;
            String isTicketVip = null;
            for (DailyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    age = (int) jTableDaily1.getValueAt(row, 1);
                    isTicketVip = (String) jTableDaily1.getValueAt(row, 2);
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                }
            }
            for (DailyTicket ticket : dailyTickets) {
                if (ID.equals(ticket.getTicketID())) {
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTableDaily1.getModel();
            model.setRowCount(0);

            for (DailyTicket ticket : arrayAge) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getTimeSlotID(), ticket.getStartTime(), ticket.getEndTime(), ticket.getDailyPrice()});
            }
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        }
    }//GEN-LAST:event_popupSua2ActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            FileSave.saveArrayDailyTickets(dailyTickets);
            JOptionPane.showMessageDialog(this, "Lưu thành công!");
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(SearchMonthlyTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(SearchDailyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDailyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDailyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDailyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDailyTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableDaily;
    private javax.swing.JTable jTableDaily1;
    private javax.swing.JMenuItem popupSua;
    private javax.swing.JMenuItem popupSua2;
    private javax.swing.JMenuItem popupXoa;
    private javax.swing.JMenuItem popupXoa2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtTimeSlotID;
    // End of variables declaration//GEN-END:variables
}
