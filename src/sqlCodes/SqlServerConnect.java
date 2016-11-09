package sqlCodes;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlServerConnect {

	public static Connection Connect(String DB)
	{
		Connection conn = null;
		String ConnectionString =  
	            "jdbc:sqlserver://ROOPESH-PC;"  
	            + "database=" + DB +";"  
	            + "integratedSecurity=true;"
	            + "loginTimeout=30;"; 
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			conn = DriverManager.getConnection(ConnectionString);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
}
