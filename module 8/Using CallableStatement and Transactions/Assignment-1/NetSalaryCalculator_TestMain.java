package CallableStatement_and_Transactions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class NetSalaryCalculator_TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		CallableStatement cstmt = null;		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-4V8PHO8:1521:XE", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// querying through emp table
		String sql = "SELECT * FROM emp";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				double netSalary = 0;

				// querying to call calculate_salary()
				String sql2 = "{ call calculate_salary(?, ?) }";

				cstmt = conn.prepareCall(sql2);
				cstmt.setInt(1, empno);
				cstmt.registerOutParameter(2, Types.DOUBLE);
				cstmt.executeQuery();

				netSalary = cstmt.getDouble(2);

				System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");
			stmt.close();
			cstmt.close();
			conn.close();
		}
	}

}

/*
------------------------
Output:
------------------------
empno: 7839, ename: KING, net salary: 4250.0
empno: 7698, ename: BLAKE, net salary: 2422.5
empno: 7782, ename: CLARK, net salary: 2082.5
empno: 7566, ename: JONES, net salary: 2528.75
empno: 7788, ename: SCOTT, net salary: 2550.0
empno: 7902, ename: FORD, net salary: 2550.0
empno: 7369, ename: SMITH, net salary: 680.0
empno: 7499, ename: ALLEN, net salary: 1615.0
empno: 7521, ename: WARD, net salary: 1400.0
empno: 7654, ename: MARTIN, net salary: 2120.0
empno: 7844, ename: TURNER, net salary: 1275.0
empno: 7876, ename: ADAMS, net salary: 935.0
empno: 7900, ename: JAMES, net salary: 807.5
empno: 7934, ename: MILLER, net salary: 1105.0


*/