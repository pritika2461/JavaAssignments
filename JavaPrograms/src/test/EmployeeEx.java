// create a class Employee with a method where you take the name address and exprience of the employee.
//make a child class programmer which has a method to take the personal details but also 
//has a field programming language
package test;

import java.util.Scanner;

class Employee
{
  String name;
  String Address;
  int experiance;
  
    Scanner sc = new Scanner(System.in);
    
	public void getDetails()
	{
     System.out.println("Enter Name :");
     name= sc.next();
     
     System.out.println("Enter Address :");
     Address= sc.next();
     
     System.out.println("Enter Experiance :");
     experiance= sc.nextInt();
       
	}
  
}
class Programmer extends Employee  
{
	String lang;
	Scanner sc = new Scanner(System.in);
	
	public void getLang()
	{  
       System.out.println("Enter Programming Lang. :");
       lang= sc.next();   
	}
	public void print()
	  {
		  System.out.println(name);
		  System.out.println(Address);
		  System.out.println(experiance);
		  System.out.println(lang);
	  }
}

public class EmployeeEx
{
	public static void main(String[] args)
	{
		Programmer p = new Programmer();
		p.getDetails();
		p.getLang();
		p.print();
	}
}

