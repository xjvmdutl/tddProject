package com.example.tddproject.ch10;

public class Dollar extends Money {

  public Dollar(int amount, String currency) {
    super(amount, currency);
  }

  /*
  public Money times(int multiplier) {
    //return Money.dollar(amount * multiplier);
    //return new Dollar(amount * multiplier, "USD");
    //return new Dollar(amount * multiplier, currency);
    return new Money(amount * multiplier, currency);
  }
   */

}
