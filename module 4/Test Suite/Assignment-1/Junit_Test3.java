package junit_4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit_4.Demo2;

public class Junit_Test3 {

	Demo2 d=new Demo2();
	@Test
	public void test() {
		boolean s=d.palindromeCheck("madam");
		assertTrue(s);
	}

}
