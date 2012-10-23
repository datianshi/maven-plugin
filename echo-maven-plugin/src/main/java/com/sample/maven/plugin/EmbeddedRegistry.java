package com.sample.maven.plugin;

import java.util.ArrayList;
import java.util.List;


public class EmbeddedRegistry{
	public static List<Registry> registries = new ArrayList<Registry>();
	
	public static void registry(Registry registry) {
		registries.add(registry);
	}
	
	public static void stop(){
		for(Registry r: registries){
			r.stop();
		}
	}
	
}
