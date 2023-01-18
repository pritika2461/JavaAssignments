package test;

public class OverlodingEx 
{

	
		public  void m1()
		{
			System.out.println("no arguments...");
		}
		
		
		public void m1(int i)
		{
			System.out.println("int arguments");
		}
		
		
		public void m1(int i, int j)
		{
			System.out.println("two integer args...");
		}
		
		
		// overload the main method 
		public static void main(int a) 
		{
			OverlodingEx o = new OverlodingEx();
			o.m1();
		//	o.m1(1);
	    //   o.m1(12, 23);

		}
		public static void main(String[] args) 
		{
			OverlodingEx o = new OverlodingEx();
			o.m1();
			o.m1(1);
			o.m1(12, 23);

		}

}
