package net.pawstep.hello;

import org.lwjgl.util.vector.Vector3f;

import net.pawstep.engine.PawStepEngine;
import net.pawstep.engine.SceneProvider;
import net.pawstep.engine.hierarchy.Entity;
import net.pawstep.engine.hierarchy.Scene;
import net.pawstep.engine.render.Camera;

public class HelloSceneProvider implements SceneProvider {

	@SuppressWarnings("unused")
	@Override
	public void populateInitialScene(Scene scene) {
		
		PawStepEngine.getLogger().info("Populating initial scene...");
		
		Entity camEnt = scene.newEntity("View");
		camEnt.getTransform().position = new Vector3f(0, 0, 0);
		Camera cam = camEnt.addComponent(Camera.class);
		
		Entity cube = scene.newEntity("Cube");
		cube.addComponent(SineMoveComponent.class);
		cube.addComponent(CubeWireframeRenderer.class);
		
		PawStepEngine.getLogger().info("Done!");
		
	}

}
