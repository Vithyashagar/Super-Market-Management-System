package package1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
		
		private static String url = "jdbc:mysql://localhost:3306/udssuper";
		private static String userName = "root";
		private static String password = "M@ng@th@9093";
		private static Connection conn;
		
		public static Connection getConnection() {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url , userName , password);
			}
			catch (Exception e) {
				System.out.println("Database connection is not success!!!");
			}
			return conn;
		}
	
	
}