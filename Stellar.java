package stellar;

<<<<<<< HEAD
 public class Stellar {
=======
public class Stellar {
>>>>>>> fixed name and deprecated getText

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    
     //The main method calls the Login class and makes it visible. It also gives the window a "Nimbus look". The Nimbus look is optional.
     public static void main(String[] args) {
=======

    //The main method calls the Login class and makes it visible. It also gives the window a "Nimbus look". The Nimbus look is optional.
    public static void main(String[] args) {
>>>>>>> fixed name and deprecated getText
        Login log = new Login();
        //For the Nimbus Look
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stellar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stellar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stellar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stellar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //Creates and displays the windows
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
             }
        });
    }
<<<<<<< HEAD
    
=======

>>>>>>> fixed name and deprecated getText
}