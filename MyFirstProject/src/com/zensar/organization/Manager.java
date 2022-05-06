package com.zensar.organization;

public class Manager extends Employee {

	private int empIncentive;

	public Manager(int empId, String empName, double empSalary, int empIncentive) {
		super(empId, empName, empSalary);
		this.empIncentive = empIncentive;
	}

	public Manager() {
		super();
	}

	public Manager(int empIncentive) {
		super();
		this.empIncentive = empIncentive;
	}

	public int getEmpIncentive() {
		return empIncentive;
	}

	public void setEmpIncentive(int empIncentive) {
		this.empIncentive = empIncentive;
	}

}
