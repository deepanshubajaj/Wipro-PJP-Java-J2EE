package interestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccount_Test {

	FDAccount fd=new FDAccount();
		
	@Test
	public void test() throws InvalidAgeException, InvalidAmountException, 
	 InvalidDaysException {
		fd.noOfDays=8;
		fd.ageOfACHolder=19;
		double Amount=10000000;
		double c=fd.calculateInterest(Amount);
		assertEquals(80000000,c,0.001);
	}

}
