package application;

import entities.Hotel;
import entities.Student;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Hotel hotel = new Hotel();

    System.out.print("Quantas vagas deseja alugar? ");
    int vacancy = input.nextInt();

    Student[] studentss = new Student[vacancy];

    for (int i = 0; i < vacancy; i++) {
      System.out.println("Informe o nome do aluno: ");
      String name = input.next();

      System.out.println("Informe o email do aluno: ");
      String email = input.next();

      Student student = new Student(name, email);
      studentss[i] = student;
    }

    hotel.setGuests(studentss);

    for (int i = 0; i < hotel.guests.length; i++) {
      System.out.println("Aluno: ");
    }
  }
}
