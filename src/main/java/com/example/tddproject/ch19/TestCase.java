package com.example.tddproject.ch19;

public class TestCase {
  private String name;
  private boolean wasRun;
  private Boolean wasSetup;

  private String log;

  public TestCase(String name) {
    this.name = name;
    this.wasRun = false;
  }
  private void testMethod() {
    this.wasRun = true;
    this.log = this.log + "testMethod ";
  }
  private void tearDown() {
    this.log = this.log + "tearDown ";
  }

  protected boolean isWasRun() {
    return wasRun;
  }

  public void run() {
    this.setUp();
    this.testMethod();
    this.tearDown();
  }


  protected void setUp() {
    //this.wasSetup = true;
    this.wasRun = false;
    this.log = "setUp ";
  }

  public boolean getWasSetUp() {
    return wasSetup;
  }

  public String getLog() {
    return log;
  }
}
