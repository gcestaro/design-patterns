package com.github.gcestaro.designpatterns.composite;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable {

  private BigDecimal value;

  public BudgetItem(BigDecimal value) {
    this.value = value;
  }

  @Override
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }
}
