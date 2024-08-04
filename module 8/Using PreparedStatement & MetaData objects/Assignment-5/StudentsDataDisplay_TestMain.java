package PreparedStatement_MetaData_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentsDataDisplay_TestMain {

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
		
		int rollno = 0;
		try {
			rollno = Integer.parseInt(args[0]);
		} catch (Exception e) {}
		
		
		try {			
			// select student data from stdnt_log table
			if (rollno != 0)
				sql = "SELECT * FROM stdnt_log WHERE rollno = ?";
			else 
				sql = "SELECT * FROM stdnt_log";
			
			pstmt = conn.prepareStatement(sql);
			if (rollno != 0) pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int ROLLNO = rs.getInt("ROLLNO");
				String STUDENTNAME = rs.getString("STUDENTNAME");
				String STANDARD = rs.getString("STANDARD");
				String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
				double FEES = rs.getDouble("FEES");
				
				System.out.println(ROLLNO + " ----- " + STUDENTNAME + " ----- " + STANDARD + 
						" ----- " + DATE_OF_BIRTH + " ----- " + FEES);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}

}

/*
------------------------
Output 1:
------------------------
1001 ----- BOB ----- IV ----- 1947-08-15 00:00:00 ----- 4500.0
1002 ----- Alice ----- V ----- 1947-11-16 00:00:00 ----- 6500.0
1003 ----- Sneha ----- V1 ----- 1944-01-10 00:00:00 ----- 10000.0
1004 ----- Lucy ----- X ----- 1942-08-22 00:00:00 ----- 9000.0
1005 ----- Vicky ----- IX ----- 1943-05-28 00:00:00 ----- 9000.0
1006 ----- BB ----- IV ----- 1947-08-15 00:00:00 ----- 4500.0

------------------------
Output 2:
------------------------
C> 1003
1003 ----- Sneha ----- V1 ----- 1944-01-10 00:00:00 ----- 10000.0


*/
