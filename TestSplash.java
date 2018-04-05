/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsplash;

/**
 *
 * @author Gabby
 */
public class TestSplash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       splash s = new splash();
        s.setVisible(true);
        dashstellartest d = new dashstellartest();
        
        try{
            for (int i= 0; i<=100; i++){
                Thread.sleep(60);
                s.loadingnum.setText(Integer.toString(i)+"%");
                s.loadingbar.setValue(i);
                if(i==100){
                    s.setVisible(false);
                    d.setVisible(true);
                    
                    
                }
            }
        
        }catch(Exception e){
            
        } 
                
    }
    
}
