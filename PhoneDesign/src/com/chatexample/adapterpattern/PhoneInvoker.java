package com.chatexample.adapterpattern;

public class PhoneInvoker implements CallerTune{

	PhoneSettingAdapter cladapter;

	@Override
	public void setCallerTune(String chatType, String contactName) {
		
		if(chatType.equalsIgnoreCase("MI5")){
	         System.out.println("Song: "+contactName+" from movie: " + chatType+" added as Caller Tune");			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(chatType.equalsIgnoreCase("MI3") || contactName.equalsIgnoreCase("MI5")){
	    	  cladapter = new PhoneSettingAdapter(chatType);
	    	  cladapter.setCallerTune(chatType, contactName);
	      }
	      
	      else{
	         System.out.println("Invalid Song Name " + chatType);
	      }
		
	}

	
}
