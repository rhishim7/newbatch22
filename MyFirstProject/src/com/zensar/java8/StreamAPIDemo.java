package com.zensar.java8;

import java.util.*;
import java.util.stream.*;


public class StreamAPIDemo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name ="abc";
		
		Optional<String> of = Optional.ofNullable(name);
		
		of.ifPresent(e-> System.out.println(e.toUpperCase()));
		
		of.orElseThrow(()-> {
			return new RuntimeException("Name not found");
		});
		
//		List<String> a=Arrays.asList("a","b","c","d");
//		List<String> b=Arrays.asList("e","f","g","h");
//		List<String> c=Arrays.asList("i","j","k","l");
//		
//		List<List<String>> multi= new ArrayList<List<String>>();
//		multi.add(a);
//		multi.add(b);
//		multi.add(c);
//		List<String> collect = multi.stream()
//		.flatMap(element -> element.stream()).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		multi.stream().flatMap(element -> element.stream()).collect(Collectors.toList());
//		
		
		
//		List<Employee> employees= new ArrayList<Employee>();
//		
//		employees.add(new Employee(1001,"Rhishi",27823, Arrays.asList(new Address("Goa", "Panjim", 412023),new Address("Maharashtra", "Pune", 411036))));
//		employees.add(new Employee(1002,"Aarav",212523, Arrays.asList(new Address("Goa", "Panjim", 412023))));
//		employees.add(new Employee(1003,"Brother",436223, Arrays.asList(new Address("Goa", "Panjim", 412023))));
//		employees.add(new Employee(1004,"Unakd",971233, Arrays.asList(new Address("Goa", "Panjim", 412023))));
//
//		employees.stream().flatMap(e -> e.getAddress().stream()).forEach(System.out::println);
//		
		// TO INCREASE SALARY BY GIVEN VALUE
		
//		List<Long> collect2 = employees.stream()
//		.map(e -> e.getEmpSalary()+1000000)
//		.collect(Collectors.toList());
//		System.out.println(collect2);
//		
		// TO COMPARE NAMES OF EMPLOYEES
		
//		employees.stream()
//		.filter((e)-> e.getEmpId()>=1002)
//		.forEach(e-> System.out.println(e));
//		Collections.sort(employees, new NameComparator());
		
		
//		Collections.sort(employees,(e1,e2)-> e1.getEmpName().compareTo(e2.getEmpName()));

//		Collections.sort(employees, Comparator.comparing(Employee::getEmpSalary).reversed());
		
//		List<String> names=Arrays.asList("Ram","Shyam","Radha","Hari","Seeta");
//		List<String> collect1 = names.stream()
//		.map(name->name.toUpperCase())
//		.collect(Collectors.toList());
//		System.out.println(collect1);
				
	}

}
