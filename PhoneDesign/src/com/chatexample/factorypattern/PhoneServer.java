package com.chatexample.factorypattern;

public class PhoneServer {

	public PhoneNotification getNotifications(String notificationType){
	      if(notificationType == null){
	         return null;
	      }		
	      if(notificationType.equalsIgnoreCase("facebook")){
	         return new FacebookNotify();
	         
	      } else if(notificationType.equalsIgnoreCase("call")){
	         return new WhatsaapNotify();
	         
	      } else if(notificationType.equalsIgnoreCase("whatsapp")){
	         return new CallNotify();
	      }
	      
	      return null;
	   }
}
