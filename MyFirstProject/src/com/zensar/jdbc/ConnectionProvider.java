package com.zensar.jdbc;

import java.io.*;
import java.sql.*;
import java.util.*;


public class ConnectionProvider {

	static Connection con = null;

	public static Connection getConnection() {
		try {
			Properties properties = new Properties();
			
			properties.load(new FileReader ("db.properties"));		
			
			
			String driverName = properties.getProperty("driver");
			String jdbcUrl = properties.getProperty("jdbcUrl");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			Class.forName(driverName);
			con = DriverManager.getConnection(
					jdbcUrl, username, password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}
