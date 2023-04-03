package com.github.gcestaro.designpatterns.mediator;

public class Helicopter implements Fly {

  private ControlTower controlTower;

  @Override
  public void land() {
    if (controlTower.canLand()) {
      System.out.println("Landing");
    }
  }

  @Override
  public void liftOff() {
    Route porto = new Route("OPO-GRU");

    if (controlTower.canLiftOff(porto)) {
      System.out.println("Lifting off");
    }
  }
}
