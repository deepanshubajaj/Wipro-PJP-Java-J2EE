import java.util.Scanner;
import java.lang.Math;
public class Calculator {
   static double powerInt(int num1,int num2){
       return Math.pow(num1,num2);
   }
   static double powerDouble(double num1,int num2){
       return Math.pow(num1,num2);
   }
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int num1,num2;
        double num3;
        System.out.println("Enter Number 1 in int: ");
        num1=scan.nextInt();
        System.out.println("Enter Number 2 in int: ");
        num2=scan.nextInt();
        System.out.println("Enter Number 3 double: ");
        num3=scan.nextDouble();
        double p1=Calculator.powerInt(num1,num2);
        double p2=Calculator.powerDouble(num3,num2);
        System.out.println("The result of powerInt(): "+p1);
        System.out.println("The result of powerDouble(): "+p2);
    }
}
