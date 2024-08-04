package PreparedStatement_MetaData_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentRecord_TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-4V8PHO8:1521:XE", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		double fees = Double.parseDouble(args[1]);
		
		try {			
			// update student data from stdnt_log table
			sql = "UPDATE stdnt_log SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, fees);
			pstmt.setInt(2, rollno);
			
			if (pstmt.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}

}

/*
------------------------
Output:
------------------------
C>1003 10000
Fees of student having rollno = 1003 updated successfully

*/
