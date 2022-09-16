package com.github.gcestaro.designpatterns.decorator.pizzas;

public abstract class PizzaDecorator implements Pizza {

  protected Pizza customPizza;

  public PizzaDecorator(Pizza customPizza) {
    this.customPizza = customPizza;
  }

  public String make() {
    return customPizza.make();
  }
}
