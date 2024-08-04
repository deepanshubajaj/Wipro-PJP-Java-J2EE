package ExceptionHandling_1;

import java.util.Scanner;

public class FormatException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String str = scan.nextLine();
		
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} 
		catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		scan.close();
	}
}
