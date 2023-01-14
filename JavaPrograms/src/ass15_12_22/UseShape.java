// WAP to 
package ass15_12_22;

class Shape
{
   void shape()
   {
     System.out.println("This is shape");
   }
}

class Reactangle extends Shape     // inherite from shape class
{   
    void shape()                  // override shape method 
   {
     System.out.println("This is Reactangle shape");
   }
}

class Circle extends Shape     // inherite from shape class
{
    void shape()              // override shape method 
   {
     System.out.println("This is Circular shape");
   }
}

public class UseShape
{
   public static void main(String[] args)
   {   
   
       //Shape s1 = new Shape();
	   //s1.shape();
	   
       Reactangle s2 = new Reactangle();     // Object Creation
	   s2.shape();                          // method calling
	   
	   Circle s3= new Circle();
	   s3.shape();
   }
}