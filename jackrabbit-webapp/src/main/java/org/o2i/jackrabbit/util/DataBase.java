package org.o2i.jackrabbit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataBase {

	public static Logger LOG = LoggerFactory.getLogger(DataBase.class);

	private static Connection cn;

	static {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbTest", "root", "");

		} catch (SQLException | ClassNotFoundException e) {
			LOG.info(e.getMessage());
		}
	}

	public static Connection getConnection() {

		return cn;
	}

}
