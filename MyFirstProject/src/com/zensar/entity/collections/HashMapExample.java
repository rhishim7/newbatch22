package com.zensar.entity.collections;
import java.util.*;

public class HashMapExample {
	public void hashMap()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		System.out.println("You're now using Stack");
		HashMap<Integer, String> hm = new HashMap<>();

		char choice;
		do {
			System.out.println("1. Add Element");
			System.out.println("2. Pop Element");
			System.out.println("3. Update Element");
			System.out.println("4. Display");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Key and Value into HashMap");
				int key = sc.nextInt();
				String value = sc.next();
				hm.put(key,value);
				break;
			case 2:
				System.out.println("Enter Key to Remove");
				int keyRemove = sc.nextInt();
				hm.remove(keyRemove);
				System.out.println("Element Removed");
				break;
			case 3:
				System.out.println("Enter Key and Value to Update");
				int getKey = sc.nextInt();
				String getValue = sc.next();
				hm.put(getKey,getValue);
				System.out.println("Key: "+getKey+" Value: "+getValue);
				break;
			case 4:
				System.out.println("HashMap: " + hm);
				break;

			default:
				break;

			}

			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}
