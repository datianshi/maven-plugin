package com.sample.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Goal which starts the echo server.
 *
 * @goal stop
 * 
 * @phase pre-integration-test
 */
public class StopMojo extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		EmbeddedRegistry.stop();
	}

}
