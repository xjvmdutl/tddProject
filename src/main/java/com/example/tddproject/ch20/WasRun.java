package com.example.tddproject.ch20;

public class WasRun extends TestCase {


  public WasRun(String name) {
    super(name);
  }

  public boolean isWasRun() {
    return super.isWasRun();
  }

  public void testBrokenMethod() throws Exception {
    throw new Exception();
  }

}
