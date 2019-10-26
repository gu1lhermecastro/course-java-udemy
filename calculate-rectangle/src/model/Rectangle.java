package model;

public class Rectangle {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return (this.width * this.height);
  }

  public double perimeter() {
    return (2 * (this.width + this.height));
  }

  public double diagonal() {
    return (2 * (Math.pow(this.width, 2) + Math.pow(this.height, 2)));
  }
}
