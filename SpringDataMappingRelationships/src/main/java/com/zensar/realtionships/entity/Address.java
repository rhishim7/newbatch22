package com.zensar.realtionships.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "address")
public class Address {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "add_id")
		private long addressId;
		private String city;
		private String addressType;
		//For OneTO One
//		@OneToOne(mappedBy = "address")
//		private Employee employee;
		//For One to Many empty


}
