package control;

import model.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    BankAccount bankAccount;

    System.out.println("Enter account number: ");
    int number = scanner.nextInt();

    System.out.println("Enter account holder: ");
    String holder = scanner.next();

    System.out.println("Is there na initial deposit (y/" +
            "n)? ");
    char resp = scanner.next().charAt(0);

    double value = 0.0;

    if (resp == 'y') {
      System.out.println("Enter initial deposit value: ");
      value = scanner.nextDouble();
      bankAccount = new BankAccount(number, holder, value);
    } else {
      bankAccount = new BankAccount(number, holder);
    }
    System.out.println();
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
