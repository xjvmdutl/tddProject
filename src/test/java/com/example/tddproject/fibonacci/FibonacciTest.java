package com.example.tddproject.fibonacci;

import static com.example.tddproject.fibonacci.Fibonacci.fib;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FibonacciTest {

  @Test
  public void testFibonacci() {
    /*
    assertEquals(0, fib(0));
    assertEquals(1, fib(1));
     */
    int[][] cases = {{0, 0}, {1, 1}, {2, 1}, {3, 2}}; //case를 추가해도 단언문 추가 필요 x
    for (int i = 0; i < cases.length; ++i) {
      assertEquals(cases[i][1], fib(cases[i][0]));
    }
  }

}