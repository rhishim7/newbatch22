package com.zensar.thread;

public class TestSynchronization {

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting();
		MyThread2 ramThread	 = new MyThread2(greeting,"Ram");
		MyThread2 seetaThread = new MyThread2(greeting,"Seeta");
		Thread t1= new Thread(ramThread);
		Thread t2= new Thread(seetaThread);
		t1.start();
		t2.start();
		
		
	}

}
