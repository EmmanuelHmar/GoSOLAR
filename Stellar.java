package stellar;


public class Stellar {

	 //The main method calls the Login class and makes it visible. It also gives the window a "Nimbus look". The Nimbus look is optional.
    public static void main(String[] args) {
    	
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
    	
    	
    	
    	
    	
       
    //Displays the loading screen then opens the login page after a delay	
       splash s = new splash();
       Login log= new Login();
       
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new splash().setVisible(true);
           }
       });
       
       
       
       
       try{
           for (int i= 0; i<=50; i++){
               Thread.sleep(35);
               
               
               if(i==50){
            	   
            	   
                   //Creates and displays the windows
            	   java.awt.EventQueue.invokeLater(new Runnable() {
                       public void run() {
                           new splash().dispose();
                       }
                   });
            	   
            	   
                   java.awt.EventQueue.invokeLater(new Runnable() {
                       public void run() {
                           new Login().setVisible(true);
                        }
                   });
                   
                   
               }
            	   
               }
           
       
       }catch(Exception e){
           
       } 
       
       
       
       
    }
    
   
}