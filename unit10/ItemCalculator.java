import java.util.*; 

public class ItemCalculator
{
	public static void printItems(ArrayList<Item> items)
	{
		for(Item i: items)
			System.out.println(i.getName() + " is " + i.getPrice() + " dollars");
	}
	
	public static float getAverage(ArrayList<Item> items)
	{
		float average = 0;
		
		for(Item i: items)
			average += i.getPrice();
			
		return average / items.size();
	}
	
	public static float getHighest(ArrayList<Item> items)
	{
		float highest = 0;
		
		for(Item i: items)
		{
			if(i.getPrice() > highest)
			highest = i.getPrice();
		}
		
		return highest;
	}
	
	public static void main(String[] args)
	{
	ArrayList<Item> items = new ArrayList<Item>();
	
	items.add(new Item("Hat", 30.00f));
	items.add(new Item("Shoes", 50.00f));
	items.add(new Item("Shirt", 10.00f));
	
	printItems(items);
	System.out.println("average price " + getAverage(items));
	System.out.println("highest price " + getHighest(items));
	}
}


