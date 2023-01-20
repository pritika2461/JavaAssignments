// Create a package where you take input of employee details. Use the above package in different class to take the user information.
package ass20_01_23;

import java.util.Scanner;

public class EmpDetails 
{
	int id;
	String name;
	int sal;
	String designation;
	public void emp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id :");
		id =sc.nextInt();
		
		System.out.print("Enter Emp Name :");
		name =sc.next();
		
		System.out.print("Enter Salary :");
		sal =sc.nextInt();
		
		System.out.print("Enter Designation :");
		designation =sc.next();
		
		
	}

}
