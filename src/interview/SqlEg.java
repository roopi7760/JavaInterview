package interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

import sqlCodes.MySqlConnect;
import sqlCodes.SqlServerConnect;

public class SqlEg {
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
