package entities;

public class Hotel {
  public Student[] guests = new Student[10];

  public void setGuests(Student[] guests) {
    this.guests = guests;
  }

  public Student[] getGuests() {
    return guests;
  }

  public String toString() {
    return "Aluno: ";
  }
}
