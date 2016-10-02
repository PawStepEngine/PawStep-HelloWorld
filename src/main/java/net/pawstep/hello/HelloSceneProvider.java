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
		cube.getTransform().position = new Vector3f(-3, -1, -5);
		//cube.addComponent(SineMoveComponent.class);
		cube.addComponent(WhiteWireframeCubeRenderer.class);
		
		Entity cube2 = cube.newEntity("Cube2");
		cube2.getTransform().position = new Vector3f(3, 0, 0);
		//cube2.getTransform().scaling = new Vector3f(1.25F, 0, 0);
		cube2.addComponent(SineMoveComponent.class);
		cube2.addComponent(WhiteWireframeCubeRenderer.class);
		
		Entity cube3 = cube2.newEntity("Cube3");
		cube3.getTransform().position = new Vector3f(3, 0, 0);
		cube3.addComponent(SineMoveComponent.class);
		cube3.addComponent(RgbWireframeCubeRenderer.class);
		
		PawStepEngine.getLogger().info("Done!");
		
	}
	
}
