import java.util.Random;

// -----------Abstract Class------------------------------
abstract class Instrument {
	public abstract void play();
}

// -----------Subclass Class-1------------------------------
class Piano extends Instrument {

	//Override
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");

	}

}

// -----------Subclass Class-2------------------------------
class Flute extends Instrument {

	//Override
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");

	}

}

// -----------Subclass Class-3------------------------------
class Guitar extends Instrument {

	//Override
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");

	}

}

// -----------Main Class------------------------------
public class Main {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		
		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		instruments[i] = new Piano();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	
	    	instruments[i].play();
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}

}