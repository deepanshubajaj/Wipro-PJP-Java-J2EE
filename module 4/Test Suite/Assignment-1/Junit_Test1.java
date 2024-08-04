package junit_4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit_4.Demo1;

public class Junit_Test1 {

	@Test
	public void test() {
		Demo1 d=new Demo1();
		String str=d.stringConcat("Hello"," World!!");
		//Test the Output
		assertEquals("Hello World!!",str);
	}

}