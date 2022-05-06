package com.zensar.entity.collections;

import java.util.*;

public class ArrayExample {

	Scanner sc = new Scanner(System.in);

	public void getArray() {
		int n = 0;
		System.out.println("You're now using Array");
		System.out.println("Enter size of Array");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements in the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Output of the Array\n");
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Array: " + arr[i]);
		}
	}

}
