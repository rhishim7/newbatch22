package com.zensar.entity;

public class SalesPerson extends WageEmployee {

	private int commission = 5;

	public SalesPerson(int id, String name, int salary, int hours, int rate,
			int commission) {
		super(id, name, salary, hours, rate);
		this.commission = commission;
	}

	public int getcommission() {
		return commission;
	}

	public void setcommission(int commission) {
		this.commission = commission;
	}

	public int calculateSalary() {
		return super.calculateSalary() + commission;
	}

	public String toString() {
		return super.toString() + " " + commission;
	}

}
