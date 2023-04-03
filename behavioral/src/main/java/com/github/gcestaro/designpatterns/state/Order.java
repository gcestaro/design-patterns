package com.github.gcestaro.designpatterns.state;

import java.util.Set;

public class Order {

  private OrderState state;

  private Set<OrderItem> items;

  public void setState(OrderState state) {
    this.state = state;
  }

  public void open() {
    state.open();
  }

  public void waitPayment() {
    state.waitingPayment();
  }

  public void pay() {
    state.pay();
  }

  public void cancel() {
    state.cancel();
  }

  public void finish() {
    state.finish();
  }
}
