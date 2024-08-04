import java.util.Random;

// -----------Abstract Class------------------------------
abstract class Compartment {
	public abstract void notice();
}

// -----------Subclass Class-1------------------------------
class FirstClass extends Compartment {

	//Override
	public void notice() {
		System.out.println("Notice: You're in FirstClass");
	}
    
}

// -----------Subclass Class-2------------------------------
class Ladies extends Compartment {

	//Override
	public void notice() {
		System.out.println("Notice: You're in Ladies");
	}

}

// -----------Subclass Class-3------------------------------
class General extends Compartment {

	//Override
	public void notice() {
		System.out.println("Notice: You're in General");
	}

}

// -----------Subclass Class-4------------------------------
class Luggage extends Compartment {

	//Override
	public void notice() {
		System.out.println("Notice: You're in Luggage");
	}

}

// -----------Main Class------------------------------
public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];

		Random ran = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = ran.nextInt((4 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	compartments[i].notice();
	    }
	}

}