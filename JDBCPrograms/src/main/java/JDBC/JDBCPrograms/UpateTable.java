package JDBC.JDBCPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	            
	            // update table 
	            
	            String u = "update employee set empid= ? ,empname = ? where empname= ? ";
	            PreparedStatement psu = con.prepareStatement(u);
	            
	            Scanner sc = new Scanner(System.in);
	            
	            System.out.println("Enter Id that you want to change :");
	            int id = sc.nextInt();
	            
	            System.out.println("enter name name that you want to change : ");
	            String name = sc.next();
	            
	            System.out.println("Enter contact that you want to change:");
	            int contact = sc.nextInt();
	            
	            psu.setInt(1,101);
	            psu.setString(2, "Pritika");
	            psu.setInt(3,951186);
	            
	            psu.executeUpdate();
	            System.out.println("Table updated....");
	            psu.close();
	            
	            // close the connection
	            con.close();
		 }     
		 
	     catch(Exception e)
		 {	    
	        System.out.println(e);
	   
	    }

	}

}
