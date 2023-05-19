package com.example.tddproject.ch17;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WasRunTest {
  @Test
  public void wasRunTest(){
    WasRun test = new WasRun("testMethod");
    System.out.println(test.isWasRun());
    //test.testMethod();
    test.run();
    System.out.println(test.isWasRun());

  }

  @Test
  public void testCaseTest(){
    WasRun test = new WasRun("testMethod");
    assertFalse(test.isWasRun());
    test.run();
    assertTrue(test.isWasRun());
  }

}
