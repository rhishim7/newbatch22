package com.zensar.entity;

import java.util.*;

public class Client  {

	
//
//	public static double printArea(Shape s)
//	{
//		return s.area();
//	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(20, "ARhishi", 8200));
		employees.add(new Employee(21, "CRhishikesh", 9200));
		employees.add(new Employee(23, "BRhishim", 7200));

		Collections.sort(employees,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}
			
		});
		
		System.out.println(employees);
		
//		Employee e = new Employee(20, "Rhishi", 8200);
//		Employee e1 = new Employee(20, "Rhishi", 8000);
//		Employee e2 = new Employee(20, "Rhishi", 9200);
//		
//		Map<Integer, Employee> hm = new HashMap();
//		
//		hm.get(e.getEmployeeId());
//		
//		
//		hm.put(1,e);
//		hm.put(2,e2);
//		
//		for(Map.Entry set: hm.entrySet())
//		{
//			System.out.println(set.getKey()+" = "+hm.get(set.getKey()));
//		}
			
//		Set keys = hm.keySet();
//		Iterator iterator = keys.iterator();
//		
//		while(iterator.hasNext())
//		{
//			Integer i = (Integer) iterator.next();
//			System.out.println(hm.get(i));	
//		}
		
			
		
//		try{
//			Class className = Class.forName("Employee");
//			Constructor[] method = className.getConstructors();
//			
//			for(int i=0;i<method.length;i++)
//			{
//				System.out.println(method[i]);
//			}
//		}
//		catch (ClassNotFoundException e)
//		{
//			System.out.println(e);
//		}
		
		
//		Shape s[] = new Shape[3];
//		s[0] = new Circle(3);
//		s[1] = new Rectangle(2,3);
//		s[2] = new Circle();
//		
//			for(int i=0;i<s.length;i++)
//			{
//				System.out.println("Area is "+s[i].area());
//			}
//		
		//		Below is a method of object class.
//		System.out.print(e.getClass());
//		System.out.println("");
//		System.out.print(e.hashCode());
//		if(e.equals(e1))
//		{
//			System.out.println("\nTrue");
//		}
//		else
//		{
//			System.out.println("false");
//		}
//		System.out.println(e);
//		System.out.println(e.calculateSalary());

	}

}
