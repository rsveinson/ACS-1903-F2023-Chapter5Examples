import java.util.Scanner;
/**
 * Prompt for 3 int values and report the largest
 */
public class FindMax
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println(
            "Please enter 3 int values");
            
        int i = kb.nextInt();
        int j = kb.nextInt();
        int k = kb.nextInt();
        
        int mx = Math.max(i, Math.max(j,k));
        int mix = Math.min(i, Math.min(j, k));
        
        System.out.println("largest is "+mx);
        System.out.println("smalles is "+mix);
    }
}
