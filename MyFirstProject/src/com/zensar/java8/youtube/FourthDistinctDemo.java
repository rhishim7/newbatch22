package com.zensar.java8.youtube;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FourthDistinctDemo {

	public static void main(String[] args) {
	
		List<String> vehicles=Arrays.asList("Hyundai","Audi","BMW","Mercedes","Tata","Buggati","Rolce-Royce","Audi","Buggati");
		//Distinct - Avoid Duplicates
		List<String> vehiclesDistinct = vehicles.stream().distinct().collect(Collectors.toList());
		
		System.out.println(vehiclesDistinct);
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,1,5,7);
		
		List<Integer> numbersDistinct = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numbersDistinct);
		
		//Count - To Count 
		//Here we count distinct elements.
		long count = vehicles.stream().distinct().count();
		System.out.println(count);
		
		//Limit - Limit the access to elements or objects
		
		vehicles.stream().limit(4).forEach(System.out::println);
		
		System.out.println("**********************");
		//Using all Distinct, Count, Limit
		
		vehicles.stream().distinct().limit(3).forEach(System.out::println);
		
		System.out.println("**********************");
		//Minimum
		List<Integer>numbersList =Arrays.asList(1,2,3,4,5,6,7,8);
		Optional<Integer> min = numbersList.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min);
		
		//Maximum
		Optional<Integer> max = numbersList.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max);
		
		//Reduce - Combine value with eachother
		Optional<String> reduce = vehicles.stream().reduce((value, combinedValue)->{return combinedValue+value;});
		System.out.println(reduce);

	}

}
