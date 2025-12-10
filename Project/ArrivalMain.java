import processing.core.*;
import java.util.*;

public class ArrivalMain extends PApplet
{
	public void settings()
	{
		fullScreen();
	}
	
	public void setup()
	{
		arrivals = new ArrayList<Arrival>();
		int angle = 0;
		
		for(int i = 0; i < 1500; i++)
		{
			arrivals.add(new Arrival(this, new PVector(width/2 + cos(angle)*150, height/2 + sin(angle)*150)));
			angle++;
		}
	}
	
	public void draw()
	{
		background(255);
		for(Arrival a: arrivals)
		a.display();
	}
	
	private ArrayList<Arrival> arrivals;

    public static void main(String[] args)
    {
        PApplet.main("ArrivalMain");
    }
    
}

	
