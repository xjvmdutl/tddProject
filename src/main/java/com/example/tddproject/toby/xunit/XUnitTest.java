package com.example.tddproject.toby.xunit;


public class XUnitTest {

  public static void main(String[] args) {
    /*
    WasRun wasRun = new WasRun("testMethod");
    System.out.println(wasRun.wasRun);//실행 되었는지 검증 //false
    wasRun.run();
    System.out.println(wasRun.wasRun); // true
     */
    /*
    new TestCaseTest("testRunning").run();
    new TestCaseTest("testSetUp").run();
    */
    /*
    TestResult result = new TestResult();
    new TestCaseTest("testTemplateMethod").run(result);
    new TestCaseTest("testResult").run(result);
    new TestCaseTest("testFailedResultFormatting").run(result);
    new TestCaseTest("testFailedResult").run(result);
    new TestCaseTest("testSuite").run(result);
    System.out.println(result.getSummary());
     */

    TestSuite suite = TestCaseTest.suite();
    TestResult result = new TestResult();
    suite.run(result);
    System.out.println(result.getSummary());

    //Compose 패턴을 적용
    TestSuite suite2 = new TestSuite();
    suite2.add(new TestCaseTest("testTemplateMethod"));
    suite2.add(suite);
    suite2.add(suite);
    suite2.add(suite);
    TestResult result2 = new TestResult();
    suite2.run(result2);
    System.out.println(result2.getSummary());
  }
}
