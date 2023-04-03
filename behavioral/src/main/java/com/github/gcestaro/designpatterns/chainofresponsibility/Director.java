package com.github.gcestaro.designpatterns.chainofresponsibility;

public class Director extends DecisionMakerChain {

  public Director() {
  }

  public Director(DecisionMakerChain next) {
    super(next);
  }

  @Override
  public void decide(Problem problem) {
    if (problem.context() == Context.STRATEGICAL) {
      System.out.println(this + " - I'll handle this problem: " + problem.description());
      return;
    }

    next.decide(problem);
  }
}
