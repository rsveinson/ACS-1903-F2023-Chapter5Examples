
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Convert to Methods
 * 
 * Description: Take a simple program and convert it so that as much of 
 *              the processing as possible is encapsulated using static
 *              methods.
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;

public class MathRandom {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
                   
        Scanner scanner = new Scanner(System.in);        

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Math.random()");
        System.out.println("****************************\n");
  
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
        int min = 7;
        int max = 15;
        double x = 0.0;
        for(int i = 0; i < 100; i++){
            // to get a number between 0 and 1000
            x = Math.random() * 100;
            
            // random number between n and m
            //solution thanks to Jared Wills
            //x = (int)(min + (max - min + 1)*Math.random());
            System.out.println((int)x);
        } // end for
    
        System.out.println(Math.hypot(3.0, 4.0));
        
        System.out.println(Math.abs(-34.34));

           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
