package stellar;

import java.awt.Toolkit;
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
        studentname = new javax.swing.JLabel();
        exclaim_text = new javax.swing.JLabel();
        term_text = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        home_menu = new javax.swing.JMenu();
        registration_menu = new javax.swing.JMenu();
        addclass_menu = new javax.swing.JMenuItem();
        schedule_menu = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        welcome_text.setForeground(new java.awt.Color(153, 153, 153));
        welcome_text.setText("Welcome,");

        studentname.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        studentname.setForeground(new java.awt.Color(153, 153, 153));
        studentname.setText("StudentName");

        exclaim_text.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        exclaim_text.setForeground(new java.awt.Color(153, 153, 153));
        exclaim_text.setText("!");

        term_text.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        term_text.setForeground(new java.awt.Color(153, 153, 153));
        term_text.setText("Spring 2018");

        javax.swing.GroupLayout dash_panelLayout = new javax.swing.GroupLayout(dash_panel);
        dash_panel.setLayout(dash_panelLayout);
        dash_panelLayout.setHorizontalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(term_text)
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addComponent(welcome_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exclaim_text)))
                .addContainerGap(1122, Short.MAX_VALUE))
        );
        dash_panelLayout.setVerticalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcome_text)
                    .addComponent(studentname)
                    .addComponent(exclaim_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(term_text)
                .addContainerGap(851, Short.MAX_VALUE))
        );

        home_menu.setText("Home");
        menubar.add(home_menu);

        registration_menu.setText("Registration");

        addclass_menu.setText("Add/Drop Classes");
        registration_menu.add(addclass_menu);

        schedule_menu.setText("Schedule");
        registration_menu.add(schedule_menu);

        menubar.add(registration_menu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dash_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dash_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Sets the Nimbus look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StellarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StellarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StellarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StellarDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StellarDashboard().setVisible(true);
            }
        });
    }
    
    //Method used to set the icon of the program to be a star
    public void staricon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-icon.png")));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addclass_menu;
    private javax.swing.JPanel dash_panel;
    private javax.swing.JLabel exclaim_text;
    private javax.swing.JMenu home_menu;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu registration_menu;
    private javax.swing.JMenuItem schedule_menu;
    public static javax.swing.JLabel studentname;
    private javax.swing.JLabel term_text;
    private javax.swing.JLabel welcome_text;
    // End of variables declaration//GEN-END:variables
}
