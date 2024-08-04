import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter string : ");
                String str = scan.nextLine();
                String[] strs = str.split(".[\\*]+.");
        		StringBuffer sb = new StringBuffer();
        		for (String x : strs)
		                	sb.append(x);
	        	System.out.println(sb);
	    }

}