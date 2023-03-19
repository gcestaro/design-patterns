package com.github.gcestaro.designpatterns.singleton;

public class PlanetEarth {

  private static PlanetEarth earth;

  private PlanetEarth() {
  }

  public static PlanetEarth getInstance() {
    if (earth == null) {
      earth = new PlanetEarth();
    }
    return earth;
  }
}
