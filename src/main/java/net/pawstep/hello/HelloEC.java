package net.pawstep.hello;

import net.pawstep.engine.EngineConfig;
import net.pawstep.engine.SceneProvider;

public class HelloEC extends EngineConfig {

	@Override
	public int getWindowWidth() {
		return 640;
	}

	@Override
	public int getWindowHeight() {
		return 480;
	}

	@Override
	public SceneProvider getSceneProvider() {
		return new HelloSceneProvider();
	}

}
