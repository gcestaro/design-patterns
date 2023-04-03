package com.github.gcestaro.designpatterns.visitor;

public interface ShoppingCartVisitor {

  int visit(Book book);
  int visit(Fruit fruit);
}
