import java.util.*;

public class ShapeCollection
{
	public ShapeCollection()
	{
		collection = new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape)
	{
		collection.add(shape);
	}
	
	public int findSides(String shapeName)
	{
		int result = 0;
		
		for(Shape shapes : collection)
		{
			if(shapeName.equals(shapes.getName()))
				result = shapes.getSides();
		}
		
		return result;
	}
	
	public double averageSides()
	{
		double result = 0;
		
		for(Shape shapes : collection)
		{
			result += shapes.getSides();
		}
		
		return result / collection.size();
	}
	
	public ArrayList<String> evenSides()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		for(Shape shapes : collection)
		{
			if(shapes.getSides() % 2 == 0 && (shapes.getSides() != 0))
			result.add(shapes.getName());
		}
		
		return result;
	}
	
	
	private ArrayList<Shape> collection;
}
