package com.example.tddproject.ch09;

public class Dollar extends Money {
  //private String currency;

  public Dollar(int amount, String currency) {
    super(amount, currency);
    /*
    this.amount = amount;
    this.currency = currency;
     */
  }

  public Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }

  /*
  @Override
  public String currency() {
    return currency;
    //return "USD";
  }
   */
}
