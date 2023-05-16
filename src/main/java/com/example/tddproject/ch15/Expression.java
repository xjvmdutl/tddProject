package com.example.tddproject.ch15;

public interface Expression {
  Money reduce(Bank bank, String to);

  Expression plus(Expression addend);
}
