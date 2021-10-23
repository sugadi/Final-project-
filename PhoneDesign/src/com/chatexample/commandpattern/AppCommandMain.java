package com.chatexample.commandpattern;



public class AppCommandMain {

	public static void main(String[] args) {
		AppRequest h1 = new AppRequest("Instagram",14);
		AppRequest h2 = new AppRequest("AdobeReader",3);
		AppRequest h3 = new AppRequest("Spotify",9);

		AllowApp r1 = new AllowApp(h1);
		AllowApp r2 = new AllowApp(h2);
		AllowApp r3 = new AllowApp(h3);
		DenyApp rs1 = new DenyApp(h1);
		DenyApp rs2 = new DenyApp(h2);

		AppServer broker = new AppServer();
	      broker.getChatList(r1);
	      broker.getChatList(r2);
	      broker.getChatList(r3);
	      broker.getChatList(rs1);
	      broker.getChatList(rs2);

	      broker.storeChatDetails();
		

	}

}
