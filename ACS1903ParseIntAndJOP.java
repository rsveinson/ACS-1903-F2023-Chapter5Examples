
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  assignemnt
 * 
 * Description: brief description
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 import java.util.Random;

public class ACS1903ParseIntAndJOP {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
                   
    int numberInput = 0;
    int numberSquared = 0;
    String strin;           // input from pop-up window
    
    strin = JOptionPane.showInputDialog("enter a number.");
    numberInput = Integer.parseInt(strin);
    
    //error incompatible types have to use explicit casting
    numberSquared = pow(numberInput, 2);
    
    System.out.println(numberInput + "^2 = " + numberSquared);
        
        
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
