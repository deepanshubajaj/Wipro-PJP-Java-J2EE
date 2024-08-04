package collection_9;

import java.util.HashSet;
import java.util.Iterator;

public class Employee_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<>();
		
		set.add("Miss. ABC");
		set.add("Miss. PQR");
		set.add("Mr. XYZ");
		set.add("Mr. CDE");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
