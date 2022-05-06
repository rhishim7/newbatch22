package com.zensar.entity.collections;

import java.util.*;

public class ArrayListExample {
	Scanner sc = new Scanner(System.in);

	public void arrayList() {
		int n = 0;
		System.out.println("You're now using ArrayList");
		System.out.println("Enter size of ArrayList");
		n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			int value = 0;
			value = sc.nextInt();
			list.add(value);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("ArrayList: " + list);
	}
}
