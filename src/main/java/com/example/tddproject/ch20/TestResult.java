package com.example.tddproject.ch20;

public class TestResult {

  private int runCount;

  public TestResult() {
    this.runCount = 0;
  }

  public String summary() {
    return runCount + " run, 0 failed";
  }

  public void testStarted() {
    this.runCount = runCount + 1;
  }

  public int getRunCount() {
    return runCount;
  }
}
