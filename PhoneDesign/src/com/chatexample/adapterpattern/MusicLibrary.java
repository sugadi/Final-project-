package com.chatexample.adapterpattern;

public class MusicLibrary implements PhoneSettings{

	@Override
	public void musicLibrary(String musicPath) {
		System.out.println("Music path changed to "+musicPath);
		
	}

	@Override
	public void changeDisplay(String displayType) {
		// TODO Auto-generated method stub
		
	}

	

	

}
