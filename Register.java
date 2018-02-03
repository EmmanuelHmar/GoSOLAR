/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stellar;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aturn
 * ~Documentation goes here~
 */

public class Register extends javax.swing.JFrame {
    //Creates Registration form
    public Register() {
        initComponents();
        staricon();
        setTitle("Stellar Registration");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        register_title = new javax.swing.JLabel();
        firstname_label = new javax.swing.JLabel();
        firstname_input = new javax.swing.JTextField();
        firstname_line = new javax.swing.JSeparator();
        lastname_label = new javax.swing.JLabel();
        lastname_input = new javax.swing.JTextField();
        lastname_line = new javax.swing.JSeparator();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        pass_label = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        pass_line = new javax.swing.JSeparator();
        confirmpass_label = new javax.swing.JLabel();
        confirmpass_input = new javax.swing.JPasswordField();
        confirmpass_line = new javax.swing.JSeparator();
        register_button = new javax.swing.JButton();
        login_label = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(33, 16, 27));

        register_title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        register_title.setForeground(new java.awt.Color(255, 255, 255));
        register_title.setText("Registration");

        firstname_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        firstname_label.setForeground(new java.awt.Color(255, 255, 255));
        firstname_label.setText("First Name:");

        firstname_input.setBackground(new java.awt.Color(33, 16, 27));
        firstname_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(255, 255, 255));
        firstname_input.setBorder(null);
        firstname_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        lastname_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lastname_label.setForeground(new java.awt.Color(255, 255, 255));
        lastname_label.setText("Last Name:");

        lastname_input.setBackground(new java.awt.Color(33, 16, 27));
        lastname_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(255, 255, 255));
        lastname_input.setBorder(null);
        lastname_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id_label.setForeground(new java.awt.Color(255, 255, 255));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(33, 16, 27));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        id_input.setForeground(new java.awt.Color(255, 255, 255));
        id_input.setBorder(null);
        id_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        pass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(255, 255, 255));
        pass_label.setText("Password:");

        pass_input.setBackground(new java.awt.Color(33, 16, 27));
        pass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        pass_input.setForeground(new java.awt.Color(255, 255, 255));
        pass_input.setBorder(null);
        pass_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        confirmpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        confirmpass_label.setForeground(new java.awt.Color(255, 255, 255));
        confirmpass_label.setText("Confirm Password:");

        confirmpass_input.setBackground(new java.awt.Color(33, 16, 27));
        confirmpass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        confirmpass_input.setForeground(new java.awt.Color(255, 255, 255));
        confirmpass_input.setBorder(null);
        confirmpass_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        register_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("Already Registered? Login here:");

        login_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        login_button.setText("Login");
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(register_title))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmpass_label)
                            .addComponent(pass_label)
                            .addComponent(id_label)
                            .addComponent(lastname_label)
                            .addComponent(firstname_label)
                            .addComponent(firstname_input)
                            .addComponent(firstname_line)
                            .addComponent(lastname_input)
                            .addComponent(lastname_line)
                            .addComponent(id_input)
                            .addComponent(id_line)
                            .addComponent(pass_input, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(pass_line)
                            .addComponent(confirmpass_input)
                            .addComponent(confirmpass_line)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(login_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_button)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(register_title)
                .addGap(59, 59, 59)
                .addComponent(firstname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstname_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstname_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastname_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastname_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpass_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpass_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(login_button))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_buttonActionPerformed

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        String firstname = firstname_input.getText();
     String lastname = lastname_input.getText();
     String studentid = id_input.getText();
     String firstpass = pass_input.getText();
     String secondpass = confirmpass_input.getText();
     
     
      if (firstname_input.getText().isEmpty() | lastname_input.getText().isEmpty() 
                | id_input.getText().isEmpty() | pass_input.getText().isEmpty() 
                | confirmpass_input.getText().isEmpty()){
            
         String error = "Make sure to fill out all fields.";
         JOptionPane.showMessageDialog(null, error, "Empty Field!", JOptionPane.ERROR_MESSAGE);
         pass_input.setText("");
         confirmpass_input.setText("");
        }
     
  
     //Compares firstpass with secondpass
     if (secondpass.equals(firstpass)){
       //true
     } else{
         String error = "Re-enter your passwords.";
         JOptionPane.showMessageDialog(null, error, "Passwords Do Not Match!", JOptionPane.ERROR_MESSAGE);
         pass_input.setText("");
         confirmpass_input.setText("");
     }
     
  
    }//GEN-LAST:event_register_buttonActionPerformed

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_login_buttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      //For Nimbus look
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        //Creates and displays the window
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    //Method used to set the icon of the program to be a star
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpass_input;
    private javax.swing.JLabel confirmpass_label;
    private javax.swing.JSeparator confirmpass_line;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JLabel firstname_label;
    private javax.swing.JSeparator firstname_line;
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JTextField lastname_input;
    private javax.swing.JLabel lastname_label;
    private javax.swing.JSeparator lastname_line;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JLabel pass_label;
    private javax.swing.JSeparator pass_line;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_title;
    // End of variables declaration//GEN-END:variables
}
