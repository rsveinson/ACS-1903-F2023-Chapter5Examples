
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

public class ACS1903MoreCharExamples {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        char ch = '9';
        int i = 0;
                   
        
      
    // ***** do some char experiments *****
    
    // char to int variable
    // '1' to int var
    // convert to numeric value i.e. - '0'
    
    // i = ch;
    // System.out.println(i - '0');
    
    i = Character.getNumericValue(ch);
    System.out.println(i);
    
    ch = 95;
    System.out.println(ch);
    
    // use getNumericValue
    
    // i = Character.getNumericValue(ch);        
    // System.out.println(i); 
    
    
    // toUpperCase()
    
    ch = 'a';
    System.out.println(ch);
    ch = Character.toUpperCase(ch);
    System.out.println(ch);
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
