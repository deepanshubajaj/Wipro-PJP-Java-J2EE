package junit_4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit_4.Employee;

public class Junit_Test2 {

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
