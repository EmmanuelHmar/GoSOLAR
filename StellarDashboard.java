package stellar;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;


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
    public static javax.swing.JLabel gpa;
    private javax.swing.JLabel gpa_label;
    private javax.swing.JMenu home_menu;
    private javax.swing.JLabel instructor_label;
    private javax.swing.JList<String> instructor_list;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lastname;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel mainpanel;
    public static javax.swing.JLabel major;
    private javax.swing.JLabel major_label;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton register_button;
    private javax.swing.JScrollPane registration_menu;
    private javax.swing.JButton schedule_button;
    private javax.swing.JList<String> schedule_list;
    private javax.swing.JScrollPane schedulelist_scroll;
    private javax.swing.JComboBox<String> semester_combobox;
    private javax.swing.JLabel semester_label;
    private javax.swing.JMenu setting_menu;
    private javax.swing.JPanel sidemenu;
    private javax.swing.JLabel starimage;
    private javax.swing.JLabel studentCon;
    public static javax.swing.JLabel studentFirstname;
    public static javax.swing.JLabel studentLastname;
    public static javax.swing.JLabel studentMajor;
    private javax.swing.JLabel studentMajor_label;
    public static javax.swing.JLabel studentYear;
    private javax.swing.JLabel studentYear_label;
    public static javax.swing.JLabel studentid;
    private javax.swing.JLabel studentid_label;
    public static javax.swing.JLabel studentidnum;
    private javax.swing.JLabel studentidnum_label;
    private javax.swing.JLabel studentinfo_label;
    private javax.swing.JLabel subject_label;
    private javax.swing.JList<String> subject_list;
    private javax.swing.JScrollPane subjectlist_scroll;
    private javax.swing.JLabel term_text;
    private javax.swing.JLabel totalcredits;
    private javax.swing.JLabel totalcredits_label;
    private javax.swing.JPanel viewSchedule_panel;
    private javax.swing.JLabel welcome_text;
    public static javax.swing.JLabel year;
    private javax.swing.JLabel year_label;
    Connection connection = null;
    ResultSet rs = null;  
    PreparedStatement pst = null;
    private JButton reset_button;
    
    
	
    public StellarDashboard() {
        connection = DatabaseConnection.dbConnector();

        initComponents();
         setTitle("Stellar");
        setLocationRelativeTo(null);
        staricon();
        fetchClass();
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
        semester_combobox.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent arg0) {
        		
        		String query1 = semester_combobox.getSelectedItem().toString();
        		String query2 = (String) subject_list.getSelectedValue();
        		String query3 = (String) courseid_input.getText().toUpperCase();
        		idFilter(query1,query2,query3);
        	}
        });
        subject_label = new javax.swing.JLabel();
        subjectlist_scroll = new javax.swing.JScrollPane();
        subject_list = new javax.swing.JList<>();
        subject_list.addListSelectionListener(new ListSelectionListener() {
        	public void valueChanged(ListSelectionEvent arg0) {
        		String query1 = semester_combobox.getSelectedItem().toString();
        		String query2 = (String) subject_list.getSelectedValue();
        		String query3 = (String) courseid_input.getText().toUpperCase();
        		idFilter(query1,query2,query3);
        	}
        });
        courseid_label = new javax.swing.JLabel();
        courseid_input = new javax.swing.JTextField();
        courseid_input.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent arg0) {
        		String query1 = semester_combobox.getSelectedItem().toString();
        		String query2 = (String) subject_list.getSelectedValue();
        		String query3 = (String) courseid_input.getText().toUpperCase();
        		idFilter(query1,query2,query3);
        	}
        });
        days_label = new javax.swing.JLabel();
        credits_combobox = new javax.swing.JComboBox<>();
        credits_label = new javax.swing.JLabel();
        instructor_label = new javax.swing.JLabel();
        addclasstitle_label = new javax.swing.JLabel();
        classestable_scroll = new javax.swing.JScrollPane();
        classes_table = new javax.swing.JTable();
        register_button = new javax.swing.JButton();
        classeslist_scroll = new javax.swing.JScrollPane();
        errorMessage = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        home_menu = new javax.swing.JMenu();
        dash_menu = new javax.swing.JMenuItem();
        setting_menu = new javax.swing.JMenu();
        
        setting_menu.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		settings_buttonMouseClicked(evt);

            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        
        JButton home_button = new JButton();
        home_button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		  mainpanel.removeAll();
        	      mainpanel.add(dash_panel);
        	      mainpanel.repaint();
        	      mainpanel.revalidate();
        		
        	}
        });
        home_button.setText("Home");
        home_button.setForeground(Color.WHITE);
        home_button.setFont(new Font("Century Gothic", Font.BOLD, 14));
        home_button.setBackground(new Color(14, 17, 45));

        javax.swing.GroupLayout sidemenuLayout = new javax.swing.GroupLayout(sidemenu);
        sidemenuLayout.setHorizontalGroup(
        	sidemenuLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(sidemenuLayout.createSequentialGroup()
        			.addContainerGap(34, Short.MAX_VALUE)
        			.addGroup(sidemenuLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(schedule_button, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        				.addComponent(home_button, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        				.addComponent(addclass_button, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        			.addGap(25))
        );
        sidemenuLayout.setVerticalGroup(
        	sidemenuLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(sidemenuLayout.createSequentialGroup()
        			.addGap(71)
        			.addComponent(home_button, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(addclass_button, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(schedule_button, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(436, Short.MAX_VALUE))
        );
        sidemenu.setLayout(sidemenuLayout);

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

        studentFirstname.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
        studentFirstname.setForeground(new java.awt.Color(102, 102, 102));
        studentFirstname.setText("Fname");

        studentLastname.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
        studentLastname.setForeground(new java.awt.Color(102, 102, 102));
        studentLastname.setText("Lname");

        studentYear_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentYear_label.setForeground(new java.awt.Color(102, 102, 102));
        studentYear_label.setText("Year:");

        studentYear.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
        studentYear.setForeground(new java.awt.Color(102, 102, 102));
        studentYear.setText("SchoolYear");

        concentration_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        concentration_label.setForeground(new java.awt.Color(102, 102, 102));
        concentration_label.setText("Concentration:");

        studentMajor_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        studentMajor_label.setForeground(new java.awt.Color(102, 102, 102));
        studentMajor_label.setText("Major:");

        Schedule_label.setFont(new java.awt.Font("Century Gothic", 1, 21)); 
        Schedule_label.setForeground(new java.awt.Color(102, 102, 102));
        Schedule_label.setText("Schedule:");

        studentCon.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
        studentCon.setForeground(new java.awt.Color(102, 102, 102));
        studentCon.setText("Con");

        schedule_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Add List Items Here" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        schedulelist_scroll.setViewportView(schedule_list);

        totalcredits.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
        totalcredits.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits.setText("4");

        totalcredits_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        totalcredits_label.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits_label.setText("Total Credits:");

        studentMajor.setFont(new Font("Century Gothic", Font.PLAIN, 18)); 
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

        semester_combobox.setModel(new DefaultComboBoxModel(new String[] {"Spring 2020", "Summer 2020", "Fall 2020"}));

        subject_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        subject_label.setForeground(new java.awt.Color(14, 17, 45));
        subject_label.setText("Subject:");

        subject_list.setModel(new AbstractListModel() {
        	String[] values = new String[] {"CSC", "HIST"};
        	public int getSize() {
        		return values.length;
        	}
        	public Object getElementAt(int index) {
        		return values[index];
        	}
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

        instructor_label.setFont(new java.awt.Font("Century Gothic", 1, 12)); 
        instructor_label.setForeground(new java.awt.Color(14, 17, 45));
        instructor_label.setText("Instructor:");
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"}));
        instructor_list = new javax.swing.JList<>();
        
                instructor_list.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = { "Instructors go here" };
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(semester_label)
        					.addComponent(semester_combobox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(subject_label)
        					.addComponent(subjectlist_scroll, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        					.addComponent(courseid_label)
        					.addComponent(courseid_input))
        				.addComponent(days_label)
        				.addComponent(credits_combobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(credits_label)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(instructor_label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGap(71))
        						.addComponent(instructor_list))
        					.addGap(124)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(17)
        			.addComponent(semester_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(semester_combobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(subject_label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(subjectlist_scroll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(courseid_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(courseid_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(24)
        			.addComponent(credits_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(credits_combobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(days_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(instructor_label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(instructor_list, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

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

        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setText("ERROR");
        
        reset_button = new JButton("Reset");
        reset_button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		fetchClass();
        	}
        });
        reset_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 //reset_buttonActionPerformed(evt);
        	}
        });
        reset_button.setForeground(Color.WHITE);
        reset_button.setFont(new Font("Century Gothic", Font.BOLD, 14));
        reset_button.setBackground(new java.awt.Color(14, 17, 45));
        reset_button.setForeground(Color.WHITE);
        classes_list = new javax.swing.JList<>();
        classes_list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        
                classes_list.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = { "Registered Classes go here" };
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });

        javax.swing.GroupLayout addClass_panelLayout = new javax.swing.GroupLayout(addClass_panel);
        addClass_panelLayout.setHorizontalGroup(
        	addClass_panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(addClass_panelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(addclasstitle_label)
        			.addContainerGap(1029, Short.MAX_VALUE))
        		.addGroup(addClass_panelLayout.createSequentialGroup()
        			.addComponent(registration_menu, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(addClass_panelLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(addClass_panelLayout.createSequentialGroup()
        					.addComponent(register_button, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(reset_button)
        					.addGap(324))
        				.addGroup(addClass_panelLayout.createSequentialGroup()
        					.addComponent(classeslist_scroll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(274))
        				.addGroup(addClass_panelLayout.createSequentialGroup()
        					.addComponent(errorMessage)
        					.addContainerGap(826, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, addClass_panelLayout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(addClass_panelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(classes_list, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        						.addComponent(classestable_scroll, GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
        					.addContainerGap())))
        );
        addClass_panelLayout.setVerticalGroup(
        	addClass_panelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(addClass_panelLayout.createSequentialGroup()
        			.addGap(0, 16, Short.MAX_VALUE)
        			.addComponent(addclasstitle_label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(addClass_panelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(registration_menu, GroupLayout.PREFERRED_SIZE, 689, GroupLayout.PREFERRED_SIZE)
        				.addGroup(addClass_panelLayout.createSequentialGroup()
        					.addComponent(classestable_scroll, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(addClass_panelLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(reset_button)
        						.addComponent(register_button))
        					.addGap(18)
        					.addComponent(classeslist_scroll, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(27)
        					.addComponent(classes_list, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(errorMessage))))
        );
        addClass_panel.setLayout(addClass_panelLayout);

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

        setting_menu.setText("Change Password");

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
    
    private void settings_buttonMouseClicked(java.awt.event.MouseEvent evt) { 
    	Settings2 sett = new Settings2(this);
        sett.setVisible(true);
        sett.pack();
        sett.setLocationRelativeTo(null);
      //Dispose just closes the pw window, not the entire program
        sett.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void courseid_inputActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    
    public void fetchClass(){

        try{
            String classTable = "select teacher_class.class_id, teacher_class.CRN, teacher_class.semester, teacher_class.day, teacher_class.class_time, classes.class_name, classes.class_credit, classes.class_subj, teacher.teacher_last_name "
            		+ "from teacher_class INNER JOIN classes on classes.class_id = teacher_class.class_id "
            		+ "INNER JOIN teacher on teacher.teacher_id = teacher_class.teacher_id";
            pst = connection.prepareStatement(classTable);
            rs = pst.executeQuery();
            classes_table.setModel(DbUtils.resultSetToTableModel(rs));
            


        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }

    
    private void idFilter(String query1  ,String query2, String query3)
    {
    	
    	ArrayList<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
    	if (query2 != null && !query2.isEmpty())
    	{
    	filters.add(RowFilter.regexFilter(query1, 2));
    	filters.add(RowFilter.regexFilter(query2, 7));
    	filters.add(RowFilter.regexFilter(query3, 0 ));
    	}
    	else
    	{
        filters.add(RowFilter.regexFilter(query1, 2));
        filters.add(RowFilter.regexFilter(query3, 0 ));

    	}
    	TableRowSorter<TableModel>	sorter = new TableRowSorter<TableModel>(classes_table.getModel());

    	
    	sorter.setRowFilter(RowFilter.andFilter(filters));	
    	classes_table.setRowSorter(sorter);
    	

    }
    
    
    
    
      public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));
    
    }
}
