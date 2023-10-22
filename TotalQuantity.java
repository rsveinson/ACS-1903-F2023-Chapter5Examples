import java.util.Scanner;
/**
 * Four lines are read where each line contains
 * an item name, a comma, and a quantity
 * with no embedded spaces.
 */
public class TotalQuantity
{
    public static void main(String[] args)
    {
       Scanner kb = new Scanner(System.in);
       int totalQty = 0;
       
       for (int i = 0; i < 4; i++){
          System.out.print("Enter next line: ");
          String line = kb.nextLine();
          
          int commaAt = line.indexOf(",");
          String qtyAsString = line.substring(commaAt+1);
          
          int qty = Integer.parseInt(qtyAsString);
          totalQty += qty;
       }
       System.out.println("total = "+totalQty);
    }
}
