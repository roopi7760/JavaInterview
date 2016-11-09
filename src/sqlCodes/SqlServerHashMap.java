package sqlCodes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class SqlServerHashMap {
	//Declare variables
	private Connection conn = null;
	private Statement statement = null;
	private HashMap<String,ArrayList<String>> department;

	//Declare Methods
	public SqlServerHashMap(String DB){
		try{
		conn = SqlServerConnect.Connect(DB);
		statement = conn.createStatement();
		department= new HashMap<String,ArrayList<String>>();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void fetchData(String sql){
		try{
			ResultSet  resultset = statement.executeQuery(sql);
			while(resultset.next()){
				String grp = resultset.getString("GroupName");
				String name = resultset.getString("Name");
				ArrayList<String> ar = new ArrayList<String>(); 
				
				if(department.containsKey(grp)){
					ar = department.get(grp);
					ar.add(name);
				}
				else{
				ar.add(name);	
				}
				department.put(grp, ar);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void displayData()
	{
		Iterator<Entry<String,ArrayList<String>>> i = department.entrySet().iterator();
		
		while(i.hasNext()){
			Entry<String,ArrayList<String>> e = i.next();
			System.out.println(e.getKey() + ":");
			Iterator<String> j = e.getValue().iterator();
			while(j.hasNext())
				System.out.println("\t" + j.next());
		}
	}
	
	public static void main(String [] args)
	{
		String DB = "AdventureWorks2012";
		SqlServerHashMap a = new SqlServerHashMap(DB);
		try{	
			String sql = "select GroupName, Name from HumanResources.Department where GroupName='Research and Development'";
			a.fetchData(sql);
			a.displayData();	
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
