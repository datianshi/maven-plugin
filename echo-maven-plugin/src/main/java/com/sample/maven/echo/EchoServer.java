package com.sample.maven.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.sample.maven.plugin.Registry;

public class EchoServer implements Runnable, Registry {

	ServerSocket serverSocket;
	private boolean interrupt = false;
	
	public EchoServer(){
		try {
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!interrupt) {

				Socket clientSocket = null;

				clientSocket = serverSocket.accept();

				PrintWriter out = new PrintWriter(
						clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(
						clientSocket.getInputStream()));

				String inputLine = in.readLine();
				out.println(inputLine);
				out.close();
				in.close();
				clientSocket.close();
			}
		} catch (IOException e) {

		}

	}

	public void stop() {
		try {
			if(!interrupt)
			{
				System.out.println("The Echo Server is shutdown");
				interrupt = true;
				serverSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
