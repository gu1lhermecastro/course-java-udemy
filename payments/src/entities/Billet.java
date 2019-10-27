package entities;

public class Billet {
  private int id;
  private int day;
  private int month;
  private double value;
  private Billet next;

  public Billet(int id, int day, int month, double value) {
    this.id = id;
    this.day = day;
    this.month = month;
    this.value = value;

  }

  public Billet(int id, int day, int month, double value, Billet billet) {
    this.id = id;
    this.day = day;
    this.month = month;
    this.value = value;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public void setNext(Billet next) {
    this.next = next;
  }

  public Billet getNext() {
    return next;
  }
}
