import java.util.*;

public class testAcademic
{
	public static void main(String[] args)
	{
		AcademicClass testClass = new AcademicClass(new Teacher("Dr. Kessner", "APCS"));
		
		testClass.addStudent(new Student("Adison", 8));
		testClass.addStudent(new Student("Sarah", 5));
		testClass.addStudent(new Student("Sofia", 5));
		testClass.addStudent(new Student("Arabella", 4));
		testClass.addStudent(new Student("Elissa", 3));
		
		ArrayList<String> odd = new ArrayList<String>(testClass.oddNum());
		ArrayList<String> faveNum = new ArrayList<String>(testClass.favoriteNum(5));
		
		System.out.println("Info: ");
		testClass.info();
		System.out.println(" ");
		System.out.println("Students whose favorite number is 5: " + faveNum);
		System.out.println(" ");
		System.out.println("Students with an odd favorite number: " + odd);
		
	}
}
