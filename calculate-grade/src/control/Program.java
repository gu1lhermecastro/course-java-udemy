package control;

import model.Student;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();

    System.out.println("Enter name for student: ");
    student.name = scanner.next();

    double[] grade = {0, 0, 0};
    String resp;

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter grade: ");
      grade[i] = scanner.nextDouble();
    }

    System.out.println("FINAL GRADE = " + student.calculatingFinalGrade(grade));

    if (student.calculatingFinalGrade(grade) > 60.00) {
      System.out.println("PASS");
    } else {
      System.out.println("FAILED");
      System.out.println("MISSING " + student.missing(student.calculatingFinalGrade(grade)) + " POINTS");
    }
  }
}
