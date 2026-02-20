import processing.sound.*;
import processing.core.*;
import java.util.*;

public class Spikes
{
	
	public Spikes(PApplet p, PVector positionIn)
	{
			this.p = p;
			position = positionIn;
			velocity = new PVector(p.random(-1,2),p.random(-1,2));
			radius = 1;
			p.color(0);
	}
	
		public void display()
	{
		p.noStroke();
		p.fill(c);
		p.ellipse(position.x,position.y,radius*2, radius*2);
		
	}

	private PApplet p; 
    private PVector position;
    private PVector velocity;
    private float radius;

}
