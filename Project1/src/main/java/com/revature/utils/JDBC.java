package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
		Connection connection=null;
		//Statement statement=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet;
		try {
		Class.forName("org.postgresql.Driver");
		
		
		System.out.println("Done....");
		
		preparedStatement=connection.prepareStatement("select * from login");
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1) +" "+resultSet.getString(2)
			+" "+resultSet.getString(3));
}
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		try {
		preparedStatement.close();
		connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}

