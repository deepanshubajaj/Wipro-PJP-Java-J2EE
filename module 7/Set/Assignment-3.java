package collection_10;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Miss. ABC");
		set.add("Miss. PQR");
		set.add("Mr. XYZ");
		set.add("Mr. CDE");
		
		Iterator<String> it = set.iterator();
		String query = "Mr. XYZ";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}