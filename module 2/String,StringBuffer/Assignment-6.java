import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 2 strings : ");
                String a = scan.nextLine();
                String b = scan.nextLine();
                String output;
        		if (a.length() < b.length()) 
			                output = a + b + a;
	        	else
		                	output = b + a + b;

		        System.out.println(output);
	    }

}