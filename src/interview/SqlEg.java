package interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlEg {
public static void main(String [] args)
{
	Connection conn = null;
	Statement statement = null;
	
	String connectionString =  
            "jdbc:sqlserver://ROOPESH-PC;"  
            + "database=AdventureWorks2012;"  
            + "integratedSecurity=true;"
            + "loginTimeout=30;"; 
	//connect to SQLSERVER

	System.out.println("Data from MS SQLSERVER Database");
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		conn = DriverManager.getConnection(connectionString);
		
		String selectSql = "select * from HumanResources.Department";  
        statement = conn.createStatement();  
        ResultSet resultSet = statement.executeQuery(selectSql);  

        // Print results from select statement  
        while (resultSet.next())   
        {  
            System.out.println(resultSet.getString("Name"));
        }  
		
	}catch (Exception ex) {
		ex.printStackTrace();
        // handle the error
    }
	
	//connect to MySQL
	System.out.println("Data from MYSQL Database");
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:8080/db1?useSSL=false","root","roopi");
		
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
