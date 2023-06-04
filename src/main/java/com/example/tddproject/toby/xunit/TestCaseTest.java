package com.example.tddproject.toby.xunit;

public class TestCaseTest extends TestCase {

  public TestCaseTest(String name) {
    super(name);
  }

  //WasRun wasRun;

  @Override
  public void setUp() {
    //wasRun = new WasRun("testMethod");
  }
  /*
  public void testRunning() {
    Assert.assertEquals(false, wasRun.wasRun);
    wasRun.run();
    Assert.assertEquals("setUp testMethod", wasRun.log);
    Assert.assertEquals(true, wasRun.wasRun);
  }

  public void testSetUp() {
    Assert.assertEquals(false, wasRun.wasSetUp);
    wasRun.run();
    Assert.assertEquals("setUp testMethod", wasRun.log);
    Assert.assertEquals(true, wasRun.wasSetUp);
  }
   */
  public void testTemplateMethod() {
    WasRun wasRun = new WasRun("testMethod");
    wasRun.run();
    Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
  }

  public void testResult(){
    WasRun wasRun = new WasRun("testMethod");
    TestResult result = wasRun.run();
    Assert.assertEquals("1 run, 0 failed", result.getSummary());
  }
}
