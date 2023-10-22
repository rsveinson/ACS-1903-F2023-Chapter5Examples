import java.util.Scanner;
/**
 * Display tokens in a string
 */
public class ScanString
{
    public static void main(String[] args)
    {
        String sample = "one    two \tthree";
        Scanner s = new Scanner(sample);
        System.out.println("<<<<"+sample+">>>>");
        while (s.hasNext()){
            String token = s.next();
            System.out.println(token);
        }
        System.out.println("<< end of tokens >>");
    }
}
