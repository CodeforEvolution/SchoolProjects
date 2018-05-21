
/**
 *   Recursion example for Factorial
 * "Uncomment" lines to view reverse of recursive solution
 */
import java.util.Scanner; 
public class RecursiveFactorial
{
    
 public static int factorial (int a)
 {
   if (a==1)    // 'base' case, when value is at 1
     {
     return 1;
    }
   else
     {
     int result;    
     result = factorial(a-1)*a  ; // this is the 'call' to recursive method
     
      // System.out.println ("factorial("+ (a-1)+")* "+ a );
     return result;
    }
 } 
 
 public static void main (String[] args )
    {
     Scanner in = new Scanner(System.in);
     
     System.out.print("Enter integer ");
      int x= in.nextInt(); 
     // System.out.println(" These 'calls' are in reverse order.....follow last output backwards");
     
     System.out.println ( x + "! = " + factorial(x) );
    }  
}
