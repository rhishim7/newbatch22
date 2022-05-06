package com.zensar.thread;

public class Client2 {

	public static void main(String[] args) {
		
		//Multi Threading with the use of Runnable Interface.
		
		MyThread2 myThread = new MyThread2(null, null);
		
		Thread t1=new Thread(myThread,"t1");
		Thread t2=new Thread(myThread,"t2");
		t1.setPriority(10);
//		t1.setName("t1");
		t1.start();
		System.out.println(t1.getPriority());
		
//		t2.setName("t2");
		t2.start();
		t1.setPriority(4);
	
		System.out.println(t2.getPriority());
	}

}
