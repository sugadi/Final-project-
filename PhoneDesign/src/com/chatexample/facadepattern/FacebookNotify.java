package com.chatexample.facadepattern;

public class FacebookNotify implements PhoneNotification{

	

	@Override
	public void getNotification() {
		System.out.println("Received notification from Facebook");
		
	}

}
