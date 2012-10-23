package com.sample.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.sample.maven.echo.EchoServer;

/**
 * Goal which starts the echo server.
 *
 * @goal run
 * 
 * @phase process-classes
 */
public class RunMojo extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
    	EchoServer echoServer = new EchoServer();
    	EmbeddedRegistry.registry(echoServer);
    	echoServer.run();
	}

}
