package net.pawstep.hello;

import net.pawstep.engine.PawStepEngine;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		PawStepEngine.init(new HelloEC());
		PawStepEngine.getEngine();
		
	}
	
}
