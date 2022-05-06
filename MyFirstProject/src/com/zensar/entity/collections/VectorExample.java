package com.zensar.entity.collections;

import java.util.*;

public class VectorExample {
	Scanner sc = new Scanner(System.in);

	public void vector() {
		int ch = 0;
		System.out.println("You're now using Vector");
		System.out.println("Enter type of Vector");
		System.out.println("1. String\n2. Integer");
		ch = sc.nextInt();
		char choice;
		do
		{
		switch (ch) {
		case 1:
			String value = "";
			Vector<String> lls = new Vector<String>();
			System.out.println("Enter Number of Elements");
			int n = sc.nextInt();
			System.out.println("Enter String Elements");
			for (int i = 0; i < n; i++) {
				value = sc.next();
				lls.add(value);
			}
			System.out.println("Vector: " + lls);
			break;

		case 2:
			Vector<Integer> lli = new Vector<Integer>();
			System.out.println("Enter Number of Elements");
			int n1 = sc.nextInt();
			System.out.println("Enter Integer Elements");
			for (int i = 0; i < n1; i++) {
				int value1 = sc.nextInt();
				lli.add(value1);
			}
			System.out.println("Vector: " + lli);
			break;
		default:
			break;

		}
		System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
	    choice = sc.next().charAt(0);
		
		} while(choice == 'Y'|| choice == 'y');

	}
}
