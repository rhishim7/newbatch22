package com.zensar.java8;

public class Client implements MyInterface,MyInterface2 {
	
	public void display()
	{
		System.out.println("This is My Interface Main");
		MyInterface.super.display();
		MyInterface2.super.display();
	}
	
	public static void main(String[] args) {

		Client c = new Client();
		c.display();
		
		
		

	}

}
