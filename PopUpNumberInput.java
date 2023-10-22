
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

public class PopUpNumberInput {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
                   
        Scanner scanner = new Scanner(System.in);        

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Simple Event Loop");
        System.out.println("****************************\n");
  
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
    
        String strin = "";          // string for keyboard input
        String name = "";
        int n = 0;
        double x = 0.0;
        
        strin = JOptionPane.showInputDialog("enter a string, an int, a double");
        
        //System.out.println("enter a string, an int, a double");
        //strin = scanner.nextLine();
        // strin   "bob 12 34.5"
        
        // parse tokens from input strin
        Scanner inputScanner = new Scanner(strin);
        name = inputScanner.next();
        n = Integer.parseInt(inputScanner.next());
        x = Double.parseDouble(inputScanner.next());
        
    
       
    // ***** output *****
    
        System.out.println("String: " +  name);
        System.out.println("int: " +  n);
        System.out.println("double: " +  x);
        
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
