package ie.tudublin;

import processing.core.PImage;
//import processing.core.PApplet;

import ie.tudublin.Visual;

//import ddf.minim.*;
//import ddf.minim.analysis.FFT;

public class Playit extends Visual
{

    PImage bkimg;

    public void settings()
    {
        size(1100, 618);
        // Use fullscreen instead of size to make your interface fullscreen
		bkimg = loadImage("images/wallpaper.jpg");
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
	


    public void draw()
    {
        background(bkimg);
		
		
    
	}


}