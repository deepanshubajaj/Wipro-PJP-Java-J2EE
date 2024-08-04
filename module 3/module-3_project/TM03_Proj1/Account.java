package interestCalculator;

public abstract class Account {
    double interestRate;
    double amount; 
    abstract double calculateInterest(double amount)throws InvalidMonthsException,InvalidAgeException,InvalidAmountException ,InvalidDaysException;
}