package com.zensar.entity.collections;

import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n   Welcome to Collection Framework  \n");
		int ch = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char choice = 0;
		do {
			System.out.println("Enter any option below");
			System.out.println("1. Array");
			System.out.println("2. ArrayList");
			System.out.println("3. LinkedList");
			System.out.println("4. Vector");
			System.out.println("5. Stack");
			System.out.println("6. Queue");
			System.out.println("7. HashSet");
			System.out.println("8. TreeSet");
			System.out.println("9. HashMap");
			System.out.println("10. NavigableSet");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ArrayExample a = new ArrayExample();
				a.getArray();
				break;
			case 2:
				ArrayListExample al = new ArrayListExample();
				al.arrayList();
				break;
			case 3:
				LinkedListExample ll = new LinkedListExample();
				ll.linkedList();
				break;
			case 4:
				VectorExample v = new VectorExample();
				v.vector();
				break;
			case 5:
				StackExample s = new StackExample();
				s.stack();
				break;
			case 6:
				QueueExample q = new QueueExample();
				q.queue();
				break;
			case 7:
				HashSetExample hs = new HashSetExample();
				hs.hashSet();
				break;
			case 8:
				TreeSetExample ts = new TreeSetExample();
				ts.treeSet();
				break;
			case 9:
				HashMapExample hm = new HashMapExample();
				hm.hashMap();
				break;
			case 10:
				NavigableSetExample ns = new NavigableSetExample();
				ns.navSet();
				break;
			default:
				break;
			}
			System.out.println("Do You Want To Contiue To Main Menu (Y/N)");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y' || choice != 9);

	}

}
