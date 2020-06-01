package ie.tudublin;

import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;
import ie.tudublin.Visual.java
 
	
public class Main
{	

	public void startUI()
	{
		final String[] a = { "MAIN" };
		processing.core.PApplet.runSketch(a, new CubeVisual1());
	}

	public static void main(final String[] args) {
		final Main main = new Main();
		main.startUI();			
	}
}