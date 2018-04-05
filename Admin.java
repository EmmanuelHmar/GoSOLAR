package stellar;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//TODO: Current update class not working

public class Admin extends javax.swing.JFrame {
	
	//Variables
	private javax.swing.JButton addClass_button;
    private javax.swing.JLabel addClass_label;
    private javax.swing.JScrollPane addclass_spanel;
    private javax.swing.JPanel addclass_tab;
    private javax.swing.JButton addinstructor_button;
    private javax.swing.JLabel addstudent_label;
    private javax.swing.JButton addstudents_button;
    private javax.swing.JLabel addteacher_label;
    private javax.swing.JPanel admin_panel;
    private javax.swing.JTabbedPane admin_tab;
    private javax.swing.JLabel studentBday_label;
    private javax.swing.JTextField clasid_input;
    private javax.swing.JLabel clasid_label;
    private javax.swing.JTable classes_table;
    private javax.swing.JTextField classid_input;
    private javax.swing.JLabel classid_label;
    private javax.swing.JLabel classinstructor_label;
    private javax.swing.JScrollPane classinstructor_spanel;
    private javax.swing.JPanel classinstructor_tab;
    private javax.swing.JTable classinstructor_table;
    private javax.swing.JTextField classtime_input;
    private javax.swing.JLabel classtime_label;
    private javax.swing.JTextField classtitle_input;
    private javax.swing.JLabel classtitle_label;
    private javax.swing.JButton clearclass_button;
    private javax.swing.JButton clearinstructors_button;
    private javax.swing.JButton clearstudent_button;
    private javax.swing.JButton clearteacher_button;
    private javax.swing.JTextField credit_input;
    private javax.swing.JLabel credit_label;
    private javax.swing.JTextField crn_input;
    private javax.swing.JLabel crn_label;
    private javax.swing.JTextField days_input;
    private javax.swing.JLabel days_label;
    private javax.swing.JLabel studentEmail_label;
    private javax.swing.JTextField studentFirstName_input;
    private javax.swing.JLabel studentFirstName_label;
    private javax.swing.JTextField teacherFirstName_input;
    private javax.swing.JLabel teacherFirstName_label;
    private javax.swing.JLabel studentGpa_label;
    private javax.swing.JButton classUpdateButton;
    private javax.swing.JButton classUpdateClear;
    private javax.swing.JLabel updateClassTitle_label;
    private javax.swing.JLabel updateClassID_label;
    private javax.swing.JLabel updateClassCredit_label;
    private javax.swing.JLabel updateClassSubject_label;
    private javax.swing.JTextField updateClassTitle_input;
    private javax.swing.JTextField updateClassID_input;
    private javax.swing.JTextField updateClassCredit_input;
    private javax.swing.JTextField updateClassSubject_input;
    private javax.swing.JLabel studentLastName_label;
    private javax.swing.JTextField teacherLastName_input;
    private javax.swing.JLabel teacherLastName_label;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel studentMajor_label;
    private javax.swing.JLabel studentPassword_label;
    private javax.swing.JTextField teacherPrefix_input;
    private javax.swing.JLabel teacherPrefix_label;
    private javax.swing.JTextField semester_input;
    private javax.swing.JLabel semester_label;
    private javax.swing.JLabel stellarnum_label;
    private javax.swing.JScrollPane student_spanel;
    private javax.swing.JTable student_table;
    private javax.swing.JLabel studentId_label;
    private javax.swing.JPanel students_tab;
    private javax.swing.JTextField subject_input;
    private javax.swing.JLabel subject_label;
    private javax.swing.JButton teacher_button;
    private javax.swing.JScrollPane teacher_spanel;
    private javax.swing.JTextField teacherid_input;
    private javax.swing.JLabel teacherid_label;
    private javax.swing.JPanel teachers_tab;
    private javax.swing.JTable teachers_table;
    private javax.swing.JTextField teachid_input;
    private javax.swing.JLabel teachid_label;
    private javax.swing.JScrollPane update_spanel;
    private javax.swing.JPanel update_tab;
    private javax.swing.JLabel updateclass_label;
    private javax.swing.JTable updateclass_table;
    private javax.swing.JLabel studentYear_label;
    private JTextField studentLastName_input;
    private JTextField studentId_input;
    private JTextField studentPassword_input;
    private JTextField stellarnum_input;
    private JTextField studentEmail_input;
    private JTextField studentGpa_input;
    private JTextField studentMajor_input;
    private JTextField studentYear_input;
    private JTextField studentBday_input;
    private JTextField studentPhone_input;
    private JTextField studentAddress_input;
    private JTextField studentState_input;
    private JTextField studentCity_input;
    private JTextField studentZip_input;

    Connection connection = null;
    Connection conn = null;
    ResultSet rs = null;  
    PreparedStatement pst = null;
    PreparedStatement ps = null;

    private JButton teachersDelete_button;
    private JButton instructorsDelete_button;
  
    
    public Admin() {
        administrator();
        //Connects to the database
        connection = DatabaseConnection.dbConnector();
        conn = DatabaseConnection.dbConnector();

        staricon();
        setTitle("Stellar: Administrator");
        setLocationRelativeTo(null);
        fetchStudents();
        fetchTeachers();
        fetchClasses();
        fetchClassInstructor();    
        }

    @SuppressWarnings("unchecked")
    
