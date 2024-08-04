package junit_2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Bob");
		list.add("Alice");
		list.add("John");
	}
	@Test
	public void test() {
		System.out.println(list);
		assertEquals("Result", "FOUND", e.findName(list, "Alice"));
		System.out.println("test");
	}

}
