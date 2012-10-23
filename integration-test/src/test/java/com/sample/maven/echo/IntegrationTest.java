package com.sample.maven.echo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;



public class IntegrationTest {

	@Test
	public void test() throws IOException{
		EchoClient c = new EchoClient();
		String echoString = "SomeThing";
		Assert.assertEquals(echoString,c.callServer(echoString));
	}
	
}
