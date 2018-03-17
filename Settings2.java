import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class Settings2 extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    private javax.swing.JTextField id_input;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField old_password_input;
    private javax.swing.JLabel old_password_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JSeparator old_password_line;
    private javax.swing.JButton confirm_button;
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel sett_title;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPasswordField new_password_input;
    private javax.swing.JPasswordField repeat_password_input;
    private javax.swing.JLabel new_pass;
    private javax.swing.JSeparator pass_line;
    private javax.swing.JSeparator rep_line;
    private javax.swing.JLabel rep_pass;
    private StellarDashboard dashboard;
    Connection connection = null;

    /**
     * Constructor that calls the login_form method, the method for the star icon,
     * sets the title to "Stellar Login", and sets the windows location to be in the center of the screen.
     */
    public Settings2(StellarDashboard dashboard) {
        this.dashboard = dashboard;
        settings_form();

        //Connects to the database
        connection = DatabaseConnection.dbConnector();
        staricon();
        setTitle("Stellar Settings");
        setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    private void settings_form() {

        main_panel = new javax.swing.JPanel();
        sett_title = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_input = new javax.swing.JTextField();
        old_password_label = new javax.swing.JLabel();
        old_password_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        old_password_line = new javax.swing.JSeparator();
        new_pass = new javax.swing.JLabel();
        rep_pass = new javax.swing.JLabel();
        new_password_input = new javax.swing.JPasswordField();
        repeat_password_input = new javax.swing.JPasswordField();
        pass_line = new javax.swing.JSeparator();
        rep_line = new javax.swing.JSeparator();
        confirm_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        cancel_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        confirm_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    String new_pw_text = new String(new_password_input.getPassword());
                    String repeat_pw_Text = new String(repeat_password_input.getPassword());
                    String idText = new String(id_input.getText());
                    String firstName = "";
                    String lastName = "";

                    if (old_password_input.getText().isEmpty() | new_pw_text.isEmpty() | repeat_pw_Text.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {
                        String query = "SELECT * FROM students WHERE student_id=? AND password=?";
                        PreparedStatement pst = connection.prepareStatement(query);
                        pst.setString(1, id_input.getText());
                        pst.setString(2, old_password_input.getText());
                        ResultSet rs = pst.executeQuery();
                        int count = 0;

                        while (rs.next()) {
                            count = count + 1;
                        }

                        if (new_pw_text.equals(old_password_input.getText())) {
                            JOptionPane.showMessageDialog(null, "Cannot change to the same password.");
                            new_password_input.setText("");
                            repeat_password_input.setText("");
                        } else if (count == 1 && new_pw_text.equals(repeat_pw_Text) && new_pw_text.length() >= 4
                                && !new_pw_text.equals(old_password_input.getText())) {

                            String update = "UPDATE students SET password = ? WHERE student_id = ?";
                            PreparedStatement preparedStmt = connection.prepareStatement(update);
                            preparedStmt.setString(1, new_pw_text);
                            preparedStmt.setString(2, idText);

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
                        } else if (count > 1) {
                            JOptionPane.showMessageDialog(null, "Duplicate Username and password");
                            old_password_input.setText("");
                            new_password_input.setText("");
                            repeat_password_input.setText("");

                        } else if (new_pw_text.length() < 4) {
                            JOptionPane.showMessageDialog(null, "The new password is too short.");
                            new_password_input.setText("");
                            repeat_password_input.setText("");


                        } else if (!new_pw_text.equals(repeat_pw_Text)) {
                            JOptionPane.showMessageDialog(null, "The new password does not match.");
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

//	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Setting the background and fonts

        main_panel.setBackground(new java.awt.Color(255, 248, 234));
        main_panel.setMaximumSize(new java.awt.Dimension(680, 500));
        main_panel.setMinimumSize(new java.awt.Dimension(680, 500));

        sett_title.setFont(new java.awt.Font("Dialog", 1, 18));
        sett_title.setForeground(new java.awt.Color(51, 51, 51));
        sett_title.setText("Change Password");

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
        id_label.setForeground(new java.awt.Color(51, 51, 51));
        id_label.setText("Student ID:");

        id_input.setBackground(new java.awt.Color(255, 248, 234));
        id_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        id_input.setForeground(new java.awt.Color(51, 51, 51));
        id_input.setBorder(null);
        id_input.setCaretColor(new java.awt.Color(51, 51, 51));
        id_input.setSelectionColor(new java.awt.Color(255, 215, 73));

        old_password_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
        old_password_label.setForeground(new java.awt.Color(51, 51, 51));
        old_password_label.setText("Old Password:");

        old_password_input.setBackground(new java.awt.Color(255, 248, 234));
        old_password_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        old_password_input.setForeground(new java.awt.Color(51, 51, 51));
        old_password_input.setBorder(null);
        old_password_input.setCaretColor(new java.awt.Color(51, 51, 51));
        old_password_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        new_pass.setFont(new java.awt.Font("Century Gothic", 1, 14));
        new_pass.setForeground(new java.awt.Color(51, 51, 51));
        new_pass.setText("New Password:");

        new_password_input.setBackground(new java.awt.Color(255, 248, 234));
        new_password_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        new_password_input.setForeground(new java.awt.Color(51, 51, 51));
        new_password_input.setBorder(null);
        new_password_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        rep_pass.setFont(new java.awt.Font("Century Gothic", 1, 14));
        rep_pass.setForeground(new java.awt.Color(51, 51, 51));
        rep_pass.setText("Repeat New Password:");

        repeat_password_input.setBackground(new java.awt.Color(255, 248, 234));
        repeat_password_input.setFont(new java.awt.Font("DialogInput", 0, 18));
        repeat_password_input.setForeground(new java.awt.Color(51, 51, 51));
        repeat_password_input.setBorder(null);
        repeat_password_input.setSelectionColor(new java.awt.Color(255, 153, 102));

        confirm_button.setFont(new java.awt.Font("Century Gothic", 1, 12));
        confirm_button.setText("Confirm");

        cancel_button.setFont(new java.awt.Font("Century Gothic", 1, 12));
        cancel_button.setText("Cancel");


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
                                                        .addComponent(id_label)
                                                        .addComponent(id_input)
                                                        .addComponent(new_pass)
                                                        .addComponent(rep_pass)
                                                        .addComponent(old_password_label)
                                                        .addComponent(old_password_input)
                                                        .addComponent(id_line)
                                                        .addComponent(old_password_line)
                                                        .addComponent(new_password_input, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                                        .addComponent(repeat_password_input, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                                        .addComponent(pass_line)
                                                        .addComponent(rep_line)))
                                        .addGroup(main_panelLayout.createSequentialGroup()
                                                .addGap(237, 237, 237)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        ))
                                .addContainerGap(122, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                                .addComponent(sett_title)
                                                .addGap(316, 316, 316))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                                .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(270, 270, 270))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(270, 270, 270))))
        );
        main_panelLayout.setVerticalGroup(
                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sett_title)
                                .addGap(50, 50, 50)
                                .addComponent(id_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(old_password_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(old_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(old_password_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(new_pass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(new_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pass_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rep_pass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(repeat_password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rep_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
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


    //Method used to set the icon of the program to be a star
    public void staricon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));

    }
}
