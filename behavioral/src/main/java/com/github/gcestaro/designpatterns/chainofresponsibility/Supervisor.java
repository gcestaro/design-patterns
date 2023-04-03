package com.github.gcestaro.designpatterns.chainofresponsibility;

public class Supervisor extends DecisionMakerChain {

  public Supervisor(DecisionMakerChain next) {
    super(next);
  }

  @Override
  public void decide(Problem problem) {
    if (problem.context() == Context.OPERATIONAL) {
      System.out.println(this + " - I'll handle this problem: " + problem.description());
      return;
    }

    next.decide(problem);
  }
}
