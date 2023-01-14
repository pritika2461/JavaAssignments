package ass22_12_22;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// input string 1
		System.out.println("Enter Frist String "); 
		String str1= sc.next();
		
		// input string 2
		System.out.println("Enter Second String ");
		String str2= sc.next();
		
		// compare 2 string 
		if(str1.equals(str2))
		{
			System.out.println("Both String are Equal....");
		}
		else
		{
			System.out.println("String are not equal....");
		}
	}

}
