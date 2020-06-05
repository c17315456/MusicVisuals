package ie.tudublin;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class Pthis extends Visual
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
		calculateAverageAmplitude();
		stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
		strokeWeight(5);
		noFill();
		lights();
		pushMatrix();
		transate(width / 2, height / 2, 0);
		rotateX(angle);		
		rotateZ(angle);
		final float boxSize1 = 50 + (200 * getSmoothedAmplitude());
        box(boxSize1);
        popMatrix();

        pushMatrix();
        transate(width / 2, height / 2, 0);
        rotateX(angle);
        rotateZ(angle);
        final float boxSize2 = 5 + (200 * getSmoothedAmplitude());
		box(boxSize2);
		popMatrix();
		
		angle +=  0.01f;
		
	}


}