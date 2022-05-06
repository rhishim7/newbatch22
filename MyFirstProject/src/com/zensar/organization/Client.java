package com.zensar.organization;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch;
		List<Labour> l = new ArrayList<Labour>();
		l.add(new Labour(1001, "Riya", 52000, 2000, 0));
		l.add(new Labour(1002, "Rocky", 20000, 0, 1200));
		l.add(new Labour(1003, "Annie", 26000, 0, 1400));
		l.add(new Labour(1001, "Ram", 23000, 1000, 0));
		l.add(new Labour(1001, "Poonam", 43000, 1400, 0));

		do {
			System.out.println("1. Display all data\n2. Calculate total Salary");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(l);
				break;
			case 2:
				l.stream().map(e1 -> e1.getEmpSalary()).collect(Collectors.toList()).forEach(System.out::println);
				break;
			default:
				break;
			}
			System.out.println("Do Youy Want To Contiue To Main Menu (Y/N)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}
