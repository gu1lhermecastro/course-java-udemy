package control;

import model.BankAccount;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter account number: ");
    int number = scanner.nextInt();

    System.out.println("Enter account holder: ");
    String holder = scanner.next();

    System.out.println("Is there na initial deposit (y/n)? ");
    boolean resp = scanner.nextBoolean();

    double value = 0.0;

    if (resp == true) {
      System.out.println("Enter initial deposit value: ");
      value = scanner.nextDouble();
    }

    BankAccount bankAccount = new BankAccount(number, holder, value);

    System.out.println(bankAccount.toString());

    System.out.println("Enter a deposit value: ");
    value = scanner.nextDouble();
    bankAccount.deposit(value);

    System.out.println(bankAccount.toString());

    System.out.println("Enter a withdraw value: ");
    value = scanner.nextDouble();
    bankAccount.withdraw(value);

    System.out.println(bankAccount.toString());
  }
}
