//create vehicle class add 2 variables to it. Create default and parameterized constructor .
package test;


class Vehical
{
	int v_no;
	String name;
	Vehical()
	{
		this.v_no = 7057;
		this.name = "Bus";
		System.out.println("Vehical Number :"+v_no);
		System.out.println("Name : "+name);
	}
	
	Vehical(int v_no, String name)
	{
		System.out.println("Vehical Number : "+v_no);
		System.out.println("Name : "+name);
	}
}

public class ConstructorEx {

	public static void main(String[] args)
	{
		Vehical v= new Vehical();

		Vehical v1= new Vehical(7278, "Bike");
  
	}

}
