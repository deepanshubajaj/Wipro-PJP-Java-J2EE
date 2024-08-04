package collection_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class String_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Item-1");
		list.add("Item-2");
		list.add("Item-3");
		list.add("Item-4");
		list.add("Item-5");
		list.add("Item-6");
		list.add("Item-7");
		list.add("Item-8");
		list.add("Item-9");
		list.add("Item-10");

		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}
}
