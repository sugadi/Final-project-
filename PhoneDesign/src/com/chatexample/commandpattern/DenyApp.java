package com.chatexample.commandpattern;

public class DenyApp implements PhoneSettings{

	AppRequest hr;
	public DenyApp(AppRequest hr) {
		this.hr = hr;
	}
	
	@Override
	public void allowNewApps() {
		hr.deny();
		
	}
	


}
