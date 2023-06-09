package com.example.tddproject.ch06;

public class Franc extends Money{
  public Franc(int amount) {
    this.amount = amount;
  }

  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount;
  }
}
