com.mysql.jdbc.Driver
jdbc:mysql://localhost:3306/orderfooddb




package CONNECT;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class connect {
	
	public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/orderfooddb?useSSL=false";
			String user="root";
			String password="12369874";
			Connection connection=(Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Suscessfully!!!!!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Error!!");
			e.printStackTrace();
		}
		
		
		
		
	}
	

}