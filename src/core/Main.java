package core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import math.Polygon;
import math.Vec2;
import util.Display;

public class Main {
	// polygons
	private List<Polygon> polygons;
	private List<Drawable> drawables;
	
	// graphics
	private BufferedImage image;
	private Display display;
	
	public Main() {
		// initialize polygons
		polygons = new ArrayList<Polygon>();
		polygons.add(new Polygon(new Vec2[] {
				new Vec2(100,100),new Vec2(200,150),new Vec2(150,250),new Vec2(50,200)
		}));
		polygons.add(new Polygon(new Vec2[] {
				new Vec2(250,100),new Vec2(450,150),new Vec2(250,400),new Vec2(150,150)
		}));
		
		// initialize graphics
		drawables = new ArrayList<Drawable>();
		for(Polygon p: polygons){
			drawables.add(new DrawablePolygon(p));
		}
		
		image = new BufferedImage(640,480,BufferedImage.TYPE_INT_ARGB);
		
		display = new Display(640,480,"Collision Detection");
	}
	
	public void run() {
		while(true) {
			draw();
		}
	}
	
	public void draw() {
		Graphics2D g2d = image.createGraphics();
		
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		for(Drawable p: drawables) {
			p.draw(g2d);
		}
		
		g2d.dispose();
		
		display.draw(image);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
