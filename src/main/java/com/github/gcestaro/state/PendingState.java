package com.github.gcestaro.state;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PendingState implements OrderState {

  private static final BigDecimal DISCOUNT_PERCENT = BigDecimal.valueOf(0.15);

  @Override
  public void applyDiscount(Order order) {
    if (ChronoUnit.DAYS.between(order.getCreatedAt(), LocalDate.now()) > 3) {
      order.items.forEach(item -> item.discount = DISCOUNT_PERCENT.multiply(item.getPrice()));
    }
  }

  @Override
  public void approve(Order order) {
    order.state = new ApprovedState();
  }

  @Override
  public void reprove(Order order) {
    order.state = new ReprovedState();
  }

  @Override
  public void finish(Order order) {
    throw new RuntimeException(
        "Pending order must be approved or reproved before getting finished.");
  }
}
