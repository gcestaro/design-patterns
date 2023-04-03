package com.github.gcestaro.state;

public class FinishedState implements OrderState {

  @Override
  public void applyDiscount(Order order) {
    throw new RuntimeException("This order has been finished and can not have a discount applied.");
  }

  @Override
  public void approve(Order order) {
    throw new RuntimeException("This order has been finished and can not be approved.");
  }

  @Override
  public void reprove(Order order) {
    throw new RuntimeException("This order has been finished and can not be reproved.");
  }

  @Override
  public void finish(Order order) {
    throw new RuntimeException("This order has been finished already.");
  }
}
