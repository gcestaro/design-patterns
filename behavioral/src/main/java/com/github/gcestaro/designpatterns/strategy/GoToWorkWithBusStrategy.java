package com.github.gcestaro.designpatterns.strategy;

public class GoToWorkWithBusStrategy implements
    GoToWorkStrategy {

  @Override
  public void go() {
    System.out.println("I'll take a bus");
  }
}
