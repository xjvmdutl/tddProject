package com.example.tddproject.ch01;

public class Dollar {

  //int amount = 5 * 2;
  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public void times(int multiplier) {
    // amount = amount * multiplier;
     amount *= multiplier;
  }
}
