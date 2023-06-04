package com.example.tddproject.toby.xunit;


import com.example.tddproject.toby.xunit.annotation.Test;

public class TestCaseTest extends TestCase {

  public TestCaseTest(String name) {
    super(name);
  }

  public static TestSuite suite() {
    /*
    TestSuite suite = new TestSuite();
    suite.add(new TestCaseTest("testTemplateMethod"));
    suite.add(new TestCaseTest("testResult"));
    suite.add(new TestCaseTest("testFailedResultFormatting"));
    suite.add(new TestCaseTest("testFailedResult"));
    suite.add(new TestCaseTest("testSuite"));
     */
    //앞에 이름이 test로 시작하면 모두 test로 실행하자 -> 현재는 어노테이션으로 변경되었다.
    return new TestSuite(TestCaseTest.class);
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

  @Test
  public void testTemplateMethod() {
    WasRun wasRun = new WasRun("testMethod");
    TestResult result = new TestResult();
    wasRun.run(result);
    Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
  }
  @Test
  public void testResult() {
    WasRun wasRun = new WasRun("testMethod");
    TestResult result = new TestResult();
    wasRun.run(result);
    Assert.assertEquals("1 run, 0 failed", result.getSummary());
  }



  @Test
  public void testFailedResultFormatting() {
    TestResult result = new TestResult();
    result.testStarted();
    result.testFailed();
    Assert.assertEquals("1 run, 1 failed", result.getSummary());
  }



  @Test
  public void testFailedResult() {
    WasRun wasRun = new WasRun("testBrokenMethod"); //해당 메서드 실행시 예외를 발생시켜 준다.
    TestResult result = new TestResult();
    wasRun.run(result);
    Assert.assertEquals("1 run, 1 failed", result.getSummary());
  }

  @Test
  public void testSuite() {
    TestSuite suite = new TestSuite();
    suite.add(new WasRun("testMethod"));
    suite.add(new WasRun("testBrokenMethod"));
    TestResult result = new TestResult();
    suite.run(result);
    Assert.assertEquals("2 run, 1 failed", result.getSummary());
  }
}
