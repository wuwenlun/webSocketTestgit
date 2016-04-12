package com.byteslounge.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.TimerTask;

import javax.servlet.http.HttpServletResponse;

public class KeepAliveTask extends TimerTask{

	@Override
	public void run() {
		HttpServletResponse response = StoreResponse.response;
		PrintWriter out;
		try {
			if(null != response){
				System.out.println("-----------------------------");
				out = response.getWriter();
				out.print("输出更新的内容");
			    out.flush();
			    Thread.sleep(3000);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
