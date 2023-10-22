
/**
 * Using Math.random() with min and max values
 *
 * @author Jared Wills
 */

import java.lang.Math;

public class MinMaxRandom
{
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        
        int rand;
        
        for (int i = 0; i < 100; i++) {
            rand = (int)(min + (max - min + 1)*Math.random());
            System.out.println(rand);
        }
    }
}
