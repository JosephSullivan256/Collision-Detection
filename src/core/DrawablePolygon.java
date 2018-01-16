package core;

import java.awt.Color;
import java.awt.Graphics2D;

import math.Polygon;
import math.Vec2;

public class DrawablePolygon implements Drawable{
	
	private Color c;
	
	private int[] xVerts;
	private int[] yVerts;
	
	public DrawablePolygon(Polygon p, Color c){
		this.c = c;
		
		Vec2[] vs = p.getVertices();
		
		xVerts = new int[vs.length];
		yVerts = new int[vs.length];
		
		for(int i = 0; i < vs.length; i++){
			xVerts[i] = (int)Math.round(vs[i].x);
			yVerts[i] = (int)Math.round(vs[i].y);
		}
	}
	
	public DrawablePolygon(Polygon p){
		this(p,new Color((float)Math.random(),(float)Math.random(),(float)Math.random(),0.5f));
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(c);
		g2d.fillPolygon(xVerts,yVerts,xVerts.length);
	}
}
