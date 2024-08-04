package collection_14;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Properties_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties properties = new Properties();
		
		properties.setProperty("Kerala", "Thiruvananthapuram");
		properties.setProperty("Rajasthan", "Jodhpur");
		properties.setProperty("Bihar", "Patna");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
