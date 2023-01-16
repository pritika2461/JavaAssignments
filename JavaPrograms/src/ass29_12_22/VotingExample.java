/* WAP to take a input of age from the user if the 
 * age is above 18 then print "You are eligible for the vote" 
else throw and exception is "age is not correct".*/

package ass29_12_22;

import java.util.Scanner;

public class VotingExample {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User Age : ");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible for the vote");
		}
		else {
			System.out.println("Age is not correct..");
		}
	}

}

