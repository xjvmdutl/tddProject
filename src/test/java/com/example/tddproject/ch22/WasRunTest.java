package com.example.tddproject.ch22;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.util.AssertionErrors.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WasRunTest {

  private TestResult result;

  @BeforeEach
  public void setUp() {
    result = new TestResult();
  }


  @Test
  public void testTemplateMethod() {
    WasRun test = new WasRun("testMethod");
    test.run(result);
    assertThat("setUp testMethod tearDown ").isEqualTo(test.getLog());
  }

  @Test
  public void testResult() {
    WasRun test = new WasRun("testMethod");
    test.run(result);
    assertThat("1 run, 0 failed").isEqualTo(result.summary());
  }

  @Test
  public void testFailedResult() {
    WasRun test = new WasRun("testBrokenMethod");
    test.run(result);
    assertThat("1 run, 1 failed").isEqualTo(result.summary());
  }

  @Test
  public void testFailedResultFormatting() {
    TestResult result = new TestResult();
    result.testStarted();
    result.testFailed();
    assertThat("1 run, 1 failed").isEqualTo(result.summary());
  }

  @Test
  public void testSuite() {
    TestSuite suite = new TestSuite();
    suite.add(new WasRun("testMethod"));
    suite.add(new WasRun("testBrokenMethod"));
    suite.run(result);
    assertThat("2 run, 1 failed").isEqualTo(result.summary());
  }
}
