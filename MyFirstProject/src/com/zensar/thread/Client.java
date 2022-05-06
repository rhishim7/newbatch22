package com.zensar.thread;

public class Client {

	public static void main(String[] args) {
		
		//Multi Threading with the use of Thread class.
		
		MyThread t1= new MyThread(); //Born | New State
		t1.start(); // Runnable
		t1.setName("t1"); //Running
		
		
		MyThread t2= new MyThread();
		t2.start();
		t2.setName("t2");
		System.out.println(t2.getName());
		

		System.out.println("EXIT"); 
		
	}

}
