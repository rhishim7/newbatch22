package com.zensar.jdbc;
import java.sql.*;
public class BatchDemo {

	public static void main(String[] args) {
	
		// Try with resource Concept
		// Does'nt require to release resources using finally block
		// Introduced in java 1.7 version
		// Pass only those resources who implements AutoCloseable interface
		try(Connection con=ConnectionProvider.getConnection();
				Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=smt.executeQuery("select * from employee");) {
			
			
			//ResultSet.TYPE_SCROLL_SENSITIVE forward scrolling
			
			
			//rs.absolute(3); // Absolute spot on result
			//rs.relative(2); // Results after the position provided
			
			ResultSetMetaData rsmd = rs.getMetaData();
			DatabaseMetaData dmd = con.getMetaData();
			
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println("getColumnName : "+rsmd.getColumnName(i));
				System.out.println("getColumnTypeName : "+rsmd.getColumnTypeName(i));
				System.out.println("isAutoIncrement : "+rsmd.isAutoIncrement(i));
				System.out.println("getPrecision : "+rsmd.getPrecision(i));
				System.out.println("getScale : "+rsmd.getScale(i));
				System.out.println("--------------------------------------");
			}
			
			System.out.println(dmd.getDatabaseMajorVersion());
			System.out.println(dmd.getSQLKeywords());
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(dmd.getDatabaseProductVersion());
			System.out.println(dmd.getJDBCMajorVersion());
			
			while (rs.next()) {
				System.out.println(rs.getInt("EMP_ID") + " " + rs.getString("EMP_NAME") + " " + rs.getInt("EMP_AGE"));
			}
			/*
			rs.moveToInsertRow(); //Used to move the cursor to insert new row
			
			rs.updateInt(1, 995);
			rs.updateString(2, "hasdxS");
			rs.updateInt(3, 23);
			
			rs.insertRow(); // Insert the data into the resultset and then to DB.
			*/
//			rs.updateInt(3, 40);
//			rs.updateRow();
//			
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			
//			con.setAutoCommit(false); // STOP COMMITING CHANGES IN DATABASE MANUALLY!
//			
//			
//			smt.addBatch("insert into employee values(3,'Rhsad',26)");
//			smt.addBatch("insert into employee values(4,'RAM',27)");
//			smt.addBatch("insert into employee values(5,'Sita',22)");
//			
//			smt.executeBatch(); // EXECUTES ALL THE BATCH
//			
//			con.commit(); // COMMIT CHANGE INTO DATABASE MANUALLY! 
//			
//			System.out.println("Batch Executed Successfully!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
