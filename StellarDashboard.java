package stellar;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class StellarDashboard extends javax.swing.JFrame {


    private javax.swing.JLabel Schedule_label;
    private javax.swing.JPanel addClass_panel;
    private javax.swing.JButton addclass_button1;
    private javax.swing.JLabel addclasstitle_label;
    private javax.swing.JTable addedClass_table;
    public static javax.swing.JLabel balance;
    private javax.swing.JLabel balance_label;
    private javax.swing.JLabel balancemessege_label;
    private javax.swing.JTable classes_table;
    private javax.swing.JScrollPane classestable_scroll;
    private javax.swing.JLabel concentration_label;
    private javax.swing.JTextField courseid_input;
    private javax.swing.JLabel courseid_label;
    private javax.swing.JComboBox<String> credits_combobox;
    private javax.swing.JLabel credits_label;
    private javax.swing.JMenuItem dash_menu;
    private javax.swing.JPanel dash_panel;
    private javax.swing.JComboBox<String> days_combobox;
    private javax.swing.JLabel days_label;
    public static javax.swing.JLabel email;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel exclaim_text;
    private javax.swing.JButton finances_button;
    private javax.swing.JPanel finances_panel;
    public static javax.swing.JLabel firstname;
    public static javax.swing.JLabel firstnameHeader;
    public static javax.swing.JLabel gpa;
    private javax.swing.JLabel gpa_label;
    private javax.swing.JButton home_button;
    private javax.swing.JMenu home_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lastname;
    public static javax.swing.JLabel lastnameHeader;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel mainpanel;
    public static javax.swing.JLabel major;
    private javax.swing.JLabel major_label;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton register_button;
    private javax.swing.JScrollPane registration_menu;
    private javax.swing.JButton remove_button;
    private javax.swing.JButton removeclass_button;
    private javax.swing.JButton reset_button1;
    private javax.swing.JButton schedule_button;
    private javax.swing.JTable schedule_table;
    private javax.swing.JComboBox<String> semester_combobox;
    private javax.swing.JLabel semester_label;
    private javax.swing.JMenu setting_menu;
    private javax.swing.JPanel sidemenu;
    private javax.swing.JLabel starimage;
    public static javax.swing.JLabel studentCon;
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
    DefaultTableModel dtable;


    public StellarDashboard() {
        connection = DatabaseConnection.dbConnector();

        initComponents();
        setTitle("Stellar");
        setLocationRelativeTo(null);
        staricon();
        fetchClass();
        fetchRegClasses();
        fetchSchudleClasses();
        CalculateCredit();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        firstnameHeader = new javax.swing.JLabel();
        lastnameHeader = new javax.swing.JLabel();
        sidemenu = new javax.swing.JPanel();
        home_button = new javax.swing.JButton();
        schedule_button = new javax.swing.JButton();
        addclass_button1 = new javax.swing.JButton();
        finances_button = new javax.swing.JButton();
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
        totalcredits = new javax.swing.JLabel();
        totalcredits_label = new javax.swing.JLabel();
        studentMajor = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        schedule_table = new javax.swing.JTable();
        removeclass_button = new javax.swing.JButton();
        removeclass_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int row = schedule_table.getSelectedRow();
                    System.out.println(row); //the number will be the row selected - 1
                    String CRN = (schedule_table.getValueAt(row, 1).toString());
                    String query = "DELETE FROM classesTaken where CRN=" + CRN;
                    pst = connection.prepareStatement(query);
                    pst.executeUpdate();

                    pst.close();

                    //DefaultTableModel model = (DefaultTableModel) addedClass_table.getModel();
                    // model.setRowCount(0);
                    fetchRegClasses();
                    fetchSchudleClasses();
                    CalculateCredit();
                    JOptionPane.showMessageDialog(null, "Class Dropped!");
                } catch (Exception E) {
                    JOptionPane.showMessageDialog(null, E);

                }
            }
        });
        addClass_panel = new javax.swing.JPanel();
        registration_menu = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        semester_label = new javax.swing.JLabel();
        semester_combobox = new javax.swing.JComboBox<>();
        semester_combobox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent arg0) {


                //String query = semester_combobox.getSelectedItem().toString();
                String query1 = semester_combobox.getSelectedItem().toString();
                String query2 = (String) subject_list.getSelectedValue();
                String query3 = (String) courseid_input.getText().toUpperCase();
                String query4 = days_combobox.getSelectedItem().toString();
                String query5 = credits_combobox.getSelectedItem().toString();
                idFilter(query1, query2, query3, query4, query5);
                //filterData(query);

            }
        });
        subject_label = new javax.swing.JLabel();
        subjectlist_scroll = new javax.swing.JScrollPane();
        subject_list = new javax.swing.JList<>();
        subject_list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {

                //String query = subject_list.getSelectedValue().toString();
                String query1 = semester_combobox.getSelectedItem().toString();
                String query2 = (String) subject_list.getSelectedValue();
                String query3 = (String) courseid_input.getText().toUpperCase();
                String query4 = days_combobox.getSelectedItem().toString();
                String query5 = credits_combobox.getSelectedItem().toString();
                idFilter(query1, query2, query3, query4, query5);
                //filterData(query);
            }
        });
        courseid_label = new javax.swing.JLabel();
        courseid_input = new javax.swing.JTextField();
        courseid_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String query1 = semester_combobox.getSelectedItem().toString();
                String query2 = (String) subject_list.getSelectedValue();
                String query3 = (String) courseid_input.getText().toUpperCase();
                String query4 = days_combobox.getSelectedItem().toString();
                String query5 = credits_combobox.getSelectedItem().toString();
                idFilter(query1, query2, query3, query4, query5);

            }
        });
        days_label = new javax.swing.JLabel();
        credits_combobox = new javax.swing.JComboBox<>();
        credits_combobox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

