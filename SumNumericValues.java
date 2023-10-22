import java.util.Scanner;
/**
 * The sum of numeric characters is calculated.
 */
public class SumNumericValues
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nEnter a line: ");
        String line = kb.nextLine();
        int sum = addDigits(line);
        System.out.println("sum = \t"+sum);
    }

    public static int addDigits(String s){        
        int sum = 0;
        // characters are examined one-by-one
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
