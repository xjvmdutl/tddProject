package com.example.tddproject.ch14;

public interface Expression {
  Money reduce(Bank bank, String to);
}
