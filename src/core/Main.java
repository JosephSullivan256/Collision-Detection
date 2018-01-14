package core;

import math.Polygon;
import math.Vec2;
import util.Display;

public class Main {
	// polygons
	private Polygon[] polygons;
	
	// graphics
	private Display display;
	
	public Main() {
		// initialize polygons
		polygons = new Polygon[1];
		polygons[0] = new Polygon(new Vec2[] {
				new Vec2(-100,0),new Vec2(-50,100),new Vec2(-10,110),new Vec2(50,-40)
		});
		
		// initialize display
		display = new Display(640,480,"Collision Detection");
	}
	
	public void run() {
		while(true) {
			draw();
		}
	}
	
	public void draw() {
		for(Polygon p: polygons) {
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
