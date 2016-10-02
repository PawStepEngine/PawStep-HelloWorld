package net.pawstep.hello;

import org.lwjgl.opengl.GL11;

import net.pawstep.engine.PawStepEngine;
import net.pawstep.engine.components.ComponentType;
import net.pawstep.engine.render.Renderer;

@ComponentType(name = "hello:cube_wireframe_rgb")
public class RgbWireframeCubeRenderer extends Renderer {

	@Override
	public void draw() {
		
		GL11.glBegin(GL11.GL_LINES);
		
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(-1, -1, -1);
		GL11.glVertex3f(1, -1, -1);
		
		GL11.glColor3f(0, 1, 0);
		GL11.glVertex3f(-1, -1, -1);
		GL11.glVertex3f(-1, 1, -1);
		
		GL11.glColor3f(0, 0, 1);
		GL11.glVertex3f(-1, -1, -1);
		GL11.glVertex3f(-1, -1, 1);
		
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(1, 1, 1);
		GL11.glVertex3f(-1, 1, 1);
		
		GL11.glColor3f(0, 1, 0);
		GL11.glVertex3f(1, 1, 1);
		GL11.glVertex3f(1, -1, 1);
		
		GL11.glColor3f(0, 0, 1);
		GL11.glVertex3f(1, 1, 1);
		GL11.glVertex3f(1, 1, -1);
		
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(-1, 1, -1);
		GL11.glVertex3f(1, 1, -1);
		
		GL11.glColor3f(0, 0, 1);
		GL11.glVertex3f(-1, 1, -1);
		GL11.glVertex3f(-1, 1, 1);
		
		GL11.glColor3f(0, 1, 0);
		GL11.glVertex3f(-1, 1, 1);
		GL11.glVertex3f(-1, -1, 1);
		
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(-1, -1, 1);
		GL11.glVertex3f(1, -1, 1);
		
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(-1, -1, 1);
		GL11.glVertex3f(1, -1, 1);
		
		GL11.glColor3f(0, 1, 0);
		GL11.glVertex3f(1, 1, -1);
		GL11.glVertex3f(1, -1, -1);
		
		GL11.glColor3f(0, 0, 1);
		GL11.glVertex3f(1, -1, -1);
		GL11.glVertex3f(1, -1, 1);
		
		GL11.glEnd();
		
	}
	
	static {
		PawStepEngine.registerComponentType(RgbWireframeCubeRenderer.class);
	}
	
}
