import java.io.File;
import java.io.FileNotFoundException;
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  numberic file data example
 * 
 * Description: Read a list of ints from a file
 **********************************************************************/

// import statements go here
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ACS1903ReadIntsFromFileSimple {
    public static void main(String[] args) throws FileNotFoundException{    
        // ***** Variables and Constants *****

        Scanner fin = new Scanner(new File("IntDataSimple.txt")); 

        int n = 0;      // numbers read from the file

        // ***** Output Banners *****

        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Read Ints from a file");
        System.out.println("****************************\n");

        // ***** read the contents of the file *****
        
        while(fin.hasNext()){
            n = fin.nextInt();
            System.out.println(n);

        }// end while

        // ***** Processing *****

        // ***** output *****
       
        // ***** Closing Message *****

        System.out.println();
        System.out.println("End of processing");

    } // end of main method

} // end of public class
