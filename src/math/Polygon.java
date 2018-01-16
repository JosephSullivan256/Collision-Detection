package math;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
	private Vec2[] vertices;
	
	public Polygon(Vec2[] vertices) {
		this.vertices = vertices;
	}
	
	public boolean contains(Vec2 v) {
		boolean negative = v.minus(vertices[0]).cross(vertices[1].minus(vertices[0])) <0;
		
		for(int i = 0; i < vertices.length; i++) {
			if(v.minus(vertices[i]).cross(vertices[(i+1)%vertices.length]) < 0 == negative) return false;
		}
		
		return true;
	}
	
	public Vec2[] getVertices() {
		return vertices;
	}
	
	public static Polygon convex(int n) {
		List<Vec2> vertices = new ArrayList<Vec2>();
		
		return new Polygon((Vec2[]) vertices.toArray());
	}
}
