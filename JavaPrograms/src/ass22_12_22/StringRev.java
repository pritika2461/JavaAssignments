package ass22_12_22;

import java.util.Scanner;

public class StringRev
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String "); // input string
		String str= sc.next();
		
		System.out.println("Orignal string : "+str);
       
		String rev ="";
		int length =str.length();   // calculate length of string
		
		for (int i=length-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);    //reverse the string
		}
		System.out.println("String after reverse : "+rev);
		
		System.out.println("Original String in Upper Case : "+str.toUpperCase());
		System.out.println("Reverse String in Upper Case : "+rev.toUpperCase());

	}

}