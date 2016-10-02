package net.pawstep.hello;

import net.pawstep.engine.EulerHelper;
import net.pawstep.engine.components.ComponentType;
import net.pawstep.engine.hierarchy.Component;

@ComponentType(name = "hello:offset_and_rotate")
public class OffsetAndRotateComponent extends Component {
	
	public float multiplier = 1F;
	
	@Override
	public void update() {
		
		float d = System.currentTimeMillis() * 0.001F * this.multiplier;
		
		this.getTransform().rotation = EulerHelper.eulerToQuat(0, 0, d);
		
	}
	
}
