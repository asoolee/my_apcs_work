import processing.core.*;

public class Rain extends PApplet
{
	public Rain(PApplet p)
	{
		this.p = p;
		position = new PVector(p.random(p.width), 0);
		velocity = new PVector(0,p.random(-20,0));
		acceleration = new PVector(0,p.random(1,4));
		radius = 3;
		c = p.color(102, 181, 255);
	}
	
	public void rainDisplay()
	{
		p.fill(c);
		p.ellipse(position.x,position.y,radius*2, radius*2);
		
		position.add(velocity);
		velocity.add(acceleration);
		
		if (position.y - radius > p.width)
		{
			position.y = 0;
			velocity.set(0,p.random(-20,0));
		}
		
	}
	private PApplet p; 
    private PVector position;
    private PVector velocity;
    private PVector acceleration;
    private float radius;
    private int c;
}
