package com.zensar.java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public interface Greeting {
	
	public void greet(String name);
}


//class GreetingImpl implements Greeting
//{
//
//	@Override
//	public void greet(String name) {
//		System.out.println("Good Morning "+name);
//		
//	}
//	
//}

//class Test{
//	public static void main(String[] args) {
//		Greeting greeting = new Greeting() {
//			
//			@Override
//			public void greet(String name) {
//				
//				System.out.println("Welcome :"+name);
//				
//			}
//			
//		};
//		
//		greeting.greet("Rhishi");
//	}
//}

//LAMBDA EXPRESSION
//1. arguments 2. -> expression symbol 3. {body}

class Test{
	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		Greeting greeting=(String name) -> {
//			System.out.println("Hello :"+name);
//		};
//		
//		greeting.greet("Rhishi");	
//		int i=0;
		
		// PREDICATE INTERFACE 
		
//		Predicate<Integer> predicate= t -> {
//			if(i%10==0) {
//				return true;
//			}
//				
//			else
//			{
//				return false;	
//			}
//			
//		};
//			predicate.test(10);
		
		// CONSUMER INTERFACE
		
		Consumer<String> c=(String name) -> System.out.print(name);
		c.accept("Rhishi");
		
		//SUPPLIER INTERFACE
		
		Supplier<String> s= () -> "Hello Brother";
		System.out.println("\n"+s.get());
		
		//FUNCTION INTERFACE
		
		Function<Integer,String> f=(i)->{
			return "I am good brother";
		};
		System.out.println(f.apply(10));
		
		//For Each Example
		Employee e = new Employee();
		List<String> names=new ArrayList<>();
		names.add("Virat");
		names.add("Rohit");
		names.add("Mahi");
		names.add("Ravindra");
		names.add("Sachin");
		
		//Functional way
		
		List<String> nameWithR = names.stream()
		.filter(name -> name.startsWith("R"))
		.collect(Collectors.toList());
		
		System.out.println(nameWithR);
//		List<String> namesStartWithR = new ArrayList<String>();
//		
//		for(String name:names)
//		{
//			if(name.startsWith("R"))
//			{
//				namesStartWithR.add(name);
//			}
//		}
//		System.out.println(namesStartWithR);
		
//		names.forEach(name-> System.out.println(name));
		
		//Using method reference operator
		// Here printEmployee is the method of employee class.
		//names.forEach(Employee::printEmployee);
	}
}
