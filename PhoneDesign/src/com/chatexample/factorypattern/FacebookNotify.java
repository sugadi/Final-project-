package com.chatexample.factorypattern;

public class FacebookNotify implements PhoneNotification{

	

	@Override
	public void getNotification() {
		System.out.println("Received notification from Facebook");
		
	}

}
