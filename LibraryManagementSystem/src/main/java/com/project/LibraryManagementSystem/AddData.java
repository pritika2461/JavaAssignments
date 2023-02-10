package com.project.LibraryManagementSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class AddData {

	public static void main(String[] args) throws SQLException, ParseException 
	{
		// create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","2461");
		
        Scanner sc = new Scanner(System.in);
        
		System.out.println("In which table you want to insert the data. \n 1) Book Details \n 2) Student Details ");
		System.out.println("Please Enter your table number :");
		
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("1. Book Details" );
	
                // Inserting data into Book Details 
                   String s = "Insert into Book_Details(Book_Id, Book_Name, Price, Author) values (?,?,?,?)";
                   PreparedStatement ps = con.prepareStatement(s);
        
                // Take input from user & adding add using scanner class
                   System.out.println("Enter Book Id ");
                   int Book_Id = sc.nextInt();
                   
                   System.out.println("Enter Book Name ");
                   String name= sc.next();
                   
                   System.out.println("Enter Book Price ");
                   int price = sc.nextInt();
                   
                   System.out.println("Enter  Book Author Author");
                   String Author = sc.next();
                   
                   // Setting the value 
                   ps.setInt(1,Book_Id);
                   ps.setString(2,name);
                   ps.setInt(3,price);
                   ps.setString(4,Author);
                   ps.executeUpdate();
    		        System.out.println("Data inserted Sucessfully...");

           		  break;
           		}
         
		 case 2:
		  { 
			   // inserting date into student data
			    System.out.println("Student details ");
			    String s1 = "Insert into Student_Details(Stud_Id, Stud_Name, Issue_Date, Return_Date) values (?,?,?,?)";
		        PreparedStatement ps1 = con.prepareStatement(s1);
		        
		        // Take input from user & adding add using scanner class
		       //  Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Student Id ");
		        int Stud_Id = sc.nextInt();
		        
		        System.out.println("Enter Student Name ");
		        String Stud_Name= sc.next();
		        
		        System.out.println("Enter Issue date");
		        Date Issue_Date =Date.valueOf(sc.next());
		        
		        System.out.println("Enter Return Date");
		        Date Return_Date =Date.valueOf(sc.next());
		        
		        // Setting the value 
		        ps1.setInt(1,Stud_Id);
		        ps1.setString(2,Stud_Name);
		        ps1.setDate(3,Issue_Date);
		        ps1.setDate(4,Return_Date);
		        
		        // execute the query
		        ps1.executeUpdate();
		        
		        System.out.println("Data inserted Suceslly...");
		        break;         
        
		  }
	}
	}
}
