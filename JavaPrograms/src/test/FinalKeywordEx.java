package test;

import java.util.Scanner;

public class FinalKeywordEx {

	public static void main(String[] args) 
	{
		
       final double pi= 3.14;  // can't chang the value of variable that we declare as a final 
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Radious : ");
       int rad = sc.nextInt();
       
       double res = pi*rad*rad;
       System.out.println("Area Of Circle :"+res);
       
	}

}
