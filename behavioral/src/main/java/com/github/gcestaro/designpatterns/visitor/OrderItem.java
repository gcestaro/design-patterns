package com.github.gcestaro.designpatterns.visitor;

public interface OrderItem {

  int accept(ShoppingCartVisitor visitor);
}
