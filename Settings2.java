package stellar;

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
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField newp_input;
    private javax.swing.JLabel newpass_label;
    private javax.swing.JPasswordField oldp_input;
    private javax.swing.JLabel oldpass_label;
    private javax.swing.JPasswordField rep_input;
    private javax.swing.JLabel repeatnewpass_label;
    Connection connection = null;
	
	
	
	
	

    public Settings2() {
    	connection = DatabaseConnection.dbConnector();
        settings_form();
        setTitle("Change Password");
        setLocationRelativeTo(null);
        staricon();
    }

   
    @SuppressWarnings("unchecked")
    private void settings_form() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        oldpass_label = new javax.swing.JLabel();
        oldp_input = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        newpass_label = new javax.swing.JLabel();
        newp_input = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        repeatnewpass_label = new javax.swing.JLabel();
        rep_input = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        conf_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        
        
        cancel_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            }
        });
        conf_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	
                    String npassText = new String(newp_input.getPassword());
                    String repText = new String(rep_input.getPassword());
                    String idText = new String(id_input.getText());
                    String firstName = "";
                    String lastName = "";
                    
                    if (oldp_input.getText().isEmpty() | npassText.isEmpty() | repText.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {


                    	String query="select * from students where student_id=? and password=?";
    					PreparedStatement pst= connection.prepareStatement(query);
    					pst.setString(1,id_input.getText());
    					pst.setString(2, oldp_input.getText());
    					ResultSet rs= pst.executeQuery();
    					int count=0;

                        while (rs.next()) {
                            count = count + 1;

                        }
                        if (count == 1 && npassText.equals(repText) && npassText.length()>=4)

                        {

                        	String update = "update students set password = ? where student_id = ?";
                            PreparedStatement preparedStmt = connection.prepareStatement(update);
                            preparedStmt.setString   (1, npassText);
                            preparedStmt.setString(2, idText);

                            preparedStmt.executeUpdate();
                            
                        	
                        	//Calls the dashboard method and sets/displays the studentname as the input of the student id.
                        	JOptionPane.showMessageDialog(null, "Please re-logg in with your new password.");
                        	Login log = new Login();
                            log.setVisible(true);
                            log.pack();
                            log.setLocationRelativeTo(null);
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                            //dispose();
                            System.exit(0);

                           
                                

                           
                            //JOptionPane.showMessageDialog(null, "Username and password is correct");
                        } else if (count > 1) {

                            JOptionPane.showMessageDialog(null, "Duplicate Username and password");
                            oldp_input.setText("");
                            newp_input.setText("");
                            rep_input.setText("");
                            

                        } 
                        else if (npassText.length()>=4 == false) {
                            JOptionPane.showMessageDialog(null, "The new password is too short.");
                            newp_input.setText("");
                            rep_input.setText("");
                    
                        
                    }else if (npassText.equals(repText) == false) {
                            JOptionPane.showMessageDialog(null, "The new password does not match.");
                            newp_input.setText("");
                            rep_input.setText("");
                    }
                        else {
                            JOptionPane.showMessageDialog(null, "Username or password is not correct. Try Again.");
                            oldp_input.setText("");
                            newp_input.setText("");
                            rep_input.setText("");

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

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        id_label.setForeground(new java.awt.Color(11, 2, 23));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(255, 255, 255));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        id_input.setBorder(null);
        id_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        oldpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        oldpass_label.setForeground(new java.awt.Color(11, 2, 23));
        oldpass_label.setText("Old Password:");

        oldp_input.setBackground(new java.awt.Color(255, 255, 255));
        oldp_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        oldp_input.setBorder(null);
        oldp_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        newpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
        newpass_label.setForeground(new java.awt.Color(11, 2, 23));
        newpass_label.setText("New Password:");

        newp_input.setBackground(new java.awt.Color(255, 255, 255));
        newp_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        newp_input.setBorder(null);
        newp_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        repeatnewpass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        repeatnewpass_label.setForeground(new java.awt.Color(11, 2, 23));
        repeatnewpass_label.setText("Repeat New Password:");

        rep_input.setBackground(new java.awt.Color(255, 255, 255));
        rep_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        rep_input.setBorder(null);
        rep_input.setSelectionColor(new java.awt.Color(153, 102, 255));

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
                            .addComponent(repeatnewpass_label)
                            .addComponent(newpass_label)
                            .addComponent(oldpass_label)
                            .addComponent(id_label)
                            .addComponent(id_input)
                            .addComponent(jSeparator1)
                            .addComponent(oldp_input)
                            .addComponent(jSeparator2)
                            .addComponent(newp_input)
                            .addComponent(jSeparator3)
                            .addComponent(rep_input, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
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
                .addComponent(id_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldp_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newp_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repeatnewpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rep_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    
    
    
    private class ChangePassword extends StellarDashboard{
    	
    	
    	
    }
              
}
