package test;

public class ExceptionEx {

	public static void main(String[] args)
	{
		int age = 10;
		if(age>=18)
		{
			throw new ArithmeticException("You are not eligible for vote");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}

	}

}
