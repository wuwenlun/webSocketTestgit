package com.byteslounge.http;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		Timer timer = new Timer();     
		TimerTask task = (TimerTask) new KeepAliveTask();     
        timer.schedule(task, 1000, 2000);  //任务1 一秒钟后执行，每两秒执行一次。 
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
