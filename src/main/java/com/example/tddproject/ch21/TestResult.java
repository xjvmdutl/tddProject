package com.example.tddproject.ch21;

public class TestResult {

  private int runCount;
  private int failureCount;

  public TestResult() {
    this.runCount = 0;
    this.failureCount = 0;
  }

  public String summary() {
    return runCount + " run, " + failureCount + " failed";
  }

  public void testStarted() {
    this.runCount = runCount + 1;
  }

  public void testFailed() {
    this.failureCount = this.failureCount + 1;
  }

  public int getRunCount() {
    return runCount;
  }

  public int getFailureCount() {
    return failureCount;
  }
}
