package application;

import util.Calculator;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter FIRST value (must be greater than the second): ");
    double value1 = scanner.nextDouble();

    System.out.println("Enter SECOND value (must be less than the second): ");
    double value2 = scanner.nextDouble();

    System.out.println("==================== MENU =====================");
    System.out.println("1: Division");
    System.out.println("2: Sum");
    System.out.println("3: Subtraction");
    System.out.println("4: Multiplication");
    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("RESULT: " + Calculator.division(value1, value2));
        break;
      case 2:
        System.out.println("RESULT: " + Calculator.sum(value1, value2));
        break;
      case 3:
        System.out.println("RESULT: " + Calculator.subtraction(value1, value2));
        break;
      case 4:
        System.out.println("RESULT: " + Calculator.multiplication(value1, value2));
        break;
    }
  }
}
