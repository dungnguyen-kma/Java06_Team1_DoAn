/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.java06.UI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author thepo
 */
public class SellMonthlyTicket extends javax.swing.JFrame {

    /**
     * Creates new form SellMonthlyTicket
     */
    public SellMonthlyTicket() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addPlaceholder(jInputName);
        addPlaceholder(jInputAddress);
        addPlaceholder(jInputPhone);
    }
    
    public void addPlaceholder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jInputName = new javax.swing.JTextField();
        jInputAddress = new javax.swing.JTextField();
        jInputPhone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRegisterDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jExpiredDate = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jSelectOneMonth = new javax.swing.JRadioButton();
        jSelectThreeMonth = new javax.swing.JRadioButton();
        jSelectSixMonth = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jSelectNormalTicket = new javax.swing.JRadioButton();
        jSelectVipTicket = new javax.swing.JRadioButton();
        jPrice = new javax.swing.JLabel();
        jExitButton = new javax.swing.JButton();
        jSubmitButton = new javax.swing.JButton();
        jResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Đăng ký vé tháng");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Họ tên khách hàng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Địa chỉ: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Số điện thoại: ");

        jInputName.setText("Họ và tên*");
        jInputName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jInputNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jInputNameFocusLost(evt);
            }
        });
        jInputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputNameActionPerformed(evt);
            }
        });

        jInputAddress.setText("Địa chỉ*");
        jInputAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jInputAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jInputAddressFocusLost(evt);
            }
        });
        jInputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputAddressActionPerformed(evt);
            }
        });

        jInputPhone.setText("Số điện thoại*");
        jInputPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jInputPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jInputPhoneFocusLost(evt);
            }
        });
        jInputPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jInputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jInputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jInputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Mã vé:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ngày bắt đầu:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Giá vé:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("ngày kết thúc: ");

        jExpiredDate.setText("jTextField1");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gia hạn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jSelectOneMonth.setText("1 tháng");
        jSelectOneMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectOneMonthActionPerformed(evt);
            }
        });

        jSelectThreeMonth.setText("3 tháng");
        jSelectThreeMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectThreeMonthActionPerformed(evt);
            }
        });

        jSelectSixMonth.setText("6 tháng");
        jSelectSixMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectSixMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSelectOneMonth)
                    .addComponent(jSelectThreeMonth)
                    .addComponent(jSelectSixMonth))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSelectOneMonth)
                .addGap(18, 18, 18)
                .addComponent(jSelectThreeMonth)
                .addGap(18, 18, 18)
                .addComponent(jSelectSixMonth)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loại vé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jSelectNormalTicket.setText("Thường");
        jSelectNormalTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectNormalTicketActionPerformed(evt);
            }
        });

        jSelectVipTicket.setText("Vip");
        jSelectVipTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectVipTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSelectVipTicket)
                    .addComponent(jSelectNormalTicket))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSelectNormalTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSelectVipTicket)
                .addGap(25, 25, 25))
        );

        jPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrice.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jExpiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPrice))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jExpiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPrice))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jExitButton.setText("Thoát");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jSubmitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSubmitButton.setText("Xác nhận");

        jResetButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jResetButton.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jExitButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSubmitButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jResetButton))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExitButton)
                    .addComponent(jSubmitButton)
                    .addComponent(jResetButton))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputNameActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_jInputNameActionPerformed

    private void jInputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInputAddressActionPerformed

    private void jInputPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInputPhoneActionPerformed

    private void jInputNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputNameFocusGained
        // TODO add your handling code here:
        if(jInputName.getText().equals("Họ và tên*")){
            jInputName.setText(null);
            jInputName.requestFocus();
            removePlaceholder(jInputName);
        }
    }//GEN-LAST:event_jInputNameFocusGained

    private void jInputAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputAddressFocusGained
        // TODO add your handling code here:
        if(jInputAddress.getText().equals("Địa chỉ*")){
            jInputAddress.setText(null);
            jInputAddress.requestFocus();
            removePlaceholder(jInputAddress);
        }
    }//GEN-LAST:event_jInputAddressFocusGained

    private void jInputPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputPhoneFocusGained
        // TODO add your handling code here:
        if(jInputPhone.getText().equals("Số điện thoại*")){
            jInputPhone.setText(null);
            jInputPhone.requestFocus();
            removePlaceholder(jInputPhone);
        }
    }//GEN-LAST:event_jInputPhoneFocusGained

    private void jInputNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputNameFocusLost
        // TODO add your handling code here:
        if(jInputName.getText().length()==0){
            addPlaceholder(jInputName);
            jInputName.setText("Họ và tên*");
        }
    }//GEN-LAST:event_jInputNameFocusLost

    private void jInputAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputAddressFocusLost
        // TODO add your handling code here:
        if(jInputAddress.getText().length()==0){
            addPlaceholder(jInputAddress);
            jInputAddress.setText("Địa chỉ*");
        }
    }//GEN-LAST:event_jInputAddressFocusLost

    private void jInputPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInputPhoneFocusLost
        // TODO add your handling code here:
        if(jInputPhone.getText().length()==0){
            addPlaceholder(jInputPhone);
            jInputPhone.setText("Số điện thoại*");
        }
    }//GEN-LAST:event_jInputPhoneFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jSelectOneMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectOneMonthActionPerformed
        // TODO add your handling code here:
        jSelectOneMonth.setSelected(true);
        jSelectThreeMonth.setSelected(false);
        jSelectSixMonth.setSelected(false);
    }//GEN-LAST:event_jSelectOneMonthActionPerformed

    private void jSelectThreeMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectThreeMonthActionPerformed
        // TODO add your handling code here:
        jSelectThreeMonth.setSelected(true);
        jSelectOneMonth.setSelected(false);
        jSelectSixMonth.setSelected(false);
    }//GEN-LAST:event_jSelectThreeMonthActionPerformed

    private void jSelectSixMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectSixMonthActionPerformed
        // TODO add your handling code here:
        jSelectSixMonth.setSelected(true);
        jSelectOneMonth.setSelected(false);
        jSelectThreeMonth.setSelected(false);
    }//GEN-LAST:event_jSelectSixMonthActionPerformed

    private void jSelectNormalTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectNormalTicketActionPerformed
        // TODO add your handling code here:
        jSelectNormalTicket.setSelected(true);
        jSelectVipTicket.setSelected(false);
    }//GEN-LAST:event_jSelectNormalTicketActionPerformed

    private void jSelectVipTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectVipTicketActionPerformed
        // TODO add your handling code here:
        jSelectVipTicket.setSelected(true);
        jSelectNormalTicket.setSelected(false);
    }//GEN-LAST:event_jSelectVipTicketActionPerformed

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
            java.util.logging.Logger.getLogger(SellMonthlyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMonthlyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMonthlyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMonthlyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMonthlyTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton;
    private javax.swing.JTextField jExpiredDate;
    private javax.swing.JTextField jInputAddress;
    private javax.swing.JTextField jInputName;
    private javax.swing.JTextField jInputPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jPrice;
    private com.toedter.calendar.JDateChooser jRegisterDate;
    private javax.swing.JButton jResetButton;
    private javax.swing.JRadioButton jSelectNormalTicket;
    private javax.swing.JRadioButton jSelectOneMonth;
    private javax.swing.JRadioButton jSelectSixMonth;
    private javax.swing.JRadioButton jSelectThreeMonth;
    private javax.swing.JRadioButton jSelectVipTicket;
    private javax.swing.JButton jSubmitButton;
    // End of variables declaration//GEN-END:variables
}
