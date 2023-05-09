package com.example.tddproject.ch10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DollarMultiplication {
  @Test
  public void testMultiplication(){
    //Dollar five = Money.dollar(5); //펙토리 메서드 도입
    Money five = Money.dollar(5); //펙토리 메서드 도입
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

}