package com.github.gcestaro.designpatterns.strategy;

public class GoToWorkFromHomeStrategy implements
    GoToWorkStrategy {

  @Override
  public void go() {
    System.out.println("Home office today");
  }
}
