package model;

public class Student {
  public String name;
  public double[] grade;
  
  public double calculatingFinalGrade(double[] grade) {
    double note = 0;
    for (double g : grade) {
      note += g;
    }
    return note;
  }

  public double missing(double finalGrade){
    return 60.0 - finalGrade;
  }
}
