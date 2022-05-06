package com.zensar.entity;

public class WageEmployee extends Employee {

	public int hours;
	public int rate;

	public WageEmployee(int id, String name, int salary, int hours, int rate) {

		// setEmployeeId(id);
		// setEmployeeName(name);
		// setEmployeeSalary(salary);
		super(id, name, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int calculateSalary() {
		return hours * rate;
	}

	@Override
	public String toString() {
		return super.toString() + " " + hours + " " + rate;
	}

}
