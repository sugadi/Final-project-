package com.chatexample.adapterpattern;


public class ChatAdapterMain {

	public static void main(String[] args) {
		PhoneInvoker st = new PhoneInvoker();

		st.setCallerTune("MI5", "Despacitio");
		st.setCallerTune("MI3", "Let me Love you");
		st.setCallerTune("MI5", "Rama");
		st.setCallerTune("D", "Shankar");

	}

}
