import processing.core.*;
import java.util.*;

public class Arrival
{
	public Arrival(PApplet p, PVector posIn, PVector targetIn)
	{
		this.p = p;
		position = posIn;
		target = targetIn;
		velocity = new PVector(p.random(-1,2),p.random(-1,2));
		radius = 1;
		c = p.color(0);
	}
	
	public void display()
	{
		p.noStroke();
		p.fill(c);
		p.ellipse(position.x,position.y,radius*2, radius*2);
		
		// now change to target
		
		//for position isnt at target, add acc
		PVector acc = PVector.sub(target, position);
		
		
		if(acc.mag() > 0.1)
		{
			acc.mult(.005f);
		}
	
		velocity.add(acc);
		position.add(velocity);
		
		if(p.dist(target.x, target.y, position.x, position.y) < 100)
		{
			velocity.mult(0.8f);
			if(velocity.mag() < 3)
			velocity.setMag(p.random(1,4));
		}
		
	}

	
	private PApplet p; 
    private PVector position;
    private PVector velocity;
    private PVector target;
    private float radius;
    private int c;
    private int n = 0;
}
