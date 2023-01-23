package test;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Child Thread ");
		}	
		//Thread.currentThread().setPriority(9);

	}
}

public class ThreadPriority {

	public static void main(String[] args) 
	{

		System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());	
		MyThread1 t =  new MyThread1();
		t.setPriority(8);

		t.start();
		
		for(int i =0; i<5; i++)
		{
			System.out.println("Main Thread ");
		}
		
	}

}
