package com.example.tddproject.ch12;


public class Money implements Expression{

  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public String currency() {
    return currency;
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  /*
  public Money plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }
   */
  public Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
