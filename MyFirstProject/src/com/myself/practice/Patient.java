package com.myself.practice;

public class Patient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hospital h=new Hospital(432,"Nobel Hospital","Pune",80088208,21);
		Hospital h1=new Hospital(432,"Nobel Hospital","Pune",80088208,21);
//		Hospital h1=new Hospital(203, "Bharti Hospital", "Katraj", 982389028, 32);
		System.out.println(h.toString());
		if(h.equals(h1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

	}

}
