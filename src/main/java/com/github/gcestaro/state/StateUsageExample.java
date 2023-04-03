package com.github.gcestaro.state;

public class StateUsageExample {

  public void example() {
    Order order = new Order();
    order.applyDiscount();
    order.approve();
    order.applyDiscount();
    order.finish();
  }
}
