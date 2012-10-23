package com.sample.maven.echo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;



public class IntegrationTest {

	@Test
	public void test() throws IOException{
		EchoClient c = new EchoClient();
		Assert.assertEquals("SomeThing",c.callServer("SomeThing"));
	}
	
}
