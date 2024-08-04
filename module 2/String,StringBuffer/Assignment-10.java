import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter string and integer n: ");
                String str = scan.nextLine();
                int n = scan.nextInt();
        		StringBuffer sb = new StringBuffer();
        		for (int i = 0; i < n; i++) {
			                    sb.append(str.substring(str.length() - n));
		        }
        		System.out.println(sb);
	    }

}