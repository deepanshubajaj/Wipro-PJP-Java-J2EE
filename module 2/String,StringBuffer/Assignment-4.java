import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter string : ");
                String str = scan.nextLine();
                String output;
            	if (str.length() % 2 == 0) {
		                    	output = str.substring(0, str.length() / 2);
		        } 
		        else {
			                    output = null;
		        }

		        System.out.println(output);

	    }

}