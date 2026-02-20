public class Rectangle
{
	public Rectangle(String nameIn, double heightIn, double widthIn)
	{
		name = nameIn;
		height = heightIn;
		width = widthIn;
	}
	
	public String getName(){ return name; } 
	public double getHeight(){ return height; }
	public double getWidth(){ return width; }
	
	public double perimeter(){ return 2*height + 2*width; }
	public double area(){ return height*width; }
	
	public static double averagePerimeter(Rectangle[][] values)
	{
		double result = 0;
		
		for(Rectangle[] row : values)
		{
			for(Rectangle value : row)
			{
				result += value.perimeter();
			}
		}
		
		int size = 0;
		
		return result / (values.length*values[0].length);
	}
	
	public static double greatest(Rectangle[][] values)
	{
		double result = values[0][0].area();
		
		for(Rectangle[] row : values)
		{
			for(Rectangle value : row)
			{
				if( value.area() > result )
				result = value.area();
			}
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Rectangle[][] values = {
			{new Rectangle("A", 3, 4), new Rectangle("B", 2, 5), new Rectangle("C", 6, 7)},
			{new Rectangle("D", 1, 2), new Rectangle("E", 8, 9), new Rectangle("F", 10, 11)}
		};
		
		System.out.println("Avg perimeter: " + averagePerimeter(values));
		System.out.println("Greatest area: " + greatest(values));
	}
	
	private double height, width;
	private String name;
}
