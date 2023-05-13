package com.example.tddproject.ch12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Addition {
  @Test
  public void testSimpleAddition(){
    /*
    Money sum = Money.dollar(5).plus(Money.dollar(5));
    assertEquals(Money.dollar(10), sum);
     */
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum, "USD");
    assertEquals(Money.dollar(10), reduced);
  }

}
