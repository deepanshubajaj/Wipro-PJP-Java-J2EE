package interestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccount_Test {

	SBAccount sb=new SBAccount();
	
	@Test
	public void test() throws InvalidAmountException {
		sb.accountChoice=1;
		double Amount=10000000;
		double c=sb.calculateInterest(Amount);
		assertEquals(600000,c,0.001);
	}
}

