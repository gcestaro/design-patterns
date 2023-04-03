package com.github.gcestaro.designpatterns.visitor;

import java.math.BigDecimal;

public class Book implements OrderItem {

  private BigDecimal price;
  private String isbnNumber;

  public Book(BigDecimal cost, String isbn) {
    this.price = cost;
    this.isbnNumber = isbn;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

}