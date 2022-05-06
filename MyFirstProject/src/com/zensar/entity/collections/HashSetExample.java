package com.zensar.entity.collections;
import java.util.*;
public class HashSetExample {
	Scanner sc = new Scanner(System.in);
	
	public void hashSet()
	{
		int ch = 0;
		System.out.println("You're now using TreeSet");
		HashSet<String> hs = new HashSet<String>();

		char choice;
		do {
			System.out.println("1. Add Element");
			System.out.println("2. Remove Element");
			System.out.println("3. Display");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element to Add into HashSet");
				String value = sc.next();
				hs.add(value);
				break;
			case 2:
				System.out.println("Enter Element to Remove from HashSet");
				String value1 = sc.next();				
				hs.remove(value1);
				System.out.println("Element Poped");
				break;
			case 3:
				System.out.println("TreeSet: " + hs);
				break;

			default:
				break;

			}

			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}
