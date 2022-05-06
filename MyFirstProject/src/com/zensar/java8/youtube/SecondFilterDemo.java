package com.zensar.java8.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class SecondFilterDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(10,20,35,40,55,60,75,80,95,100);
		
		numbersList.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		List<String> stringsList = Arrays.asList("Ram","Prasad","Mishra","Gopinath","Jay","Raghu");
		
		stringsList.stream().filter(str -> str.length()>3 && str.length()<7	).collect(Collectors.toList())
		
				.forEach(System.out::println);
		
		List<String> words = Arrays.asList("cup",null,"books","tables",null,"door","cats");
		
		words.stream().filter( w -> w!=null).collect(Collectors.toList())
		.forEach(System.out::println);

	}

}
