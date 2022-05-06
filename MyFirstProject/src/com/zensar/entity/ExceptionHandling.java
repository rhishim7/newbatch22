package com.zensar.entity;

import java.util.*;

public class ExceptionHandling extends Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 0;
			System.out.println("Enter one option");
			System.out
					.println("1.Addition\n2.Division\n3.Multiplication\n4.Substraction");
			int option = sc.nextInt();
			if (option == 1) {
				result = a + b;
				System.out.println("Addition is: " + result);
			} else if (option == 2) {
				result = a / b;
				System.out.println("Division is: " + result);
			} else if (option == 3) {
				result = a * b;
				System.out.println("Multiplication is: " + result);
			} else if (option == 4) {
				result = a - b;
				System.out.println("Substraction is: " + result);
			} else {
				System.out.println("Invalid Option Selected");
			}

		} catch (ArithmeticException e) {
			System.out.println("The error here is: " + e.getMessage());

		} catch (NumberFormatException e) {
			System.out.println("The error here is: " + e.getMessage());
		}

	}

}