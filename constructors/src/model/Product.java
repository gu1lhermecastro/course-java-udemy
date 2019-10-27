package model;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double totalValueInStock() {
    return (quantity * price);
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString(){
    return "Porudct: "
            + name
            + ", R$ "
            + price
            + ", "
            + quantity
            + " units"
            + ", Total: R$ "
            + totalValueInStock();
  }
}