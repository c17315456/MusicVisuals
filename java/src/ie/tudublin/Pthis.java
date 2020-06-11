package ie.tudublin;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class Pthis extends Visual
{
	
	//Circles
	Roundy rd1;
	Roundy rd2;
	Roundy rd3;
	Roundy rd4;


    public void settings()
    {
        size(1000, 650, P3D);
        // Use fullscreen instead of size to make your interface fullscreen
	
        //fullScreen(); 
    }
	
	
	public void setup()
	{
        startMinim();
        loadAudio("Earth.mp3");
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
		translate(width / 2, height / 2, 0);
		rotateX(angle);		
		rotateZ(angle);
		//float boxSize = 300 * getSmoothedAmplitude();
		float boxSize = 50 + (300 * getSmoothedAmplitude());
        box(boxSize);
        popMatrix();

        pushMatrix();
        translate(width / 2, height / 2, 0);
        rotateX(angle);
        rotateZ(angle);
        //float boxSize2 = 5 + (200 * getSmoothedAmplitude());
		box(boxSize - 20); //Will see if boxsize - int works
		popMatrix();
		
		pushMatrix();
        translate(width / 2, height / 2, 0);
        rotateX(angle);
        rotateZ(angle);
        //float boxSize2 = 5 + (200 * getSmoothedAmplitude());
		box(boxSize + 20); //Will see if boxsize - int works
		popMatrix();
		
		
		
		angle +=  0.01f;
		
	}


}