import java.util.Random;
/** 
 * Toss a coin 100 times and tabulate the 
 * number of heads and the number of tails.
 */
public class TossCoin
{
    public static void main(String[] args)
    {
        int heads = 0;
        int tails = 0;

        System.out.print("\n100 tosses: ");

        Random g = new Random(); 

        for (int i=0; i<100; i++)
            if(g.nextBoolean()){
                heads++;
            }// end if
            else{
                tails++;
            }// end else

        System.out.println("\nHeads: "+heads
            +"\nTails: "+(100-heads));
            
        // some experiments with random
        int temp = g.nextInt(11) + 10;
        System.out.println(temp);

    }
}
