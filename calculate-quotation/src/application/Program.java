package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is the dolla price? ");
    CurrencyConverter.DOLLAR_PRICE = scanner.nextDouble();

    System.out.print("How many dollar will be bought? ");
    double willBought = scanner.nextDouble();

    System.out.print("Amount to be paid in reais = " + CurrencyConverter.convertToReais(willBought));

  }
}
