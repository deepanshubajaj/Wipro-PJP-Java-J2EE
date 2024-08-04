package ExceptionHandling_4;

import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		sc.close();
	}
	
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
