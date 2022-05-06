package com.zensar.model.figure;

public class Client {

	public static void main(String[] args) {
		
		Picture p= new Picture();
		boolean add = p.add(new Parallelogram(2, 5, 90));
		System.out.println(add);

	}

}
