package interestCalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("MAIN MENU\n--------- " + "\n    1." + " Interest Calculator-SB" + " \n    2." + " Interest Calculator-FD"
                + "\n    3." + " Interest Calculator-RD" + "\n    4 " + " Exit\n"+"Enter your option (1..4) : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                SBAccount sb = new SBAccount();
                try {
                    System.out.print("Enter the Average SB amount ");
                    double amount = sc.nextDouble();
                    System.out.print("Interest gained is : $ " + sb.calculateInterest(amount));

                } catch (InvalidAmountException e) {
                    System.out.println("Exception : Invalid amount");
                }
                break;

            case 2:
                try {
                    FDAccount fd = new FDAccount();
                    System.out.print("Enter the FD Amount");
                    double fAmount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + fd.calculateInterest(fAmount));
                } catch (InvalidAgeException e) {
                    System.out.println("Invalid Age Entered");
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount Entered");

                } catch (InvalidDaysException e) {
                    System.out.println("Invalid Days Entered");

                }

                break;
            case 3:
                try {
                    RDAccount rd = new RDAccount();
                    System.out.print("Enter the RD amount");
                    double Ramount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + rd.calculateInterest(Ramount));
                } catch (InvalidAgeException e) {
                    System.out.println("Invalid Age Entered");
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount Entered");

                } catch (InvalidMonthsException e) {
                    System.out.println("Invalid Days Entered");
                }

                break;

            case 4:
                System.out.println("DO YOU WANT TO CALCULATE AGAIN ????" + " "
                        + "RUN AGAIN THE PROGRAM");
            default:
                System.out.println("Wrong choice");

        }
    }

}