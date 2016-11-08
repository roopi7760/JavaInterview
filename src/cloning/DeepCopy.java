package cloning;

public class DeepCopy {

	public static void main(String[] args)
	{
		Course Science = new Course("Physics", "Biology", "Chemistry");
		Student student1 = new Student(1, "Roopesh", Science);
		Student student2 = null;
		
		
		try
		{
			student2 = (Student) student1.clone();
		}
		catch(CloneNotSupportedException  e)
		{
			e.printStackTrace();
		}	
		
		System.out.println("Subject2 of student1 is " + student1.course.subject2);
		System.out.println("Subject2 of student2 is " + student2.course.subject2);
		
		student2.course.subject2 = "maths";
		
		System.out.println("Subject2 of student1 is " + student1.course.subject2);
		System.out.println("Subject2 of student2 is " + student2.course.subject2);
		

	}
}
