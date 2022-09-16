package com.github.gcestaro.designpatterns.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {

  private BigDecimal value = BigDecimal.ZERO;

  private List<Budgetable> items = new ArrayList<>();

  public void add(Budgetable item) {
    this.items.add(item);
    this.value = this.value.add(item.getValue());
  }

  @Override
  public BigDecimal getValue() {
    return value;
  }
}
