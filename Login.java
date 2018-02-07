import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_title;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel newuser_label;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JLabel pass_label;
    private javax.swing.JSeparator pass_line;
    private javax.swing.JButton register_button;  
    Connection connection=null;
 
    
    //Login form
    public Login() {
        login_form();
		connection= DatabaseConnection.dbConnector();
        staricon();
        setTitle("Stellar Login");
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")                          
    private void login_form() {

        main_panel = new javax.swing.JPanel();
        login_title = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        pass_label = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        pass_line = new javax.swing.JSeparator();
        login_button = new javax.swing.JButton();
        login_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try{
					String query="select * from students where student_id=? and passqord=?";
					PreparedStatement pst= connection.prepareStatement(query);
					pst.setString(1,id_input.getText());
					pst.setString(2,pass_input.getText());
					ResultSet rs= pst.executeQuery();
					int count=0;
					while(rs.next()){
						count= count+1;
					}
					if (count == 1)
					{
							JOptionPane.showMessageDialog(null, "Username and password is correct");
							
					}
					else if (count >1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");

					}
					else {
						JOptionPane.showMessageDialog(null, "Username or password is not correct Try Again");

					}
					rs.close();
					pst.close();
					}

				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
        	}
        });
        newuser_label = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Setting the background and fonts

        main_panel.setBackground(new java.awt.Color(33, 16, 27));
        main_panel.setMaximumSize(new java.awt.Dimension(680, 500));
        main_panel.setMinimumSize(new java.awt.Dimension(680, 500));

        login_title.setFont(new java.awt.Font("Dialog", 1, 18)); 
        login_title.setForeground(new java.awt.Color(255, 255, 255));
        login_title.setText("Login");

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        id_label.setForeground(new java.awt.Color(255, 255, 255));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(33, 16, 27));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        id_input.setForeground(new java.awt.Color(255, 255, 255));
        id_input.setBorder(null);
        id_input.setCaretColor(new java.awt.Color(255, 255, 255));
        id_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        pass_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        pass_label.setForeground(new java.awt.Color(255, 255, 255));
        pass_label.setText("Password:");

        pass_input.setBackground(new java.awt.Color(33, 16, 27));
        pass_input.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        pass_input.setForeground(new java.awt.Color(255, 255, 255));
        pass_input.setBorder(null);
        pass_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        login_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        login_button.setText("Login");

        newuser_label.setForeground(new java.awt.Color(255, 255, 255));
        newuser_label.setText("New User? Register here:");

        register_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        register_button.setText("Register");
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
           
            //Event Listeners
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            }
        });
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        
        
       //Panel Layout
        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass_label)
                            .addComponent(id_label)
                            .addComponent(id_input)
                            .addComponent(id_line)
                            .addComponent(pass_input, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(pass_line)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(newuser_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register_button)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(login_title)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_title)
                .addGap(50, 50, 50)
                .addComponent(id_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newuser_label)
                    .addComponent(register_button))
                .addContainerGap(162, Short.MAX_VALUE))
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
    }
    
    
    //Handling 
    
    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               
 
    
    //Method used to set the icon of the program to be a star
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));
    
    }
    
                   
                    
}