//        		String query = credits_combobox.getSelectedItem().toString();
                String query1 = semester_combobox.getSelectedItem().toString();
                String query2 = (String) subject_list.getSelectedValue();
                String query3 = (String) courseid_input.getText().toUpperCase();
                String query4 = days_combobox.getSelectedItem().toString();
                String query5 = credits_combobox.getSelectedItem().toString();
                idFilter(query1, query2, query3, query4, query5);
                //	filterData(query);
            }
        });
        credits_label = new javax.swing.JLabel();
        days_combobox = new javax.swing.JComboBox<>();
        days_combobox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

//        		String query = days_combobox.getSelectedItem().toString();
                String query1 = semester_combobox.getSelectedItem().toString();
                String query2 = (String) subject_list.getSelectedValue();
                String query3 = (String) courseid_input.getText().toUpperCase();
                String query4 = days_combobox.getSelectedItem().toString();
                String query5 = credits_combobox.getSelectedItem().toString();
                idFilter(query1, query2, query3, query4, query5);
                //	filterData(query);
            }
        });
        addclasstitle_label = new javax.swing.JLabel();
        classestable_scroll = new javax.swing.JScrollPane();
        classes_table = new javax.swing.JTable();
        register_button = new javax.swing.JButton();
        register_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String s = balance.getText();
                String t = totalcredits.getText();

                int b = Integer.parseInt(s);
                int total = Integer.parseInt(t);

                if (b <= 0) {
                    if (total <= 14) {
                        try {
                            int row = classes_table.getSelectedRow();

                            String classID = (classes_table.getValueAt(row, 0).toString());
                            String student_id = studentidnum.getText();
                            String class_day = (classes_table.getValueAt(row, 3).toString());
                            String CRN = (classes_table.getValueAt(row, 1).toString());
                            String semester_taken = (classes_table.getValueAt(row, 2).toString());
                            String classTimes = (classes_table.getValueAt(row, 4).toString());
                            String[] class_time = classTimes.split(" - ", 2);
                            String start_time = class_time[0];
                            String end_time = class_time[1];

                            // Change the class hours to 24 hour format
                            SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");
                            SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
                            start_time = date24Format.format(date12Format.parse(start_time));
                            end_time = date24Format.format(date12Format.parse(end_time));

//                          This query passes the student id and returns results if clases were signed up
                            String queryNew = "select * FROM classesTaken where panther_num = ? AND day = ? AND semesterTaken = ?"
                                    + "AND start_time between ? AND ? OR day = ? AND semesterTaken = ? AND end_time BETWEEN ? AND ?";

                            PreparedStatement preparedStatement = connection.prepareStatement(queryNew);

                            preparedStatement.setString(1, student_id);
                            preparedStatement.setString(2, class_day);
                            preparedStatement.setString(3, semester_taken);
                            preparedStatement.setString(4, start_time);
                            preparedStatement.setString(5, end_time);
                            preparedStatement.setString(6, class_day);
                            preparedStatement.setString(7, semester_taken);
                            preparedStatement.setString(8, start_time);
                            preparedStatement.setString(9, end_time);
                            ResultSet resultSet = preparedStatement.executeQuery();

//                            If the query returns any classes then there is a class conflict
                            if (resultSet.next()) {
                                JOptionPane.showMessageDialog(null, "Classes conflict error.");
                            }
//                            If no result then we can now register for the class
                            else if (!resultSet.next()) {
                                String query = "insert into classesTaken values('" + student_id + "','" + classID + "','" + semester_taken + "','"
                                        + CRN + "','" + class_day + "','" + start_time + "','" + end_time + "') ";

                                pst = connection.prepareStatement(query);

                                pst.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Class added for registration.");

                                pst.close();
                            }

                        } catch (Exception E) {
                            JOptionPane.showMessageDialog(null, E);
                        }
                    }
//                    Reached max hours for registration
                    else {
                        JOptionPane.showMessageDialog(null, "You reached maximum credit hours !!");
                    }
                }
