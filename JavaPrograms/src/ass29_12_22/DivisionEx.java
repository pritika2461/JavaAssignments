/* WAP where you take input of two numbers(i,j) from the user
and divide the first number with second include exception handling mechanism.*/

package ass29_12_22;

import java.util.Scanner;

public class DivisionEx {

	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number i :");
       int i = sc.nextInt();
       
       System.out.println("Enter second number j : ");
       int j = sc.nextInt();
       
       try {
    	   double res;
    	   res= i/j;
    	   System.out.println("Didision of given numbers is : "+res);
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
	}

}
