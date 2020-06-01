package ie.tudublin;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class Playit extends Visual
{


    public void settings()
    {
        size(1000, 650, P3D);
        // Use fullscreen instead of size to make your interface fullscreen
	
        //fullScreen(); 
    }
	
	
	public void setup()
	{
        startMinim();
        loadAudio("Bubblegum.mp3");
  		colorMode(HSB);
        
    }
	
	
	public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }
	
	float angle = 0;
	


    public void draw()
    {
        background(0);
		stroke(255);
		strokeWeight(5);
		mofill();
		lights();
		transate(width / 2, height / 2, 0);
		rotateX(angle);		
		rotateZ(angle);
		
		box(100);
		
		angle +=  0.01f;
		
	}


}