package com.github.gcestaro.designpatterns.decorator.pizzas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PizzaDecoratorTest {

  @Test
  public void decoratorTest() {
    Pizza pizza = new CreamCheeseDecorator(new ChickenDecorator(new SimplePizza()));

    assertEquals("Pizza dough + Chicken + Cream Cheese", pizza.make());
  }
}