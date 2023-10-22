
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Another Random example
 * 
 * Description: get random number in the range n - m
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 import java.util.Random;

public class MoreRandom {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
                   
        int n = 0;      // a random number
        Random rnd = new Random();
      
    // ***** get a random number in a range *****
        
        n = rnd.nextInt(10);    // 0 to 9
        System.out.println(n);
        
        n = rnd.nextInt(10) + 11;    // 10 to 20
        System.out.println(n);
        
        // form 50 to 100
        for(int i = 0; i < 20; i++){
            n = rnd.nextInt(51) + 50;
            System.out.println(n);
        }// end for
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
