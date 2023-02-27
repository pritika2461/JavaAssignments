package JDBC.JDBCPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable 
{

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
	             
	             // create table employee
	             
	              String q = "create table employee(empid int, empname varchar(10), contact int)";
	             PreparedStatement ps = con.prepareStatement(q);
	             ps.executeUpdate();
	             System.out.println("Table created...");
	             ps.close();

	             
	             // insert the values
	             String in = "insert into employee(empid, empname,contact) values(?,?,?)";
	     	     PreparedStatement pst = con.prepareStatement(in);
	     	     
	     	     // set the value to query
	     	    pst.setInt(1, 11);
	     	    pst.setString(2,"Prit");
	     	    pst.setInt(3, 9521);
	     	    
	     	    pst.setInt(1, 12);
	     	    pst.setString(2,"Priya");
	     	    pst.setInt(3, 7621);
	     	    
	     	    pst.setInt(1, 13);
	     	    pst.setString(2,"Pooja");
	     	    pst.setInt(3, 8511);
	     	    
	     	    pst.setInt(1, 14);
	     	    pst.setString(2,"Maya");
	     	    pst.setInt(3, 7341);
	             
	            pst.executeUpdate();
	            System.out.println("Value inserted...");
	            pst.close();
	            
	            
	            // update table 
	            
	            String u = "update employee set empid= 11 where empname= 'prit' ";
	            PreparedStatement psu = con.prepareStatement(u);
	            
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

