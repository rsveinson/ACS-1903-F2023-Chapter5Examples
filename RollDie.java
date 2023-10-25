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
    
    // what about a pair of 6 sided dice
            
        // here's something pretty cool
        int roll = g.nextInt(6) + 1; 
        
        if(roll == 3){
            System.out.println('\u2682');
        }
    }
    
    
}
