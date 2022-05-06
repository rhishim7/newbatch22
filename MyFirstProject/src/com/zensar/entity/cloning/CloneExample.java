package com.zensar.entity.cloning;

public class CloneExample implements Cloneable {

	public int a=10;
	public int b=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
	
}
