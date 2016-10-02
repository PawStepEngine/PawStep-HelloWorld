package net.pawstep.hello;

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
		
		Entity ent = scene.newEntity("View");
		Camera cam = ent.addComponent(Camera.class);
		
		PawStepEngine.getLogger().info("Done!");
		
	}

}
