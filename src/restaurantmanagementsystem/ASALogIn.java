/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurantmanagementsystem;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author kk
 */
public class ASALogIn extends javax.swing.JFrame {

    /**
     * Creates new form ASALogIn
     */
    public ASALogIn() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 153));
        jLabel4.setText("Manage Products");

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 153));
        jLabel6.setText("Manage Products");

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));

        jLabel8.setBackground(new java.awt.Color(153, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 153));
        jLabel8.setText("Manage Products");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtn.setBackground(new java.awt.Color(102, 0, 0));
        loginBtn.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 204, 153));
        loginBtn.setText("LogIn");
        loginBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 292, 39));

        nameTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(102, 0, 0));
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 180, -1));

        jLabel5.setBackground(new java.awt.Color(255, 204, 153));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Password : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        passwordTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(102, 0, 0));
        passwordTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("User Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 106, -1));

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 153));
        jLabel3.setText("ASA Restaurant Login");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 390, -1));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 314, 380, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
                      
    String url = "jdbc:ucanaccess://C:/Users/kk/Downloads/RestaurantManagementSystemDB.accdb";
    String query = "SELECT * FROM logIn WHERE userName = ? AND password = ?";

    String username = nameTxt.getText();
    String password = passwordTxt.getText();

    try (Connection connection = DriverManager.getConnection(url);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            if ("admin".equals(username) && "admin".equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful as Admin!");
                AddProduct pdForm = new AddProduct();
                this.hide();
                pdForm.show();
            } else if ("user".equals(username) && "1234".equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful as Staff!");
                FoodMenu menuForm = new FoodMenu();
                this.hide();
                menuForm.show();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

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
            java.util.logging.Logger.getLogger(ASALogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASALogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASALogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASALogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASALogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    // End of variables declaration//GEN-END:variables
}
