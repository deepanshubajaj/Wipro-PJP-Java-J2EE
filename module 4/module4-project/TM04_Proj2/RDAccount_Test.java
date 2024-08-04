package interestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccount_Test {

	RDAccount rd=new RDAccount();
	@Test
	public void test() throws InvalidAgeException, InvalidAmountException, 
	 InvalidDaysException,InvalidMonthsException {
		rd.noOfMonths=8;
		rd.age=60;
		double Amount=10000000;
		double c=rd.calculateInterest(Amount);
		assertEquals(825000,c,0.001);
	}
}
