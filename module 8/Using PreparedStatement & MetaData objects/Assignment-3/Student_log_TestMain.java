package PreparedStatement_MetaData_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_log_TestMain {

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
		
		try {
			// backup/log student data to stdnt_log table
			sql = "INSERT INTO stdnt_log SELECT * FROM stdnt WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			int logged = pstmt.executeUpdate();
			
			// delete student data from stdnt table
			sql = "DELETE FROM stdnt WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			
			if (pstmt.executeUpdate() == 1 && logged == 1)
				System.out.println("Student having rollno = " + rollno + " deleted successfully");
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
C>1004
Student having rollno = 1004 deleted successfully

*/