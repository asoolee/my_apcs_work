import processing.core.*;
import java.util.*;

public class Arrival
{
	public Arrival(PApplet p, PVector posIn)
	{
		this.p = p;
		position = posIn;
		velocity = new PVector(p.random(-2,2),p.random(-2,2));
		radius = 1;
		c = p.color(0);
	}
	
	public void display()
	{
		p.fill(c);
		p.ellipse(position.x,position.y,radius*2, radius*2);
		
		position.add(velocity);
		
		PVector acc = new PVector(p.mouseX - position.x, p.mouseY - position.y);
		acc.mult(.001f);
		velocity.add(acc);
	}
	
	private PApplet p; 
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
}
