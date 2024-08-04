package junit_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringConcat_Unit {

	@Test
	public void test() {
		Demo1 d=new Demo1();
		String str=d.stringConcat("Hello"," World!!");
		//Test the Output
		assertEquals("Hello World!!",str);
	}

}
