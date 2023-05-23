package com.example.tddproject.ch18;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WasRunTest {
  @Test
  public void wasRunTest(){
    WasRun test = new WasRun("testMethod");
    System.out.println(test.isWasRun());
    test.run();
    System.out.println(test.isWasRun());
  }

  @Test
  public void testSetUp(){
    WasRun test = new WasRun("TestMethod");
    test.run();
    assertTrue(test.getWasSetUp());
  }
  @Test
  public void testCaseTest(){
    WasRun test = new WasRun("testMethod");
    //assertFalse(test.isWasRun());
    test.run();
    assertTrue(test.isWasRun());
  }
  @Test
  public void testRunning(){
    WasRun test = new WasRun("testMethod");
    test.run();
    assertTrue(test.isWasRun());
  }


}
