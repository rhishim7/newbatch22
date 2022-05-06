package com.zensar.file;

import java.io.*;

import com.zensar.entity.Employee;

public class WriteObject {
	public static void main(String[] args) {
		Employee employee = new Employee(1001, "Ram", 20000);



		ObjectOutputStream oos = null;



		try {
		oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));

		oos.writeObject(employee);
		System.out.println("Successfull");
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
	}


