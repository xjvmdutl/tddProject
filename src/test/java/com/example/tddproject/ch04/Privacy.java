package com.example.tddproject.ch04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tddproject.ch04.Dollar;
import org.junit.jupiter.api.Test;

class Privacy {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    //Dollar product = five.times(2);
    // assertEquals(10, product);
    //assertEquals(new Dollar(10), product);
    assertEquals(new Dollar(10), five.times(2));
    //product = five.times(3);
    //assertEquals(15, product);
    //assertEquals(new Dollar(15), product);
    assertEquals(new Dollar(15), five.times(3));
  }

}