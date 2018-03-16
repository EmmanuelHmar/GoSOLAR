package stellar;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLogin extends javax.swing.JFrame {

    private javax.swing.JButton adminLogin_button;
    private javax.swing.JPanel adminLogin_panel;
    private javax.swing.JPasswordField adminPass_input;
    private javax.swing.JLabel adminPass_label;
    private javax.swing.JTextField adminUsername_input;
    private javax.swing.JLabel adminUsername_label;
    private javax.swing.JLabel adminlogin_label;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginasa_label;
    private javax.swing.JLabel student_label;
	Connection connection=null;

    public AdminLogin() {
    	connection= DatabaseConnection.dbConnector();
        adminLogin();
        setTitle("Stellar Administrator Login");
        setLocationRelativeTo(null);
        staricon();
    }

   
    @SuppressWarnings("unchecked")                
    private void adminLogin() {

        adminLogin_panel = new javax.swing.JPanel();
        adminlogin_label = new javax.swing.JLabel();
        adminUsername_label = new javax.swing.JLabel();
        adminUsername_input = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        adminPass_label = new javax.swing.JLabel();
        adminPass_input = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        adminLogin_button = new javax.swing.JButton();
        loginasa_label = new javax.swing.JLabel();
        student_label = new javax.swing.JLabel();
        
        
        
        adminLogin_button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		try{
                    
                    
                     String passText = new String(adminPass_input.getPassword());
			
                       if (adminUsername_input.getText().isEmpty() | adminPass_input.getText().isEmpty()){
                       
                           JOptionPane.showMessageDialog(null, "Please fill in all fields");
                       } else {
                    
                    
                                String query="select * from admin where username=? and password=?";
			PreparedStatement pst= connection.prepareStatement(query);
			pst.setString(1,adminUsername_input.getText());
			pst.setString(2, passText);
			ResultSet rs= pst.executeQuery();
			int count=0;
                                
                                while(rs.next()){
				count= count+1;
                                       
                                       
                                      
			}
			if (count == 1)
                                    
			{
                                    
                           
                                    //Calls the dashboard method and sets/displays the studentname as the input of the student id.
                                     Admin ad= new Admin() ;
                                     ad.setVisible(true);
                                     ad.pack();
                                     ad.setLocationRelativeTo(null);
                                     ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                     //ad.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                     dispose();
			     //JOptionPane.showMessageDialog(null, "Username and password is correct");
                                                
					
			}
			else if (count >1)
			{
				JOptionPane.showMessageDialog(null, "Duplicate Username and password");
				                        adminUsername_input.setText("");
                                        adminPass_input.setText("");


			}
			else {
				JOptionPane.showMessageDialog(null, "Username or password is not correct. Try Again.");
				                        adminUsername_input.setText("");
                                        adminPass_input.setText("");

			}
               
                                
			rs.close();
			pst.close();
			}
                       }
                

		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null, e1);
		}
        		
        		
        		
        		
        		
        		
        		
        		
        		
        	}
        });
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        adminLogin_panel.setBackground(new java.awt.Color(255, 255, 255));

        adminlogin_label.setFont(new java.awt.Font("Century Gothic", 1, 24)); 
        adminlogin_label.setForeground(new java.awt.Color(14, 17, 45));
        adminlogin_label.setText("Adminstrator Login");

        adminUsername_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        adminUsername_label.setForeground(new java.awt.Color(11, 2, 23));
        adminUsername_label.setText("Username:");

        adminUsername_input.setBackground(new java.awt.Color(255, 255, 255));
        adminUsername_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        adminUsername_input.setBorder(null);
        adminUsername_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        adminPass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        adminPass_label.setForeground(new java.awt.Color(11, 2, 23));
        adminPass_label.setText("Password:");

        adminPass_input.setBackground(new java.awt.Color(255, 255, 255));
        adminPass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        adminPass_input.setBorder(null);
        adminPass_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        adminLogin_button.setBackground(new java.awt.Color(14, 17, 45));
        adminLogin_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        adminLogin_button.setForeground(new java.awt.Color(255, 255, 255));
        adminLogin_button.setText("Login");

        loginasa_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        loginasa_label.setForeground(new java.awt.Color(11, 2, 23));
        loginasa_label.setText("Login as a");

        student_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        student_label.setForeground(new java.awt.Color(153, 0, 204));
        student_label.setText("student");
        student_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout adminLogin_panelLayout = new javax.swing.GroupLayout(adminLogin_panel);
        adminLogin_panel.setLayout(adminLogin_panelLayout);
        adminLogin_panelLayout.setHorizontalGroup(
            adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLogin_panelLayout.createSequentialGroup()
                .addGroup(adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLogin_panelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminPass_label)
                            .addComponent(adminUsername_label)
                            .addComponent(adminUsername_input)
                            .addComponent(jSeparator1)
                            .addComponent(adminPass_input, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(adminLogin_panelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(adminlogin_label)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLogin_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminLogin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminLogin_panelLayout.createSequentialGroup()
                        .addComponent(loginasa_label)
                        .addGap(4, 4, 4)
                        .addComponent(student_label)))
                .addGap(194, 194, 194))
        );
        adminLogin_panelLayout.setVerticalGroup(
            adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLogin_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminlogin_label)
                .addGap(35, 35, 35)
                .addComponent(adminUsername_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminUsername_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminPass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminPass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLogin_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminLogin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginasa_label)
                    .addComponent(student_label))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLogin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLogin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                      

    private void student_labelMouseEntered(java.awt.event.MouseEvent evt) {                                           
        student_label.setForeground(new java.awt.Color(153, 102, 255));
    }                                          

    private void student_labelMouseExited(java.awt.event.MouseEvent evt) {                                          
        student_label.setForeground(new java.awt.Color(153, 0, 204));
    }                                         

    private void student_labelMouseClicked(java.awt.event.MouseEvent evt) {                                           
       Login l = new Login();
            l.setVisible(true);
            l.pack();
            l.setLocationRelativeTo(null);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
    }                                          

   
    
     public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));
    
    }

}
