package com.example.tddproject.ch19;

import static org.assertj.core.api.Assertions.assertThat;
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
  public void testTemplateMethod(){
    WasRun test = new WasRun("TestMethod");
    test.run();
    assertThat("setUp testMethod tearDown ").isEqualTo(test.getLog());
  }
  @Test
  public void testCaseTest(){
    WasRun test = new WasRun("testMethod");
    //assertFalse(test.isWasRun());
    test.run();
    assertTrue(test.isWasRun());
  }

}
