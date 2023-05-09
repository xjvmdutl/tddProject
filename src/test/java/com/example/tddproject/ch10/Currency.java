package com.example.tddproject.ch10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tddproject.ch09.Money;
import org.junit.jupiter.api.Test;

public class Currency {

  @Test
  public void testCurrency(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}
