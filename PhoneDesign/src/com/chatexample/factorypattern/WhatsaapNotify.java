package com.chatexample.factorypattern;

public class WhatsaapNotify implements PhoneNotification{


	@Override
	public void getNotification() {
		System.out.println("Received notification for WHatsaap application");
		
	}

}
