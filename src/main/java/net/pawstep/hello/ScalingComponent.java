package net.pawstep.hello;

import org.lwjgl.util.vector.Vector3f;

import net.pawstep.engine.PawStepEngine;
import net.pawstep.engine.components.ComponentType;
import net.pawstep.engine.hierarchy.Component;

@ComponentType(name = "hello:scaler")
public class ScalingComponent extends Component {

	@Override
	public void update() {
		
		long t = System.currentTimeMillis();
		double d = ((double) t) * 0.001D;
		
		float sin = (float) Math.sin(d);
		float cos = (float) Math.cos(d);
		
		this.getTransform().scaling = new Vector3f(sin + 1.5F, cos + 1.5F, 0.5F);
		this.getTransform().position = new Vector3f(0, 1, 0);
		
	}
	
	static {
		PawStepEngine.registerComponentType(ScalingComponent.class);
	}
	
}
