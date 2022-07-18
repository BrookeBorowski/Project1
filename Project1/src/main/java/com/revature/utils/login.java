package com.revature.utils;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.project.*;

public class login{
	public static void main(String[] args) {
		Connection connection=null;
		try {
			
			connection=ConnectionUtils.getInstance().getConnection();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done...."); 
	}
}
