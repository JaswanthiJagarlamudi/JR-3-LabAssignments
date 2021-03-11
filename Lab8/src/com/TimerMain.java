package com;

public class TimerMain {

	public static void main(String[] args) {
		RunnableTimer r=new RunnableTimer();
		Thread t=new Thread(r);
		t.start();

	}

}
