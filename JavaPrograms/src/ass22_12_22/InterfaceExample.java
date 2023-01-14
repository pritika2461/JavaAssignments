package ass22_12_22;
import java.util.Scanner;
interface Printable     // interface 
	{
		public void squre();   // abstract method
	}

	interface Calculate
	{
		public void cube();
	}

	class Demo implements Printable // implements from printable interface 
	{
		 public void squre()
		 {   
	         Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter Number of finding Squre :");
			 int a= sc.nextInt();
			 int s= a*a;                      // finding square of number
			 System.out.println("Squre of "+a+" is "+s);
		 }
	}

	class Demo1 implements Calculate
	{
		public void cube()
		{ 
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter Number of finding Cube :");
			 int a= sc.nextInt();
			 
			 int s= a*a*a;
			 System.out.println("Cube of "+a+" is "+s);
		}
	}

	public class InterfaceExample
	{
	   public static void main(String[] args)
	   {
		   Demo d= new Demo();
		   d.squre();
		   
		   Demo1 d1= new Demo1();
		   d1.cube();
				   
	   }
	}


	
