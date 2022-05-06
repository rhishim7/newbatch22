package com.zensar.entity.collections;

import java.util.*;


public class TreeSetExample {
	Scanner sc = new Scanner(System.in);

	public void treeSet() {
		int ch = 0;
		System.out.println("You're now using TreeSet");
		Set<String> ts = new TreeSet<>();

		char choice;
		do {
			System.out.println("1. Add Element");
			System.out.println("2. Remove Element");
			System.out.println("3. Display");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element to Add into TreeSet");
				String value = sc.next();
				ts.add(value);
				break;
			case 2:
				System.out.println("Enter Element to Remove from TreeSet");
				String value1 = sc.next();				
				ts.remove(value1);
				System.out.println("Element Poped");
				break;
			case 3:
				System.out.println("TreeSet: " + ts);
				break;

			default:
				break;

			}

			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}
