package control;

import model.Product;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name for product: ");
    String name = scanner.next();

    System.out.println("Enter price for product: ");
    double price = scanner.nextDouble();

    System.out.println("Enter quantity for product: ");
    int quantity = scanner.nextInt();

    Product product = new Product(name, price, quantity);

    System.out.println(product.toString());

    System.out.println("How many do you want to add: ");
    int increaseQuantity = scanner.nextInt();

    product.addProducts(increaseQuantity);
    System.out.println(product.toString());

    System.out.println("How many do you want to remove: ");
    int decreaseQuantity = scanner.nextInt();

    product.removeProducts(decreaseQuantity);
    System.out.println(product.toString());

  }
}