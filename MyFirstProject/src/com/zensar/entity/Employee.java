package com.zensar.entity;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

	private int employeeId;
	private String employeeName;
	private int employeeSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String toString() {
		return employeeId + " "	+ employeeName + " " + employeeSalary;
	}

	public int calculateSalary() {
		return 0;
	}
	
//	Object class method
	
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		return Objects.hash(employeeId, employeeName, employeeSalary);
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
		System.out.println("Equals");
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& employeeSalary == other.employeeSalary;
	}
	
	
	public int compareTo(Object o) {
		Employee e1 = (Employee)o;


	if(this.getEmployeeId()>e1.getEmployeeId()) {
	return -1;
	}else if(this.getEmployeeId()<e1.getEmployeeId()) {
	return 1;
	}else if(this.getEmployeeId()==e1.getEmployeeId()) {
	return 0;
	}

	return 0;
	}
	


}
