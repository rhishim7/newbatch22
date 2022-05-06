package com.zensar.file;

import java.io.*;

import com.zensar.entity.Employee;

public class ReadObject {
public static void main(String[] args) {
	
	File file = new File("abc1.txt");


	System.out.println(file.delete());
	
	
	ObjectInput ois=null;
	try {
	ois = new ObjectInputStream(new FileInputStream("abc.txt"));

	Employee e=(Employee)ois.readObject();
	System.out.println(e);
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}




	}
}

