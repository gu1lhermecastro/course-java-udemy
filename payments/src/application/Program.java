package application;

import entities.Billet;
import entities.ListBillet;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ListBillet listBillet = new ListBillet();
    listBillet.setLenght(0);

    Billet billet1 = new Billet(1, 1, 8, 500.00);
//    Billet billet2 = new Billet(2, 5, 9, 550.00);
//    Billet billet3 = new Billet(3, 8, 12, 600.00);
//    Billet billet4 = new Billet(4, 25, 1, 650.00);
//    Billet billet5 = new Billet(5, 28, 2, 700.00);

    listBillet.addBillet(billet1);
//    listBillet.addBillet(billet2);
//    listBillet.addBillet(billet3);
//    listBillet.addBillet(billet4);
//    listBillet.addBillet(billet5);
  }
}
