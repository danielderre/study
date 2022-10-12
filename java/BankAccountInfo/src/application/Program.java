package application;

import entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("===== Enter account info =====");
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit? (y/n)");
        String response = String.valueOf(sc.nextLine().charAt(0));
        if (response.equals("y")) {
            System.out.println("Enter the initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, holder, initialDeposit);
        } else {
            account = new Account(accountNumber, holder);
        }

        System.out.println();
        System.out.println("===== Account Data =====");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(account);

    sc.close();
    }
}