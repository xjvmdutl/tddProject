package com.example.tddproject.ch18;

public class TestCase {
  private String name;
  private boolean wasRun;
  private Boolean wasSetup;


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
    this.setUp();
    this.testMethod();
  }

  protected void setUp() {
    this.wasSetup = true;
    this.wasRun = false;
  }

  public boolean getWasSetUp() {
    return wasSetup;
  }
}
