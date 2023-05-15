package com.example.tddproject.ch14;


public class Money implements Expression {

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


  public Expression plus(Money addend) {
    return new Sum(this, addend);
  }
  @Override
  public Money reduce(Bank bank, String to) {
    //int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
    int rate = bank.rate(currency, to);
    return new Money(amount / rate, to);
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