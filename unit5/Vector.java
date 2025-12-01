public class Vector
{
	private double x;
	private double y;
	
	public Vector(double xIn, double yIn)
	{
		x = xIn;
		y = yIn;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getMag()
	{
		return Math.sqrt(x*x + y*y);
	}
	
	public double direction()
	{
		
	}
	
}
