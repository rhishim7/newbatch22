package com.zensar.jdbc;

import java.sql.*;
import java.util.*;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement psmt=null;
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
//			Statement smt = con.createStatement();
			
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Id");
			int id = sc.nextInt();
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Age");
			int age = sc.nextInt();
			
			psmt = con.prepareStatement("insert into Employee values(?,?,?)");
			
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			
			int count= psmt.executeUpdate();
			
//			int count = smt.executeUpdate("INSERT INTO student VALUES (" + id + ",'" + name + "'," + age + ");");

			if (count > 0) {
				System.out.println("Inserted Sucessfully");
			} else {
				System.out.println("Cannot Insert");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
