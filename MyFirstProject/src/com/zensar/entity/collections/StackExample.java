package com.zensar.entity.collections;

import java.util.*;

public class StackExample {
	Scanner sc = new Scanner(System.in);

	public void stack() {
		int ch = 0;
		System.out.println("You're now using Stack");
		Stack<String> s = new Stack<>();

		char choice;
		do {
			System.out.println("1. Push Element");
			System.out.println("2. Pop Element");
			System.out.println("3. Display");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element to Push into Stack");
				String value = sc.next();
				s.push(value);
				break;
			case 2:
				s.pop();
				System.out.println("Element Poped");
				break;
			case 3:
				System.out.println("Stack: " + s);
				break;

			default:
				break;

			}

			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}
