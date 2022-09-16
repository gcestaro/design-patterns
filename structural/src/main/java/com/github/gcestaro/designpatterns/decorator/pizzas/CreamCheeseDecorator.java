package com.github.gcestaro.designpatterns.decorator.pizzas;

public class CreamCheeseDecorator extends PizzaDecorator {

  public CreamCheeseDecorator(Pizza customPizza) {
    super(customPizza);
  }

  public String make() {
    return customPizza.make() + addCreamCheese();
  }

  private String addCreamCheese() {
    return " + Cream Cheese";
  }
}