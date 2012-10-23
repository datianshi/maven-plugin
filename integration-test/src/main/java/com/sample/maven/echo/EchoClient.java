package com.sample.maven.echo;

import java.io.*;
import java.net.*;

public class EchoClient {
	
	public String callServer(String val) throws IOException {
		Socket echoSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		echoSocket = new Socket("localhost", 9999);
		out = new PrintWriter(echoSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(
					echoSocket.getInputStream()));

		out.println(val);
		String retval = in.readLine();

		out.close();
		in.close();
		echoSocket.close();
		return retval;
	}
}
