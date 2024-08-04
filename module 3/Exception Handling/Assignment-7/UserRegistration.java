package ExceptionHandling_7;

public class UserRegistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration registration = new UserRegistration();
		
		try {
			registration.registerUser("Mickey_Mouse", "USA");
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}