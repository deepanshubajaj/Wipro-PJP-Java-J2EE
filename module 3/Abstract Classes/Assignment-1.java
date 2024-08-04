// -----------Abstract Class------------------------------
abstract class GeneralBank {

	public abstract double getSavingInterestRate();
	
	public abstract double getFixedInterestRate();
}

// -----------Subclass Class-1------------------------------
class ICICIBank extends GeneralBank {

	//Override
	public double getSavingInterestRate() {
		return 4.0;
	}

	//Override
	public double getFixedInterestRate() {
		return 8.5;
	}

}

// -----------Subclass Class-2------------------------------
class KotMBank extends GeneralBank {

	//Override
	public double getSavingInterestRate() {
		return 6.0;
	}

	//Override
	public double getFixedInterestRate() {
		return 9.0;
	}

}

// -----------Main Class------------------------------
public class Main {

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();

		System.out.println(iciciBank.getSavingInterestRate()+" %");
		System.out.println(iciciBank.getFixedInterestRate()+" %");
		System.out.println(kotMBank.getSavingInterestRate()+" %");
		System.out.println(kotMBank.getFixedInterestRate()+" %");
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotMBank();
		
		System.out.println(gb1.getSavingInterestRate()+" %");
		System.out.println(gb1.getFixedInterestRate()+" %");
		System.out.println(gb2.getSavingInterestRate()+" %");
		System.out.println(gb2.getFixedInterestRate()+" %");
	}

}