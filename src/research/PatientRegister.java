/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package research;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author AbdUlraHman
 */
public class PatientRegister extends javax.swing.JFrame {

    /**
     * Creates new form PatientRegister
     */
    public PatientRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(450, 550);
        this.setTitle("Register as a patient");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordTextField = new javax.swing.JTextField();
        ConfirmPasswordTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        BirthdayTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UserNameTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        docName = new javax.swing.JTextField();
        docEmail = new javax.swing.JTextField();
        docPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        parentName = new javax.swing.JTextField();
        parentEmail = new javax.swing.JTextField();
        parentPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");

        jLabel2.setText("Confirm Password");

        jLabel3.setText("Birthday");

        jLabel4.setText("Phone");

        jLabel5.setText("User Name");

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        UserNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Doctor Information");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Personal Information");

        docName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Parent Information");

        jLabel10.setText("Name");

        jLabel11.setText("E-mail");

        jLabel12.setText("Phone");

        jLabel13.setText("Name");

        jLabel14.setText("E-mail");

        jLabel15.setText("Phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(parentPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(parentName)
                            .addComponent(docEmail)
                            .addComponent(PasswordTextField)
                            .addComponent(UserNameTextField1)
                            .addComponent(ConfirmPasswordTextField)
                            .addComponent(AddressTextField)
                            .addComponent(PhoneTextField)
                            .addComponent(BirthdayTextField)
                            .addComponent(docName)
                            .addComponent(docPhone)
                            .addComponent(parentEmail))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(19, 19, 19)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        
        // patient data
        String userName = UserNameTextField1.getText();
        String birthDay = BirthdayTextField.getText();
        String phone = PhoneTextField.getText();
        String address = AddressTextField.getText();
        String pass = PasswordTextField.getText();
        String confirmPass = ConfirmPasswordTextField.getText();
        
        // doctor data
        String doc_name = docName.getText();
        String doc_email = docEmail.getText();
        String doc_phone = docPhone.getText();
        
        // parent data
        String parent_name = parentName.getText();
        String parnet_email = parentEmail.getText();
        String parent_phone = parentEmail.getText();
        
        try
        {
            if(userName.isEmpty() || birthDay.isEmpty() || phone.isEmpty() || 
                    address.isEmpty() || pass.isEmpty() || confirmPass.isEmpty())
                JOptionPane.showMessageDialog(this, "Please fill all personal data", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(!(pass.equals(confirmPass)))
                JOptionPane.showMessageDialog(this, "password doesn't match", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(doc_name.isEmpty() || doc_email.isEmpty() || doc_phone.isEmpty())
                JOptionPane.showMessageDialog(this, "Please fill doctor data", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(parent_name.isEmpty() || parnet_email.isEmpty() || parent_phone.isEmpty())
                JOptionPane.showMessageDialog(this, "Please fill parent data", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            else{
                String dbHost = "jdbc:derby://localhost:1527/Database";
                String dbUsrname = "ziad";
                String dbPass = "123456";

                Connection myconobj = DriverManager.getConnection(dbHost, dbUsrname, dbPass);

                // check if the user name has been used before
                String query = "SELECT USER_ID FROM PATIENT WHERE USER_ID=(?)";
                PreparedStatement pstmt = myconobj.prepareStatement(query);
                pstmt.setString(1, userName);
                ResultSet rs = pstmt.executeQuery(); 
                if(rs.next())
                    JOptionPane.showMessageDialog(this, "User name is used, please choose another", "ERROR", JOptionPane.ERROR_MESSAGE);                    
                
                //  insert into patient table
                query = "INSERT INTO PATIENT VALUES (?, ? , ?, ?, ?)";
                pstmt = myconobj.prepareStatement(query);
                pstmt.setString(1, userName);
                pstmt.setString(2, pass);
                pstmt.setString(3, birthDay);
                pstmt.setString(4, phone);
                pstmt.setString(5, address);
                pstmt.executeUpdate();
                
                //  insert into doctor table
                query = "INSERT INTO DOCTOR VALUES (?, ? , ?, ?)";
                pstmt = myconobj.prepareStatement(query);
                pstmt.setString(1, userName);
                pstmt.setString(2, doc_name);
                pstmt.setString(3, doc_email);
                pstmt.setString(4, doc_phone);
                pstmt.executeUpdate();
                
                
                //  insert into doctor table
                query = "INSERT INTO PARENT VALUES (?, ? , ?, ?)";
                pstmt = myconobj.prepareStatement(query);
                pstmt.setString(1, userName);
                pstmt.setString(2, parnet_email);
                pstmt.setString(3, parent_name);
                pstmt.setString(4, parent_phone);
                pstmt.executeUpdate();
                    
                JOptionPane.showMessageDialog(this,"You have registered successfully!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                
                // return to home page
                home p2 = new home();
                p2.setVisible(true);
                p2.setTitle("Home");
                this.setVisible(false);
            }
        }
        catch(HeadlessException | SQLException e)
        {   
            System.out.println(e.getMessage());            
        }      
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void UserNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTextField1ActionPerformed

    private void docNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNameActionPerformed

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
            java.util.logging.Logger.getLogger(PatientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField BirthdayTextField;
    private javax.swing.JTextField ConfirmPasswordTextField;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UserNameTextField1;
    private javax.swing.JTextField docEmail;
    private javax.swing.JTextField docName;
    private javax.swing.JTextField docPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField parentEmail;
    private javax.swing.JTextField parentName;
    private javax.swing.JTextField parentPhone;
    // End of variables declaration//GEN-END:variables
}
