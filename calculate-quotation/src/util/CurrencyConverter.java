package util;

public class CurrencyConverter {
  public static double DOLLAR_PRICE;
  private static double IOF = 6;

  public static double convertToReais(double dollar) {
    return ((DOLLAR_PRICE * dollar) + (((DOLLAR_PRICE * dollar) * IOF )/ 100));
  }
}
