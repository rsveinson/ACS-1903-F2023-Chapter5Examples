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
            
    // how about a 10 sided die
        int tenSided = g.nextInt(10) + 1;
        System.out.println("\n" + tenSided);
    
    // what about a pair of 6 sided dice
    
        int d1 = 0;
        int d2 = 0;
        
        d1 = g.nextInt(6) + 1;
        d2 = g.nextInt(6) + 1;
        System.out.println(d1);
        System.out.println(d2);
        
        int bigRoll = Math.max(d1, d2);
        System.out.println(bigRoll);
            
        // here's something pretty cool
        int roll = 3; 
        
        if(roll == 3){
            System.out.println('\u2682');
        }
    }
    
    
}
