package ExecutingQuery_ProcessingResults;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_TestMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs;

		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-4V8PHO8:1521:XE", "hr", "hr");			
		} 
		catch (Exception e) {
			System.out.println("Connection could  not be established");
			if (conn != null) 
				conn.close();
		}

		String sql = "SELECT empno, ename FROM emp";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println("empno: " + rs.getInt(1) + ", ename: " + rs.getString("ename"));
		}

		if (stmt != null) 
			stmt.close();		
		if (conn != null) 
			conn.close();
	}

}


/*
------------------------------------------
Output:
------------------------------------------

empno: 7839, ename: KING
empno: 7698, ename: BLAKE
empno: 7782, ename: CLARK
empno: 7566, ename: JONES
empno: 7788, ename: SCOTT
empno: 7902, ename: FORD
empno: 7369, ename: SMITH
empno: 7499, ename: ALLEN
empno: 7521, ename: WARD
empno: 7654, ename: MARTIN
empno: 7844, ename: TURNER
empno: 7876, ename: ADAMS
empno: 7900, ename: JAMES
empno: 7934, ename: MILLER

*/
