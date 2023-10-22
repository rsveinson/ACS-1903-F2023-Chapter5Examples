
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

public class SimpleMathMaxMin {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
        // strings for I/O
        String prompt;
        String strin;
        String strout;
        
        // variables for input
        String name;
        int n = 0;
        int m = 0;
        
        // variables for max min result
        int largest = 0;
        int smallest = 0;
  
    // ***** get two ints using JOP *****
        
        prompt = "Enter you name and two integers(ints)";
        strin = JOptionPane.showInputDialog(prompt);
        //System.out.println(strin);
        
        // parse the input string
        Scanner sc = new Scanner(strin);
        name = sc.next();         // get the first token
        
        // both of these should wokr
        n = Integer.parseInt(sc.next());
        m = sc.nextInt();
        
        // find the biggest input number
        largest = Math.max(n, m);
        smallest = Math.min(n, m);
           
    // ***** output *****
    
        // create the oputput string
        strout = "Well " + name + " of the numbers: " + n + ", and " + m + "\n";
        strout += "Largest: " + largest + "\n";
        strout += "Smallest: " + smallest;
        
        // now print it to a JOP
        JOptionPane.showMessageDialog(null, strout);
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
