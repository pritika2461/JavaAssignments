package test;
interface vehical
{
	public void capacity();
	public void NoOfWheels();
}

class Bike implements vehical
{
  public void capacity()
  {
	  System.out.println("Two seats");
  }
  
  public void NoOfWheels()
  {
	  System.out.println("2");
  }
}


class Bus implements vehical
{
  public void capacity()
  {
	  System.out.println("fifty seats");
  }
  
  public void NoOfWheels()
  {
	  System.out.println("6");
  }
}


public class InterfaceEx 
{
	public static void main(String[] args) 
	{
        Bike b =new Bike();
        b.capacity();
        b.NoOfWheels();
        
        Bus b1=  new Bus();
        b1.capacity();
        b1.NoOfWheels();
	}

}
