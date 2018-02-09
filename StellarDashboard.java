package stellar;

public class StellarDashboard extends javax.swing.JFrame {
    /**
     * Creates new form StellarDashboard
     */
    public StellarDashboard() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        dash_panel = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        studentname = new javax.swing.JLabel();
        exclaim = new javax.swing.JLabel();
        term_spring = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_panel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        dash_panel.setBackground(new java.awt.Color(255, 255, 255));

        welcome.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(153, 153, 153));
        welcome.setText("Welcome, ");

        studentname.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        studentname.setForeground(new java.awt.Color(153, 153, 153));
        studentname.setText("StudentName");

        exclaim.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        exclaim.setForeground(new java.awt.Color(153, 153, 153));
        exclaim.setText("!");

        term_spring.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        term_spring.setForeground(new java.awt.Color(153, 153, 153));
        term_spring.setText("Spring 2018");

        javax.swing.GroupLayout dash_panelLayout = new javax.swing.GroupLayout(dash_panel);
        dash_panel.setLayout(dash_panelLayout);
        dash_panelLayout.setHorizontalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(term_spring)
                    .addGroup(dash_panelLayout.createSequentialGroup()
                        .addComponent(welcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exclaim)))
                .addContainerGap(878, Short.MAX_VALUE))
        );
        dash_panelLayout.setVerticalGroup(
            dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(dash_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentname)
                    .addComponent(exclaim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(term_spring)
                .addContainerGap(644, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dash_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
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
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StellarDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dash_panel;
    private javax.swing.JLabel exclaim;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel studentname;
    private javax.swing.JLabel term_spring;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
