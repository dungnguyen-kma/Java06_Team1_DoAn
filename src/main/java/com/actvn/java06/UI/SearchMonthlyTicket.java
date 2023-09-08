/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.java06.UI;

import com.actvn.java06.MonthlyTicket;
import com.actvn.java06.FileSave;
import javax.swing.JOptionPane;
import static com.actvn.java06.PoolManage.monthlyTickets;
import java.awt.Image;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tatcataiso
 */
public class SearchMonthlyTicket extends javax.swing.JFrame {

    /**
     * Creates new form SearchMonthlyTicket
     */
    public SearchMonthlyTicket() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        popupXoa = new javax.swing.JMenuItem();
        popupSua = new javax.swing.JMenuItem();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelAvata = new javax.swing.JLabel();
        buttonAvata = new javax.swing.JButton();

        jPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenuMouseClicked(evt);
            }
        });

        popupXoa.setText("Xóa");
        popupXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupXoaActionPerformed(evt);
            }
        });
        jPopupMenu.add(popupXoa);

        popupSua.setText("Sửa");
        popupSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSuaActionPerformed(evt);
            }
        });
        jPopupMenu.add(popupSua);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nhập vào họ tên khách hàng cần tìm kiếm:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Tuổi", "Loại vé", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Ngày đăng ký", "Ngày hết hạn", "Giá tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton1.setText("Lưu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelAvata.setIcon(new javax.swing.ImageIcon("D:\\Image\\Anh_mac_dinh.png")); // NOI18N
        labelAvata.setToolTipText("");

        buttonAvata.setLabel("Hiển thị ảnh \nkhách hàng");
        buttonAvata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAvataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1)
                        .addGap(245, 245, 245)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAvata)
                            .addComponent(labelAvata))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAvata)
                        .addGap(35, 35, 35)
                        .addComponent(buttonAvata)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<MonthlyTicket> arrayList = new ArrayList<>();
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    public static String getLastWord(String str) {
        String[] words = str.split(" ");
        if (words.length > 0) {
            return words[words.length - 1];
        }
        return "";
    }
    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String key = txtName.getText();

        if (key.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập họ tên khách hàng cần tìm kiếm!");
        } else {
            monthlyTickets.clear();
            try {
                FileSave.ReadArrayMonthlyTickets(monthlyTickets);
            } catch (IOException ex) {
                Logger.getLogger(SearchMonthlyTicket.class.getName()).log(Level.SEVERE, null, ex);
            }
            arrayList.clear();

            String subKey = "";
            for (MonthlyTicket ticket : monthlyTickets) {
                subKey = getLastWord(ticket.getCustomerName());
                if (key.equalsIgnoreCase(ticket.getCustomerName()) || key.equalsIgnoreCase(subKey)) {
                    arrayList.add(ticket);
                }
            }
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);

            for (MonthlyTicket ticket : arrayList) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getCustomerName(), ticket.getCustomerAddress(), ticket.getCustomerPhone(), ticket.getRegistereDate(), ticket.getExpiedDate(), ticket.getMonthlyPrice(), ticket.getCustomerAvatar()});
            }
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void popupSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSuaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn sửa thông tin hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTable.getSelectedRow();
            ID = (String) jTable.getValueAt(row, 0);
            ArrayList<MonthlyTicket> copy = new ArrayList<>(arrayList);
            int age = 0;
            String isTicketVip = null;
            String name = null;
            String address = null;
            int phone = 0;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String date1 = null;
            String date2 = null;
            LocalDate startTime = null;
            LocalDate endTime = null;

            for (MonthlyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    age = (int) jTable.getValueAt(row, 1);
                    isTicketVip = (String) jTable.getValueAt(row, 2);
                    name = (String) jTable.getValueAt(row, 3);
                    address = (String) jTable.getValueAt(row, 4);
                    phone = (int) jTable.getValueAt(row, 5);
                    date1 = (String) jTable.getValueAt(row, 6);
                    date2 = (String) jTable.getValueAt(row, 7);
                    startTime = LocalDate.parse(date1, formatter);
                    endTime = LocalDate.parse(date2, formatter);
                    ticket.setCustomerName(name);
                    ticket.setCustomerAddress(address);
                    ticket.setCustomerPhone(phone);
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                    ticket.setRegistereDate(startTime);
                    ticket.setExpiedDate(endTime);
                }
            }
            for (MonthlyTicket ticket : monthlyTickets) {
                if (ID.equals(ticket.getTicketID())) {
                    ticket.setCustomerName(name);
                    ticket.setCustomerAddress(address);
                    ticket.setCustomerPhone(phone);
                    ticket.setAge(age);
                    ticket.setIsTicketVip(isTicketVip);
                    ticket.setRegistereDate(startTime);
                    ticket.setExpiedDate(endTime);
                }
            }

            //jTableDaily.removeAll();
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);

            for (MonthlyTicket ticket : arrayList) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getCustomerName(), ticket.getCustomerAddress(), ticket.getCustomerPhone(), ticket.getRegistereDate(), ticket.getExpiedDate(), ticket.getMonthlyPrice(), ticket.getCustomerAvatar()});
            }
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        }
    }//GEN-LAST:event_popupSuaActionPerformed

    private void jPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenuMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPopupMenuMouseClicked

    private void popupXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupXoaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa hay không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String ID;
            int row;
            row = jTable.getSelectedRow();
            ID = (String) jTable.getValueAt(row, 0);
            ArrayList<MonthlyTicket> copy = new ArrayList<>(arrayList);
            ArrayList<MonthlyTicket> copy2 = new ArrayList<>(monthlyTickets);

            for (MonthlyTicket ticket : copy) {
                if (ID.equals(ticket.getTicketID())) {
                    arrayList.remove(ticket);
                }
            }
            for (MonthlyTicket ticket : copy2) {
                if (ID.equals(ticket.getTicketID())) {
                    monthlyTickets.remove(ticket);
                }
            }

            DefaultTableModel model = (DefaultTableModel) jTable.getModel();

            model.setRowCount(0);
            for (MonthlyTicket ticket : arrayList) {
                model.addRow(new Object[]{ticket.getTicketID(), ticket.getAge(), ticket.getIsTicketVip(), ticket.getCustomerName(), ticket.getCustomerAddress(), ticket.getCustomerPhone(), ticket.getRegistereDate(), ticket.getExpiedDate(), ticket.getMonthlyPrice(), ticket.getCustomerAvatar()});
            }

            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        }
    }//GEN-LAST:event_popupXoaActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            jPopupMenu.show(this, 200, 200 + (jTable.getSelectedRow()) * 5);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            FileSave.saveArrayMonthlyTickets(monthlyTickets);
            JOptionPane.showMessageDialog(this, "Lưu thành công!");
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(SearchMonthlyTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu các thay đổi không?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            jButton1ActionPerformed(evt);
            dispose();
        } else {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(labelAvata.getWidth(), labelAvata.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void buttonAvataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAvataActionPerformed
        // TODO add your handling code here:
        String ID;
        int row;
        row = jTable.getSelectedRow();
        ID = (String) jTable.getValueAt(row, 0);
        ArrayList<MonthlyTicket> copy = new ArrayList<>(arrayList);

        String avata = "D:\\Image\\Anh_mac_dinh.png";
        for (MonthlyTicket ticket : copy) {
            if (ID.equals(ticket.getTicketID())) {
                avata = ticket.getCustomerAvatar();
            }
        }
        labelAvata.setIcon(ResizeImage(avata));
    }//GEN-LAST:event_buttonAvataActionPerformed

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
            java.util.logging.Logger.getLogger(SearchMonthlyTicket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchMonthlyTicket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchMonthlyTicket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchMonthlyTicket.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMonthlyTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAvata;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel labelAvata;
    private javax.swing.JMenuItem popupSua;
    private javax.swing.JMenuItem popupXoa;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
