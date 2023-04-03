package com.github.gcestaro.state;

import java.math.BigDecimal;

public class ApprovedState implements OrderState {

  private static final BigDecimal DISCOUNT_PERCENT = BigDecimal.valueOf(0.05);

  @Override
  public void applyDiscount(Order order) {
    order.items.forEach(item -> item.discount = item.getPrice().multiply(DISCOUNT_PERCENT));
  }

  @Override
  public void approve(Order order) {
    throw new RuntimeException("This order has been approved already.");
  }

  @Override
  public void reprove(Order order) {
    order.state = new ReprovedState();
  }

  @Override
  public void finish(Order order) {
    order.state = new FinishedState();
  }
}
