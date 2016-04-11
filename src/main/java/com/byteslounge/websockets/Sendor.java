package com.byteslounge.websockets;

import java.io.IOException;
import java.util.TimerTask;

public class Sendor extends TimerTask{
	public void sendMessage(){
		try {
			if(null != StoreSession.session){
				StoreSession.session.getBasicRemote().sendText("to excute this method all the time");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		sendMessage();
	}
}
