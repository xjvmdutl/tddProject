package com.example.tddproject.toby.xunit;

public class TestResult {
  int runCount = 0;

  public void testStarted(){
    runCount++;
  }

  public String getSummary() {
    return runCount + " run, 0 failed";
  }
}
