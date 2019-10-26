package control;

import model.Employee;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.print("Name: ");
    String name = scanner.next();
    System.out.print("Gross salary: ");
    double grossSalary = scanner.nextDouble();
    System.out.print("Tax: ");
    double tax = scanner.nextDouble();

    employee.setGrossSalary(grossSalary);
    employee.setName(name);
    employee.setTax(tax);

    System.out.println(employee.toString());

    System.out.print("Which percentage to increase salary? ");
    double percentage = scanner.nextDouble();
    employee.increaseSalary(percentage);

    System.out.println("Updated data: " + employee.toString());
  }
}
