import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Settings2 extends javax.swing.JFrame {
	
	
	

    
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton conf_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField new_password_input;
    private javax.swing.JLabel newpass_label;
    private javax.swing.JPasswordField old_password_input;
    private javax.swing.JLabel oldpass_label;
    private javax.swing.JPasswordField repeat_password_input;
    private javax.swing.JLabel repeatnewpass_label;
    private javax.swing.JLabel reqs_label;
    private StellarDashboard dashboard;
    Connection connection = null;
    String studentID;
	
	
	
	
	

    public Settings2(StellarDashboard dashboard) {
    	this.dashboard = dashboard;
    	connection = DatabaseConnection.dbConnector();
        settings_form();
        setTitle("Change Password");
        setLocationRelativeTo(null);
        staricon();
    }
    
    void setID(String I){        // GADD
    	studentID = I;
    }

   
    @SuppressWarnings("unchecked")
    private void settings_form() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        oldpass_label = new javax.swing.JLabel();
        old_password_input = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        newpass_label = new javax.swing.JLabel();
        new_password_input = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        repeatnewpass_label = new javax.swing.JLabel();
        repeat_password_input = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        reqs_label = new javax.swing.JLabel();
        conf_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        
        
        cancel_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            }
        });
        conf_button.addActionListener(new ActionListener() {  //GADD
            public void actionPerformed(ActionEvent e) {
            	try {

                    String new_pw_text = new String(new_password_input.getPassword());
                    String repeat_pw_Text = new String(repeat_password_input.getPassword());
                    final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*[0-9]).{4,}$";
                    

                    if (old_password_input.getText().isEmpty() | new_pw_text.isEmpty() | repeat_pw_Text.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {
                    	String studentID2 = studentID.toString();
                        String query = "SELECT * FROM students WHERE student_id=? AND password=?";
                        PreparedStatement pst = connection.prepareStatement(query);
                        pst.setString(1, studentID2);
                        pst.setString(2, old_password_input.getText());
                        ResultSet rs = pst.executeQuery();


                        if (new_pw_text.equals(old_password_input.getText())) {
                            JOptionPane.showMessageDialog(null, "Cannot change to the same password.");
                            new_password_input.setText("");
                            repeat_password_input.setText("");
                        } else if (new_pw_text.equals(repeat_pw_Text) && new_pw_text.length() >= 4
                                && !new_pw_text.equals(old_password_input.getText()) && new_pw_text.matches(PASSWORD_REGEX)) {

                            String update = "UPDATE students SET password = ? WHERE student_id = ?";
                            PreparedStatement preparedStmt = connection.prepareStatement(update);
                            preparedStmt.setString(1, new_pw_text);
                            preparedStmt.setString(2, studentID2);

                            preparedStmt.executeUpdate();

                            //Calls the dashboard method and sets/displays the studentname as the input of the student id.
                            JOptionPane.showMessageDialog(null, "Please re-login with your new password.");

                            dashboard.dispose();

                            Login log = new Login();
                            log.setVisible(true);
                            log.pack();
                            log.setLocationRelativeTo(null);
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();


                            //JOptionPane.showMessageDialog(null, "Username and password is correct");
                        } else if (new_pw_text.length() < 4) {
                            JOptionPane.showMessageDialog(null, "The new password is too short.");
                            new_password_input.setText("");
                            repeat_password_input.setText("");


                        } else if (!new_pw_text.equals(repeat_pw_Text)) {
                            JOptionPane.showMessageDialog(null, "The new password does not match.");
                            new_password_input.setText("");
                            repeat_password_input.setText("");
                        } else if (!new_pw_text.matches(PASSWORD_REGEX)) {
                            JOptionPane.showMessageDialog(null, "The password does not meet requirements." +
                                    "\nRequirements: 1 upper case, 1 lower case, 1 number, >= 4 characters");
                            new_password_input.setText("");
                            repeat_password_input.setText("");
 
                        } else {
                            JOptionPane.showMessageDialog(null, "Username or password is not correct. Try Again.");
                            old_password_input.setText("");
                            new_password_input.setText("");
                            repeat_password_input.setText("");
                        }


                        rs.close();
                        pst.close();
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }
                
                
              
            }
        });
        
        
       
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(14, 17, 45));
        jLabel1.setText("Change Password");

        oldpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        oldpass_label.setForeground(new java.awt.Color(11, 2, 23));
        oldpass_label.setText("Old Password:");

        old_password_input.setBackground(new java.awt.Color(255, 255, 255));
        old_password_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        old_password_input.setBorder(null);
        old_password_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        newpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
        newpass_label.setForeground(new java.awt.Color(11, 2, 23));
        newpass_label.setText("New Password:");

        new_password_input.setBackground(new java.awt.Color(255, 255, 255));
        new_password_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        new_password_input.setBorder(null);
        new_password_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        repeatnewpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        repeatnewpass_label.setForeground(new java.awt.Color(11, 2, 23));
        repeatnewpass_label.setText("Repeat New Password:");

        repeat_password_input.setBackground(new java.awt.Color(255, 255, 255));
        repeat_password_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        repeat_password_input.setBorder(null);
        repeat_password_input.setSelectionColor(new java.awt.Color(153, 102, 255));
        
        reqs_label.setFont(new java.awt.Font("Century Gothic", 1, 10)); 
        reqs_label.setForeground(new java.awt.Color(11, 2, 23));
        reqs_label.setText("*Password must have more then three digits, must have one capital letter and one number.");

        conf_button.setBackground(new java.awt.Color(14, 17, 45));
        conf_button.setFont(new java.awt.Font("Century Gothic", 1, 12));
        conf_button.setForeground(new java.awt.Color(255, 255, 255));
        conf_button.setText("Confirm");

        cancel_button.setBackground(new java.awt.Color(14, 17, 45));
        cancel_button.setFont(new java.awt.Font("Century Gothic", 1, 12));
        cancel_button.setForeground(new java.awt.Color(255, 255, 255));
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reqs_label)
                        	.addComponent(repeatnewpass_label)
                            .addComponent(newpass_label)
                            .addComponent(oldpass_label)
                            .addComponent(old_password_input)
                            .addComponent(jSeparator2)
                            .addComponent(new_password_input)
                            .addComponent(jSeparator3)
                            .addComponent(repeat_password_input, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel_button)
                            .addComponent(conf_button))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(old_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(new_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repeatnewpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repeat_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(reqs_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGap(18, 18, 18)
                .addComponent(conf_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel_button)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                      

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

   
    
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));
    
    }
    
    
    

              
}
