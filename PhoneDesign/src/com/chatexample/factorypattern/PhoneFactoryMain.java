package com.chatexample.factorypattern;

public class PhoneFactoryMain {

	public static void main(String[] args) {
		PhoneServer bb = new PhoneServer();

	  PhoneNotification g1 = bb.getNotifications("call");
    
	  g1.getNotification();
	      
      PhoneNotification g2 = bb.getNotifications("whatsapp");
	    
      g2.getNotification();
	      
      PhoneNotification g3 = bb.getNotifications("facebook");
	       
      g3.getNotification();

	}

}
