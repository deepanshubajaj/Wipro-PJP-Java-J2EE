package junit_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_Test {

	Demo2 d=new Demo2();
	@Test
	public void test() {
		boolean s=d.palindromeCheck("madam");
		assertTrue(s);
	}

}
