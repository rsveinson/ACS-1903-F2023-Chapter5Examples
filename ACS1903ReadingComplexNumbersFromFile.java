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

public class ACS1903ReadingComplexNumbersFromFile {
    public static void main(String[] args) throws FileNotFoundException{    
        // ***** Variables and Constants *****

        String strin;
        int n = 0;          // some number parsed from the line of data

        // create the Scanner to read the file   
        Scanner fin = new Scanner(new File("IntDataComplex.txt")); 


        // ***** Output Banners *****

        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Read Ints from a file");
        System.out.println("****************************\n");

        // ***** read the contents of the file *****
        while(fin.hasNext()){
            strin = fin.nextLine();
            System.out.println(strin);
            
            // make a new scanner from the input string
            Scanner line = new Scanner(strin);
            
            // parse each number in the line
            // while(line.hasNext()){
                // n = line.nextInt();
                // System.out.print(n + ", ");
            // }// end end of line
            // System.out.println();
        }// end eof

        // ***** Processing *****

        // ***** output *****
       
        // ***** Closing Message *****

        System.out.println();
        System.out.println("End of processing");

    } // end of main method

} // end of public class
