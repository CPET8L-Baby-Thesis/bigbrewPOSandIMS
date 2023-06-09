/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bigbrew_pos;

import javax.swing.JOptionPane;

/**
 *
 * @author JOIBOI
 */
public class userAuth extends javax.swing.JFrame {

    /**
     * Creates new form userAuth
     */
    public userAuth() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(240, 215, 188)); // This override the backgound to the standard color
        greetText.setOpaque(false); // This set the greetText panel to tranparent

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBorder = new javax.swing.JPanel();
        bottomBorder = new javax.swing.JPanel();
        loginForm = new javax.swing.JPanel();
        accLbl = new java.awt.Label();
        staffID = new javax.swing.JTextField();
        loginBttn = new javax.swing.JButton();
        spprtBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        greetText = new javax.swing.JPanel();
        wlcLbl = new java.awt.Label();
        bbShopLbl = new java.awt.Label();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Authentication");
        setBackground(new java.awt.Color(240, 215, 188));
        setResizable(false);

        topBorder.setBackground(new java.awt.Color(187, 111, 27));

        javax.swing.GroupLayout topBorderLayout = new javax.swing.GroupLayout(topBorder);
        topBorder.setLayout(topBorderLayout);
        topBorderLayout.setHorizontalGroup(
            topBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topBorderLayout.setVerticalGroup(
            topBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        bottomBorder.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout bottomBorderLayout = new javax.swing.GroupLayout(bottomBorder);
        bottomBorder.setLayout(bottomBorderLayout);
        bottomBorderLayout.setHorizontalGroup(
            bottomBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomBorderLayout.setVerticalGroup(
            bottomBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        loginForm.setBackground(new java.awt.Color(242, 244, 234));
        loginForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        accLbl.setAlignment(java.awt.Label.CENTER);
        accLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        accLbl.setText("ACCOUNT LOGIN");

        staffID.setBackground(new java.awt.Color(229, 229, 229));
        staffID.setFont(new java.awt.Font("Roboto Lt", 0, 12)); // NOI18N
        staffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffIDActionPerformed(evt);
            }
        });

        loginBttn.setBackground(new java.awt.Color(114, 169, 122));
        loginBttn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        loginBttn.setForeground(new java.awt.Color(255, 255, 255));
        loginBttn.setText("Login");
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        spprtBttn.setBackground(new java.awt.Color(242, 244, 234));
        spprtBttn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        spprtBttn.setForeground(new java.awt.Color(29, 128, 205));
        spprtBttn.setText("Need Support?");
        spprtBttn.setBorderPainted(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesIcon/user_icon.png"))); // NOI18N

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(accLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginFormLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(spprtBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffID)
                .addContainerGap())
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(spprtBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        wlcLbl.setAlignment(java.awt.Label.CENTER);
        wlcLbl.setBackground(new java.awt.Color(240, 215, 188));
        wlcLbl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        wlcLbl.setText("Welcome to");

        bbShopLbl.setAlignment(java.awt.Label.CENTER);
        bbShopLbl.setBackground(new java.awt.Color(240, 215, 188));
        bbShopLbl.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bbShopLbl.setText("BigBrew Coffee Shop!");

        javax.swing.GroupLayout greetTextLayout = new javax.swing.GroupLayout(greetText);
        greetText.setLayout(greetTextLayout);
        greetTextLayout.setHorizontalGroup(
            greetTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greetTextLayout.createSequentialGroup()
                .addGroup(greetTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greetTextLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(wlcLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(greetTextLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bbShopLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        greetTextLayout.setVerticalGroup(
            greetTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greetTextLayout.createSequentialGroup()
                .addComponent(wlcLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bbShopLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        copyright.setText("© BigBrew 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(greetText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(copyright)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(greetText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(copyright)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffIDActionPerformed

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        // TODO add your handling code here:
        String enteredStaffIDText = staffID.getText(); // Get the value entered in the staffID field

        // Check if the enteredStaffIDText is empty or null
        if (enteredStaffIDText.isEmpty() || enteredStaffIDText.isBlank()) {
            // Display an error message
            JOptionPane.showMessageDialog(this, "Please enter a valid Staff ID.", "Invalid Staff ID", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the staff ID is empty
        }

        // Check if the enteredStaffIDText has exactly 8 digits
        if (enteredStaffIDText.length() != 8) {
            // Display an error message
            JOptionPane.showMessageDialog(this, "Please enter a valid Staff ID.", "Invalid Staff ID", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the staff ID does not have 8 digits
        }

        int enteredStaffID;
        try {
            enteredStaffID = Integer.parseInt(enteredStaffIDText);
        } catch (NumberFormatException e) {
            // Display an error message if the entered value is not a valid integer
            JOptionPane.showMessageDialog(this, "Please enter a valid Staff ID.", "Invalid Staff ID", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the staff ID is not a valid integer
        }

        // Perform staff ID validation
        if (enteredStaffID == 00000000) {
            // Close the userAuth window if the user clicks the button
            dispose();

            // Open the mainPOS if the loginBttn is clicked and the credentials are correct
            java.awt.EventQueue.invokeLater(() -> {
                mainPOS mainPos = new mainPOS();
                mainPos.setLocationRelativeTo(null); // Center the mainPOS frame
                mainPos.setVisible(true);
            });
        } else {
            // Display an error message
            JOptionPane.showMessageDialog(this, "The staff ID is not correct. Please try again.", "Invalid Staff ID", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBttnActionPerformed

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
            java.util.logging.Logger.getLogger(userAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new userAuth().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label accLbl;
    private java.awt.Label bbShopLbl;
    private javax.swing.JPanel bottomBorder;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel greetText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBttn;
    private javax.swing.JPanel loginForm;
    private javax.swing.JButton spprtBttn;
    private javax.swing.JTextField staffID;
    private javax.swing.JPanel topBorder;
    private java.awt.Label wlcLbl;
    // End of variables declaration//GEN-END:variables

    private boolean isStaffIDValid(String staffIdentification) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
