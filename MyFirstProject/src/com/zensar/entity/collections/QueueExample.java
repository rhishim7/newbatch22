package com.zensar.entity.collections;

import java.util.*;

public class QueueExample {
	Scanner sc = new Scanner(System.in);
	public void queue()
	{
		int ch = 0;
		System.out.println("You're now using Queue");
		

		char choice;
		do {
			System.out.println("1. Basic Queue (Integer)");
			System.out.println("2. Priority Queue");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				Queue<Integer> q = new LinkedList<>();
				char choice1;
				do {
					System.out.println("1. Add Element");
					System.out.println("2. Remove Element");
					System.out.println("3. Display Head Element");
					System.out.println("4. Display Size");
					System.out.println("5. Display Queue");
					ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Element to Add into Queue");
						int value = sc.nextInt();
						q.add(value);
						break;
					case 2:
						System.out.println("Element Removed: "+q.remove());
						break;
					case 3:
						System.out.println("Queue Head: " + q.peek());
						break;
					case 4:
						System.out.println("Queue Size: "+q.size());
						break;
					case 5:
						System.out.println("Queue: "+q);
						break;
					default:
						break;

					}

					System.out.println("Do You Want To Go To Back Menu (Y/N)");
					choice1 = sc.next().charAt(0);
				} while (choice1 == 'Y' || choice1 == 'y');
				break;
			case 2:
				Queue<String> q1 = new PriorityQueue<>();
				char choice11;
				do {
					System.out.println("1. Add Element");
					System.out.println("2. Remove Element");
					System.out.println("3. Display Head Element");
					System.out.println("4. Display Size");
					System.out.println("5. Display Queue");
					ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Element to Add into Queue");
						String value = sc.next();
						q1.add(value);
						break;
					case 2:
						System.out.println("Element Removed: "+q1.remove());
						break;
					case 3:
						System.out.println("Queue Head: " + q1.peek());
						break;
					case 4:
						System.out.println("Queue Size: "+q1.size());
						break;
					case 5:
						
						System.out.println("Queue: "+q1);
						break;
					default:
						break;

					}

					System.out.println("Do You Want To Go To The Back Menu (Y/N)");
					choice11 = sc.next().charAt(0);
				} while (choice11 == 'Y' || choice11 == 'y');
				break;

			}

			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}
