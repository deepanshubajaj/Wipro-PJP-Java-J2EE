import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 2 strings to concatenate : ");
                String str = scan.nextLine();
                String str1= scan.nextLine();
                StringBuffer sb=new StringBuffer(str.toLowerCase());  
                sb.append(str1.toLowerCase());
                System.out.println(sb);
        }
}