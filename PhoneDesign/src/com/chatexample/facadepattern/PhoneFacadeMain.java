package com.chatexample.facadepattern;

public class PhoneFacadeMain {

	public static void main(String[] args) {
		PhoneServer bb = new PhoneServer();

		bb.getCallNotification();
		bb.getFacebookNotification();
		bb.getWhatsappNotification();

	}

}
