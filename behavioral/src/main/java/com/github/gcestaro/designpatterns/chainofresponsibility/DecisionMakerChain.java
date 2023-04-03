package com.github.gcestaro.designpatterns.chainofresponsibility;

public abstract class DecisionMakerChain implements DecisionMaker {

  protected DecisionMakerChain next;

  protected DecisionMakerChain() {
    this(null);
  }

  protected DecisionMakerChain(DecisionMakerChain next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}
