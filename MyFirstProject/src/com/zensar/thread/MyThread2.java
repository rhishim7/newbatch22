package com.zensar.thread;

public class MyThread2 implements Runnable {

	Greeting greeting = null;
	String name=null;
	
	
	public MyThread2(Greeting greeting, String name)
	{
		this.greeting=greeting;
		this.name=name;
	}

	@Override
	public void run() {
		greeting.greet(name);
		
	}
}
