package control;

import model.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    System.out.println("Enter rectangle width and height");
    double width = scanner.nextDouble();
    double height = scanner.nextDouble();

    Rectangle rectangle = new Rectangle(width, height);

    System.out.println("AREA = " + rectangle.area());
    System.out.println("PERIMETER = " + rectangle.perimeter());
    System.out.println("DIAGONAL = " + rectangle.diagonal());
    scanner.close();
  }
}
