package com.example.tddproject.ch13;

public class Bank {

  public Money reduce(Expression source, String to) {
    //return Money.dollar(10);
    /*
    Sum sum = (Sum) source;
    int amount = sum.augend.amount + sum.addend.amount;
    return new Money(amount, to);
     */
    if (source instanceof Money) {
      return source.reduce(to);
    }
    Sum sum = (Sum) source;
    return sum.reduce(to);
  }
}

