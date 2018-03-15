import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StellarDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StellarDashboard
     */
    public StellarDashboard() {
        initComponents();
        staricon();
        setTitle("Stellar");
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        dash_panel = new javax.swing.JPanel();
        welcome_text = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        exclaim_text = new javax.swing.JLabel();
        term_text = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        studentInformation_panel = new javax.swing.JPanel();
        studentidnum_label = new javax.swing.JLabel();
        studentidnum = new javax.swing.JLabel();
        studentid_label = new javax.swing.JLabel();
        studentid = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        major = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        classes_label = new javax.swing.JLabel();
        major_label = new javax.swing.JLabel();
        gpa_label = new javax.swing.JLabel();
        year_label = new javax.swing.JLabel();
        gpa = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        info_line = new javax.swing.JSeparator();
        studentinfo_label = new javax.swing.JLabel();
        messages_panel = new javax.swing.JPanel();
        messages_label = new javax.swing.JLabel();
        finances_panel = new javax.swing.JPanel();
        finances_label = new javax.swing.JLabel();
        sidemenu = new javax.swing.JPanel();
        addclass_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        schedule_button = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        home_menu = new javax.swing.JMenu();
        registration_menu = new javax.swing.JMenu();
        schedule_menu = new javax.swing.JMenuItem();
        settings_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_panel.setBackground(new java.awt.Color(204, 204, 204));

        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("door12.png")));
        logout_button.setText("Logout");
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_buttonMouseClicked(evt);
            }
        });
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        settings_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	settings_buttonMouseClicked(evt);

            }
        });
        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                .addContainerGap(1377, Short.MAX_VALUE)
                .addComponent(logout_button)
                .addGap(19, 19, 19))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dash_panel.setBackground(new java.awt.Color(255, 255, 255));

        welcome_text.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcome_text.setForeground(new java.awt.Color(102, 102, 102));
        welcome_text.setText("Welcome,");

        firstname.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        firstname.setForeground(new java.awt.Color(102, 102, 102));
        firstname.setText("FirstName");

        exclaim_text.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        exclaim_text.setForeground(new java.awt.Color(102, 102, 102));
        exclaim_text.setText("!");

        term_text.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        term_text.setForeground(new java.awt.Color(102, 102, 102));
        term_text.setText("Spring 2018");

        lastname.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lastname.setForeground(new java.awt.Color(102, 102, 102));
        lastname.setText("LastName");

        studentInformation_panel.setBackground(new java.awt.Color(255, 255, 255));
        studentInformation_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        studentInformation_panel.setForeground(new java.awt.Color(204, 204, 204));

        studentidnum_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        studentidnum_label.setForeground(new java.awt.Color(102, 102, 102));
        studentidnum_label.setText("Student ID#:");

        studentidnum.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        studentidnum.setForeground(new java.awt.Color(102, 102, 102));
        studentidnum.setText("Student ID#");

        studentid_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        studentid_label.setForeground(new java.awt.Color(102, 102, 102));
        studentid_label.setText("Student ID:");

        studentid.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        studentid.setForeground(new java.awt.Color(102, 102, 102));
        studentid.setText("StudentID");

        email_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        email_label.setForeground(new java.awt.Color(102, 102, 102));
        email_label.setText("Email:");

        major.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        major.setForeground(new java.awt.Color(102, 102, 102));
        major.setText("Major");

        email.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("StudentEmail");

        classes_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        classes_label.setForeground(new java.awt.Color(102, 102, 102));
        classes_label.setText("Classes:");

        major_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        major_label.setForeground(new java.awt.Color(102, 102, 102));
        major_label.setText("Major:");

        gpa_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        gpa_label.setForeground(new java.awt.Color(102, 102, 102));
        gpa_label.setText("GPA:");

        year_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        year_label.setForeground(new java.awt.Color(102, 102, 102));
        year_label.setText("Current Year:");

        gpa.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        gpa.setForeground(new java.awt.Color(102, 102, 102));
        gpa.setText("GPA");

        year.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        year.setForeground(new java.awt.Color(102, 102, 102));
        year.setText("Year");

        studentinfo_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        studentinfo_label.setForeground(new java.awt.Color(102, 102, 102));
        studentinfo_label.setText("Student Information:");

        javax.swing.GroupLayout studentInformation_panelLayout = new javax.swing.GroupLayout(studentInformation_panel);
        studentInformation_panel.setLayout(studentInformation_panelLayout);
        studentInformation_panelLayout.setHorizontalGroup(
            studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info_line, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(studentInformation_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(studentidnum_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentidnum))
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(studentid_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentid))
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(email_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email))
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(major_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(major))
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(gpa_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpa))
                    .addGroup(studentInformation_panelLayout.createSequentialGroup()
                        .addComponent(year_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year))
                    .addComponent(studentinfo_label)
                    .addComponent(classes_label))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        studentInformation_panelLayout.setVerticalGroup(
            studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformation_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentinfo_label)
                .addGap(11, 11, 11)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentidnum_label)
                    .addComponent(studentidnum))
                .addGap(18, 18, 18)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentid_label)
                    .addComponent(studentid))
                .addGap(18, 18, 18)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email))
                .addGap(18, 18, 18)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(major_label)
                    .addComponent(major))
                .addGap(18, 18, 18)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpa_label)
                    .addComponent(gpa))
                .addGap(18, 18, 18)
                .addGroup(studentInformation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year_label)
                    .addComponent(year))
                .addGap(62, 62, 62)
                .addComponent(info_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classes_label)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        messages_panel.setBackground(new java.awt.Color(255, 255, 255));
        messages_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        messages_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        messages_label.setForeground(new java.awt.Color(102, 102, 102));
        messages_label.setText("Main Menu:");

        javax.swing.GroupLayout messages_panelLayout = new javax.swing.GroupLayout(messages_panel);
        messages_panel.setLayout(messages_panelLayout);
        messages_panelLayout.setHorizontalGroup(
            messages_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messages_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messages_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        messages_panelLayout.setVerticalGroup(
            messages_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messages_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messages_label)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        finances_panel.setBackground(new java.awt.Color(255, 255, 255));
        finances_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        finances_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        finances_label.setForeground(new java.awt.Color(102, 102, 102));
        finances_label.setText("Finances:");

        javax.swing.GroupLayout finances_panelLayout = new javax.swing.GroupLayout(finances_panel);
        finances_panel.setLayout(finances_panelLayout);
        finances_panelLayout.setHorizontalGroup(
            finances_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finances_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finances_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        finances_panelLayout.setVerticalGroup(
            finances_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finances_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finances_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dash_panelLayout = new javax.swing.GroupLayout(dash_panel);
        dash_panel.setLayout(dash_panelLayout);
        dash_panelLayout.setHorizontalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentInformation_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finances_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messages_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(term_text)
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(welcome_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exclaim_text, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dash_panelLayout.setVerticalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcome_text)
                    .addComponent(lastname)
                    .addComponent(firstname)
                    .addComponent(exclaim_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(term_text)
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addComponent(messages_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finances_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(studentInformation_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addclass_button.setText("Add/Drop Classes");
        addclass_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                addclass_buttonMouseClicked(evt);
            }
        });

        update_button.setText("Update Student Information");
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_buttonMouseClicked(evt);
            }
        });

        schedule_button.setText("View Schedule");

        javax.swing.GroupLayout sidemenuLayout = new javax.swing.GroupLayout(sidemenu);
        sidemenu.setLayout(sidemenuLayout);
        sidemenuLayout.setHorizontalGroup(
            sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addclass_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_button, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidemenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(schedule_button, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        sidemenuLayout.setVerticalGroup(
            sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemenuLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(addclass_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sidemenuLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(schedule_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(729, Short.MAX_VALUE)))
        );

        home_menu.setText("Home");
        menubar.add(home_menu);

        registration_menu.setText("Registration");

        schedule_menu.setText("Schedule");
        registration_menu.add(schedule_menu);

        menubar.add(registration_menu);
        
        settings_menu.setText("Settings");
        menubar.add(settings_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dash_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dash_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseClicked
         int logout_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (logout_con == 0){
            Login log = new Login();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();

        }
    }//GEN-LAST:event_logout_buttonMouseClicked

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_buttonActionPerformed


    private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked
        Admin ad = new Admin();
            ad.setVisible(true);
            ad.pack();
            ad.setLocationRelativeTo(null);
            ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //dispose();
    }//GEN-LAST:event_update_buttonMouseClicked

    private void settings_buttonMouseClicked(java.awt.event.MouseEvent evt) { //M1
    	Settings2 sett = new Settings2(this);
        sett.setVisible(true);
        sett.pack();
        sett.setLocationRelativeTo(null);
        sett.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }    
    

    //Method used to set the icon of the program to be a star
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));
    
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addclass_button;
    private javax.swing.JLabel classes_label;
    private javax.swing.JPanel dash_panel;
    public static javax.swing.JLabel email;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel exclaim_text;
    private javax.swing.JLabel finances_label;
    private javax.swing.JPanel finances_panel;
    public static javax.swing.JLabel firstname;
    public static javax.swing.JLabel gpa;
    private javax.swing.JLabel gpa_label;
    private javax.swing.JMenu home_menu;
    private javax.swing.JSeparator info_line;
    public static javax.swing.JLabel lastname;
    private javax.swing.JButton logout_button;
    public static javax.swing.JLabel major;
    private javax.swing.JLabel major_label;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel messages_label;
    private javax.swing.JPanel messages_panel;
    private javax.swing.JMenu registration_menu;
    private javax.swing.JButton schedule_button;
    private javax.swing.JMenuItem schedule_menu;
    private javax.swing.JPanel sidemenu;
    private javax.swing.JPanel studentInformation_panel;
    public static javax.swing.JLabel studentid;
    private javax.swing.JLabel studentid_label;
    public static javax.swing.JLabel studentidnum;
    private javax.swing.JLabel studentidnum_label;
    private javax.swing.JLabel studentinfo_label;
    private javax.swing.JLabel term_text;
    private javax.swing.JButton update_button;
    private javax.swing.JLabel welcome_text;
    public static javax.swing.JLabel year;
    private javax.swing.JLabel year_label;
    private javax.swing.JMenu settings_menu;
    // End of variables declaration//GEN-END:variables
}
