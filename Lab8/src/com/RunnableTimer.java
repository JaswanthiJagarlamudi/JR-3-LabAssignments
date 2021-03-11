package com;

import java.util.Date;

public class RunnableTimer implements Runnable {

	public void run() {
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new Date());
		}
		
		
	}

	
}
