package com.exception.test;

import java.util.Scanner;

public class VotingApplication{

	public static int age;
	
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("This is a Voting Machine");
		System.out.println("Please confirm your age?");
		
		age = sc.nextInt();
		
		
		if(age<18) 
		{
			try
			{
				throw new InvalidAgeException("Error Bro");
			}
			catch(InvalidAgeException e)
			{
				
				System.out.println("You cannot vote untill you're 18");
			}
		}
		else
		{
			System.out.println("Congratulation! You can vote..");
		}
			
	}
	
		
	
	

	
}
