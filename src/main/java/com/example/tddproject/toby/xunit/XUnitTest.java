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
    new TestCaseTest("testTemplateMethod").run();
    new TestCaseTest("testResult").run();

  }
}
