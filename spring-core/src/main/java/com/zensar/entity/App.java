package com.zensar.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		//this reads the beans.xml file

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		//TypeCasting is used.
//		Employee employee = (Employee) context.getBean("e1");
		
		//TypeCasting is not used.
		Employee employee = context.getBean("e1", Employee.class);
		
		System.out.println(employee);
		
		((AbstractApplicationContext) context).close();
		
	}
}
