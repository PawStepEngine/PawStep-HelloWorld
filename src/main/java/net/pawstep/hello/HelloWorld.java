package net.pawstep.hello;

import net.pawstep.engine.PawStepEngine;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		PawStepEngine e = PawStepEngine.init(new HelloEC());
		
		e.getLoopManager().startLoop();
		
	}
	
}
