
package stellar;

import java.awt.*;

public class splash extends javax.swing.JFrame {

    public splash() {
        Splash();
        staricon();
    }


    @SuppressWarnings("unchecked")
    private void Splash() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        stellar_label = new javax.swing.JLabel();
        stellarbackground = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        stellar_label.setFont(new Font("Century Gothic", Font.PLAIN, 48));
        stellar_label.setForeground(new java.awt.Color(255, 255, 255));
        stellar_label.setText("Stellar");
        jPanel1.add(stellar_label);
        stellar_label.setBounds(15, 225, 160, 50);

        stellarbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("StellarSplash.png")));
        stellarbackground.setText("jLabel1");
        jPanel1.add(stellarbackground);
        stellarbackground.setBounds(0, 0, 520, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(516, 291));
        setLocationRelativeTo(null);
    }


    public void staricon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("StellarStarLight.png")));

    }


    private javax.swing.JLabel stellar_label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stellarbackground;
}
