import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    //Variables
    private javax.swing.JLabel admin_label;
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel loginas_label;
    private javax.swing.JLabel newuser_label;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JLabel pass_label;
    private javax.swing.JSeparator pass_line;
    private javax.swing.JLabel reset_label;
    private javax.swing.JLabel starlogo_label;
    private int attempts = 3; //Num of login attempts limit
    Connection connection=null;

    
    public Login() {
        login_form();
        connection= DatabaseConnection.dbConnector();
        setTitle("Stellar Login");
        setLocationRelativeTo(null);
        staricon();
    }

    
    @SuppressWarnings("unchecked")
    private void login_form() {
    	
    	
        login_panel = new javax.swing.JPanel();
        starlogo_label = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        pass_label = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        pass_line = new javax.swing.JSeparator();
        login_button = new javax.swing.JButton();
        newuser_label = new javax.swing.JLabel();
        reset_label = new javax.swing.JLabel();
        loginas_label = new javax.swing.JLabel();
        admin_label = new javax.swing.JLabel();
        
  pass_input.addKeyListener(new KeyAdapter() {
        	
        	
        	@Override
        	public void keyPressed(KeyEvent e) {
        		if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
        			
        			try{
                        
                        String firstName = "";
                        String lastName = "";
                        String studentIDnum = "";
                        String studentID = "";
                        String studentEmail = "";
                        String Major = "";
                        String GPA = "";
                        String Year = "";
                        String Standing= "";
                        String balance = "";
                        
                         String passText = new String(pass_input.getPassword());
				
                         if (attempts == 0) {
                             JOptionPane.showMessageDialog(null, "You ran out of login attempts." +
                             "\nGoodbye.");
                             System.exit(0);
                         } 
                         
                     
                         if (id_input.getText().isEmpty() | pass_input.getText().isEmpty()){
                           
                               JOptionPane.showMessageDialog(null, "Please fill in all fields");
                           } else {
                        
                        
                                    String query="select * from students where student_id=? and password=?";
				PreparedStatement pst= connection.prepareStatement(query);
				pst.setString(1,id_input.getText());
				pst.setString(2, passText);
				ResultSet rs= pst.executeQuery();
				int count=0;
                                    
                                    while(rs.next()){
					count= count+1;
                                            firstName = rs.getString("first_name");
                                            lastName = rs.getString("last_name");
                                            studentIDnum = rs.getString("panther_num");
                                            studentID = rs.getString("student_id");
                                            studentEmail = rs.getString("email");
                                            Major = rs.getString("major");
                                            GPA = rs.getString("GPA");
                                            Year = rs.getString("school_year");
                                            balance = rs.getString("balance");
                                          
				}
				if (count == 1)
                                        
				{
                                        
                                        
                               
                                        //Calls the dashboard method and sets/displays the studentname as the input of the student id.
                                         StellarDashboard stellardash= new StellarDashboard() ;
                                         stellardash.setVisible(true);
                                         stellardash.pack();
                                         stellardash.setLocationRelativeTo(null);
                                         stellardash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                         StellarDashboard.firstname.setText(firstName);
                                         StellarDashboard.lastname.setText(lastName);
                                         StellarDashboard.studentidnum.setText(studentIDnum);
                                         StellarDashboard.studentid.setText(studentID);
                                         StellarDashboard.email.setText(studentEmail);
                                           StellarDashboard.major.setText(Major);
                                           StellarDashboard.gpa.setText(GPA);
                                           StellarDashboard.year.setText(Year);
                                           StellarDashboard.balance.setText(balance);
                                           dispose();
				     //JOptionPane.showMessageDialog(null, "Username and password is correct");
                                                    
						
				}
				else if (count >1)
				{
					 JOptionPane.showMessageDialog(null, "Duplicate Username and password " +
                             "\nLogin attempts left: " + attempts);
                     id_input.setText("");
                     pass_input.setText("");
                     attempts--;;


				}
				else {
					JOptionPane.showMessageDialog(null, "Username or password is not correct. " +
                            "\nLogin attempts left: " + attempts);
                    id_input.setText("");
                    pass_input.setText("");
                    attempts--;

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
        		
        		
        	}
        });
       
        
        
        
        /**Login Button Handling. Checks the username and password. if they're correct, the dashboard will open.
         * If the password or username is incorrect, they fields will reset. if the fields are empty they will be a message saying that
         * the fields are empty.
         */
        login_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
                    String firstName = "";
                    String lastName = "";
                    String studentIDnum = "";
                    String studentID = "";
                    String studentEmail = "";
                    String Major = "";
                    String GPA = "";
                    String Year = "";
                    String Standing = "";
                    String balance = "";

                    String passText = new String(pass_input.getPassword());

//                    while (attempts != 0) {

                    if (attempts == 0) {
                        JOptionPane.showMessageDialog(null, "You ran out of login attempts." +
                        "\nGoodbye.");
                        System.exit(0);
                    }

                    if (id_input.getText().isEmpty() | pass_input.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {
                        String query = "select * from students where student_id=? and password=?";
                        PreparedStatement pst = connection.prepareStatement(query);
                        pst.setString(1, id_input.getText());
                        pst.setString(2, passText);
                        ResultSet rs = pst.executeQuery();
                        int count = 0;

                        while (rs.next()) {
                            count = count + 1;
                            firstName = rs.getString("first_name");
                            lastName = rs.getString("last_name");
                            studentIDnum = rs.getString("panther_num");
                            studentID = rs.getString("student_id");
                            studentEmail = rs.getString("email");
                            Major = rs.getString("major");
                            GPA = rs.getString("GPA");
                            Year = rs.getString("school_year");
                            balance = rs.getString("balance");
                            //Standing = rs.getString("");

                        }

                        if (count == 1) {
                        	//Calls the dashboard method and sets/displays the studentname as the input of the student id.
                            StellarDashboard stellardash= new StellarDashboard() ;
                            stellardash.setVisible(true);
                            stellardash.pack();
                            stellardash.setLocationRelativeTo(null);
                            stellardash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            //stellardash.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            StellarDashboard.firstname.setText(firstName);
                            StellarDashboard.lastname.setText(lastName);
                            StellarDashboard.studentidnum.setText(studentIDnum);
                            StellarDashboard.studentid.setText(studentID);
                            String I = studentID.toString();
                //            StellarDashboard.setID(I);
                            StellarDashboard.email.setText(studentEmail);
                              StellarDashboard.major.setText(Major);
                              StellarDashboard.gpa.setText(GPA);
                              StellarDashboard.year.setText(Year);
                              StellarDashboard.studentFirstname.setText(firstName);
                              StellarDashboard.studentLastname.setText(lastName);
                              StellarDashboard.studentYear.setText(Year);
                              StellarDashboard.studentMajor.setText(Major);
                              StellarDashboard.balance.setText(balance);
                              
                            dispose();
                            //JOptionPane.showMessageDialog(null, "Username and password is correct");

                        } else if (count > 1) {
                            JOptionPane.showMessageDialog(null, "Duplicate Username and password " +
                                    "\nLogin attempts left: " + attempts);
                            id_input.setText("");
                            pass_input.setText("");
                            attempts--;

                        } else {
                            JOptionPane.showMessageDialog(null, "Username or password is not correct. " +
                                    "\nLogin attempts left: " + attempts);
                            id_input.setText("");
                            pass_input.setText("");
                            attempts--;
                        }

                        rs.close();
                        pst.close();
//                        }
                    }

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }
        	}
        });
        
        
      
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login_panel.setBackground(new java.awt.Color(255, 255, 255));

        starlogo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("StellarStar.png"))); 

        login_label.setFont(new java.awt.Font("Century Gothic", 1, 24)); 
        login_label.setForeground(new java.awt.Color(14, 17, 45));
        login_label.setText("Stellar Login");

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        id_label.setForeground(new java.awt.Color(11, 2, 23));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(255, 255, 255));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        id_input.setForeground(new java.awt.Color(0, 0, 0));
        id_input.setBorder(null);
        id_input.setSelectionColor(new java.awt.Color(153, 102, 255));
        id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_inputActionPerformed(evt);
            }
        });

        pass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        pass_label.setForeground(new java.awt.Color(11, 2, 23));
        pass_label.setText("Password:");

        pass_input.setBackground(new java.awt.Color(255, 255, 255));
        pass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        pass_input.setForeground(new java.awt.Color(0, 0, 0));
        pass_input.setBorder(null);
        pass_input.setSelectionColor(new java.awt.Color(153, 102, 255));

        login_button.setBackground(new java.awt.Color(14, 17, 45));
        login_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        newuser_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        newuser_label.setForeground(new java.awt.Color(14, 17, 45));
        newuser_label.setText("Forgot Password?");

        reset_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        reset_label.setForeground(new java.awt.Color(153, 0, 204));
        reset_label.setText("Reset here!");
        reset_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_labelMouseExited(evt);
            }
        });

        loginas_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        loginas_label.setForeground(new java.awt.Color(14, 17, 45));
        loginas_label.setText("Login as an");

        admin_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        admin_label.setForeground(new java.awt.Color(153, 0, 204));
        admin_label.setText("administrator");
        admin_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_input)
                            .addComponent(id_line)
                            .addComponent(pass_input)
                            .addComponent(pass_line)
                            .addGroup(login_panelLayout.createSequentialGroup()
                                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_label)
                                    .addComponent(pass_label)
                                    .addGroup(login_panelLayout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(login_panelLayout.createSequentialGroup()
                                                .addComponent(newuser_label)
                                                .addGap(4, 4, 4)
                                                .addComponent(reset_label))
                                            .addGroup(login_panelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(loginas_label)
                                                .addGap(4, 4, 4)
                                                .addComponent(admin_label)))))
                                .addGap(0, 60, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(starlogo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addComponent(login_label)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(login_label)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(starlogo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(id_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_line, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newuser_label)
                            .addComponent(reset_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginas_label)
                            .addComponent(admin_label)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                      

    private void id_inputActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void admin_labelMouseClicked(java.awt.event.MouseEvent evt) {                                         
         AdminLogin ad = new AdminLogin();
            ad.setVisible(true);
            ad.pack();
            ad.setLocationRelativeTo(null);
            ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
    }                                        

    private void admin_labelMouseEntered(java.awt.event.MouseEvent evt) {                                         
      admin_label.setForeground(new java.awt.Color(153, 102, 255));
    }                                        

    private void admin_labelMouseExited(java.awt.event.MouseEvent evt) {                                        
        admin_label.setForeground(new java.awt.Color(153, 0, 204));
    }                                       

    private void register_labelMouseExited(java.awt.event.MouseEvent evt) {                                           
        reset_label.setForeground(new java.awt.Color(153, 0, 204));
    }                                          

    private void register_labelMouseEntered(java.awt.event.MouseEvent evt) {                                            
       reset_label.setForeground(new java.awt.Color(153, 102, 255));
    }                                           

    private void register_labelMouseClicked(java.awt.event.MouseEvent evt) {                                            
       ResetPassword r = new ResetPassword();
            r.setVisible(true);
            r.pack();
            r.setLocationRelativeTo(null);
            r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
    }                                           

   
    
   private static void delay() {
	   try {
		   Thread.sleep(2000);
		   
	   } catch (java.lang.InterruptedException e) {
		   //System.out.println(e);
		   
		   
	   }
	   
	   
	   
   } 
    
    
    
    
    
     public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));
    
    }

                
}