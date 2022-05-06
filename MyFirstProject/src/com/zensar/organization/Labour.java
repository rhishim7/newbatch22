package com.zensar.organization;

public class Labour extends Manager {

	private int empOvertime;

	public Labour(int empId, String empName, double empSalary, int empIncentive, int empOvertime) {
		super(empId, empName, empSalary, empIncentive);
		this.empOvertime = empOvertime;
	}

	public void getAllSalary() {
		@SuppressWarnings("unused")
		double sum = getEmpSalary();
	}

	@Override
	public String toString() {
		return "Employee Id=" + getEmpId() + ", Employee Name=" + getEmpName() + ", Employee Salary=" + getEmpSalary()
				+ ", Employee Incentive=" + getEmpIncentive() + ", Employee Overtime=" + getEmpOvertime() + "\n";
	}

	public Labour() {
		super();
	}

	public Labour(int empOvertime) {
		super();
		this.empOvertime = empOvertime;
	}

	public int getEmpOvertime() {
		return empOvertime;
	}

	public void setEmpOvertime(int empOvertime) {
		this.empOvertime = empOvertime;
	}

}
