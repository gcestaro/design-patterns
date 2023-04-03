package com.github.gcestaro.designpatterns.strategy;

import java.util.HashSet;
import java.util.Set;

public class Person {

  private Context context;

  private Set<GoToWorkStrategy> strategies = new HashSet<>();

  public void goToWork() {
    context.getStrategy().go();
  }
}
