package com.chatexample.factorypattern;

public class CallNotify implements PhoneNotification{


	@Override
	public void getNotification() {
		System.out.println("Notification received for getting a call from contact Roy");
		
	}

}
