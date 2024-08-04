package ExceptionHandling_8;

public class InvalidAge_check {

	public static void main(String[] args) throws InvalidAgeException {
		String name = args[0];
		
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();

		System.out.println("Name: " + name + " Age: " + age);
	}

}

