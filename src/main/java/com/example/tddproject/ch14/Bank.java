package com.example.tddproject.ch14;

import java.util.Hashtable;

public class Bank {

  private Hashtable rates = new Hashtable();

  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  public int rate(String from, String to) {
    //return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    if(from.equals(to)) return 1;
    Integer rate = (Integer) rates.get(new Pair(from, to));
    return rate.intValue();
  }

  public void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), Integer.valueOf(rate));
  }
}

