package com.github.gcestaro.designpatterns.strategy;

public class GoToWorkWithUberStrategy implements
    GoToWorkStrategy {

  @Override
  public void go() {
    System.out.println("I'll take an uber");
  }
}
