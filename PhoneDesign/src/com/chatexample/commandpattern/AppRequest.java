package com.chatexample.commandpattern;

public class AppRequest {

	private String appName;
	private int appVersion;
	
	
	
	
	public AppRequest(String appName, int appVersion) {
		
		this.appName = appName;
		this.appVersion = appVersion;
		
	}
	public void allow() {
		System.out.println("New application "+appName+" installed with version "+appVersion);
	}
	public void deny() {
		System.out.println("New application "+appName+" with version "+appVersion+" contains virus and prevented from intalling");
	}
}
