package collection_project_2;

import java.util.ArrayList;
import java.util.List;

public class StringList_Operations {
	private List<String> list = new ArrayList<>();
	
	public boolean insert(String item) {
		if (!list.contains(item)) {
			list.add(item);
			return true;
		}
		
		return false;
	}
	
	public boolean search(String item) {
		if (list.contains(item)) {
			return true;
		}
		
		return false;
	}
	
	public boolean delete(String item) {
		if (list.contains(item)) {
			list.remove(item);
			return true;
		}
		
		return false;
	}
	
	public void display() {
		for (String item : list)
			System.out.println(item);
	}
	
		
	public int size() {
		return list.size();
	}
	
}