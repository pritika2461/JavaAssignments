package com.project.LibraryManagementSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) throws SQLException 
	{
		// create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root","2461");
        
        // taking the date input from user
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Which table you want to update \n 1) Book Details \n 2) Student Details");
        System.out.println("Enter table number");
        int ch = sc.nextInt();
        
        switch(ch)
        {
        case 1:
        {
        	// update table 
            String u = "update Book_Details set Book_Name = ?, Price = ?, Author = ? where Book_Id = ?";
            PreparedStatement psu = con.prepareStatement(u);
            
        
            System.out.println("Enter Book Id that you want to update");
            int Book_Id = sc.nextInt();
            
            System.out.println("Enter Book Name that you want to update");
            String Book_Name = sc.next();
            
            System.out.println("Enter Book Price that you want to update");
            int Price = sc.nextInt();
            
            System.out.println("Enter Author that you want to update");
            String Author = sc.next();
            
            // setting the value 
            
            psu.setString(1, Book_Name);
            psu.setInt(2,Price);
            psu.setString(3, Author);
            psu.setInt(4, Book_Id);
            
            psu.executeUpdate();
            System.out.println("Data Updated Sucessfully....");
            psu.close();
            break;
        }
        
        case 2:
        {
        	// update table 
            String s = "update Book_Details set Book_Name = ?, Price = ?, Author = ? where Book_Id = ?";
            PreparedStatement psu1 = con.prepareStatement(s);
            
        
            System.out.println("Enter Student Id that you want to update");
            int Stud_Id = sc.nextInt();
            
            System.out.println("Enter Student Name that you want to update");
            String Stud_Name = sc.next();
            
            System.out.println("Enter Issue date that you want to update");
	        Date Issue_Date =Date.valueOf(sc.next());
            
            System.out.println("Enter Return that you want to update");
	        Date Return_Date =Date.valueOf(sc.next());
            
            // setting the value 
            
            psu1.setString(1, Stud_Name);
            psu1.setDate(2,Issue_Date);
            psu1.setDate(3, Return_Date);
            psu1.setInt(4, Stud_Id);
            
            psu1.executeUpdate();
            System.out.println("Data Updated Sucessfully....");
            psu1.close();
        }
        }
        
       
	}

}
