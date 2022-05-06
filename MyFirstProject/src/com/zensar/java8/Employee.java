package com.zensar.java8;

import java.util.*;

public class Employee {

	private int empId;
	private String empName;
	private long empSalary;
	private List<Address> address;
	public Employee() {
		
	}
	

	public Employee(int empId, String empName, long empSalary, List<Address> address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}
	
	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && empSalary == other.empSalary;
	}

	public static void printEmployee(String name) {
		System.out.println(name);
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
