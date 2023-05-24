/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import source1.SuggestionList;

/**
 *
 * @author Dilanka
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    String pid1;
    String brnd;
    String modl1;
    String bprice1;
    String sllng1;
    String qtyt1;
    String statust;
Color cc1 = new Color(204, 253, 244);
    Color cc2 = new Color(0, 0, 0);

    Color cc3 = new Color(0, 204, 255);
    Color cc4 = new Color(255, 255, 255);
    public Inventory() {
        initComponents();
        tbled();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inv_search_com = new javax.swing.JComboBox<>();
        invt_serarch = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Brand", "Model", "Qyt", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 720, 270));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logout 03.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STOCK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 130, 40));

        inv_search_com.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                inv_search_comPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(inv_search_com, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, 0));

        invt_serarch.setBackground(new java.awt.Color(0, 51, 51));
        invt_serarch.setForeground(new java.awt.Color(255, 255, 255));
        invt_serarch.setBorder(null);
        invt_serarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invt_serarchActionPerformed(evt);
            }
        });
        invt_serarch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                invt_serarchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invt_serarchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                invt_serarchKeyTyped(evt);
            }
        });
        jPanel1.add(invt_serarch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 20));

        jLabel9.setBackground(new java.awt.Color(0, 204, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reset");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Main_Menu mn = new Main_Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void inv_search_comPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_inv_search_comPopupMenuWillBecomeInvisible
        SuggestionList.setSelectedItem(invt_serarch, inv_search_com);
    }//GEN-LAST:event_inv_search_comPopupMenuWillBecomeInvisible

    private void invt_serarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invt_serarchActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            String intp = invt_serarch.getText();
            ResultSet rs = database.db.search("SELECT stock.qty,stock.prduct_p_id,product.brand,product.model FROM stock INNER JOIN product ON stock.prduct_p_id=product.p_id WHERE product.p_id='" + intp + "'");
            while (rs.next()) {
                qtyt1 = rs.getString("stock.qty");

                pid1 = rs.getString("stock.prduct_p_id");
                brnd = rs.getString("product.brand");
                modl1 = rs.getString("product.model");
                int qtyin = Integer.parseInt(qtyt1);
                if (qtyin <= 10) {
                    statust = "low";

                } else {
                    statust = "enough";
                }
                Vector v = new Vector();
                v.add(pid1);
                v.add(brnd);
                v.add(modl1);
                v.add(qtyt1);
                v.add(statust);
                dtm.setRowCount(0);
//                Object[] row1 = {pid1, brnd, modl1, qtyt1, statust};
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_invt_serarchActionPerformed

    private void invt_serarchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invt_serarchKeyReleased
        SuggestionList.showList(invt_serarch, inv_search_com, "SELECT product.p_id FROM product WHERE product.p_id LIKE '" + invt_serarch.getText() + "%'", "product.p_id", evt, this.getClass().getName());

    }//GEN-LAST:event_invt_serarchKeyReleased

    private void invt_serarchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invt_serarchKeyTyped

//        if (invt_serarch.getText().isEmpty()) {
//            if (evt.getKeyCode() == 8) {
//                evt.consume();
//            }
//            tbled();
//        }

    }//GEN-LAST:event_invt_serarchKeyTyped

    private void invt_serarchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invt_serarchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_invt_serarchKeyPressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
if(jTable1.getRowCount()>1){

}else{
        tbled();

}
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered

        jLabel9.setBackground(cc1);
        jLabel9.setForeground(cc2);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited

        jLabel9.setBackground(cc3);
        jLabel9.setForeground(cc4);
    }//GEN-LAST:event_jLabel9MouseExited

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> inv_search_com;
    private javax.swing.JTextField invt_serarch;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    void tbled() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            ResultSet rs = database.db.search("SELECT stock.prduct_p_id, stock.qty,product.brand,product.model FROM stock INNER JOIN product ON stock.prduct_p_id = product.p_id;");

            while (rs.next()) {
                pid1 = rs.getString("stock.prduct_p_id");
                brnd = rs.getString("product.brand");
                modl1 = rs.getString("product.model");
                qtyt1 = rs.getString("stock.qty");
                int qtyin = Integer.parseInt(qtyt1);
                if (qtyin <= 10) {
                    statust = "low";
                } else {
                    statust = "enough";
                }
                Object[] row1 = {pid1, brnd, modl1, qtyt1, statust};
                dtm.addRow(row1);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}