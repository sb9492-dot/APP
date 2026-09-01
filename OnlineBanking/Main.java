
import java.util.Scanner;
import account.*;
import payment.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String number = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        Account a;

        System.out.println("\n1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter account type: ");
        int choice = sc.nextInt();

        if (choice == 1)
            a = new SavingsAccount(number, name, balance);
        else
            a = new CurrentAccount(number, name, balance);

        a.displayDetails();

        System.out.print("\nEnter payment amount: ");
        double amount = sc.nextDouble();

        Payment p;

        System.out.println("\n1. UPI");
        System.out.println("2. Card");
        System.out.print("Enter payment method: ");
        int method = sc.nextInt();

        if (method == 1) {
            p = new UPIPayment();
            ((SecurePayment)p).verifyPayment();
        } else {
            p = new CardPayment();
        }

        p.pay(amount);

        if (p instanceof OnlineTransaction)
            System.out.println("This is an Online Transaction");
    }
}

