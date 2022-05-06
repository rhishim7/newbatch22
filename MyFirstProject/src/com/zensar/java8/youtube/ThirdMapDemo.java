package com.zensar.java8.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> vehicles=Arrays.asList("Hyundai","Audi","BMW","Mercedes","Tata","Buggati","Rolce Royce");
		List<Integer> numbersList = Arrays.asList(2,5,3,7,9);
		List<Integer> multipliedNumbersList=new ArrayList<Integer>();
		List<String> upperCaseVehicles=new ArrayList<String>();
		List<String> lowerCaseVehicles=new ArrayList<String>();
		
		// Without Java 8 Streams
		for(String name:vehicles)
		{
			lowerCaseVehicles.add(name.toLowerCase());
		}
		
		System.out.println(lowerCaseVehicles);
		
		// With Streams
		
		upperCaseVehicles = vehicles.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperCaseVehicles);
		
		multipliedNumbersList = numbersList.stream().map(n -> n*3).collect(Collectors.toList());
		System.out.println(multipliedNumbersList);
		
	}

}
