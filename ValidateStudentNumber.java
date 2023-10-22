import java.util.Scanner;
/**
 * A string provided by the user is examined
 * to determine whether or not it is numeric.
 */
public class ValidateStudentNumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = kb.next();
        // characters are examined one-by-one
        
        
        boolean valid = true;
        // assume that the number as entered is valid
        for (int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            
            if ( ! Character.isDigit(c))
                valid = false;
        }// end for loop 
        
        if (valid)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
