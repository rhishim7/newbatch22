package com.zensar.java8;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		return (e1.getEmpName().compareTo(e2.getEmpName()));
	}

}