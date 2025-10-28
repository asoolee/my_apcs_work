public class Person
{
	public Person(String nameIn, int petIn)
	{
		name = nameIn;
		pets = petIn;
	}
	
	public void greeting()
	{
		System.out.println("Hello my name is " + name + " and I have " + pets + " pets.");
	}
	
	public String getName()
	{	
		return name;
	}
	
	public int getPets()
	{
		return pets;
	}
	
	private String name;
	private int pets;
	
}
