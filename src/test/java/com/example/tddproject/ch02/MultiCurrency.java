package com.example.tddproject.ch02;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tddproject.ch02.Dollar;
import org.junit.jupiter.api.Test;

public class MultiCurrency {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    Dollar product = five.times(2); //해당 함수 호출후에는 더이상 five는 5가 아니다.
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }
}
