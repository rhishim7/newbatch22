package com.zensar.entity;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.zensar.entity")
@PropertySource("myProperties.properties")
public class DemoConfig {
	
	@Bean(value="e1")
	public Employee getEmployee()
	{
		return new Employee(1003, "Rhishi", 24,getAddress());
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address("Goa", "Panjim", 416238);
	}

}
