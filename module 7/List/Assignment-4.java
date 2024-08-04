package collection_4;

import java.util.ArrayList;
import java.util.List;

class MyArray_List<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class Different_DataType_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = new MyArray_List<>();

		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			list.add("Test");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(list);

	}

}
