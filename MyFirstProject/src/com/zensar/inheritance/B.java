package com.zensar.inheritance;

public class B extends A {
	
			public void msgFromB()
			{
				System.out.println("This is a message passed from Class B");
			}
		
			public static void main(String[] args) {
				B b = new B();
				b.msgFromA();
				System.out.println(b.call);
			}
}
