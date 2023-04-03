package com.github.gcestaro.designpatterns.proxy;

import java.util.Set;

public class BankAccount {

  private Set<Gold> goldStore;

  public boolean deposit(Cash cash) {
    return true;
  }

  public boolean withdraw(Cash amount) {
    return false;
  }
}
