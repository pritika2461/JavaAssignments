// WAP to create the thread to find the number is even or odd.
package ass29_12_22;

import java.util.Scanner;

public class EvenOddExample {

	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
        t.start();
        if(num%2==0)
        {
        	System.out.println("Even Number..");
        }
        else {
        	System.out.println("Odd number...");
        }
	}

}
class MyThread extends Thread
{
	public 
	int num;
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		
	}
}