package com.chatexample.adapterpattern;

public class ChangeDisplay implements PhoneSettings{

	@Override
	public void musicLibrary(String musicPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDisplay(String displayType) {
		System.out.println("Phone displya changet to "+displayType+ " mode");
		
	}

	

	

}
