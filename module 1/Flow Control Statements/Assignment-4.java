import java.util.*;
public class Sample {
    public static void main(String args[]) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter two characters: ");
      char a=scan.next().charAt(0);
      char b=scan.next().charAt(0);
      if(a<b)
            System.out.println(a+","+b);
      else
            System.out.println(b+","+a);
      
    }
}