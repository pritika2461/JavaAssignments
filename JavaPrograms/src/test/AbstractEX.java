//create one abstract class bank with method rate_of_interest. 
//inherit that in 2 different banks and give the required output.

package test;

abstract class Bank
{
	abstract void ROI();
	public void print()
	{
		System.out.println("Abstract class..");
	}
}

class BOI extends Bank
{
	public void ROI()
	{
		System.out.println("BOI");
	}
}

class SBI extends Bank
{
	public void ROI()
	{
		System.out.println("SBI");
	}
}
public class AbstractEX {

	public static void main(String[] args) 
	{	
      BOI b= new BOI();
      b.ROI();
      b.print();
      
      SBI s = new SBI();
      s.ROI();
      s.print();
	}

}
