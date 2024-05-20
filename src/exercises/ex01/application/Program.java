package exercises.ex01.application;

import exercises.ex01.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
         Bank account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.next();
        System.out.println();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account = new Bank(accountNumber, name, initialValue);
        } else {
            account = new Bank(accountNumber, name);
        };

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();
    }
}
