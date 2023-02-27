package JDBC.JDBCPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException
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
	             
	             // creating the insert statement
	             String q = "insert into student(id, name,contact) values(?,?,?)";
	     	     PreparedStatement ps = con.prepareStatement(q);
	     	    
	     	     // set the value to query
	     	    ps.setInt(1, 12);
	     	    ps.setString(2,"Prit");
	     	    ps.setInt(3, 9521);
	     	    
	     	    // execute the query
	     	    ps.executeUpdate();
	     	    
	     	    System.out.println("the date is insered.........");
	     	    
	     	    // closing the connection
	     	    con.close();
	     	   }
	     	    catch(Exception e)
	     	    {
	     	    	System.out.println(e);
	   
	    }
	}

}
