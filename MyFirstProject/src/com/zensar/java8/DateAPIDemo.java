package com.zensar.java8;

import java.time.*;
public class DateAPIDemo {

	public static void main(String[] args) {
		
		LocalDate birthDate= LocalDate.of(1997,1,31);
		
		LocalDate currentDate = LocalDate.now();
		
		Period p = Period.between(birthDate, currentDate);
		
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
		
		
	}

}
