package com.zensar.java8;

public interface Addition {

	public void add(int a,int b);
	
}


class AdditionImpl implements Addition
{
	public void add(int a,int b)
	{
		System.out.println("Adding");
	}
}

class TestAdd
{
	public static void main(String[] args) {
		
		Addition addition=(int a, int b) ->
		{
			System.out.println("Addition is : "+(a+b));
		};
		addition.add(20,30);
	}
}