
package stellar;

import java.awt.*;

public class ResetPassword extends javax.swing.JFrame {

    public ResetPassword() {
        passReset();
        setTitle("Reset Password");
        setLocationRelativeTo(null);
        staricon();

    }

    @SuppressWarnings("unchecked")
    private void passReset() {

        resetPassword_panel = new javax.swing.JPanel();
        ResetPass_title = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        studentId_input = new javax.swing.JTextField();
        id_line = new javax.swing.JSeparator();
        passwordReset_button = new javax.swing.JButton();
        error_label = new javax.swing.JLabel();
        error_label.setFont(new Font("Century Gothic", Font.PLAIN, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resetPassword_panel.setBackground(new java.awt.Color(255, 255, 255));

        ResetPass_title.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ResetPass_title.setForeground(new java.awt.Color(14, 17, 45));
        ResetPass_title.setText("Reset Password");

        id_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id_label.setForeground(new java.awt.Color(11, 2, 23));
        id_label.setText("Enter your student ID:");

        studentId_input.setBackground(new java.awt.Color(255, 255, 255));
        studentId_input.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        studentId_input.setBorder(null);
        studentId_input.setSelectionColor(new java.awt.Color(153, 102, 255));
        studentId_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentId_inputActionPerformed(evt);
            }
        });

        passwordReset_button.setBackground(new java.awt.Color(14, 7, 45));
        passwordReset_button.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        passwordReset_button.setForeground(new java.awt.Color(255, 255, 255));
        passwordReset_button.setText("Reset Password");
        passwordReset_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordReset_buttonMouseClicked(evt);
            }
        });
        passwordReset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordReset_buttonActionPerformed(evt);
            }
        });

        error_label.setForeground(new java.awt.Color(255, 255, 255));
        error_label.setText("*Error Message");

        javax.swing.GroupLayout resetPassword_panelLayout = new javax.swing.GroupLayout(resetPassword_panel);
        resetPassword_panel.setLayout(resetPassword_panelLayout);
        resetPassword_panelLayout.setHorizontalGroup(
                resetPassword_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resetPassword_panelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ResetPass_title)
                                .addGap(233, 233, 233))
                        .addGroup(resetPassword_panelLayout.createSequentialGroup()
                                .addGroup(resetPassword_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(resetPassword_panelLayout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(resetPassword_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(error_label)
                                                        .addGroup(resetPassword_panelLayout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addGroup(resetPassword_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(studentId_input, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(id_label)
                                                                        .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(resetPassword_panelLayout.createSequentialGroup()
                                                .addGap(228, 228, 228)
                                                .addComponent(passwordReset_button)))
                                .addContainerGap(96, Short.MAX_VALUE))
        );
        resetPassword_panelLayout.setVerticalGroup(
                resetPassword_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(resetPassword_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ResetPass_title)
                                .addGap(69, 69, 69)
                                .addComponent(id_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(studentId_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_line, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordReset_button)
                                .addGap(24, 24, 24)
                                .addComponent(error_label)
                                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resetPassword_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resetPassword_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void passwordReset_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void passwordReset_buttonMouseClicked(java.awt.event.MouseEvent evt) {

        //For successful reset
        error_label.setForeground(new java.awt.Color(29, 178, 0));
        error_label.setText("*This is a test~!");

        //For reset error
        //error_label.setForeground(new java.awt.Color(255, 15, 15));
        // error_label.setText("*This is a test~!");

    }

    private void studentId_inputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public void staricon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ResetPass_title;
    private javax.swing.JLabel error_label;
    private javax.swing.JLabel id_label;
    private javax.swing.JSeparator id_line;
    private javax.swing.JButton passwordReset_button;
    private javax.swing.JPanel resetPassword_panel;
    private javax.swing.JTextField studentId_input;
    // End of variables declaration                   
}
