import java.util.*;

public class AcademicClass
{
	public AcademicClass(Teacher teacher)
	{
		students = new ArrayList<Student>();
		this.teacher = teacher;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public void info()
	{
		System.out.println("Teacher: " + teacher.getName());
		System.out.println("Subject: " + teacher.getSubject());
		
		System.out.println("Students: ");
		for(int i = 0; i < students.size(); i++)
		{
			System.out.println(students.get(i).getName());
		}
	}
	
	public ArrayList<String> favoriteNum(int number)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		for(Student s : students)
		{
			if(number == s.getNum())
				result.add(s.getName());
		}
		
		return result;
	}
	
	public ArrayList<String> oddNum()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		for(Student s : students)
		{
			if((s.getNum() % 2) != 0 && s.getNum() != 0)
				result.add(s.getName());
		}
		
		return result;

	}
	
	private ArrayList<Student> students;
	private Teacher teacher;
}
