// Create JDBC project using Maven for library management system. It should have add, update,delete and show functionality.
package com.project.LibraryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) throws SQLException
	{
				 // create connection
		              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root","2461");
		              
		         // checking the connection is establish or not
		             if(con.isClosed())
		             { 
		    	           System.out.println("Connection is not sucessful....");
		             }
		             else 
		             {
		    	           System.out.println("connection is sucessful....");
		             }
		             
		             // creating table Book Details
		             String q = "create table Book_Details(Book_Id int,Book_Name varchar(100), Price int, Author varchar(100))";
		             PreparedStatement ps = con.prepareStatement(q);
		     
		             System.out.println(" Book Details Table Created...");
		             
		             
		             // creating Student details table
		             String s = "create table Student_Details(Stud_Id int,Stud_Name varchar(20),Issue_Date date, Return_Date date)";
		             PreparedStatement ps1 = con.prepareStatement(s);
		             
		             // execute updates
		             ps.executeUpdate();
		             ps1.executeUpdate();
		             System.out.println(" Student  Details Table Created...");
		             
		            // close the connection
		            con.close();
			
		    } 

	}


