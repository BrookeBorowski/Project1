package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static ConnectionUtils connectionUtils;
	private Connection connection;
	
	private ConnectionUtils() throws SQLException {

		String url = System.getenv("DB_URL");
		String user = System.getenv("DB_USER");
		String pwd = System.getenv("DB_PASS");
		String dbName = System.getenv("DB_PROJECT");
		  try {
	            Class.forName("org.postgresql.Driver");
	            this.connection = DriverManager.getConnection(url+dbName,user,pwd);
	        } catch (ClassNotFoundException ex) {
	            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
	        }

	}
	public Connection getConnection() {
        return connection;
    }
	
	public static ConnectionUtils getInstance() throws SQLException {
        if (connectionUtils == null) {
        	connectionUtils = new ConnectionUtils();
        } else if (connectionUtils.getConnection().isClosed()) {
        	connectionUtils = new ConnectionUtils();
        }

        return connectionUtils;
    }
}
