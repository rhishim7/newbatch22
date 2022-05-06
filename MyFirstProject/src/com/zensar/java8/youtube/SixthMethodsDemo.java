package com.zensar.java8.youtube;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SixthMethodsDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2,3,6,8,4,9);
		
		//Sorted Method
		List<Integer> asort = list1.stream().sorted().collect(Collectors.toList());
		// Ascending Sort
		System.out.println("Ascending Sort "+asort);
		
		//Descending Sort
		List<Integer> dsort = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Sort "+dsort);
	
		//Sorted String
		List<String> list2 = Arrays.asList("Hyundai","Audi","BMW","Mercedes","Tata","Buggati","Rolce-Royce");
		List<String> collectList2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted String "+collectList2);
		
		//Reverse Sorted String
		List<String> collectList3 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted String "+collectList3);
		
		//Match Methods
		
		//anyMatch()
		boolean anyMatch = list2.stream().anyMatch(value -> {return value.startsWith("A");} );
		System.out.println(anyMatch);
		
		//allMatch()
		boolean allMatch = list2.stream().allMatch(value1 -> {return value1.endsWith("s");});
		System.out.println(allMatch);
		
		//noneMatch()
		boolean noneMatch = list2.stream().noneMatch(value3 -> {return value3.length()==2;});
		System.out.println(noneMatch);
		
		//findAny() - finds any one element from collections
		Optional<String> findAny = list2.stream().findAny();
		System.out.println(findAny);
		
		//findFirst() - finds first element from collections
		Optional<String> findFirst = list2.stream().findFirst();
		System.out.println(findFirst);
		
		//Concate Streams
		Stream<String> stream1 = list2.stream();
		Stream<Integer> stream2 = list1.stream();
		
		List<Object> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
