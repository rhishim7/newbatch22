package com.zensar.jdbc;

import java.sql.*;
import java.util.*;

public class UpdateData {

	public static void main(String[] args) {

		Statement smt = null;

		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = ConnectionProvider.getConnection();

			smt = con.createStatement();
			System.out.println("Enter Id to Update");
			int updateId = sc.nextInt();
			System.out.println("Enter Name to Update");
			String name = sc.next();
			System.out.println("Enter Age to Update");
			int age = sc.nextInt();

//			int count = smt.executeUpdate("Update student SET studentName='"+name+"',studentAge="+age+"where studentId="+updateId+";");

			int count = smt.executeUpdate("Update employee SET EMP_NAME='" + name + "',EMP_AGE=" + age
					+ " where EMP_ID=" + updateId + "");
			if (count > 0) {
				System.out.println("Successfully Updated");
			} else {
				System.out.println("Cannot Update");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
