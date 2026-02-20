import java.util.*;

public class testShape
{
	public static void main(String[] args)
		{	
			ShapeCollection testCollection = new ShapeCollection();
		
			testCollection.addShape(new Shape("circle", 0));
			testCollection.addShape(new Shape("square", 4));
			testCollection.addShape(new Shape("star", 5));
			testCollection.addShape(new Shape("triangle", 3));
			testCollection.addShape(new Shape("rectangle", 4));
			testCollection.addShape(new Shape("octagon", 8));
			
			ArrayList<String> even = new ArrayList<String>(testCollection.evenSides());
			
			System.out.println("A star has " + testCollection.findSides("star") + " sides");
			System.out.println("The average amount of sides is " + testCollection.averageSides());
			System.out.println("All shapes with even sides:" + even);
			
		}
}
