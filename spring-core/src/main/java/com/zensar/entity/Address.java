package com.zensar.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Address {
	
	@Value("${state}")
	private String state;
	@Value("${city}")
	private String city;
	@Value("${pin}")
	private int pin;

	public Address() {
		super();
	}

	public Address(String state, String city, int pin) {
		super();
		this.state = state;
		this.city = city;
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}

}
