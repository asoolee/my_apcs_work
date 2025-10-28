public class PersonTest
{
	public static void main(String[] args)
	{
		Person Jasmine = new Person("Jasmine", 1);
		
		System.out.println(Jasmine.getName());
		System.out.println(Jasmine.getPets());
		
		Jasmine.greeting();

	}
	
}