    private void administrator() {

        admin_panel = new javax.swing.JPanel();
        admin_tab = new javax.swing.JTabbedPane();
        teachers_tab = new javax.swing.JPanel();
        teacher_spanel = new javax.swing.JScrollPane();
        teachers_table = new javax.swing.JTable();
        addteacher_label = new javax.swing.JLabel();
        teacherFirstName_label = new javax.swing.JLabel();
        teacherFirstName_input = new javax.swing.JTextField();
        teacherLastName_label = new javax.swing.JLabel();
        teacherLastName_input = new javax.swing.JTextField();
        teacherPrefix_label = new javax.swing.JLabel();
        teacherPrefix_input = new javax.swing.JTextField();
        teacherid_label = new javax.swing.JLabel();
        teacherid_input = new javax.swing.JTextField();
        clearteacher_button = new javax.swing.JButton();
        teacher_button = new javax.swing.JButton();
        update_tab = new javax.swing.JPanel();
        update_spanel = new javax.swing.JScrollPane();
        updateclass_table = new javax.swing.JTable();
        updateclass_label = new javax.swing.JLabel();
        updateClassTitle_label = new javax.swing.JLabel();
        updateClassTitle_input = new javax.swing.JTextField();
        updateClassID_label = new javax.swing.JLabel();
        updateClassID_input = new javax.swing.JTextField();
        updateClassCredit_label = new javax.swing.JLabel();
        updateClassCredit_input = new javax.swing.JTextField();
        updateClassSubject_label = new javax.swing.JLabel();
        updateClassSubject_input = new javax.swing.JTextField();
        classUpdateClear = new javax.swing.JButton();
        classUpdateButton = new javax.swing.JButton();
        classinstructor_tab = new javax.swing.JPanel();
        classinstructor_spanel = new javax.swing.JScrollPane();
        classinstructor_table = new javax.swing.JTable();
        classinstructor_label = new javax.swing.JLabel();
        crn_label = new javax.swing.JLabel();
        crn_input = new javax.swing.JTextField();
        teachid_label = new javax.swing.JLabel();
        teachid_input = new javax.swing.JTextField();
        clasid_label = new javax.swing.JLabel();
        clasid_input = new javax.swing.JTextField();
        semester_label = new javax.swing.JLabel();
        semester_input = new javax.swing.JTextField();
        clearinstructors_button = new javax.swing.JButton();
        addinstructor_button = new javax.swing.JButton();
        addinstructor_button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		addInstructor_buttonActionPerformed(evt);
        	}
        });
        days_label = new javax.swing.JLabel();
        days_input = new javax.swing.JTextField();
        classtime_label = new javax.swing.JLabel();
        classtime_input = new javax.swing.JTextField();
        logout_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin_panel.setBackground(new java.awt.Color(204, 204, 204));

        admin_tab.setBackground(new java.awt.Color(255, 215, 73));
        admin_tab.setForeground(new java.awt.Color(51, 51, 51));
        teacherFirstName_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_inputActionPerformed(evt);
            }
        });

        teachers_tab.setBackground(new java.awt.Color(255, 255, 255));

        teachers_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        teacher_spanel.setViewportView(teachers_table);

        addteacher_label.setFont(new java.awt.Font("Dialog", 1, 14)); 
        addteacher_label.setForeground(new java.awt.Color(51, 51, 51));
        addteacher_label.setText("Add Teacher:");

        teacherFirstName_label.setForeground(new java.awt.Color(51, 51, 51));
        teacherFirstName_label.setText("First Name:");

        teacherFirstName_input.setBackground(new java.awt.Color(255, 255, 255));
        teacherFirstName_input.setForeground(new java.awt.Color(51, 51, 51));
        teacherFirstName_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_inputActionPerformed(evt);
            }
        });

        teacherLastName_label.setForeground(new java.awt.Color(51, 51, 51));
        teacherLastName_label.setText("Last Name:");

        teacherLastName_input.setBackground(new java.awt.Color(255, 255, 255));
        teacherLastName_input.setForeground(new java.awt.Color(51, 51, 51));

        teacherPrefix_label.setForeground(new java.awt.Color(51, 51, 51));
        teacherPrefix_label.setText("Prefix:");

        teacherPrefix_input.setBackground(new java.awt.Color(255, 255, 255));
        teacherPrefix_input.setForeground(new java.awt.Color(51, 51, 51));

        teacherid_label.setForeground(new java.awt.Color(51, 51, 51));
        teacherid_label.setText("ID:");

        teacherid_input.setBackground(new java.awt.Color(255, 255, 255));
        teacherid_input.setForeground(new java.awt.Color(51, 51, 51));

        clearteacher_button.setText("Clear");
        clearteacher_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearteacher_buttonMouseClicked(evt);
            }
        });

        teacher_button.setText("Add");
        teacher_button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                addTeacher_buttonActionPerformed(evt);
            }

        });
        
        teachersDelete_button = new JButton("Delete");
        teachersDelete_button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		teachersDelete_buttonMouseClicked(evt);

            }
        });

        javax.swing.GroupLayout teachers_tabLayout = new javax.swing.GroupLayout(teachers_tab);
        teachers_tabLayout.setHorizontalGroup(
        	teachers_tabLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(teachers_tabLayout.createSequentialGroup()
        			.addComponent(teacher_spanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(200)
        			.addGroup(teachers_tabLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(teachers_tabLayout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(teacherFirstName_label)
        					.addComponent(teacherLastName_label)
        					.addComponent(teacherPrefix_label)
        					.addComponent(teacherid_label)
        					.addComponent(teacherFirstName_input)
        					.addComponent(teacherLastName_input)
        					.addComponent(teacherPrefix_input)
        					.addComponent(teacherid_input, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
        				.addComponent(addteacher_label)
        				.addGroup(teachers_tabLayout.createSequentialGroup()
        					.addGap(80)
        					.addComponent(clearteacher_button)
        					.addGap(18)
        					.addComponent(teacher_button)
        					.addGap(18)
        					.addComponent(teachersDelete_button)))
        			.addGap(200))
        );
        teachers_tabLayout.setVerticalGroup(
        	teachers_tabLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(teacher_spanel, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        		.addGroup(teachers_tabLayout.createSequentialGroup()
        			.addGap(45)
        			.addComponent(addteacher_label)
        			.addGap(31)
        			.addComponent(teacherFirstName_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(teacherFirstName_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(teacherLastName_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(teacherLastName_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(teacherPrefix_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(teacherPrefix_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(teacherid_label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(teacherid_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(teachers_tabLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(clearteacher_button)
        				.addComponent(teacher_button)
        				.addComponent(teachersDelete_button))
        			.addContainerGap(346, Short.MAX_VALUE))
        );
        teachers_tab.setLayout(teachers_tabLayout);

        admin_tab.addTab("Teachers", teachers_tab);

        update_tab.setBackground(new java.awt.Color(255, 255, 255));

        updateclass_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        update_spanel.setViewportView(updateclass_table);

        updateclass_label.setFont(new java.awt.Font("Dialog", 1, 14)); 
        updateclass_label.setForeground(new java.awt.Color(51, 51, 51));
        updateclass_label.setText("Update Class:");

        updateClassTitle_label.setForeground(new java.awt.Color(51, 51, 51));
        updateClassTitle_label.setText("Class Title:");

        updateClassTitle_input.setBackground(new java.awt.Color(255, 255, 255));
        updateClassTitle_input.setForeground(new java.awt.Color(51, 51, 51));
        updateClassTitle_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        updateClassID_label.setForeground(new java.awt.Color(51, 51, 51));
        updateClassID_label.setText("Class ID:");

        updateClassID_input.setBackground(new java.awt.Color(255, 255, 255));
        updateClassID_input.setForeground(new java.awt.Color(51, 51, 51));

        updateClassCredit_label.setForeground(new java.awt.Color(51, 51, 51));
        updateClassCredit_label.setText("Credit:");

        updateClassCredit_input.setBackground(new java.awt.Color(255, 255, 255));
        updateClassCredit_input.setForeground(new java.awt.Color(51, 51, 51));

        updateClassSubject_label.setForeground(new java.awt.Color(51, 51, 51));
        updateClassSubject_label.setText("Subject:");

        updateClassSubject_input.setBackground(new java.awt.Color(255, 255, 255));
        updateClassSubject_input.setForeground(new java.awt.Color(51, 51, 51));

        classUpdateClear.setText("Clear");

        classUpdateButton.setText("Update");
        classUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                updateClasses_buttonActionPerformed(evt);
            }

        });
        students_tab = new javax.swing.JPanel();
        student_spanel = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        addstudent_label = new javax.swing.JLabel();
        studentFirstName_label = new javax.swing.JLabel();
        studentFirstName_input = new javax.swing.JTextField();
        studentLastName_label = new javax.swing.JLabel();
        studentId_label = new javax.swing.JLabel();
        studentPassword_label = new javax.swing.JLabel();
        clearstudent_button = new javax.swing.JButton();
        addstudents_button = new javax.swing.JButton();
        stellarnum_label = new javax.swing.JLabel();
        studentEmail_label = new javax.swing.JLabel();
        studentGpa_label = new javax.swing.JLabel();
        studentMajor_label = new javax.swing.JLabel();
        studentYear_label = new javax.swing.JLabel();
        studentBday_label = new javax.swing.JLabel();
        
                students_tab.setBackground(new java.awt.Color(255, 255, 255));
                
                        student_table.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null}
                                },
                                new String[]{
                                        "Title 1", "Title 2", "Title 3", "Title 4"
                                }
                        ));
                        student_spanel.setViewportView(student_table);
                        
                                addstudent_label.setFont(new java.awt.Font("Dialog", 1, 14)); 
                                addstudent_label.setForeground(new java.awt.Color(51, 51, 51));
                                addstudent_label.setText("Add Student:");
                                
                                        studentFirstName_label.setForeground(new java.awt.Color(51, 51, 51));
                                        studentFirstName_label.setText("First Name:");
                                        
                                                studentFirstName_input.setBackground(new java.awt.Color(255, 255, 255));
                                                studentFirstName_input.setForeground(new java.awt.Color(51, 51, 51));
                                                studentFirstName_input.addActionListener(new java.awt.event.ActionListener() {
                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                        firstname_inputActionPerformed(evt);
                                                    }
                                                });
                                                
                                                        studentLastName_label.setForeground(new java.awt.Color(51, 51, 51));
                                                        studentLastName_label.setText("Last Name:");
                                                        
                                                                studentId_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                studentId_label.setText("Student ID:");
                                                                
                                                                        studentPassword_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                        studentPassword_label.setText("Password:");
                                                                        
                                                                                clearstudent_button.setText("Clear");
                                                                                clearstudent_button.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                        clearstudent_buttonMouseClicked(evt);
                                                                                    }
                                                                                });
                                                                                
                                                                                
                                                                                        addstudents_button.setText("Add");
                                                                                        addstudents_button.addActionListener(new java.awt.event.ActionListener() {
                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                addStudents_buttonActionPerformed(evt);
                                                                                            }
                                                                                        });
                                                                                        
                                                                                                stellarnum_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                stellarnum_label.setText("Stellar Number:");
                                                                                                
                                                                                                        studentEmail_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                        studentEmail_label.setText("E-mail:");
                                                                                                        
                                                                                                                studentGpa_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                                studentGpa_label.setText("GPA:");
                                                                                                                
                                                                                                                        studentMajor_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                                        studentMajor_label.setText("Major:");
                                                                                                                        
                                                                                                                                studentYear_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                                                studentYear_label.setText("School Year:");
                                                                                                                                
                                                                                                                                        studentBday_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                                                        studentBday_label.setText("Birthday:");
                                                                                                                                        
                                                                                                                                        studentLastName_input = new JTextField();
                                                                                                                                        studentLastName_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentLastName_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentId_input = new JTextField();
                                                                                                                                        studentId_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentId_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentPassword_input = new JTextField();
                                                                                                                                        studentPassword_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentPassword_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        stellarnum_input = new JTextField();
                                                                                                                                        stellarnum_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        stellarnum_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentEmail_input = new JTextField();
                                                                                                                                        studentEmail_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentEmail_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentGpa_input = new JTextField();
                                                                                                                                        studentGpa_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentGpa_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentMajor_input = new JTextField();
                                                                                                                                        studentMajor_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentMajor_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentYear_input = new JTextField();
                                                                                                                                        studentYear_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentYear_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentBday_input = new JTextField();
                                                                                                                                        studentBday_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentBday_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        JLabel lblPhone = new JLabel();
                                                                                                                                        lblPhone.setText("Phone:");
                                                                                                                                        lblPhone.setForeground(new Color(51, 51, 51));
                                                                                                                                        
                                                                                                                                        JLabel lblAddress = new JLabel();
                                                                                                                                        lblAddress.setText("Address:");
                                                                                                                                        lblAddress.setForeground(new Color(51, 51, 51));
                                                                                                                                        
                                                                                                                                        studentPhone_input = new JTextField();
                                                                                                                                        studentPhone_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentPhone_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentAddress_input = new JTextField();
                                                                                                                                        studentAddress_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentAddress_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        JLabel lblState = new JLabel();
                                                                                                                                        lblState.setText("State:");
                                                                                                                                        lblState.setForeground(new Color(51, 51, 51));
                                                                                                                                        
                                                                                                                                        JLabel lblCity = new JLabel();
                                                                                                                                        lblCity.setText("City:");
                                                                                                                                        lblCity.setForeground(new Color(51, 51, 51));
                                                                                                                                        
                                                                                                                                        studentState_input = new JTextField();
                                                                                                                                        studentState_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentState_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        studentCity_input = new JTextField();
                                                                                                                                        studentCity_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentCity_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        JLabel lblZipcode = new JLabel();
                                                                                                                                        lblZipcode.setText("Zipcode:");
                                                                                                                                        lblZipcode.setForeground(new Color(51, 51, 51));
                                                                                                                                        
                                                                                                                                        studentZip_input = new JTextField();
                                                                                                                                        studentZip_input.setForeground(new Color(51, 51, 51));
                                                                                                                                        studentZip_input.setBackground(Color.WHITE);
                                                                                                                                        
                                                                                                                                        JButton studentsDelete_button = new JButton("Delete");
                                                                                                                                        studentsDelete_button.addMouseListener(new MouseAdapter() {
                                                                                                                                        	@Override
                                                                                                                                        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                                                        		studentsDelete_buttonMouseClicked(evt);

                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                                javax.swing.GroupLayout students_tabLayout = new javax.swing.GroupLayout(students_tab);
                                                                                                                                                students_tabLayout.setHorizontalGroup(
                                                                                                                                                	students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                		.addGroup(students_tabLayout.createSequentialGroup()
                                                                                                                                                			.addComponent(student_spanel, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                			.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                			.addGroup(students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                				.addGroup(students_tabLayout.createSequentialGroup()
                                                                                                                                                					.addGap(157)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                						.addComponent(studentFirstName_label)
                                                                                                                                                						.addComponent(studentFirstName_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentId_label)
                                                                                                                                                						.addComponent(studentId_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(stellarnum_label)
                                                                                                                                                						.addComponent(stellarnum_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentGpa_label)
                                                                                                                                                						.addComponent(studentGpa_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentYear_label)
                                                                                                                                                						.addComponent(addstudent_label)
                                                                                                                                                						.addComponent(studentState_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(lblZipcode, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentZip_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentYear_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(lblPhone, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentPhone_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(87)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                						.addComponent(studentAddress_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentBday_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentCity_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentBday_label)
                                                                                                                                                						.addComponent(studentMajor_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentMajor_label)
                                                                                                                                                						.addComponent(studentEmail_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentEmail_label)
                                                                                                                                                						.addComponent(studentPassword_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentPassword_label)
                                                                                                                                                						.addComponent(studentLastName_input, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentLastName_label)))
                                                                                                                                                				.addGroup(students_tabLayout.createSequentialGroup()
                                                                                                                                                					.addGap(325)
                                                                                                                                                					.addComponent(clearstudent_button)
                                                                                                                                                					.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                                					.addComponent(addstudents_button)
                                                                                                                                                					.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                                                					.addComponent(studentsDelete_button)))
                                                                                                                                                			.addGap(236))
                                                                                                                                                );
                                                                                                                                                students_tabLayout.setVerticalGroup(
                                                                                                                                                	students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                		.addGroup(students_tabLayout.createSequentialGroup()
                                                                                                                                                			.addGroup(students_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                                				.addGroup(students_tabLayout.createSequentialGroup()
                                                                                                                                                					.addGap(38)
                                                                                                                                                					.addComponent(addstudent_label)
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentFirstName_label)
                                                                                                                                                						.addComponent(studentLastName_label))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentFirstName_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentLastName_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentId_label)
                                                                                                                                                						.addComponent(studentPassword_label))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentId_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentPassword_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(stellarnum_label)
                                                                                                                                                						.addComponent(studentEmail_label))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(stellarnum_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentEmail_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentGpa_label)
                                                                                                                                                						.addComponent(studentMajor_label))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentGpa_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentMajor_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentYear_label)
                                                                                                                                                						.addComponent(studentBday_label))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentYear_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentBday_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(lblPhone)
                                                                                                                                                						.addComponent(lblAddress))
                                                                                                                                                					.addGap(1)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentPhone_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentAddress_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(lblCity)
                                                                                                                                                						.addComponent(lblState))
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(studentState_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                						.addComponent(studentCity_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                					.addGap(18)
                                                                                                                                                					.addComponent(lblZipcode)
                                                                                                                                                					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                                					.addComponent(studentZip_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                                                					.addGap(29)
                                                                                                                                                					.addGroup(students_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                                                						.addComponent(clearstudent_button)
                                                                                                                                                						.addComponent(addstudents_button)
                                                                                                                                                						.addComponent(studentsDelete_button)))
                                                                                                                                                				.addComponent(student_spanel, GroupLayout.PREFERRED_SIZE, 756, GroupLayout.PREFERRED_SIZE))
                                                                                                                                                			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                );
                                                                                                                                                students_tab.setLayout(students_tabLayout);
                                                                                                                                                
                                                                                                                                                        admin_tab.addTab("Students", students_tab);
        addclass_tab = new javax.swing.JPanel();
        addclass_spanel = new javax.swing.JScrollPane();
        classes_table = new javax.swing.JTable();
        classtitle_label = new javax.swing.JLabel();
        classtitle_input = new javax.swing.JTextField();
        classid_label = new javax.swing.JLabel();
        classid_input = new javax.swing.JTextField();
        credit_label = new javax.swing.JLabel();
        credit_input = new javax.swing.JTextField();
        subject_label = new javax.swing.JLabel();
        subject_input = new javax.swing.JTextField();
        addClass_label = new javax.swing.JLabel();
        clearclass_button = new javax.swing.JButton();
        addClass_button = new javax.swing.JButton();
        
                addclass_tab.setBackground(new java.awt.Color(255, 255, 255));
                addclass_tab.setForeground(new java.awt.Color(51, 51, 51));
                
                        classes_table.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][]{
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null}
                                },
                                new String[]{
                                        "Title 1", "Title 2", "Title 3", "Title 4"
                                }
                        ));
                        addclass_spanel.setViewportView(classes_table);
                        
                                classtitle_label.setForeground(new java.awt.Color(51, 51, 51));
                                classtitle_label.setText("Class Title:");
                                
                                        classtitle_input.setBackground(new java.awt.Color(255, 255, 255));
                                        classtitle_input.setForeground(new java.awt.Color(51, 51, 51));
                                        classtitle_input.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                classtitle_inputActionPerformed(evt);
                                            }
                                        });
                                        
                                                classid_label.setForeground(new java.awt.Color(51, 51, 51));
                                                classid_label.setText("Class ID:");
                                                
                                                        classid_input.setBackground(new java.awt.Color(255, 255, 255));
                                                        classid_input.setForeground(new java.awt.Color(51, 51, 51));
                                                        
                                                                credit_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                credit_label.setText("Credit:");
                                                                
                                                                        credit_input.setBackground(new java.awt.Color(255, 255, 255));
                                                                        credit_input.setForeground(new java.awt.Color(51, 51, 51));
                                                                        
                                                                                subject_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                subject_label.setText("Subject:");
                                                                                
                                                                                        subject_input.setBackground(new java.awt.Color(255, 255, 255));
                                                                                        subject_input.setForeground(new java.awt.Color(51, 51, 51));
                                                                                        
                                                                                                addClass_label.setBackground(new java.awt.Color(102, 102, 102));
                                                                                                addClass_label.setFont(new java.awt.Font("Dialog", 1, 14));
                                                                                                addClass_label.setForeground(new java.awt.Color(51, 51, 51));
                                                                                                addClass_label.setText("Add Class:");
                                                                                                
                                                                                                        clearclass_button.setText("Clear");
                                                                                                        clearclass_button.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                                                clearclass_buttonMouseClicked(evt);
                                                                                                            }
                                                                                                        });
                                                                                                        
                                                                                                                addClass_button.setText("Add");
                                                                                                                addClass_button.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                    @Override
                                                                                                                    public void actionPerformed(ActionEvent evt) {
                                                                                                                        addClasses_buttonActionPerformed(evt);
                                                                                                                    }

                                                                                                                });
                                                                                                                
                                                                                                                JButton classDelete_button = new JButton("Delete");
                                                                                                                classDelete_button.addMouseListener(new MouseAdapter() {
                                                                                                                	@Override
                                                                                                                	public void mouseClicked(MouseEvent arg0) {
                                                                                                                		
                                                                                                                		 try {
                                                                                                                 	    	int row = classes_table.getSelectedRow();
                                                                                                                 	        System.out.println(row); //the number will be the row selected - 1
                                                                                                                 	        String value = (classes_table.getModel().getValueAt(row, 0).toString());
                                                                                                                 	        String query = "DELETE FROM classes where class_id="+value;
                                                                                                                 			ps =  conn.prepareStatement(query);
                                                                                                                 			ps.executeUpdate();
                                                                                                                 			
                                                                                                                 			ps.close();
                                                                                                                 			
                                                                                                                 			DefaultTableModel model = (DefaultTableModel) classes_table.getModel();
                                                                                                                 		     model.setRowCount(0);
                                                                                                                 			fetchClasses();
                                                                                                                 			
                                                                                                                 		     JOptionPane.showMessageDialog(null, "Class deleted!");
                                                                                                                 	    } catch (Exception e) {
                                                                                                                 			JOptionPane.showMessageDialog(null, e);
                                                                                                                 			
                                                                                                                 		}
                                                                                                                		
                                                                                                                		
                                                                                                                		
                                                                                                                	}
                                                                                                                });
                                                                                                                
                                                                                                                        javax.swing.GroupLayout addclass_tabLayout = new javax.swing.GroupLayout(addclass_tab);
                                                                                                                        addclass_tabLayout.setHorizontalGroup(
                                                                                                                        	addclass_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        		.addGroup(addclass_tabLayout.createSequentialGroup()
                                                                                                                        			.addComponent(addclass_spanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                        			.addGroup(addclass_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        				.addGroup(addclass_tabLayout.createSequentialGroup()
                                                                                                                        					.addGap(200)
                                                                                                                        					.addGroup(addclass_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        						.addGroup(addclass_tabLayout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                        							.addComponent(classtitle_label)
                                                                                                                        							.addComponent(classid_label)
                                                                                                                        							.addComponent(credit_label)
                                                                                                                        							.addComponent(subject_label)
                                                                                                                        							.addComponent(classtitle_input)
                                                                                                                        							.addComponent(classid_input, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                                                                                                        							.addComponent(credit_input)
                                                                                                                        							.addComponent(subject_input))
                                                                                                                        						.addComponent(addClass_label)))
                                                                                                                        				.addGroup(addclass_tabLayout.createSequentialGroup()
                                                                                                                        					.addGap(323)
                                                                                                                        					.addComponent(clearclass_button)
                                                                                                                        					.addGap(18)
                                                                                                                        					.addComponent(addClass_button)
                                                                                                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        					.addComponent(classDelete_button)))
                                                                                                                        			.addGap(0, 440, Short.MAX_VALUE))
                                                                                                                        );
                                                                                                                        addclass_tabLayout.setVerticalGroup(
                                                                                                                        	addclass_tabLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        		.addComponent(addclass_spanel, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                                                                                                                        		.addGroup(addclass_tabLayout.createSequentialGroup()
                                                                                                                        			.addGap(45)
                                                                                                                        			.addComponent(addClass_label)
                                                                                                                        			.addGap(31)
                                                                                                                        			.addComponent(classtitle_label)
                                                                                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        			.addComponent(classtitle_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                        			.addComponent(classid_label)
                                                                                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        			.addComponent(classid_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                        			.addComponent(credit_label)
                                                                                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        			.addComponent(credit_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                        			.addComponent(subject_label)
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                        			.addComponent(subject_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                        			.addGap(18)
                                                                                                                        			.addGroup(addclass_tabLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                        				.addComponent(classDelete_button)
                                                                                                                        				.addComponent(addClass_button)
                                                                                                                        				.addComponent(clearclass_button))
                                                                                                                        			.addContainerGap(346, Short.MAX_VALUE))
                                                                                                                        );
                                                                                                                        addclass_tab.setLayout(addclass_tabLayout);
                                                                                                                        
                                                                                                                                admin_tab.addTab("Add Class", addclass_tab);


        javax.swing.GroupLayout update_tabLayout = new javax.swing.GroupLayout(update_tab);
        update_tab.setLayout(update_tabLayout);
        update_tabLayout.setHorizontalGroup(
                update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(update_tabLayout.createSequentialGroup()
                                .addComponent(update_spanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(updateClassTitle_label)
                                                .addComponent(updateClassID_label)
                                                .addComponent(updateClassCredit_label)
                                                .addComponent(updateClassSubject_label)
                                                .addComponent(updateClassTitle_input)
                                                .addComponent(updateClassID_input)
                                                .addComponent(updateClassCredit_input)
                                                .addComponent(updateClassSubject_input, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(updateclass_label)
                                        .addGroup(update_tabLayout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(classUpdateClear)
                                                .addGap(30, 30, 30)
                                                .addComponent(classUpdateButton)))
                                .addGap(200, 200, 200))
        );
        update_tabLayout.setVerticalGroup(
                update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(update_spanel, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                        .addGroup(update_tabLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(updateclass_label)
                                .addGap(31, 31, 31)
                                .addComponent(updateClassTitle_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateClassTitle_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateClassID_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateClassID_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateClassCredit_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateClassCredit_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateClassSubject_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateClassSubject_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(classUpdateClear)
                                        .addComponent(classUpdateButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admin_tab.addTab("Update Class", update_tab);

        classinstructor_tab.setBackground(new java.awt.Color(255, 255, 255));

        classinstructor_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        classinstructor_spanel.setViewportView(classinstructor_table);

        classinstructor_label.setFont(new java.awt.Font("Dialog", 1, 14)); 
        classinstructor_label.setForeground(new java.awt.Color(51, 51, 51));
        classinstructor_label.setText("Class Instructors:");

        crn_label.setForeground(new java.awt.Color(51, 51, 51));
        crn_label.setText("CRN:");

        crn_input.setBackground(new java.awt.Color(255, 255, 255));
        crn_input.setForeground(new java.awt.Color(51, 51, 51));
        crn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crn_inputActionPerformed(evt);
            }
        });

        teachid_label.setForeground(new java.awt.Color(51, 51, 51));
        teachid_label.setText("Teacher ID:");

        teachid_input.setBackground(new java.awt.Color(255, 255, 255));
        teachid_input.setForeground(new java.awt.Color(51, 51, 51));

        clasid_label.setForeground(new java.awt.Color(51, 51, 51));
        clasid_label.setText("Class ID:");

        clasid_input.setBackground(new java.awt.Color(255, 255, 255));
        clasid_input.setForeground(new java.awt.Color(51, 51, 51));

        semester_label.setForeground(new java.awt.Color(51, 51, 51));
        semester_label.setText("Semester:");

        semester_input.setBackground(new java.awt.Color(255, 255, 255));
        semester_input.setForeground(new java.awt.Color(51, 51, 51));

        clearinstructors_button.setText("Clear");
        clearinstructors_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearinstructors_buttonMouseClicked(evt);
            }
        });

        addinstructor_button.setText("Add");

        days_label.setForeground(new java.awt.Color(51, 51, 51));
        days_label.setText("Days:");

        days_input.setBackground(new java.awt.Color(255, 255, 255));
        days_input.setForeground(new java.awt.Color(51, 51, 51));

        classtime_label.setForeground(new java.awt.Color(51, 51, 51));
        classtime_label.setText("Class Time:");

        classtime_input.setBackground(new java.awt.Color(255, 255, 255));
        classtime_input.setForeground(new java.awt.Color(51, 51, 51));
        
        instructorsDelete_button = new JButton("Delete");

        javax.swing.GroupLayout classinstructor_tabLayout = new javax.swing.GroupLayout(classinstructor_tab);
        classinstructor_tabLayout.setHorizontalGroup(
        	classinstructor_tabLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(classinstructor_tabLayout.createSequentialGroup()
        			.addComponent(classinstructor_spanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(classinstructor_tabLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(classinstructor_tabLayout.createSequentialGroup()
        					.addGap(306)
        					.addComponent(clearinstructors_button)
        					.addGap(18)
        					.addComponent(addinstructor_button)
        					.addGap(18)
        					.addComponent(instructorsDelete_button))
        				.addGroup(classinstructor_tabLayout.createSequentialGroup()
        					.addGap(200)
        					.addGroup(classinstructor_tabLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(classtime_label)
        						.addComponent(crn_label)
        						.addComponent(teachid_label)
        						.addComponent(clasid_label)
        						.addComponent(semester_label)
        						.addComponent(crn_input)
        						.addComponent(teachid_input)
        						.addComponent(clasid_input)
        						.addComponent(semester_input, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        						.addComponent(classinstructor_label)
        						.addComponent(days_label)
        						.addComponent(days_input)
        						.addComponent(classtime_input))))
        			.addContainerGap())
        );
        classinstructor_tabLayout.setVerticalGroup(
        	classinstructor_tabLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(classinstructor_spanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(classinstructor_tabLayout.createSequentialGroup()
        			.addGap(45)
        			.addComponent(classinstructor_label)
        			.addGap(31)
        			.addComponent(crn_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(crn_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(teachid_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(teachid_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(clasid_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(clasid_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(semester_label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(semester_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(days_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(days_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(classtime_label)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(classtime_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(classinstructor_tabLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(clearinstructors_button)
        				.addComponent(addinstructor_button)
        				.addComponent(instructorsDelete_button)))
        );
        classinstructor_tab.setLayout(classinstructor_tabLayout);

        admin_tab.addTab("Class Instructors", classinstructor_tab);

        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("door12.png"))); // NOI18N
        logout_button.setText("Logout");
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout admin_panelLayout = new javax.swing.GroupLayout(admin_panel);
        admin_panelLayout.setHorizontalGroup(
        	admin_panelLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(admin_tab, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(admin_panelLayout.createSequentialGroup()
        			.addComponent(logout_button)
        			.addGap(229))
        );
        admin_panelLayout.setVerticalGroup(
        	admin_panelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(admin_panelLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(logout_button)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(admin_tab, GroupLayout.PREFERRED_SIZE, 797, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        admin_panel.setLayout(admin_panelLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(admin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 841, Short.MAX_VALUE)
        );

        pack();
    }

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        int logout_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (logout_con == 0) {
            AdminLogin log = new AdminLogin();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
    }
    
    private void teachersDelete_buttonMouseClicked(java.awt.event.MouseEvent evt) {
    
    	 int delete_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);

         if (delete_con == 0) {
    	 try {
    	    	int row = teachers_table.getSelectedRow();
    	        System.out.println(row); //the number will be the row selected - 1
    	        String value = (teachers_table.getModel().getValueAt(row, 0).toString());
    	        String query = "DELETE FROM teacher where teacher_id="+value;
    			ps =  conn.prepareStatement(query);
    			ps.executeUpdate();
    			
    			ps.close();
    			
    			DefaultTableModel model = (DefaultTableModel) teachers_table.getModel();
    		     model.setRowCount(0);
    			fetchTeachers();
    			
    		     JOptionPane.showMessageDialog(null, "Teacher deleted!");
    	    } catch (Exception e) {
    			JOptionPane.showMessageDialog(null, e);
    			
    		}
         }
    }
    
    private void studentsDelete_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        
       int delete_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);

       if (delete_con == 0) {
    	try {
   	    	int row = student_table.getSelectedRow();
   	        System.out.println(row); //the number will be the row selected - 1
   	        String value = (student_table.getModel().getValueAt(row, 0).toString());
   	        String query = "DELETE FROM students where panther_num="+value;
   			ps =  conn.prepareStatement(query);
   			ps.executeUpdate();
   			
   			ps.close();
   			
   			DefaultTableModel model = (DefaultTableModel) student_table.getModel();
   		     model.setRowCount(0);
   			fetchStudents();
   			
   		     JOptionPane.showMessageDialog(null, "Student deleted!");
   	    } catch (Exception e) {
   			JOptionPane.showMessageDialog(null, e);
   			
   		}
    }
   }
    private void classDelete_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        
        int delete_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);

        if (delete_con == 0) {
     	try {
    	    	int row = classes_table.getSelectedRow();
    	        System.out.println(row); //the number will be the row selected - 1
    	        String value = (classes_table.getModel().getValueAt(row, 0).toString());
    	        String query = "DELETE FROM classes where class_id="+value;
    			ps =  conn.prepareStatement(query);
    			ps.executeUpdate();
    			
    			ps.close();
    			
    			DefaultTableModel model = (DefaultTableModel) classes_table.getModel();
    		     model.setRowCount(0);
    			fetchClasses();
    			
    		     JOptionPane.showMessageDialog(null, "Class deleted!");
    	    } catch (Exception e) {
    			JOptionPane.showMessageDialog(null, e);
    			
    		}
     }
    }
    
private void instructorDelete_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        
        int delete_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);

        if (delete_con == 0) {
     	try {
    	    	int row = classinstructor_table.getSelectedRow();
    	        System.out.println(row); //the number will be the row selected - 1
    	        String value = (classinstructor_table.getModel().getValueAt(row, 0).toString());
    	        String query = "DELETE FROM teacher_class where CRN="+value;
    			ps =  conn.prepareStatement(query);
    			ps.executeUpdate();
    			
    			ps.close();
    			
    			DefaultTableModel model = (DefaultTableModel) classinstructor_table.getModel();
    		     model.setRowCount(0);
    			fetchClasses();
    			
    		     JOptionPane.showMessageDialog(null, "Class deleted!");
    	    } catch (Exception e) {
    			JOptionPane.showMessageDialog(null, e);
    			
    		}
     }
    }
    
    
   
    
    
    
    
    
    

    private void classtitle_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void fname_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void firstname_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void crn_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addClasses_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String title = classtitle_input.getText().trim().toUpperCase();
            String id = classid_input.getText().trim().toUpperCase();
            int credit = Integer.parseInt(credit_input.getText());
            String subject = subject_input.getText().trim().toUpperCase();

            String sql = "INSERT INTO classes " + "(class_id,class_name,class_credit,class_subj) "
                    + "VALUES('" + id + "','" + title + "','" + credit + "','" + subject + "') ";

            statement.execute(sql);

            JOptionPane.showMessageDialog(null, "Added Successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        fetchClasses();
    }

    private void addTeacher_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String firstName = teacherFirstName_input.getText().trim().toUpperCase();
            String lastName = teacherLastName_input.getText().trim().toUpperCase();
            int id = Integer.parseInt(teacherid_input.getText());
            String prefix = teacherPrefix_input.getText().trim().toUpperCase();

            String sql = "INSERT INTO teacher " + "(teacher_id, teacher_title, teacher_first_name, teacher_last_name) "
                    + "VALUES('" + id + "','" + prefix + "','" + firstName + "','" + lastName + "') ";

            statement.execute(sql);

            JOptionPane.showMessageDialog(null, "Added Successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
		fetchTeachers();
    }



    private void addStudents_buttonActionPerformed(java.awt.event.ActionEvent evt) {
      
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String firstName = studentFirstName_input.getText().trim().toUpperCase();
            String lastName =  studentGpa_input.getText().trim().toUpperCase();
            String studentID = studentId_input.getText();
            String password = studentPassword_input.getText().trim();
            String email = studentEmail_input.getText().trim();
            int stellarNum = Integer.parseInt(stellarnum_input.getText());
            int gpa = Integer.parseInt(studentGpa_input.getText());
            String bday = studentBday_input.getText().trim().toUpperCase();
            String major = studentMajor_input.getText().trim().toUpperCase();
            String schoolYear = studentYear_input.getText().trim().toUpperCase();
            
            String phone = studentPhone_input.getText().trim().toUpperCase();
            String address = studentAddress_input.getText().trim().toUpperCase();
            String state = studentState_input.getText().trim().toUpperCase();
            String city = studentCity_input.getText().trim().toUpperCase();
            int zip = Integer.parseInt(studentZip_input.getText());
            

            String sql = "INSERT INTO students "
                    + "(panther_num, first_name, last_name, email, student_id, password, GPA, bday, major, school_year, phone, address, state, city, zipcode) "
                    + "VALUES('" + stellarNum + "','" + firstName + "','" + lastName + "','" + email + "','"
                    + studentID + "','" + password + "','" + gpa + "','" + bday + "','" + major + "','" + schoolYear + "', '" + phone + "', '" + address + "', '" + state + "', '" + city + "', '" + zip + "') ";

            statement.execute(sql);

            JOptionPane.showMessageDialog(null, "Added Successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        
        fetchStudents();

    }

    private void updateClasses_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String title = updateClassTitle_input.getText().trim().toUpperCase();
            String id = updateClassID_input.getText().trim().toUpperCase();
            int credit = Integer.parseInt(updateClassID_input.getText());
            String subject = updateClassSubject_input.getText().trim().toUpperCase();

            String sql = "INSERT or REPLACE INTO classes " + "(class_id,class_name,class_credit,class_subj) "
                    + "VALUES('" + title + "','" + id + "','" + credit + "','" + subject + "') ";

            statement.execute(sql);

            JOptionPane.showMessageDialog(null, "Updated Successfully!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void addInstructor_buttonActionPerformed(java.awt.event.ActionEvent evt)
    {
    	 Statement statement = null;

         try {
             statement = connection.createStatement();

             String crn = crn_input.getText().trim().toUpperCase();
             int id = Integer.parseInt(teachid_input.getText());
             String class_id = clasid_input.getText().trim().toUpperCase();
             String semester = semester_input.getText().trim().toUpperCase();
             String day = days_input.getText().trim().toUpperCase();
             String time = classtime_input.getText().trim().toUpperCase();


             String sql = "INSERT INTO teacher_class " + "(CRN,teacher_id,class_id,semester,day,class_time) "
                     + "VALUES('" + crn + "','" + id + "','" + class_id + "','" + semester + "','" + day + "','" + time + "') ";

             statement.execute(sql);

             JOptionPane.showMessageDialog(null, "Added Successfully!");

         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
             e.printStackTrace();
         }
    }

    private void clearclass_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        classtitle_input.setText("");
        classid_input.setText("");
        credit_input.setText("");
        subject_input.setText("");
    }

    private void clearteacher_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        teacherFirstName_input.setText("");
        teacherLastName_input.setText("");
        teacherid_input.setText("");
        teacherPrefix_input.setText("");

    }

    private void clearstudent_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        studentFirstName_input.setText("");
        studentGpa_input.setText("");
        studentId_input.setText("");
        stellarnum_input.setText("");
        studentEmail_input.setText("");
        studentGpa_input.setText("");
        studentMajor_input.setText("");
        studentYear_input.setText("");
        studentBday_input.setText("");
        studentPassword_input.setText("");

    }

    private void clearinstructors_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        crn_input.setText("");
        teachid_input.setText("");
        clasid_input.setText("");
        semester_input.setText("");
        days_input.setText("");
        classtime_input.setText("");

   

   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    public void staricon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));

    }
    
    public void fetchStudents (){

        try{
        
            String stdTable = "select * from students";
            pst = connection.prepareStatement(stdTable);
            rs = pst.executeQuery();
            student_table.setModel(DbUtils.resultSetToTableModel(rs));
           
            rs.close();
			pst.close();
            
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    
     }
       public void fetchTeachers (){

        try{
        
            String teachTable = "select * from teacher";
            pst = connection.prepareStatement(teachTable);
            rs = pst.executeQuery();
            teachers_table.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
			pst.close();
            
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    
     }
    
      public void fetchClasses(){

        try{
            String classTable = "select * from classes";
            pst = connection.prepareStatement(classTable);
            rs = pst.executeQuery();
           classes_table.setModel(DbUtils.resultSetToTableModel(rs));
          
           rs.close();
		   pst.close();
            
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    
     }
      
      
       public void fetchClassInstructor(){

        try{
        
           String cinstructTable = "select teacher_class.class_id, teacher_class.CRN, teacher_class.semester, teacher_class.day, teacher_class.class_time, classes.class_name, classes.class_credit, classes.class_subj, teacher.teacher_last_name "
           		+ "from teacher_class INNER JOIN classes on classes.class_id = teacher_class.class_id "
           		+ "INNER JOIN teacher on teacher.teacher_id = teacher_class.teacher_id";
            pst = connection.prepareStatement(cinstructTable);
            rs = pst.executeQuery();
            classinstructor_table.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
			pst.close();
            
            
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    
     }
}