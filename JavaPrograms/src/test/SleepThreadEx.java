package test;

class SleepEx extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("I am Child Thread, I am Sleepy");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Got Interrupted");
		}
	}
}

public class SleepThreadEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());	
		
		SleepEx t =  new SleepEx();
		t.setPriority(8);
		
		t.start();
		t.interrupt();
	
			System.out.println("Main Thread ");
	

	}

}
