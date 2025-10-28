import processing.core.*;
import java.util.*;

public class ImRaining extends PApplet
{
	public void settings()
	{
		size(400,400);
	}
	
	public void setup()
	{
		rains = new ArrayList<Rain>();
	
		for(int i = 0; i < 100; i++)
		rains.add(new Rain(this));
	}
	
	public void draw()
	{
		background(0);
		for(Rain r: rains)
		r.rainDisplay();
	}
	
	private ArrayList<Rain> rains;

    public static void main(String[] args)
    {
        PApplet.main("ImRaining");
    }
}
