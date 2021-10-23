package com.chatexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class AppServer {

	private List<PhoneSettings> contactList = new ArrayList<PhoneSettings>(); 

	   public void getChatList(PhoneSettings order){
		   contactList.add(order);		
	   }

	   public void storeChatDetails(){
	   
	      for (PhoneSettings order : contactList) {
	         order.allowNewApps();
	      }
	      contactList.clear();
	   }
}
