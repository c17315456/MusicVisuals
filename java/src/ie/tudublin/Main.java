package ie.tudublin;

import ie.tudublinPlayit.java;
//import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;
import ie.tudublin.Visual.java


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch(a, new Playit());
	}

	public static void main(final String[] args) {
		Main main = new Main();
		main.startUI();			
	}
}