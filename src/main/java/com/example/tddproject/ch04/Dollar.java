package com.example.tddproject.ch04;

public class Dollar {
  private int amount; //Dollar의 amount 인스턴스 변수를 사용하는 코드가 Dollar 자신밖에 없다.

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }
}
