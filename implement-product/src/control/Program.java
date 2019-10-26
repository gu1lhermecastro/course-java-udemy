package control;

import model.Product;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Product product = new Product();

    System.out.println("Enter name for product: ");
    product.name = scanner.next();

    System.out.println("Enter price for product: ");
    product.price = scanner.nextDouble();

    System.out.println("Enter quantity for product: ");
    product.quantity = scanner.nextInt();

    System.out.println("Value in stock: " + product.totalValueInStock());

    System.out.println("How many do you want to add: ");
    int increaseQuantity = scanner.nextInt();

    product.addProducts(increaseQuantity);
    System.out.println("Value in stock: " + product.totalValueInStock());

    System.out.println("How many do you want to remove: ");
    int decreaseQuantity = scanner.nextInt();

    product.removeProducts(decreaseQuantity);
    System.out.println("Value in stock: " + product.totalValueInStock());
  }
}