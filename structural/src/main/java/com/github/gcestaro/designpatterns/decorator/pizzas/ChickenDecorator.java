package com.github.gcestaro.designpatterns.decorator.pizzas;

public class ChickenDecorator extends PizzaDecorator {

  public ChickenDecorator(Pizza pizza) {
    super(pizza);
  }

  public String make() {
    return customPizza.make() + addChicken();
  }

  private String addChicken() {
    return " + Chicken";
  }
}