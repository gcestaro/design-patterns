package com.github.gcestaro.designpatterns.strategy;

public class GoToWorkWithOwnCarStrategy implements
    GoToWorkStrategy {

  @Override
  public void go() {
    System.out.println("I'll drive");
  }
}
