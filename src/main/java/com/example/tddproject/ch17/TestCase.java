package com.example.tddproject.ch17;

public class TestCase {
  private String name;
  private boolean wasRun;


  public TestCase(String name) {
    this.name = name;
    this.wasRun = false;
  }
  private void testMethod() {
    this.wasRun = true;
  }

  protected boolean isWasRun() {
    return wasRun;
  }

  public void run() {
    this.testMethod();
  }
}
