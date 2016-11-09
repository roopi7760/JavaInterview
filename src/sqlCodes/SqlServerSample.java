package sqlCodes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlServerSample {
	public static void main(String [] args)
	{
		Connection conn = null;
		Statement statement = null;
		
		//connect to SQLSERVER

		System.out.println("Data from MS SQLSERVER Database");
		try{
			conn = SqlServerConnect.Connect("AdventureWorks2012");
			
			String selectSql = "select * from HumanResources.Department";  
	        statement = conn.createStatement();  
	        ResultSet resultSet = statement.executeQuery(selectSql);  

	        // Print results from select statement  
	        while (resultSet.next())   
	        {  
	            System.out.println(resultSet.getString("Name"));
	        }  
			conn.close();
		}catch (Exception ex) {
			ex.printStackTrace();
	        // handle the error
	    }
	}
}
