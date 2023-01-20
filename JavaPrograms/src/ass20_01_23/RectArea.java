// Create a package where which is calculating area of rectangle and use it in different class usepack.
package ass20_01_23;

import java.util.Scanner;

public class RectArea 
{
	
	 public void area()
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length :");
		int l =sc.nextInt();
			
		System.out.print("Enter Breadth :");
		int b =sc.nextInt();
			
   	  System.out.println("Area of Reactangle :  "+(l*b));
     }
}
