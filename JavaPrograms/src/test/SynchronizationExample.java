package test;

class sync extends Thread 
{
	int total =0;
	public void run() {
		synchronized(this)
		{
	          for(int i =0; i<5; i++)
	             {
		                total= total+i;
	              }
	System.out.println("Send Notification");
     this.notify();}
		}
}

public class SynchronizationExample {

	public static void main(String[] args)
	{
	     sync s = new sync();	
	     s.start();
	     //Thread.sleep(50000);
	     
	     synchronized(s)
	     {
	    	 System.out.println("Main thread ");
	    	 s.wait();
	    	 System.out.println("Got Notification");
	    	 System.out.println(s.total);
	     }

	}

}
