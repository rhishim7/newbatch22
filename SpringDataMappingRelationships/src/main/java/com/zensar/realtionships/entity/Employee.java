package com.zensar.realtionships.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "employee_details")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private long empId;
	private String empName;
	private Integer empAge;
	// creates foreign key table as address_add_id
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_add_id")// custom foreign key table name
//	private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
	private List<Address> address;

}
