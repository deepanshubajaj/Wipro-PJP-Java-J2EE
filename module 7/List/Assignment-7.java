package collection_7;

import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;

	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	

	public int getId() {
		return id;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Employee_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> list = new Vector<>();

		list.add(new Employee(101, "Mr. Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Mr. Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "Mr. John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Mr. Stuart", "456 street, India", 40000.0));

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());


	}

}
