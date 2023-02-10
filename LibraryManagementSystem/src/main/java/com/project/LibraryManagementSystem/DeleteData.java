package com.project.LibraryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws SQLException 
	{
		
		 // create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root","2461");
        
        
        // Delete data from table 
        String d = "delete from Book_Details where Book_Id = ?";
        PreparedStatement psd = con.prepareStatement(d);
        
        String s = "delete from Student_Details where Stud_Id = ?";
        PreparedStatement ps = con.prepareStatement(s);
        
        // creating scanner data 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("From which table you want to delete data. \n 1) Book Detail \n 2) Student Detail");
        System.out.println("Enter Table number");
        int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
            {
            	System.out.println("Enter Book Id that you want to delete : ");
                int Book_Id = sc.nextInt();
                
                psd.setInt(1, Book_Id);
                
                psd.executeUpdate();
                System.out.println("Data deleted....");
                break;
            }
            
            case 2:
            {
            	System.out.println("Enter student Id that you want to delete : ");
                int Stud_Id = sc.nextInt();
                
                ps.setInt(1, Stud_Id);
                
                ps.executeUpdate();
                System.out.println("Data deleted....");
                break;
        	
             }
        }
           
        con.close();
	}

}
