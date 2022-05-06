package com.zensar.java8.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class FifthFlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		List<Integer> list4 = Arrays.asList(7,8);
		
		List<List<Integer>> finalList= Arrays.asList(list1,list2,list3,list4);
		List<Integer> result = finalList.stream().flatMap(x-> x.stream()
				.map(n-> n+10)
				).collect(Collectors.toList());
		System.out.println(result);
		
		//Strings
		
		List<String> names1 = Arrays.asList("Hockey","Football");
		List<String> names2 = Arrays.asList("Baseball","Swimming");
		List<String> names3 = Arrays.asList("Horse Riding","Cricket");
		String game = " Game";
		List<List<String>> finalNames= Arrays.asList(names1,names2,names3);
		
		List<String> resultNames = finalNames.stream().flatMap(x-> x.stream()).map(n-> n+game).collect(Collectors.toList());
		System.out.println(resultNames);
	}

}
