package test;
class Parent
{
   	public void title()
	{
		System.out.println("Core java");
	}
	
	final public void msg()       // final method 
	{
		System.out.println("This is parent class");
	}
	
}
class Child extends Parent
	{
		public void title()
		{
			System.out.println("Advance Java");
		}
		/*public void msg()    // final method can't override ...
		{
			System.out.println("This is Base class");
		}*/
	}
public class OverridingEx 
	{
	public static void main(String[] args)
	{
		Parent c = new Parent();
		c.title();
		c.msg();  
		
		Child b = new Child();
		b.title();
		b.msg();
		
		
		

	}

}
