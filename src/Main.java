import entities.Account;
import entities.CurrentAccount;
import entities.Holder;
import entities.SavingsAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Holder auxHolder = new Holder("Pedro");
        CurrentAccount repAccount = new CurrentAccount(auxHolder); //necessary to test transfer

        System.out.println("Welcome! Insert the holder's name: ");
        Holder holder = new Holder(scanner.nextLine());
        System.out.println("Do you want to create Current or Savings Account? (C/S)");
        String answer = scanner.nextLine().toUpperCase();
        char aux = answer.charAt(0);

        if (aux == 'C') {
            Account account = new CurrentAccount(holder);
            System.out.println(account.toString());
            System.out.println();

            System.out.println("Do you wanna do any transaction? (Y/N)");
            String answer1 = scanner.nextLine().toUpperCase();
            char aux1 = answer1.charAt(0);

            if (aux1 == 'Y') {
                System.out.println("Transfer,balance, deposit or withdraw? (T/B/D/W)");
                String answer2 = scanner.nextLine().toUpperCase();
                char aux2 = answer2.charAt(0);

                if (aux2 == 'T') {
                    System.out.println("Please insert the value to transfer: ");
                    double valueAuxT = scanner.nextDouble();
                    System.out.println("Insert the recipient account name: ");
                    String repName = scanner.next();
                    account.transfer(valueAuxT, repAccount);
                    System.out.println("Transfer realized. Your new balance is: " + account.getBalance());

                } else if (aux2 == 'D') {
                    System.out.println("Please insert the value to deposit: ");
                    double valueAuxD = scanner.nextDouble();
                    account.deposit(valueAuxD);
                    System.out.println("Deposit realized. Your new balance is: " + account.getBalance());

                } else if (aux2 == 'W') {
                    System.out.println("Please insert the value to withdraw: ");
                    double valueAuxW = scanner.nextDouble();
                    account.withdraw(valueAuxW);

                } else if (aux2 == 'B') {
                    System.out.println("Your balance is: " + account.getBalance());
                } else {
                    System.out.println("Invalid value! ");
                }
            } else if (aux1 == 'N') {
                System.out.println("Thanks for using our Bank!");
            } else {
                System.out.println("Invalid value! ");
            }
            System.out.println("Thanks for using our Bank!");


        } else if (aux == 'S') {
            Account account = new SavingsAccount(holder);
            System.out.println(account.toString());
            System.out.println();

            System.out.println("Do you wanna do any transaction? (Y/N)");
            String answer1 = scanner.nextLine().toUpperCase();
            char aux1 = answer1.charAt(0);
            if (aux1 == 'Y') {
                System.out.println("Transfer, deposit or withdraw? (T/B/D/W)");
                String answer2 = scanner.nextLine().toUpperCase();
                char aux2 = answer2.charAt(0);
                if (aux2 == 'T') {
                    System.out.println("Please insert the value to transfer: ");
                    double valueAuxT = scanner.nextDouble();
                    System.out.println("Insert the recipient account name: ");
                    String repName = scanner.next();
                    account.transfer(valueAuxT, repAccount);
                    System.out.println("Transfer realized. Your new balance is: " + account.getBalance());

                } else if (aux2 == 'D') {
                    System.out.println("Please insert the value to deposit: ");
                    double valueAuxD = scanner.nextDouble();
                    account.deposit(valueAuxD);
                    System.out.println("Deposit realized. Your new balance is: " + account.getBalance());

                } else if (aux2 == 'W') {
                    System.out.println("Please insert the value to withdraw: ");
                    double valueAuxW = scanner.nextDouble();
                    account.withdraw(valueAuxW);

                } else if (aux2 == 'B') {
                    System.out.println("Your balance is: " + account.getBalance());
                } else {
                    System.out.println("Invalid value! ");
                }
            } else if (aux1 == 'N') {
                System.out.println("Thanks for using our Bank!");
            } else {
                System.out.println("Invalid value! ");
            }

        } else {
            System.out.println("Invalid value! ");
        }
    }
}