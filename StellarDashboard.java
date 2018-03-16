package stellar;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class StellarDashboard extends javax.swing.JFrame {

	private javax.swing.JLabel Schedule_label;
    private javax.swing.JPanel addClass_panel;
    private javax.swing.JButton addclass_button;
    private javax.swing.JLabel addclasstitle_label;
    private javax.swing.JList<String> classes_list;
    private javax.swing.JTable classes_table;
    private javax.swing.JScrollPane classeslist_scroll;
    private javax.swing.JScrollPane classestable_scroll;
    private javax.swing.JLabel concentration_label;
    private javax.swing.JTextField courseid_input;
    private javax.swing.JLabel courseid_label;
    private javax.swing.JComboBox<String> credits_combobox;
    private javax.swing.JLabel credits_label;
    private javax.swing.JMenuItem dash_menu;
    private javax.swing.JPanel dash_panel;
    private javax.swing.JLabel days_label;
    public static javax.swing.JLabel email;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel exclaim_text;
    public static javax.swing.JLabel firstname;
    private javax.swing.JCheckBox fri_check;
    public static javax.swing.JLabel gpa;
    private javax.swing.JLabel gpa_label;
    private javax.swing.JMenu home_menu;
    private javax.swing.JLabel instructor_label;
    private javax.swing.JList<String> instructor_list;
    private javax.swing.JScrollPane instructor_scroll;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lastname;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel mainpanel;
    public static javax.swing.JLabel major;
    private javax.swing.JLabel major_label;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mntmChangePassword;
    private javax.swing.JCheckBox mon_check;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton register_button;
    private javax.swing.JScrollPane registration_menu;
    private javax.swing.JCheckBox sat_check;
    private javax.swing.JButton schedule_button;
    private javax.swing.JList<String> schedule_list;
    private javax.swing.JScrollPane schedulelist_scroll;
    private javax.swing.JComboBox<String> semester_combobox;
    private javax.swing.JLabel semester_label;
    private javax.swing.JMenu setting_menu;
    private javax.swing.JPanel sidemenu;
    private javax.swing.JLabel starimage;
    private javax.swing.JLabel studentCon;
    private javax.swing.JLabel studentFirstname;
    private javax.swing.JLabel studentLastname;
    private javax.swing.JLabel studentMajor;
    private javax.swing.JLabel studentMajor_label;
    private javax.swing.JLabel studentYear;
    private javax.swing.JLabel studentYear_label;
    public static javax.swing.JLabel studentid;
    private javax.swing.JLabel studentid_label;
    public static javax.swing.JLabel studentidnum;
    private javax.swing.JLabel studentidnum_label;
    private javax.swing.JLabel studentinfo_label;
    private javax.swing.JLabel subject_label;
    private javax.swing.JList<String> subject_list;
    private javax.swing.JScrollPane subjectlist_scroll;
    private javax.swing.JCheckBox sun_check;
    private javax.swing.JLabel term_text;
    private javax.swing.JCheckBox thur_check;
    private javax.swing.JLabel totalcredits;
    private javax.swing.JLabel totalcredits_label;
    private javax.swing.JCheckBox tue_check;
    private javax.swing.JPanel viewSchedule_panel;
    private javax.swing.JCheckBox wed_check;
    private javax.swing.JLabel welcome_text;
    public static javax.swing.JLabel year;
    private javax.swing.JLabel year_label;
    
    
	
    public StellarDashboard() {
        initComponents();
         setTitle("Stellar");
        setLocationRelativeTo(null);
        staricon();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        sidemenu = new javax.swing.JPanel();
        schedule_button = new javax.swing.JButton();
        addclass_button = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        dash_panel = new javax.swing.JPanel();
        starimage = new javax.swing.JLabel();
        welcome_text = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        term_text = new javax.swing.JLabel();
        studentinfo_label = new javax.swing.JLabel();
        studentidnum_label = new javax.swing.JLabel();
        studentidnum = new javax.swing.JLabel();
        studentid_label = new javax.swing.JLabel();
        studentid = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        major_label = new javax.swing.JLabel();
        major = new javax.swing.JLabel();
        gpa_label = new javax.swing.JLabel();
        gpa = new javax.swing.JLabel();
        year_label = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        exclaim_text = new javax.swing.JLabel();
        viewSchedule_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        studentFirstname = new javax.swing.JLabel();
        studentLastname = new javax.swing.JLabel();
        studentYear_label = new javax.swing.JLabel();
        studentYear = new javax.swing.JLabel();
        concentration_label = new javax.swing.JLabel();
        studentMajor_label = new javax.swing.JLabel();
        Schedule_label = new javax.swing.JLabel();
        studentCon = new javax.swing.JLabel();
        schedulelist_scroll = new javax.swing.JScrollPane();
        schedule_list = new javax.swing.JList<>();
        totalcredits = new javax.swing.JLabel();
        totalcredits_label = new javax.swing.JLabel();
        studentMajor = new javax.swing.JLabel();
        addClass_panel = new javax.swing.JPanel();
        registration_menu = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        semester_label = new javax.swing.JLabel();
        semester_combobox = new javax.swing.JComboBox<>();
        subject_label = new javax.swing.JLabel();
        subjectlist_scroll = new javax.swing.JScrollPane();
        subject_list = new javax.swing.JList<>();
        courseid_label = new javax.swing.JLabel();
        courseid_input = new javax.swing.JTextField();
        days_label = new javax.swing.JLabel();
        credits_combobox = new javax.swing.JComboBox<>();
        credits_label = new javax.swing.JLabel();
        mon_check = new javax.swing.JCheckBox();
        tue_check = new javax.swing.JCheckBox();
        wed_check = new javax.swing.JCheckBox();
        thur_check = new javax.swing.JCheckBox();
        fri_check = new javax.swing.JCheckBox();
        sat_check = new javax.swing.JCheckBox();
        sun_check = new javax.swing.JCheckBox();
        instructor_label = new javax.swing.JLabel();
        instructor_scroll = new javax.swing.JScrollPane();
        instructor_list = new javax.swing.JList<>();
        addclasstitle_label = new javax.swing.JLabel();
        classestable_scroll = new javax.swing.JScrollPane();
        classes_table = new javax.swing.JTable();
        register_button = new javax.swing.JButton();
        classeslist_scroll = new javax.swing.JScrollPane();
        classes_list = new javax.swing.JList<>();
        errorMessage = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        home_menu = new javax.swing.JMenu();
        dash_menu = new javax.swing.JMenuItem();
        setting_menu = new javax.swing.JMenu();
        mntmChangePassword = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menu_panel.setBackground(new java.awt.Color(194, 185, 198));

        logout_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("door12.png"))); 
        logout_button.setText("Logout");
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button)
                .addGap(22, 22, 22))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout_button)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        sidemenu.setBackground(new java.awt.Color(14, 17, 45));

        schedule_button.setBackground(new java.awt.Color(14, 17, 45));
        schedule_button.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        schedule_button.setForeground(new java.awt.Color(255, 255, 255));
        schedule_button.setText("View Schedule");
        schedule_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedule_buttonActionPerformed(evt);
            }
        });

        addclass_button.setBackground(new java.awt.Color(14, 17, 45));
        addclass_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        addclass_button.setForeground(new java.awt.Color(255, 255, 255));
        addclass_button.setText("Add/Drop Classes");
        addclass_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclass_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidemenuLayout = new javax.swing.GroupLayout(sidemenu);
        sidemenu.setLayout(sidemenuLayout);
        sidemenuLayout.setHorizontalGroup(
            sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidemenuLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addclass_button, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedule_button, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        sidemenuLayout.setVerticalGroup(
            sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemenuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(schedule_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addclass_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpanel.setLayout(new java.awt.CardLayout());

        dash_panel.setBackground(new java.awt.Color(255, 255, 255));

        starimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("StellarAccents.png"))); 

        welcome_text.setFont(new java.awt.Font("Century Gothic", 1, 24)); 
        welcome_text.setForeground(new java.awt.Color(102, 102, 102));
        welcome_text.setText("Welcome,");

        firstname.setFont(new java.awt.Font("Century Gothic", 1, 36)); 
        firstname.setForeground(new java.awt.Color(102, 102, 102));
        firstname.setText("FirstName");

        lastname.setFont(new java.awt.Font("Century Gothic", 1, 36)); 
        lastname.setForeground(new java.awt.Color(102, 102, 102));
        lastname.setText("LastName");

        term_text.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        term_text.setForeground(new java.awt.Color(102, 102, 102));
        term_text.setText("Spring 2018");

        studentinfo_label.setFont(new java.awt.Font("Century Gothic", 1, 18));
        studentinfo_label.setForeground(new java.awt.Color(102, 102, 102));
        studentinfo_label.setText("Student Information:");

        studentidnum_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        studentidnum_label.setForeground(new java.awt.Color(102, 102, 102));
        studentidnum_label.setText("Student ID#:");

        studentidnum.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        studentidnum.setForeground(new java.awt.Color(102, 102, 102));
        studentidnum.setText("Student ID#");

        studentid_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        studentid_label.setForeground(new java.awt.Color(102, 102, 102));
        studentid_label.setText("Student ID:");

        studentid.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        studentid.setForeground(new java.awt.Color(102, 102, 102));
        studentid.setText("StudentID");

        email_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        email_label.setForeground(new java.awt.Color(102, 102, 102));
        email_label.setText("Email:");

        email.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("StudentEmail");

        major_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        major_label.setForeground(new java.awt.Color(102, 102, 102));
        major_label.setText("Major:");

        major.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        major.setForeground(new java.awt.Color(102, 102, 102));
        major.setText("Major");

        gpa_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        gpa_label.setForeground(new java.awt.Color(102, 102, 102));
        gpa_label.setText("GPA:");

        gpa.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        gpa.setForeground(new java.awt.Color(102, 102, 102));
        gpa.setText("GPA");

        year_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); 
        year_label.setForeground(new java.awt.Color(102, 102, 102));
        year_label.setText("Current Year:");

        year.setFont(new java.awt.Font("Century Gothic", 0, 20)); 
        year.setForeground(new java.awt.Color(102, 102, 102));
        year.setText("Year");

        exclaim_text.setFont(new java.awt.Font("Century Gothic", 1, 36)); 
        exclaim_text.setForeground(new java.awt.Color(102, 102, 102));
        exclaim_text.setText("!");

        javax.swing.GroupLayout dash_panelLayout = new javax.swing.GroupLayout(dash_panel);
        dash_panel.setLayout(dash_panelLayout);
        dash_panelLayout.setHorizontalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dash_panelLayout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(studentidnum_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentidnum))
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(studentid_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentid))
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(email_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email))
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(major_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(major))
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(gpa_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gpa))
                            .addGroup(dash_panelLayout.createSequentialGroup()
                                .addComponent(year_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year))
                            .addComponent(studentinfo_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                        .addComponent(starimage))))
        );
        dash_panelLayout.setVerticalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(starimage))
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastname)
                        .addComponent(exclaim_text))
                    .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(welcome_text)
                        .addComponent(firstname)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(term_text)
                .addGap(31, 31, 31)
                .addComponent(studentinfo_label)
                .addGap(11, 11, 11)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentidnum_label)
                    .addComponent(studentidnum))
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentid_label)
                    .addComponent(studentid))
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email))
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(major_label)
                    .addComponent(major))
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpa_label)
                    .addComponent(gpa))
                .addGap(18, 18, 18)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year_label)
                    .addComponent(year))
                .addGap(0, 312, Short.MAX_VALUE))
        );

        mainpanel.add(dash_panel, "card5");

        viewSchedule_panel.setBackground(new java.awt.Color(255, 255, 255));

        name_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        name_label.setForeground(new java.awt.Color(102, 102, 102));
        name_label.setText("Name:");

        studentFirstname.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentFirstname.setForeground(new java.awt.Color(102, 102, 102));
        studentFirstname.setText("Fname");

        studentLastname.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentLastname.setForeground(new java.awt.Color(102, 102, 102));
        studentLastname.setText("Lname");

        studentYear_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentYear_label.setForeground(new java.awt.Color(102, 102, 102));
        studentYear_label.setText("Year:");

        studentYear.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentYear.setForeground(new java.awt.Color(102, 102, 102));
        studentYear.setText("SchooYear");

        concentration_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        concentration_label.setForeground(new java.awt.Color(102, 102, 102));
        concentration_label.setText("Concentration:");

        studentMajor_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentMajor_label.setForeground(new java.awt.Color(102, 102, 102));
        studentMajor_label.setText("Major:");

        Schedule_label.setFont(new java.awt.Font("Century Gothic", 1, 21)); 
        Schedule_label.setForeground(new java.awt.Color(102, 102, 102));
        Schedule_label.setText("Schedule:");

        studentCon.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentCon.setForeground(new java.awt.Color(102, 102, 102));
        studentCon.setText("Con");

        schedule_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Add List Items Here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        schedulelist_scroll.setViewportView(schedule_list);

        totalcredits.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        totalcredits.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits.setText("4");

        totalcredits_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        totalcredits_label.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits_label.setText("Total Credits:");

        studentMajor.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentMajor.setForeground(new java.awt.Color(102, 102, 102));
        studentMajor.setText("studentMajor");

        javax.swing.GroupLayout viewSchedule_panelLayout = new javax.swing.GroupLayout(viewSchedule_panel);
        viewSchedule_panel.setLayout(viewSchedule_panelLayout);
        viewSchedule_panelLayout.setHorizontalGroup(
            viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                        .addComponent(totalcredits_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalcredits))
                    .addComponent(Schedule_label)
                    .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                        .addComponent(concentration_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentCon))
                    .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                        .addComponent(studentMajor_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentMajor))
                    .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                        .addComponent(studentYear_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentYear))
                    .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                        .addComponent(name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentFirstname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentLastname))
                    .addComponent(schedulelist_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        viewSchedule_panelLayout.setVerticalGroup(
            viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(studentFirstname)
                    .addComponent(studentLastname))
                .addGap(18, 18, 18)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentYear_label)
                    .addComponent(studentYear))
                .addGap(18, 18, 18)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentMajor_label)
                    .addComponent(studentMajor))
                .addGap(18, 18, 18)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concentration_label)
                    .addComponent(studentCon))
                .addGap(47, 47, 47)
                .addComponent(Schedule_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schedulelist_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalcredits_label)
                    .addComponent(totalcredits))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        mainpanel.add(viewSchedule_panel, "card4");

        addClass_panel.setBackground(new java.awt.Color(255, 255, 255));

        registration_menu.setBackground(new java.awt.Color(255, 255, 255));
        registration_menu.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        semester_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        semester_label.setForeground(new java.awt.Color(14, 17, 45));
        semester_label.setText("Semester:");

        semester_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring 2018", "Summer 2018", "Fall 2018"}));

        subject_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        subject_label.setForeground(new java.awt.Color(14, 17, 45));
        subject_label.setText("Subject:");

        subject_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Computer Science", "History", };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        subjectlist_scroll.setViewportView(subject_list);

        courseid_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        courseid_label.setForeground(new java.awt.Color(14, 17, 45));
        courseid_label.setText("Course ID:");

        courseid_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseid_inputActionPerformed(evt);
            }
        });

        days_label.setFont(new java.awt.Font("Century Gothic", 1, 12));
        days_label.setForeground(new java.awt.Color(14, 17, 45));
        days_label.setText("Days:");

        credits_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        credits_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        credits_label.setForeground(new java.awt.Color(14, 17, 45));
        credits_label.setText("Credits:");

        mon_check.setForeground(new java.awt.Color(14, 17, 45));
        mon_check.setText("Mon");

        tue_check.setForeground(new java.awt.Color(14, 17, 45));
        tue_check.setText("Tue");
        tue_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tue_checkActionPerformed(evt);
            }
        });

        wed_check.setForeground(new java.awt.Color(14, 17, 45));
        wed_check.setText("Wed");
        wed_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wed_checkActionPerformed(evt);
            }
        });

        thur_check.setForeground(new java.awt.Color(14, 17, 45));
        thur_check.setText("Thur");
        thur_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thur_checkActionPerformed(evt);
            }
        });

        fri_check.setForeground(new java.awt.Color(14, 17, 45));
        fri_check.setText("Fri");
        fri_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fri_checkActionPerformed(evt);
            }
        });

        sat_check.setForeground(new java.awt.Color(14, 17, 45));
        sat_check.setText("Sat");
        sat_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat_checkActionPerformed(evt);
            }
        });

        sun_check.setForeground(new java.awt.Color(14, 17, 45));
        sun_check.setText("Sun");
        sun_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sun_checkActionPerformed(evt);
            }
        });

        instructor_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        instructor_label.setForeground(new java.awt.Color(14, 17, 45));
        instructor_label.setText("Instructor:");

        instructor_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Instructors go here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        instructor_scroll.setViewportView(instructor_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(semester_label)
                        .addComponent(semester_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subject_label)
                        .addComponent(subjectlist_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addComponent(courseid_label)
                        .addComponent(courseid_input))
                    .addComponent(days_label)
                    .addComponent(credits_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits_label)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mon_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tue_check))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wed_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thur_check))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fri_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sat_check))
                    .addComponent(sun_check)
                    .addComponent(instructor_label)
                    .addComponent(instructor_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(semester_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semester_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subject_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectlist_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseid_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseid_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(credits_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(credits_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(days_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mon_check)
                    .addComponent(tue_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wed_check)
                    .addComponent(thur_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fri_check)
                    .addComponent(sat_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sun_check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instructor_label)
                .addGap(18, 18, 18)
                .addComponent(instructor_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        registration_menu.setViewportView(jPanel1);

        addclasstitle_label.setBackground(new java.awt.Color(14, 17, 45));
        addclasstitle_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        addclasstitle_label.setForeground(new java.awt.Color(14, 17, 45));
        addclasstitle_label.setText("Class Selection:");

        classes_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        classestable_scroll.setViewportView(classes_table);

        register_button.setBackground(new java.awt.Color(14, 17, 45));
        register_button.setFont(new java.awt.Font("Century Gothic", 1, 14)); 
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("Register");

        classes_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Registered Classes go here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        classeslist_scroll.setViewportView(classes_list);

        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setText("ERROR");

        javax.swing.GroupLayout addClass_panelLayout = new javax.swing.GroupLayout(addClass_panel);
        addClass_panel.setLayout(addClass_panelLayout);
        addClass_panelLayout.setHorizontalGroup(
            addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClass_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addclasstitle_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addClass_panelLayout.createSequentialGroup()
                .addComponent(registration_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                        .addGap(0, 359, Short.MAX_VALUE)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                        .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classeslist_scroll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classestable_scroll))
                        .addContainerGap())
                    .addGroup(addClass_panelLayout.createSequentialGroup()
                        .addComponent(errorMessage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addClass_panelLayout.setVerticalGroup(
            addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(addclasstitle_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registration_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addClass_panelLayout.createSequentialGroup()
                        .addComponent(classestable_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(register_button)
                        .addGap(18, 18, 18)
                        .addComponent(classeslist_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(errorMessage))))
        );

        mainpanel.add(addClass_panel, "card3");

        home_menu.setText("Home");
        home_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                home_menuMouseReleased(evt);
            }
        });
        home_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_menuActionPerformed(evt);
            }
        });

        dash_menu.setText("Go to Dashboard");
        dash_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dash_menuMouseReleased(evt);
            }
        });
        home_menu.add(dash_menu);

        menubar.add(home_menu);

        setting_menu.setText("Settings");

        mntmChangePassword.setText("Change Password");
        mntmChangePassword.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseReleased(MouseEvent e) {
        		Settings2 sett = new Settings2();
                sett.setVisible(true);
                sett.pack();
                sett.setLocationRelativeTo(null);
                sett.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
        setting_menu.add(mntmChangePassword);

        menubar.add(setting_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );

        pack();
    }              

    private void schedule_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      mainpanel.removeAll();
      mainpanel.add(viewSchedule_panel);
      mainpanel.repaint();
      mainpanel.revalidate();
    }                                               

    private void addclass_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      mainpanel.removeAll();
      mainpanel.add(addClass_panel);
      mainpanel.repaint();
      mainpanel.revalidate();
    }                                               

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        int logout_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (logout_con == 0){
            Login log = new Login();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();

        }
    }                                          

    private void home_menuActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
    }                                         

    private void home_menuMouseReleased(java.awt.event.MouseEvent evt) {                                        
      
    }                                       

    private void dash_menuMouseReleased(java.awt.event.MouseEvent evt) {                                        
      mainpanel.removeAll();
      mainpanel.add(dash_panel);
      mainpanel.repaint();
      mainpanel.revalidate();
    }                                       

    private void tue_checkActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void courseid_inputActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void wed_checkActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void thur_checkActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void fri_checkActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void sat_checkActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void sun_checkActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    
    
    
    
    
    
      public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));
    
    }

  
                  
}
