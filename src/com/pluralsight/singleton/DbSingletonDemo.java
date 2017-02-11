package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String args[]) {

		long timeBefore = 0;
		long timeAfter = 0;

		// First, create a singleton instance (there will only ever be ONE)
		DbSingleton instance = DbSingleton.getInstance();

		// Note - the code below will not work, because we CAN'T create an
		// instance of DbSingleton. Will get an error about constructor not
		// being visible.
		// DbSingleton anotherInstance = new DbSingleton();

		// Get connection to database, and create a statement.
		// This requires using the non-static method on the singleton instance,
		// to get the instance of the connection.
		// E.g MANY CONNECTIONS hanging off our ONE INSTANCE - V.IMPORTANT
		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

		Statement sta;
		try {
			sta = conn.createStatement();
			int count = sta
					.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
							+ "City VARCHAR(20))");
			System.out.println("Table Created");
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// If we carry out another SQL statement, we can see that the recorded
		// time is very close to zero. This is because the time is taken in
		// actually creating the singleton object the first time round.
		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);	
	
	}

}
