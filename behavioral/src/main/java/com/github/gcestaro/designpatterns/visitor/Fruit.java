package com.github.gcestaro.designpatterns.visitor;

import java.math.BigDecimal;

public class Fruit implements OrderItem {

  private BigDecimal pricePerKg;
  private int weight;
  private String name;

  public Fruit(BigDecimal priceKg, int wt, String nm) {
    this.pricePerKg = priceKg;
    this.weight = wt;
    this.name = nm;
  }

  public BigDecimal getPricePerKg() {
    return pricePerKg;
  }


  public int getWeight() {
    return weight;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
