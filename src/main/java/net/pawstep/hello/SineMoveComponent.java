package net.pawstep.hello;

import org.lwjgl.util.vector.Vector3f;

import net.pawstep.engine.PawStepEngine;
import net.pawstep.engine.components.ComponentType;
import net.pawstep.engine.hierarchy.Component;

@ComponentType(name = "hello:sine_move")
public class SineMoveComponent extends Component {
	
	@Override
	public void update() {
		
		long t = System.currentTimeMillis();
		double d = ((double) t) * 0.001D;
		
		float sin = (float) Math.sin(d);
		float cos = (float) Math.cos(d);
		
		this.getTransform().position = new Vector3f(3F * sin, 0, 3F * cos - 4);
		
	}
	
	static {
		PawStepEngine.registerComponentType(SineMoveComponent.class);
	}
	
}
