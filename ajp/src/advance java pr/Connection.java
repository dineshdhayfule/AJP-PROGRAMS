package jdb;

import java.sql.DriverManager;
import java.sql.SQLException;
public class Connection 

 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		    java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		    if(con!=null)
		 	{
			   System.out.println("Connections builded");
		 	}
		 	else
		 	{
		 		System.out.println("Connections Not builded");
		 	}		    
		   } 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
			}


	}


