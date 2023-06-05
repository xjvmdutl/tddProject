package com.example.tddproject.toby.xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.core.annotation.AnnotationUtils;

public class TestSuite implements Test {

  //List<WasRun> tests = new ArrayList<>();
  //List<TestCase> tests = new ArrayList<>();
  List<Test> tests = new ArrayList<>(); //Composite 패턴을 이용해 TestSuite 타입이나, TestCase 타입 모두 test 타입으로 취급한다.

  public TestSuite(Class<? extends TestCase> testClass) {
    /*
    Arrays.stream(testClass.getMethods())
        .filter(method -> method.getName().startsWith("test"))
        .forEach(method ->
            {
              try {
                add(testClass.getConstructor(String.class).newInstance(method.getName()));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            }
        );
     */
    Arrays.stream(testClass.getMethods())
        .filter(method -> AnnotationUtils.findAnnotation(method, com.example.tddproject.toby.xunit.annotation.Test.class) != null)
        .forEach(method ->
            {
              try {
                add(testClass.getConstructor(String.class).newInstance(method.getName()));
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            }
        );
  }

  public TestSuite() {

  }

  /*
  public void add(WasRun test) {
    tests.add(test);
  }
   */
  /*
  public void add(TestCase test) {
    tests.add(test);
  }
   */
  public void add(Test test) {
    tests.add(test);
  }

  public void run(TestResult result) {
    tests.forEach(t -> {
      //Connect 파라미터 방식으로 진행해야 한다 -> 파라미터로 전달한 데이터에 계속 누적
      t.run(result);
    });
  }
}
