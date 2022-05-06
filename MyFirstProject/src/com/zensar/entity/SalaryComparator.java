package com.zensar.entity;



import java.util.Comparator;



public class SalaryComparator implements Comparator {



@Override
public int compare(Object o1, Object o2) {

Employee e1 = (Employee) o1;
Employee e2 = (Employee) o2;
if(e1.getEmployeeSalary()>e2.getEmployeeSalary()) {
return 1;
}else if(e1.getEmployeeSalary()<e2.getEmployeeSalary()) {
return -1;
}else if(e1.getEmployeeSalary()==e2.getEmployeeSalary()) {
return 0;
}


return 0;
}



}