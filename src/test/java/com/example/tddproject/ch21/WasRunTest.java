package com.example.tddproject.ch21;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WasRunTest {

  @Test
  public void wasRunTest() {
    WasRun test = new WasRun("testMethod");
    System.out.println(test.isWasRun());
    test.run();
    System.out.println(test.isWasRun());
  }

  @Test
  public void testTemplateMethod() {
    WasRun test = new WasRun("TestMethod");
    test.run();
    assertThat("setUp testMethod tearDown ").isEqualTo(test.getLog());
  }

  @Test
  public void testCaseTest() {
    WasRun test = new WasRun("testMethod");
    test.run();
    assertTrue(test.isWasRun());
  }

  @Test
  public void testResult() {
    WasRun test = new WasRun("testMethod");
    var result = test.run();
    assertThat("1 run, 0 failed").isEqualTo(result.summary());
  }

  @Test
  public void testFailedResult() {
    WasRun test = new WasRun("testBrokenMethod");
    TestResult result = test.run();
    assertThat("1 run, 1 failed").isEqualTo(result.summary());
  }

  @Test
  public void testFailedResultFormatting(){
    TestResult result = new TestResult();
    result.testStarted();
    result.testFailed();
    assertThat("1 run, 1 failed").isEqualTo(result.summary());
  }
}
