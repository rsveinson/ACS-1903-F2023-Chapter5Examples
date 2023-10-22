import java.util.Random;
/** 
 * Display 10 rolls of a 6-sided die.
 */
public class RollDie
{
    public static void main(String[] args)
    {
        System.out.print("\n\n10 rolls: ");
        Random g = new Random(); 
        for (int i=0; i<10; i++)
            System.out.print(g.nextInt(6)+1+"   ");
    }
}
