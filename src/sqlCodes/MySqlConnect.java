package sqlCodes;

import java.sql.Connection;
import java.sql.DriverManager;



public class MySqlConnect {
	
	public static Connection Connect(String DB,String username, String password)
	{
		String ConnectionString;
		Connection conn = null;
		ConnectionString = "jdbc:mysql://localhost:8080/"+DB+"?useSSL=false";
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(ConnectionString, username, password);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
}
