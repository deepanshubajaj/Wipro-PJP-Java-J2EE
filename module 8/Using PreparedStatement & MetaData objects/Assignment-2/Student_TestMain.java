package PreparedStatement_MetaData_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student_TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-4V8PHO8:1521:XE", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			try {
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4) rollno = 0;
			} catch (Exception e) {}
		} while (rollno == 0);
		
		String studentName = "";
		boolean lowercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<>(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();
		
		Double fees = 0.0;
		do {
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);
		
		
		// inserting data into db
		String sql = "INSERT INTO stdnts VALUES(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, studentName);
			pstmt.setString(3, standard);
			pstmt.setString(4, dob);
			pstmt.setDouble(5, fees);
			pstmt.executeQuery();
			System.out.println("Student added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");
			pstmt.close();
			conn.close();
		}		
		
		sc.close();
	}

}


/*
 
 CREATE TABLE stdnts (
	Rollno Number (4) Primary Key,
	StudentName Varchar (20)  Not Null,
	Standard Varchar (2) Not Null,
	Date_Of_Birth Date,
	Fees Number (9,2)
);
INSERT INTO stdnt VALUES(1002, 'ALICE', 'V', '16-Aug-1947', 4300.0);

*/

/*
 
 -----------------------------------------
 Output:
 -----------------------------------------
 
Enter rollno: 1003
Enter name: Daniel
Enter name: X
Enter standard: X
Enter D.O.B.: 17-Aug-1946
Enter fees: 5600
Student added successfully

*/

