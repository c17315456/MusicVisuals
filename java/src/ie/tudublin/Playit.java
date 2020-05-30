package ie.tudublin;

import processing.core.PImage;
import processing.core.PApplet;

import ddf.minim.*;
import ddf.minim.analysis.FFT;

public class Playit extends PApplet 
{

    PImage bkimg;
	PImage KK;

    public void settings()
    {
        size(1100, 618);
        // Use fullscreen instead of size to make your interface fullscreen
		bkimg = loadImage("images/wallpaper.jpg");
        //fullScreen(); 
    }
	
	
		 public void setup()
    {
        colorMode(HSB);
       
     

        startMinim();
        loadAudio("Bubblegum.mp3");
        getAudioPlayer().play();
        //startListening(); 
        
    }
	


    public void draw()
    {
        background(bkimg);
		
		
    
	}


}