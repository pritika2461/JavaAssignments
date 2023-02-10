package com.project.LibraryManagementSystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ShowData {

	public static void main(String[] args) throws SQLException 
	{
		// create connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root","2461");
        
        // scanner input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table data you Want to see. \n 1) Book_details \n 2) Student_Details");
        System.out.println("Enter table number :");
        int ch = sc.nextInt();
        
        switch (ch)
        {
        case 1 :
        {
        	 String s = "select * from Book_Details";
             PreparedStatement pss = con.prepareStatement(s);
             ResultSet rset = pss.executeQuery();
            
             while(rset.next())
             {
            	 int Book_Id = rset.getInt(1);
            	 String Book_Name = rset.getString(2);
            	 int Price = rset.getInt(3);
            	 String Author = rset.getString(4);
            	 
            	 System.out.println("ID : "+Book_Id+" "+"Name : "+Book_Name+ " "+" Price : "+Price+ " "+"Author : "+Author);
             }
            System.out.println("Data Displayed....");
            pss.close();
            break;
        }
        
        case 2:
        {
        	 String s1 = "select * from Student_Details";
             PreparedStatement ps = con.prepareStatement(s1);
             ResultSet rset = ps.executeQuery();
            
             while(rset.next())
             {
            	 int Stud_Id = rset.getInt(1);
            	 String Stud_Name = rset.getString(2);
            	 Date IssueDate = rset.getDate(3);
            	 Date Return_Date = rset.getDate(4);
            	 
            	 System.out.println("Student ID : "+Stud_Id+" "+"Student Name : "+Stud_Name+ " "+" Issue_Date : "+IssueDate+ " "+"Return Date : "+Return_Date);
             }
            System.out.println("Data Displayed....");
            ps.close();
        }
        }
		// close the connection
        con.close();
	}

}
