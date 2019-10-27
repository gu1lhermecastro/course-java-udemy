package model;

public class BankAccount {
  private int number;
  private String holder;
  private double balance;

  public BankAccount(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    deposit(initialDeposit);
  }

  public BankAccount(int number, String holder) {
    this.number = number;
    this.holder = holder;
  }

  public int getNumber() { return number; }
//  public void setNumber(int number) { this.number = number; }

  public String getHolder() { return holder; }
  public void setHolder(String holder) { this.holder = holder; }

  public double getBalance() { return balance; }
//  public void setBalance(double balance) { this.balance = balance; }

  public void deposit(double value) {
    this.balance += value;
  }

  public void withdraw(double value) {
    this.balance -= value + 5.0;
  }

  public String toString() {
    return "Update account data:\n"
            + "Account: " + getNumber()
            + ", Holder: " + getHolder()
            + ", Balance: " + String.format("%.2f", getBalance()) ;
  }
}
