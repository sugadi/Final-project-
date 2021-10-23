package com.chatexample.commandpattern;

public class AllowApp implements PhoneSettings{

	AppRequest hr;
	public AllowApp(AppRequest hr) {
		this.hr = hr;
	}

	@Override
	public void allowNewApps() {
		hr.allow();
		
	}
	


}
