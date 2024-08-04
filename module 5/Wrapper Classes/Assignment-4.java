package wrapper_4;

class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class Cloneable_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Mr. ABC");
		Employee empClone = emp.clone();
		
		empClone.setName("Mr. PQR");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
