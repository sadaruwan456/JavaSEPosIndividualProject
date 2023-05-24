/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Cryptography.Cryption;
import Model.Email;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Dilanka
 */
public class Forgot_password extends javax.swing.JFrame {

    StringBuilder sb = new StringBuilder();
    String charSet = "abcdefghijk245879lmnopqrst";
    Random rnd = new Random();
    String OTP;
    String pw2;

    /**
     * Creates new form Forgot_password
     */
    public Forgot_password() {
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

        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email_f = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        send_btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confr_btn = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        pin_f = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(0, 0, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Grand Mobile Shop");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logo22.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 230, 340));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password");

        email_f.setBackground(new java.awt.Color(0, 51, 51));
        email_f.setForeground(new java.awt.Color(255, 255, 255));
        email_f.setBorder(null);
        email_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                email_fMouseEntered(evt);
            }
        });
        email_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fActionPerformed(evt);
            }
        });

        send_btn.setBackground(new java.awt.Color(0, 204, 204));
        send_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        send_btn.setForeground(new java.awt.Color(255, 255, 255));
        send_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        send_btn.setText("Send");
        send_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_btn.setOpaque(true);
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                send_btnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pin Number");

        confr_btn.setBackground(new java.awt.Color(0, 204, 204));
        confr_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confr_btn.setForeground(new java.awt.Color(255, 255, 255));
        confr_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confr_btn.setText("Confirm");
        confr_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confr_btn.setOpaque(true);
        confr_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confr_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confr_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confr_btnMouseExited(evt);
            }
        });

        status.setForeground(new java.awt.Color(255, 255, 255));

        pin_f.setBackground(new java.awt.Color(0, 51, 51));
        pin_f.setForeground(new java.awt.Color(255, 255, 255));
        pin_f.setBorder(null);
        pin_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pin_fMouseEntered(evt);
            }
        });
        pin_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin_fActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logout 03.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(email_f, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(send_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pin_f, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(confr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(email_f, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pin_f, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confr_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 0, 290, 342));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_fMouseEntered

    }//GEN-LAST:event_email_fMouseEntered

    private void email_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fActionPerformed

    }//GEN-LAST:event_email_fActionPerformed

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        if (!email_f.getText().isEmpty()) {
            try {
                String emailu = email_f.getText();
                ResultSet rs = database.db.search("SELECT * FROM users WHERE users.email = '" + emailu + "'");
                if (rs.next()) {
//                    System.out.println(rs.getString("users.email"));

                    String eml = email_f.getText().trim();
                    while (sb.length() < 6) {
                        int index = (int) (rnd.nextFloat() * charSet.length());
                        sb.append(charSet.charAt(index));
                    }
                    OTP = sb.toString();
                    status.setText("Sending Code...");
                    Email.sendMail(eml, " Grand Mobile Phone Shop ", "Your System Admin Verification Code : " + OTP);
                    System.out.println("sent..");

                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect Email", "Invalide", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pleace check Field", "Empty Field", JOptionPane.ERROR_MESSAGE);
        }

//       if(!email_f.getText().isEmpty()){
//       
//      
//           }else{
//      
//       }

    }//GEN-LAST:event_send_btnMouseClicked

    private void send_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseEntered
        Color cc1 = new Color(204, 253, 244);
        Color cc0 = new Color(0, 0, 0);
        send_btn.setBackground(cc1);
        send_btn.setForeground(cc0);
    }//GEN-LAST:event_send_btnMouseEntered

    private void send_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseExited
        Color cc = new Color(102, 204, 255);
        Color cc2 = new Color(255, 255, 255);

        send_btn.setBackground(cc);
        send_btn.setForeground(cc2);
    }//GEN-LAST:event_send_btnMouseExited
    private void confr_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confr_btnMouseClicked
        if (pin_f.getText().equals(OTP)) {
            JPasswordField jp1 = new JPasswordField();
            JPasswordField jpc1 = new JPasswordField();
            JLabel jl1 = new JLabel();
            String d = "Machin..";
            jl1.setText(d);
            Object[] jpw = {"New Password", jp1, "Confirm Password", jpc1, jl1};
            int okcan = JOptionPane.showConfirmDialog(this, jpw, "Enter New Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String pw1 = jp1.getText();
             pw2 = jpc1.getText();
            if (okcan == JOptionPane.OK_OPTION) {
                if (pw1.equals(pw2)) {
                    try {
                        database.db.iud("UPDATE users SET users.password = '" + Cryption.encript(pw2) + "' WHERE users.email = '" + email_f.getText() + "'");
                        JOptionPane.showMessageDialog(this, "Updated");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    new Main_Menu().setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "different");
                }

            }
            if (okcan == JOptionPane.CANCEL_OPTION || okcan == JOptionPane.CLOSED_OPTION) {

              
                pin_f.setText(null);
            }

        } else {

            JOptionPane.showMessageDialog(this, "Incorrect OTP code..,!", "Incorrect", JOptionPane.ERROR_MESSAGE);
            pin_f.setText(null);
        }
    }//GEN-LAST:event_confr_btnMouseClicked

    private void confr_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confr_btnMouseEntered
        Color cc1 = new Color(204, 253, 244);
        Color cc0 = new Color(0, 0, 0);
        confr_btn.setBackground(cc1);
        confr_btn.setForeground(cc0);
        // TODO add your handling code here:
    }//GEN-LAST:event_confr_btnMouseEntered

    private void confr_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confr_btnMouseExited
        Color cc = new Color(102, 204, 255);
        Color cc2 = new Color(255, 255, 255);

        confr_btn.setBackground(cc);
        confr_btn.setForeground(cc2);
        // TODO add your handling code here:
    }//GEN-LAST:event_confr_btnMouseExited

    private void pin_fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pin_fMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_fMouseEntered

    private void pin_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_fActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        Color cc1 = new Color(0, 0, 0);
        Color cc2 = new Color(255, 255, 255);

        jLabel15.setBackground(cc1);
        jLabel15.setForeground(cc2);

    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        Color cc3 = new Color(0, 0, 204);
        Color cc4 = new Color(153, 255, 255);

        jLabel15.setBackground(cc3);
        jLabel15.setForeground(cc4);


    }//GEN-LAST:event_jLabel15MouseExited

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
            java.util.logging.Logger.getLogger(Forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confr_btn;
    private javax.swing.JTextField email_f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField pin_f;
    private javax.swing.JLabel send_btn;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
