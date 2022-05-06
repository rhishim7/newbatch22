package com.zensar.jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		try {
			// Optional for newer versions.
			// Registration of the driver.
			Connection con = ConnectionProvider.getConnection();
			CallableStatement csmt = null;
			System.out.println("Connected !!!!");
			
			Statement smt = con.createStatement();

			ResultSet rs = smt.executeQuery("select * from Employee");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
			
			csmt=con.prepareCall("{call updateEmpAge(?,?)}");
			
			csmt.setInt(1, 1);
			
			csmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			@SuppressWarnings("unused")
			int count=csmt.executeUpdate();
			
			System.out.println("Updated Employee Age is"+csmt.getInt(2));
			
			System.out.println("Procedure was executed successfully via JAVA");
			
		

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}