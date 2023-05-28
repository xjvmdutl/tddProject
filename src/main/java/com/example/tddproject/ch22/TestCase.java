package com.example.tddproject.ch22;

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

  public TestResult run(TestResult result) {
    result.testStarted();
    this.setUp();
    try{
      this.testMethod();
    }catch (Exception e){
      result.testFailed();
    }
    this.tearDown();
    //return new TestResult();
    return result;
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
