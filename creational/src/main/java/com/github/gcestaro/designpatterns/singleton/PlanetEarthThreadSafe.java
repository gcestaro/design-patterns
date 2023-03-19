package com.github.gcestaro.designpatterns.singleton;

public class PlanetEarthThreadSafe {

  private static volatile PlanetEarthThreadSafe earth;

  private PlanetEarthThreadSafe() {
  }

  public static PlanetEarthThreadSafe getInstance() {
    if (earth == null) {
      synchronized (PlanetEarthThreadSafe.class) {
        if (earth == null) {
          earth = new PlanetEarthThreadSafe();
        }
      }
    }
    return earth;
  }
}
