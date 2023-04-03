package com.github.gcestaro.designpatterns.strategy;

public class GoToWorkWalkingStrategy implements
    GoToWorkStrategy {

  @Override
  public void go() {
    System.out.println("I'll walk today");
  }
}
