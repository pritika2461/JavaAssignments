package test;
class Exception
{
	public void m1() throws ArithmeticException
	{
		try 
		{
		int j = (20/0);
		System.out.println(j);
		System.out.println("m1 method");
		}
		
		finally
		{
			System.out.println("Exception");
		}	
	}
	
	void m2()
	{
		m1();
		System.out.println("m2 method");
	}
	void m3()
	{
		m2();
		System.out.println("m3 method");
	}
}

public class PropogatingException {

	public static void main(String[] args) 
	{
          Exception e = new Exception();
          e.m3();
	}

}
