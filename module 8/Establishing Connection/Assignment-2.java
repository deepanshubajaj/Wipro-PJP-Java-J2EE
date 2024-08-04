package EstablishingConnection_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnection2_TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		
		try {			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-4V8PHO8:1521:XE", "hr", "hr");
			System.out.println("Connection Established successfully");
		} 
		catch (Exception e) {
			System.out.println("Connection could not be established");
		} 
		finally {
			if (conn != null) 
				conn.close();
		}
	}

}


/*

Output:
Connection could  not be established


*/