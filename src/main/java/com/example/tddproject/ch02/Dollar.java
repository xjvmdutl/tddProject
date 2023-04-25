package com.example.tddproject.ch02;

public class Dollar {

  //int amount = 5 * 2;
  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    /**
    amount *= multiplier;
    return null;
     */
    return new Dollar(amount * multiplier);
  }
}
