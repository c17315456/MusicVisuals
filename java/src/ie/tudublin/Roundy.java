package ie.tudublin;

import processing.core.PApplet;
//import ie.tudublin.Visual;

public class Roundy
{
	Pthis pthis;
    private float x;
    private float y;
    private float r;
    private float g;
    private float b;
	private float diameter;
    private float radius;
	
	
    public Roundy (Pthis pthis,float x, float y, float diameter, float r, float g, float b)
    {
        this.pthis = pthis;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.diameter = diameter;
    }


    public void render()
    {
        //ui.noStroke();
        //ui.fill(r,g,b);
        pthis.ellipse(x,y,diameter, diameter);
		
    }

		
}