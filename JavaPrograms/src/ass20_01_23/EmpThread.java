//WAP using thread where you take the basic salary of employee and add 10% hike to the salary and print his new salary.
package ass20_01_23;

import java.util.Scanner;

class MyThread extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of Employee : ");
		double sal = sc.nextDouble();
		
		System.out.println("Actual Salary :"+sal);
		
		double salhike = sal/10;
		double finalsal= sal+salhike;

	    double hike = (sal+salhike-sal)/(sal)*100;
        System.out.println("Your Salary After Hike "+hike+"% : "+finalsal);
	
	}
}
public class EmpThread {

	public static void main(String[] args) 
	{ 
		 MyThread t = new MyThread();
		 t.start();
		 
	}

}
