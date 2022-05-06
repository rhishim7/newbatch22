package com.zensar.jdbc;

import java.sql.*;
import java.util.*;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = ConnectionProvider.getConnection();

			Statement smt = con.createStatement();
			System.out.println("Enter Id to delete");
			int option = sc.nextInt();

			int count = smt.executeUpdate("DELETE FROM employee WHERE EMP_ID=" + option + ";");
			if (count > 0) {
				System.out.println("Successfully Deleted");
			} else {
				System.out.println("Cannot Delete");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
