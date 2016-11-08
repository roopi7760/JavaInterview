package aggregation;

public class Employee {
String Name;
Address address;

final static String COMPANY = "Hewlett-Packard";
public Employee(String Name, String city, String state, String country)
{
	this.Name = Name;
	
	address = new Address(city, state, country);
			
}

public String getAddress()
{
	String add = address.getAddress();
	return add;
	
}

public static void main(String[] args)
{
	Employee e1 = new Employee("Rajeev", "Mysore", "Karnataka", "India");
	Employee e2 = new Employee("Krishna", "Arlington", "Texas", "USA");
	
	System.out.println(e1.Name + "'s address is " + e1.getAddress() + " and his company is " + COMPANY);
	
	System.out.println(e2.Name + "'s address is " + e2.getAddress() + " and his company is " + COMPANY);
}
}
