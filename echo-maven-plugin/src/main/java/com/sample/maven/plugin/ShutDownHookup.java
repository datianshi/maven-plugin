package com.sample.maven.plugin;

public class ShutDownHookup implements Runnable{

	public void run() {
		EmbeddedRegistry.stop();
	}

}
