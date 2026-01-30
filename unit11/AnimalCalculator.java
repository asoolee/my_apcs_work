import java.util.*;

public class AnimalCalculator
{
	public static void main(String[] args)
	{
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Human());
		animals.add(new Cat());
		animals.add(new Sponge());
		animals.add(new Centipede());
		
		for(Animal a: animals)
		{
			System.out.println("name: " + a.getName() + " " + 
                               "legs: " + a.getLeg() + " " + 
                               "Furry: " + a.getFurry());
		}
		
		System.out.println("Average legs: " + averageLegs(animals));
		System.out.println("Least legs: " + leastLegs(animals));
	}
	
	public static int averageLegs(ArrayList<Animal> animals)
	{
		int result = 0;
		
		for(Animal a: animals)
		{
			result += a.getLeg(); 
		}
		
		return result / animals.size();
	}
	
	public static String leastLegs(ArrayList<Animal> animals)
	{
		Animal leastLegs = null;
		int legs = 1000;
		
		for(int i = 0; i < animals.size(); i++)
		{
			if(animals.get(i).getLeg() <  legs)
			{
				legs = animals.get(i).getLeg();
				leastLegs = animals.get(i);
			}
		}
		
		return leastLegs.getName();
	}
}
