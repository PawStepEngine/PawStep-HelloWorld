package net.pawstep.hello;

import org.lwjgl.util.vector.Vector3f;

import net.pawstep.engine.components.ComponentType;
import net.pawstep.engine.hierarchy.Component;

@ComponentType(name = "hello:sinz")
public class SinZComponent extends Component {

	@Override
	public void update() {
		
		long t = System.currentTimeMillis();
		double d = ((double) t) * 0.001D;
		
		float sin = (float) Math.sin(d);
		
		this.getTransform().position = new Vector3f(0, 2, sin * 2F - 5F);
		
	}
	
}
