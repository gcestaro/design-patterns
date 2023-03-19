package com.github.gcestaro.designpatterns.singleton;

public class PlanetEarthThreadSafeInnerClass {

  private PlanetEarthThreadSafeInnerClass() {
  }

  public static PlanetEarthThreadSafeInnerClass getInstance() {
    return PlanetEarthHolder.planetEarth;
  }

  /**
   * Although it may look like eager initialization, it is lazy due to inner class loads only when
   * used by the public class.
   * <p>
   * Checkout this <a
   * href="https://stackoverflow.com/questions/46542017/java-singleton-with-an-inner-class-what-guarantees-thread-safety">thread</a>
   * on StackOverFlow for more details.
   */
  private static final class PlanetEarthHolder {

    private static final PlanetEarthThreadSafeInnerClass planetEarth = new PlanetEarthThreadSafeInnerClass();
  }
}
