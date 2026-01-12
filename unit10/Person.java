public class Person
{
	public Person(String name, int pets)
	{
		this.name = name;
		this.pets = pets;
	}
	
	private String name; 
	private int pets;
	
	//accessor
	
	public String getName()
	{
		return name;
	}
	
	public int getPets()
	{
		return pets;
	}
	
}
