package com.zensar.entity.collections;

import java.util.*;

public class NavigableSetExample {
	Scanner sc = new Scanner(System.in);

	public void navSet() {
		int ch = 0;
		System.out.println("You're now using NavigableSet");
		System.out.println("Enter type of NavigableSet");
		System.out.println("1. Integer\n2. String");
		ch = sc.nextInt();
		char choice;
		do {
			switch (ch) {
			case 1:
				do {

					System.out.println("1. Add Element");
					System.out.println("2. Remove Element");
					System.out.println("3. Poll First");
					System.out.println("4. Poll Last");
					System.out.println("5. Reverse Order");
					System.out.println("6. Display");
					NavigableSet<Integer> ns = new TreeSet<>();
					ch = sc.nextInt();
					int size = 0, value = 0;
					switch (ch) {
					case 1:
						System.out.println("Enter Element to Add into NavigableSet");
						System.out.println("How many Elements you want to enter?");
						size = sc.nextInt();
						for (int i = 0; i < size; i++) {
							value = sc.nextInt();
							ns.add(value);
						}

						System.out.println("Elements Added");
						System.out.println("NavigableSet: " + ns);
						System.out.println(ns.descendingSet());
						break;
					case 2:
						System.out.println("Enter Element to Remove from NavigableSet");
						int value1 = sc.nextInt();
						ns.remove(value1);
						System.out.println("Element Removed");
						break;
					case 3:
						System.out.println(ns.pollFirst());
						break;
					case 4:
						System.out.println(ns.pollLast());
						break;
					case 5:
						System.out.println(ns.descendingSet());
						break;
					case 6:
						System.out.println("NavigableSet: " + ns);
						break;
					default:
						break;

					}

					System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
					choice = sc.next().charAt(0);
				} while (choice == 'Y' || choice == 'y');

			case 2:
				do {

					System.out.println("1. Add Element");
					System.out.println("2. Remove Element");
					System.out.println("3. Poll First");
					System.out.println("4. Poll Last");
					System.out.println("5. Reverse Order");
					System.out.println("6. Display");
					NavigableSet<String> ns = new TreeSet<>();
					ch = sc.nextInt();
					int size;
					switch (ch) {
					case 1:
						System.out.println("Enter Element to Add into NavigableSet");
						System.out.println("How many Elements you want to enter?");
						size = sc.nextInt();
						for (int i = 0; i < size; i++) {
							String value = sc.next();
							ns.add(value);
						}

						System.out.println("Elements Added");
						System.out.println("NavigableSet: " + ns);
						System.out.println(ns.descendingSet());
						break;
					case 2:
						System.out.println("Enter Element to Remove from NavigableSet");
						String value1 = sc.next();
						ns.remove(value1);
						System.out.println("Element Removed");
						break;
					case 3:
						System.out.println(ns.pollFirst());
						break;
					case 4:
						System.out.println(ns.pollLast());
						break;
					case 5:
						System.out.println(ns.descendingSet());
						break;
					case 6:
						System.out.println("NavigableSet: " + ns);
						break;
					default:
						break;

					}

					System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
					choice = sc.next().charAt(0);
				} while (choice == 'Y' || choice == 'y');

			}
			System.out.println("Do You Want To Continue To Main Menu(Y/N)");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

	}
}
