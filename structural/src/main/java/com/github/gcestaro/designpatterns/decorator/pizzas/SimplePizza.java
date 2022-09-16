package com.github.gcestaro.designpatterns.decorator.pizzas;

public class SimplePizza implements Pizza {

  @Override
  public String make() {
    return "Pizza dough";
  }
}