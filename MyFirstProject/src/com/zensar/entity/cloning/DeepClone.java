package com.zensar.entity.cloning;

public class DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneExample c1 = new CloneExample();
		
		System.out.println("Without Clone");
		System.out.println(c1.a+" "+c1.b);
		
		CloneExample c2 = (CloneExample) c1.clone();
		
		System.out.println(c2==c1);

	}

}
