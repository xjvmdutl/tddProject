package com.example.tddproject.ch10;

public class Franc extends Money {
  public Franc(int amount, String currency) {
    super(amount, currency);
  }

  /*
  public Money times(int multiplier) {
    //return Money.franc(amount * multiplier);
    //return new Franc(amount * multiplier, "CHF");
    //return new Franc(amount * multiplier, currency);
    return new Money(amount * multiplier, currency);
  }
   */

}
