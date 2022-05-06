package com.zensar.inheritance;

public class C extends B {
	
	public void msgFromC()
	{
		System.out.println("This is a message passed from Class C");
	}
	
	public static void main(String[] args) {
		C c= new C();
		c.msgFromA();
		c.msgFromB();
		c.msgFromC();
		System.out.println("OOOOOO " +c.call);
		
	}

}
