package engine;

import static org.lwjgl.opengl.GL11.*;

public class Sprite {

	private float r,g,b,sx,sy;
	
	public void Sprite(float r, float g, float b, float sx ,float sy){
		this.r = r;
		this.g=  g;
		this.b = b;
		this.sx = sx;
		this.sy = sy;
		
	}
	
	
	public void render() {
		glColor3f(r, g, b);
		glBegin(GL_QUADS);
		{
			glVertex2d(0, 0);
			glVertex2d(0, sy);
			glVertex2d(sx, sy);
			glVertex2d(sx, 0);
		}
		glEnd();
		
	}

}
