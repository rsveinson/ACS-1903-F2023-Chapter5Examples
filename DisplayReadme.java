import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Display contents of Readme.txt with line numbers
 */
public class DisplayReadme
{
      public static void main(String[] args)
      throws FileNotFoundException 
      {
            /* the file to be read must be in the same folder as the .java file. the name
             * of the file in the Scanner line must be exactly the same as 
             * the name of the file in the folder.
             * if either of these conditions is not met a runtime exception will be 
             * thrown when the program attempts to access the file.
             */
            Scanner f = new Scanner(new File("Readme.txt"));
            int  i=1;
            System.out.println("<<<< File Readme.txt >>>>");
            
            while (f.hasNext()) {
                  String line = f.nextLine();
                  System.out.println((i++)+" "+line);
            }
            System.out.println("<<<< end of listing >>>>");
      }
}
