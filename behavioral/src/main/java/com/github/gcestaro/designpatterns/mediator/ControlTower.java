package com.github.gcestaro.designpatterns.mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ControlTower {

  private Map<Route, Fly> flyingRoute;

  private boolean isLandAvailable;

  public ControlTower() {
    flyingRoute = new ConcurrentHashMap<>();
  }

  boolean canLand() {
    boolean isLandAvailable = this.isLandAvailable;
    this.isLandAvailable = !this.isLandAvailable;
    return isLandAvailable;
  }
}
