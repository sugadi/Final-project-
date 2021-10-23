package com.chatexample.adapterpattern;

public class PhoneSettingAdapter implements CallerTune {

	PhoneSettings bd;
	
	public PhoneSettingAdapter(String chatType) {
		
		if(chatType.equalsIgnoreCase("MI5")) {
			bd = new MusicLibrary();
		}else if(chatType.equalsIgnoreCase("MI3")) {
			bd = new ChangeDisplay();
		}
	}
	


	@Override
	public void setCallerTune(String movieName, String songName) {
		if(movieName.equalsIgnoreCase("MI3")) {
			bd.changeDisplay(songName);
		}else if(movieName.equalsIgnoreCase("MI5")) {
			bd.musicLibrary(songName);
		}
	}

}
