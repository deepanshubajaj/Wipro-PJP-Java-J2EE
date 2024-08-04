package collection_2;

public class Employee_EmployeeDB_Test {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		EmployeeDB empDb = new EmployeeDB();

		Employee emp1 = new Employee(101, "Mr. Bob", "bob@pqr.com", 'M', 25000);
		Employee emp2 = new Employee(102, "Johnson Alice", "alice@pqr.com", 'F', 30000);
		Employee emp3 = new Employee(103, "ABC_John", "john@pqr.com", 'M', 20000);
		Employee emp4 = new Employee(104, "Lucy_XYZ", "lucy@pqr.com", 'M', 50000);

		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();
		empDb.deleteEmployee(102);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();

		System.out.println(empDb.showPaySlip(103));
	}

}
