public class Animal
{
	public Animal(String name, int legCount, boolean furriness)
	{
		this.name = name;
		this.legCount = legCount;
		this.furriness = furriness;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLeg()
	{
		return legCount;
	}
	
	public String getFurry()
	{
		if(furriness == true)
		return "Yes";
		
		else
		return "No";
	}
	
	protected String name;
	protected int legCount;
	protected boolean furriness;
}
