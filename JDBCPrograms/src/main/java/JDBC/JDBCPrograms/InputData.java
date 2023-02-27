package JDBC.JDBCPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) 
	{
		 try 
		 {
			 // create connection
	              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root","2461");
	         // checking the connection is establish or not
	             if(con.isClosed())
	             {
	    	           System.out.println("Connection is not sucessful....");
	             }
	             else 
	             {
	    	           System.out.println("connection is sucessful....");
	             }
	             
	             Scanner sc = new Scanner(System.in);
	             
	             System.out.println("Enter Your Id ");
	             int id = sc.nextInt();
	             
	             System.out.println("Enter Your Name");
	             String name = sc.next();
	             
	             System.out.println("Enter contact number");
	             int contact = sc.nextInt();
	             
	             
	           
	             
	             // creating the insert statement
	             String q = "insert into student(id, name,contact) values(?,?,?)";
	     	     PreparedStatement ps = con.prepareStatement(q);
	     	     
	     	     
	     	     String s = "Delete from student where id = ?";
	     	     PreparedStatement pst = con.prepareStatement(s);
	     	     
	     	     System.out.println("enter id that you want to delete ");
	     	     int id1 = sc.nextInt();
	     	     pst.setInt(1, 101);
	     	     
	     	     pst.executeUpdate();
	     	     
	     	     
	    
	     	    // closing the connection
	     	    con.close();
	     	   }
	     	    catch(Exception e)
	     	    {
	     	    	System.out.println(e);
	   
	    }

	}

}
