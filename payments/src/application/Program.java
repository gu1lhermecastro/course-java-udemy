package application;

import entities.Billet;
import entities.ListBillet;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ListBillet listBillet = new ListBillet();
    listBillet.setLenght(0);

    System.out.println("Enter id: ");
    int id = input.nextInt();

    System.out.println("Enter day: ");
    int day = input.nextInt();

    System.out.println("Enter month: ");
    int month = input.nextInt();

    System.out.println("Enter value: ");
    double value = input.nextDouble();

    Billet billet = new Billet(id, day, month, value);

    Billet billet2 = new Billet(2, 5, 8, 500.00);
    Billet billet3 = new Billet(3, 5, 8, 500.00);
    Billet billet4 = new Billet(4, 5, 8, 500.00);
    Billet billet5 = new Billet(5, 5, 8, 500.00);

    listBillet.addBillet(billet);
    listBillet.addBillet(billet2);
    listBillet.addBillet(billet3);
    listBillet.addBillet(billet4);
    listBillet.addBillet(billet5);
    listBillet.viewBillets();

    listBillet.removeBillet();

    listBillet.viewBillets();

  }
}
