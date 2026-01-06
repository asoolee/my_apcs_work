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
		 //int angle = 0;
		
		//for(int i = 0; i < 1500; i++)
		//{
		//arrivals.add(new Arrival(this, new PVector(width/2 + cos(angle)*150, height/2 + sin(angle)*150)));
		//arrivals.add(new Arrival(this, new PVector(random(width/3,width/2), random(height/3,height/2))));
		//angle++;
		//}
		
		cx = width/2;
		cy = height/2;
		r = width/6;
		
		background(255);
		
	}
	
	public void draw()
	{
		fill(255,30);
		rect(0,0, width, height);
	// should change to width height 
	
		if(spawn)
		{
			n++;
			float t = random(0, TWO_PI);
			arrivals.add(new Arrival(this, new PVector(mouseX, mouseY), new PVector(cx+r*cos(t),cy+r*sin(t))));
		}
		for(Arrival a: arrivals)
		a.display();
	}
	
	public void mousePressed()
	{
		spawn = true;
	}
	
	public void mouseReleased()
	{
		spawn = false;
	}
	
	
    public static void main(String[] args)
    {
        PApplet.main("ArrivalMain");
    }
    
  
    private ArrayList<Arrival> arrivals;
	private boolean spawn = false;
	private float cx, cy;
	private float r;
	private float N = 1400;
	private float n = 0;
    
}

	
