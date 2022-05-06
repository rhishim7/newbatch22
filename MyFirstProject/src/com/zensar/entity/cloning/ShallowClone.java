package com.zensar.entity.cloning;

public class ShallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneExample c1 = new CloneExample();
		
		System.out.println("Without Clone");
		System.out.println(c1.a+" "+c1.b);
		
		CloneExample c2 = c1;
		
		c2.a = 11;
		c2.b = 21;
		System.out.println("Shallow Clone");
		System.out.println(c1.a+" "+c1.b);
	}

}
