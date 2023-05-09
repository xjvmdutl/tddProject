package com.example.tddproject.ch10;


public class Money {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Dollar dollar(int amount){
    return new Dollar(amount,"USD");
  }
  public static Franc franc(int amount){
    return new Franc(amount, "CHF");
  }
  public String currency(){
    return currency;
  }
  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }
  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    //return amount == money.amount && getClass().equals(money.getClass());
    return amount == money.amount && currency().equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
