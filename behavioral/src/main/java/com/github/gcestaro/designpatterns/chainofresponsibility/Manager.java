package com.github.gcestaro.designpatterns.chainofresponsibility;

public class Manager extends DecisionMakerChain {

  public Manager(DecisionMakerChain next) {
    super(next);
  }

  @Override
  public void decide(Problem problem) {
    if (problem.context() == Context.OPERATIONAL || problem.context() == Context.TACTICAL) {
      System.out.println(this + " - I'll handle this problem: " + problem.description());
      return;
    }

    next.decide(problem);
  }
}
