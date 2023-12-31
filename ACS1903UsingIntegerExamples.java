
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  assignemnt
 * 
 * Description: brief description
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 import java.util.Random;

public class ACS1903UsingIntegerExamples {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        int n = 0;
        int m = 0;
        int p = 0;
        
        String st;
        
      
    // ***** do some Integer experiments *****
    
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println();
        
        // int big = Integer.MAX_VALUE;
        // System.out.println(big);
        // big++;
        // System.out.println(big);
        // big--;
        // System.out.println(big);
        // System.out.println();
        
        n = 256;
        m = 128;
        
        // max and min, very similar to Math.max and Math.min
        p = Integer.max(n, m);
        System.out.println(p);
        
        p = Integer.min(n, m);
        System.out.println(p);
        
        // toString
        System.out.println(Integer.toString(m));
        
        // parseInt
        st = "12345";
        
        // we know this won't work
        //p = m + st;
        
        // parse the string as an int
        n = Integer.parseInt(st);
        p = m + n;              // now it works
        
        // beware
        //n = Integer.parseInt("1,234.34");
        //n = Integer.parseInt("1,234");
        //n = Integer.parseInt("$1234");
        
        // toString()
        Random rnd = new Random();
        n = rnd.nextInt(9000) + 1000;
        System.out.println("integer number: " + n);
        
        st = Integer.toString(n);
        System.out.println("now as a string: " + st);
        
        char ch = st.charAt(2);
        System.out.println("now the third digit: " + ch);
        
        System.out.println("now digits reversed");
        
        for(int i = st.length() -1; i >= 0; i--){
            System.out.println(st.charAt(i));
        }// end for
        
        
        
        
        
        
        
        
        
        
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
