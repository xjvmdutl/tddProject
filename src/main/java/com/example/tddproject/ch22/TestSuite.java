package com.example.tddproject.ch22;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

  private List<WasRun> tests;

  private TestResult result;
  public TestSuite() {
    this.tests = new ArrayList<>();
  }

  public void add(WasRun test){
    this.tests.add(test);
  }

  /*
  public TestResult run(){
    this.result = new TestResult();
    for (WasRun test : tests) {
      test.run(result);
    }
    return result;
  }
   */
  public void run(TestResult result){
    for (WasRun test : tests) {
      test.run(result);
    }
  }
}
