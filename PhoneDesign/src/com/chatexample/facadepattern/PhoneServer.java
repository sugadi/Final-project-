package com.chatexample.facadepattern;

public class PhoneServer {
	
	PhoneNotification call;
	PhoneNotification facebook;
	PhoneNotification whatsapp;
	
	public PhoneServer() {
		call = new CallNotify();
		facebook = new FacebookNotify();
		whatsapp = new WhatsaapNotify();
	}
	
	public void getCallNotification() {
		call.getNotification();
	}

	public void getFacebookNotification() {
		facebook.getNotification();
	}

	public void getWhatsappNotification() {
		whatsapp.getNotification();
	}
	
}
