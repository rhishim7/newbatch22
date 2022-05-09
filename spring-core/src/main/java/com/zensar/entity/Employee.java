package com.zensar.entity;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

//@Component
public class Employee implements InitializingBean,BeanNameAware{
	
	@Value("${eid}")
	private int employeeId;
	@Value("${ename}")
	private String employeeName;
	@Value("${eage}")
	private int employeeAge;
	
	@Autowired
	private Address address;
	
//	We can use @Autowired on top of filed 
// 	Just like
//	@Autowired
//	private Set<Address> address.
//	Or like below i.e top of constructor
//  And also on top of Setter method

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
	}

	@PostConstruct
	public void init1()
	{
		System.out.println("Welcome to Spring Annotation");
	}
	
	@PreDestroy
	public void init()
	{
		System.out.println("Destory with Annotation");
	}

	public Employee(int employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}
	
	public Employee(int employeeId, String employeeName, int employeeAge, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", address=" + address;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is: "+name);
		
	}

	


	

}
