import java.util.*;

public class PersonStats
{
	public static float getAverage(ArrayList<Person> persons)
		{
			int average = 0;
		
			for(Person p: persons)
				average += p.getPets();
			
			return average / persons.size();
		}
	
	public static String mostPets(ArrayList<Person> persons)
		{
			Person highest = null;
			int highestPets = 0;
			
			for(int i = 0; i < persons.size(); i++)
			{
				if(persons.get(i).getPets() > highestPets)
				{
					highestPets = persons.get(i).getPets();
					highest = persons.get(i);
				} 
			}
			
			return highest.getName();
			
		}
		
	public static ArrayList<String> more2Pets(ArrayList<Person> persons)
		{
			ArrayList<String> result = new  ArrayList<String>();
			
			for(Person p: persons)
			{
				if( p.getPets() >= 2)
				{
					result.add(p.getName());
				}
			}
			
			return result;
		}
	
	public static void main(String[] args)
	{
		int expectedAverage = 2;
		String expectedPets = "Sarah";
		
		ArrayList<Person> test = new ArrayList<Person>();
		test.add(new Person("Sarah", 5));
		test.add(new Person("Jazzy", 1));
		test.add(new Person("Sofia", 3));
		test.add(new Person("Dad", 4));
		test.add(new Person("Me", 1));
		
		System.out.println("Average pets: " + getAverage(test));
		if(getAverage(test) == expectedAverage)
			System.out.println("yay");
		else
			System.out.println("no");
		System.out.println("Most pets: " + mostPets(test));
		if(mostPets(test) == expectedPets)
			System.out.println("yay");
		else
			System.out.println("no");
		System.out.println("At least two pets: " + more2Pets(test));
	}
}
