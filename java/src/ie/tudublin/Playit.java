package ie.tudublin;

import processing.core.PImage;
import processing.core.PApplet;

public class Playit extends PApplet 
{

    PImage bkimg;

    public void settings()
    {
        size(1100, 618);
        // Use fullscreen instead of size to make your interface fullscreen
		bkimg = loadImage("images/wallpaper.jpg");
        //fullScreen(); 
    }

    public void draw()
    {
        background(bkimg);
    }


}