//                Postitive balance prevents class registatrion
                else {
                    JOptionPane.showMessageDialog(null, "Hold present on the account due to finances.");
                }

                fetchRegClasses();
                fetchSchudleClasses();
                CalculateCredit();


            }
        });
        errorMessage = new javax.swing.JLabel();
        remove_button = new javax.swing.JButton();
        remove_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int row = addedClass_table.getSelectedRow();
                    System.out.println(row); //the number will be the row selected - 1
                    String CRN = (addedClass_table.getValueAt(row, 1).toString());
                    String query = "DELETE FROM classesTaken where CRN=" + CRN;
                    pst = connection.prepareStatement(query);
                    pst.executeUpdate();

                    pst.close();

                    fetchRegClasses();
                    fetchSchudleClasses();
                    CalculateCredit();
                    JOptionPane.showMessageDialog(null, "Class Dropped!");
                } catch (Exception E) {
                    JOptionPane.showMessageDialog(null, E);

                }


            }
        });
        jScrollPane1 = new javax.swing.JScrollPane();
        addedClass_table = new javax.swing.JTable();
        reset_button1 = new javax.swing.JButton();
        reset_button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetData(e);
            }
        });
        reset_button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        finances_panel = new javax.swing.JPanel();
        balancemessege_label = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        home_menu = new javax.swing.JMenu();
        dash_menu = new javax.swing.JMenuItem();
        setting_menu = new javax.swing.JMenu();
        setting_menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
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

        lblWelcome.setFont(new java.awt.Font("Century Gothic", 1, 14));
        lblWelcome.setForeground(new java.awt.Color(51, 51, 51));
        lblWelcome.setText("Welcome,");

        firstnameHeader.setFont(new java.awt.Font("Century Gothic", 1, 14));
        firstnameHeader.setForeground(new java.awt.Color(51, 51, 51));
        firstnameHeader.setText("firstname");

        lastnameHeader.setFont(new java.awt.Font("Century Gothic", 1, 14));
        lastnameHeader.setForeground(new java.awt.Color(51, 51, 51));
        lastnameHeader.setText("lastname");

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panelLayout.setHorizontalGroup(
                menu_panelLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(menu_panelLayout.createSequentialGroup()
                                .addContainerGap(1043, Short.MAX_VALUE)
                                .addComponent(lblWelcome)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(firstnameHeader)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lastnameHeader)
                                .addGap(48)
                                .addComponent(logout_button)
                                .addGap(22))
        );
        menu_panelLayout.setVerticalGroup(
                menu_panelLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(menu_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(menu_panelLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(logout_button)
                                        .addComponent(lastnameHeader)
                                        .addComponent(firstnameHeader)
                                        .addComponent(lblWelcome))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_panel.setLayout(menu_panelLayout);

        sidemenu.setBackground(new java.awt.Color(14, 17, 45));

        home_button.setBackground(new java.awt.Color(14, 17, 45));
        home_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        home_button.setForeground(new java.awt.Color(255, 255, 255));
        home_button.setText("Home");
        home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_buttonMouseClicked(evt);
            }
        });
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        schedule_button.setBackground(new java.awt.Color(14, 17, 45));
        schedule_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        schedule_button.setForeground(new java.awt.Color(255, 255, 255));
        schedule_button.setText("View Schedule");
        schedule_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedule_buttonActionPerformed(evt);
            }
        });

        addclass_button1.setBackground(new java.awt.Color(14, 17, 45));
        addclass_button1.setFont(new java.awt.Font("Century Gothic", 1, 14));
        addclass_button1.setForeground(new java.awt.Color(255, 255, 255));
        addclass_button1.setText("Add/Drop Classes");
        addclass_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclass_button1ActionPerformed(evt);
            }
        });

        finances_button.setBackground(new java.awt.Color(14, 17, 45));
        finances_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        finances_button.setForeground(new java.awt.Color(255, 255, 255));
        finances_button.setText("Finances");
        finances_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finances_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidemenuLayout = new javax.swing.GroupLayout(sidemenu);
        sidemenu.setLayout(sidemenuLayout);
        sidemenuLayout.setHorizontalGroup(
                sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidemenuLayout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addGroup(sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(finances_button, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addclass_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(schedule_button, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );
        sidemenuLayout.setVerticalGroup(
                sidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidemenuLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addclass_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(schedule_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(finances_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        studentFirstname.setFont(new java.awt.Font("Century Gothic", 0, 18));
        studentFirstname.setForeground(new java.awt.Color(102, 102, 102));
        studentFirstname.setText("Fname");

        studentLastname.setFont(new java.awt.Font("Century Gothic", 0, 18));
        studentLastname.setForeground(new java.awt.Color(102, 102, 102));
        studentLastname.setText("Lname");

        studentYear_label.setFont(new java.awt.Font("Century Gothic", 1, 18));
        studentYear_label.setForeground(new java.awt.Color(102, 102, 102));
        studentYear_label.setText("Year:");

        studentYear.setFont(new java.awt.Font("Century Gothic", 0, 18));
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

        studentCon.setFont(new java.awt.Font("Century Gothic", 0, 18));
        studentCon.setForeground(new java.awt.Color(102, 102, 102));
        studentCon.setText("Con");

        totalcredits.setFont(new java.awt.Font("Century Gothic", 0, 18));
        totalcredits.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits.setText("4");

        totalcredits_label.setFont(new java.awt.Font("Century Gothic", 1, 18));
        totalcredits_label.setForeground(new java.awt.Color(102, 102, 102));
        totalcredits_label.setText("Total Credits:");

        studentMajor.setFont(new java.awt.Font("Century Gothic", 0, 18));
        studentMajor.setForeground(new java.awt.Color(102, 102, 102));
        studentMajor.setText("studentMajor");

        schedule_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(schedule_table);

        removeclass_button.setBackground(new java.awt.Color(14, 17, 45));
        removeclass_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        removeclass_button.setForeground(new java.awt.Color(255, 255, 255));
        removeclass_button.setText("Remove");

        javax.swing.GroupLayout viewSchedule_panelLayout = new javax.swing.GroupLayout(viewSchedule_panel);
        viewSchedule_panel.setLayout(viewSchedule_panelLayout);
        viewSchedule_panelLayout.setHorizontalGroup(
                viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                                .addComponent(name_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentFirstname)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentLastname))
                                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                                .addComponent(totalcredits_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(totalcredits))
                                                        .addComponent(Schedule_label))
                                                .addContainerGap(32, Short.MAX_VALUE))
                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                                .addComponent(studentMajor_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentMajor))
                                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                                .addComponent(studentYear_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentYear))
                                                        .addGroup(viewSchedule_panelLayout.createSequentialGroup()
                                                                .addComponent(concentration_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentCon)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSchedule_panelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeclass_button)
                                .addGap(545, 545, 545))
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
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeclass_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(viewSchedule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalcredits_label)
                                        .addComponent(totalcredits))
                                .addGap(111, 111, 111))
        );

        mainpanel.add(viewSchedule_panel, "card4");

        addClass_panel.setBackground(new java.awt.Color(255, 255, 255));

        registration_menu.setBackground(new java.awt.Color(255, 255, 255));
        registration_menu.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        semester_label.setFont(new java.awt.Font("Century Gothic", 1, 12));
        semester_label.setForeground(new java.awt.Color(14, 17, 45));
        semester_label.setText("Semester:");

        semester_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Spring 2020", "Summer 2020", "Fall 2020"}));

        subject_label.setFont(new java.awt.Font("Century Gothic", 1, 12));
        subject_label.setForeground(new java.awt.Color(14, 17, 45));
        subject_label.setText("Subject:");

        subject_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"ART", "BIO", "CSC", "HIST", "MUA"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
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

        credits_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));
        credits_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits_comboboxActionPerformed(evt);
            }
        });

        credits_label.setFont(new java.awt.Font("Century Gothic", 1, 12));
        credits_label.setForeground(new java.awt.Color(14, 17, 45));
        credits_label.setText("Credits:");

        days_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"MW", "TR", "F", "M", "T", "W", "R"}));

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
                                        .addComponent(days_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(days_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(253, Short.MAX_VALUE))
        );

        registration_menu.setViewportView(jPanel1);

        addclasstitle_label.setBackground(new java.awt.Color(14, 17, 45));
        addclasstitle_label.setFont(new java.awt.Font("Century Gothic", 1, 18));
        addclasstitle_label.setForeground(new java.awt.Color(14, 17, 45));
        addclasstitle_label.setText("Class Selection:");

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
        classestable_scroll.setViewportView(classes_table);

        register_button.setBackground(new java.awt.Color(14, 17, 45));
        register_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("Register");

        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        errorMessage.setText("ERROR");

        remove_button.setBackground(new java.awt.Color(14, 17, 45));
        remove_button.setFont(new java.awt.Font("Century Gothic", 1, 14));
        remove_button.setForeground(new java.awt.Color(255, 255, 255));
        remove_button.setText("Remove");

        addedClass_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(addedClass_table);

        reset_button1.setBackground(new java.awt.Color(14, 17, 45));
        reset_button1.setFont(new java.awt.Font("Century Gothic", 1, 14));
        reset_button1.setForeground(new java.awt.Color(255, 255, 255));
        reset_button1.setText("Reset");

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
                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addClass_panelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                                                                .addGap(0, 278, Short.MAX_VALUE)
                                                                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(reset_button1)
                                                                .addGap(343, 343, 343))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                                                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jScrollPane1)
                                                                        .addComponent(classestable_scroll))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(errorMessage)
                                                                .addContainerGap())))
                                        .addGroup(addClass_panelLayout.createSequentialGroup()
                                                .addGap(403, 403, 403)
                                                .addComponent(remove_button)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        addClass_panelLayout.setVerticalGroup(
                addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClass_panelLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(addclasstitle_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registration_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addClass_panelLayout.createSequentialGroup()
                                                .addComponent(classestable_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(register_button)
                                                        .addComponent(reset_button1))
                                                .addGap(18, 18, 18)
                                                .addGroup(addClass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(errorMessage)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(remove_button)))
                                .addContainerGap())
        );

        mainpanel.add(addClass_panel, "card3");

        finances_panel.setBackground(new java.awt.Color(255, 255, 255));

        balancemessege_label.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        balancemessege_label.setForeground(new java.awt.Color(102, 102, 102));
        balancemessege_label.setText("Your student balance due is the amount of money you owe on your \"Student Account\".");

        balance_label.setFont(new Font("Century Gothic", Font.BOLD, 40));
        balance_label.setForeground(new java.awt.Color(51, 51, 51));
        balance_label.setText("Balance Due:");

        balance.setBackground(new java.awt.Color(102, 102, 102));
        balance.setFont(new Font("Century Gothic", Font.BOLD, 30));
        balance.setForeground(new java.awt.Color(102, 102, 102));
        balance.setText("Balance");

        JLabel label = new JLabel();
        label.setText(".00");
        label.setForeground(new Color(102, 102, 102));
        label.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label.setBackground(new Color(102, 102, 102));

        JLabel label_1 = new JLabel();
        label_1.setText("$");
        label_1.setForeground(new Color(102, 102, 102));
        label_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label_1.setBackground(new Color(102, 102, 102));

        javax.swing.GroupLayout finances_panelLayout = new javax.swing.GroupLayout(finances_panel);
        finances_panelLayout.setHorizontalGroup(
                finances_panelLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(finances_panelLayout.createSequentialGroup()
                                .addGroup(finances_panelLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(finances_panelLayout.createSequentialGroup()
                                                .addGap(74)
                                                .addComponent(label_1)
                                                .addGap(1)
                                                .addComponent(balance)
                                                .addGap(1)
                                                .addComponent(label))
                                        .addGroup(finances_panelLayout.createSequentialGroup()
                                                .addGap(40)
                                                .addGroup(finances_panelLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(balancemessege_label, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(balance_label))))
                                .addContainerGap(316, Short.MAX_VALUE))
        );
        finances_panelLayout.setVerticalGroup(
                finances_panelLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(finances_panelLayout.createSequentialGroup()
                                .addGap(90)
                                .addComponent(balancemessege_label)
                                .addGap(35)
                                .addComponent(balance_label)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(finances_panelLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(balance)
                                        .addComponent(label, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(496, Short.MAX_VALUE))
        );
        finances_panel.setLayout(finances_panelLayout);

        mainpanel.add(finances_panel, "card5");

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
                                        .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)))
        );

        pack();
    }

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        mainpanel.removeAll();
        mainpanel.add(dash_panel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }

    private void schedule_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        mainpanel.removeAll();
        mainpanel.add(viewSchedule_panel);
        mainpanel.repaint();
        mainpanel.revalidate();
        fetchRegClasses();
        fetchSchudleClasses();
        CalculateCredit();
    }

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        int logout_con = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

        if (logout_con == 0) {
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

    private void courseid_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addclass_button1ActionPerformed(java.awt.event.ActionEvent evt) {
        mainpanel.removeAll();
        mainpanel.add(addClass_panel);
        mainpanel.repaint();
        mainpanel.revalidate();
        fetchRegClasses();
        fetchSchudleClasses();
        CalculateCredit();
    }

    private void home_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        mainpanel.removeAll();
        mainpanel.add(dash_panel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }

    private void credits_comboboxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void finances_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        mainpanel.removeAll();
        mainpanel.add(finances_panel);
        mainpanel.repaint();
        mainpanel.revalidate();

    }

    //Fetch the classes
    public void fetchClass() {

        try {
            String classTable = "select teacher_class.class_id, teacher_class.CRN, teacher_class.semester, teacher_class.day, teacher_class.class_time, classes.class_name, classes.class_credit, classes.class_subj, teacher.teacher_last_name "
                    + "from teacher_class INNER JOIN classes on classes.class_id = teacher_class.class_id "
                    + "INNER JOIN teacher on teacher.teacher_id = teacher_class.teacher_id";
            pst = connection.prepareStatement(classTable);
            rs = pst.executeQuery();
            classes_table.setModel(DbUtils.resultSetToTableModel(rs));

            DefaultTableModel model = (DefaultTableModel) classes_table.getModel();
            String[] col = {"Class ID", "CRN", "Semester", "Day", "Time", "Title", "Credits", "Subject", "Teacher"};
            model.setColumnIdentifiers(col);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }


    private void idFilter(String query1, String query2, String query3, String query4, String query5) {

        ArrayList<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
        if (query2 != null && !query2.isEmpty()) {
            filters.add(RowFilter.regexFilter(query1, 2));
            filters.add(RowFilter.regexFilter(query2, 7));
            filters.add(RowFilter.regexFilter(query3, 0));
            filters.add(RowFilter.regexFilter(query4, 3));
            filters.add(RowFilter.regexFilter(query5, 6));


        } else {
            filters.add(RowFilter.regexFilter(query1, 2));
            filters.add(RowFilter.regexFilter(query3, 0));
            filters.add(RowFilter.regexFilter(query4, 3));
            filters.add(RowFilter.regexFilter(query5, 6));


        }
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(classes_table.getModel());


        sorter.setRowFilter(RowFilter.andFilter(filters));
        classes_table.setRowSorter(sorter);


    }

    private void filterData(String query) {

        dtable = (DefaultTableModel) classes_table.getModel();

        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(dtable);
        classes_table.setRowSorter(t);


        if (query != "All") {

            t.setRowFilter(RowFilter.regexFilter(query));
        } else {
            classes_table.setRowSorter(t);

        }


    }

    private void resetData(java.awt.event.MouseEvent evt) {

        dtable = (DefaultTableModel) classes_table.getModel();

        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(dtable);
        classes_table.setRowSorter(t);


    }

    public static String s;

    private void setID() {
        s = (studentid.getText()).toString();
    }

    private void settings_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        setID();
        Settings2 sett = new Settings2(this);
        sett.setID(s);
        sett.setVisible(true);
        sett.pack();
        sett.setLocationRelativeTo(null);
        //Dispose just closes the pw window, not the entire program
        sett.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    //    Get regular classes
    public void fetchRegClasses() {

        try {

            String student_id = studentidnum.getText();

            String RegTab = "select  classesTaken.class_id, classesTaken.CRN, classesTaken.semesterTaken,classes.class_credit, classesTaken.Day, classesTaken.start_time, classesTaken.end_time, teacher.teacher_title, teacher.teacher_last_name from classesTaken INNER JOIN teacher_class on classesTaken.CRN= teacher_class.CRN INNER JOIN teacher on teacher_class.teacher_id = teacher.teacher_id INNER JOIN classes on classes.class_id = classesTaken.class_id where panther_num = ?";

       /*   String RegTab = "select teacher_class.class_id, teacher_class.CRN, teacher_class.semester, teacher_class.day, teacher_class.class_time, classes.class_name, classes.class_credit, classes.class_subj, teacher.teacher_last_name "
                  + "from teacher_class INNER JOIN classes on classes.class_id = teacher_class.class_id "
          		+ "INNER JOIN teacher on teacher.teacher_id = teacher_class.teacher_id";*/
            pst = connection.prepareStatement(RegTab);
            pst.setString(1, student_id);
            rs = pst.executeQuery();
            addedClass_table.setModel(DbUtils.resultSetToTableModel(rs));

            DefaultTableModel model = (DefaultTableModel) addedClass_table.getModel();
            String[] col = {"Class ID", "CRN", "Semester", "Credits", "Days", "Start Time", "End Time", "Teacher Prefix", "Teacher Lastname"};
            model.setColumnIdentifiers(col);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    /**
     * Displays the table from the database on the View Schedule page
     * Changes the headers titles
     */

//    Fetch the class schedules
    public void fetchSchudleClasses() {

        try {

            String student_id = studentidnum.getText();

            String RegTab = " select classesTaken.class_id, classesTaken.CRN, classesTaken.semesterTaken,classes.class_credit, classesTaken.Day, classesTaken.start_time, classesTaken.end_time, teacher.teacher_title, teacher.teacher_last_name from classesTaken INNER JOIN teacher_class on classesTaken.CRN= teacher_class.CRN INNER JOIN teacher on teacher_class.teacher_id = teacher.teacher_id INNER JOIN classes on classes.class_id = classesTaken.class_id where panther_num = ? ";

            pst = connection.prepareStatement(RegTab);
            pst.setString(1, student_id);
            rs = pst.executeQuery();
            schedule_table.setModel(DbUtils.resultSetToTableModel(rs));

            DefaultTableModel model = (DefaultTableModel) schedule_table.getModel();
            String[] col = {"Class ID", "CRN", "Semester", "Credits", "Days", "Start Time", "End Time", "Teacher Prefix", "Teacher Lastname"};
            model.setColumnIdentifiers(col);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void CalculateCredit() {
        int total = 0;
        for (int i = 0; i < schedule_table.getRowCount(); i++) {
            int Amount = (int) schedule_table.getValueAt(i, 3);
            total = Amount + total;

        }

        totalcredits.setText(String.valueOf(total));

    }

    //Sets window icon to a star image
    public void staricon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));

    }
}
