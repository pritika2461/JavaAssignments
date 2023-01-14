package ass22_12_22;


import java.util.Scanner;

public class StringInput {

	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frist String ");
		String str1= sc.next();
		
		System.out.println("Enter Second String ");
		String str2= sc.next();
		
		
		if(str1.contains(str2))
		{
			System.out.println("content of first string are exits in second string");
		}
		else
		{
			System.out.println("content of first string are not exist in second string");
		}
		 

	}

}
