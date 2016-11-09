package sqlCodes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlSample {
	public static void main(String [] args)
	{
		Connection conn = null;
		Statement statement = null;
		//connect to MySQL
		System.out.println("Data from MYSQL Database");
		try{
			conn = MySqlConnect.Connect("db1", "root", "roopi");
			String selectSql = "select * from album";  
	        statement = conn.createStatement();  
	        ResultSet resultSet = statement.executeQuery(selectSql);  

	        // Print results from select statement  
	        while (resultSet.next())   
	        {  
	            System.out.println(resultSet.getString("AlbumTitle"));
	        }  
			
		}catch (Exception ex) {
			ex.printStackTrace();
	        // handle the error
	    }
	}

}
