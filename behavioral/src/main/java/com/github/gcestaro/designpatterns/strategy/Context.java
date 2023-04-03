package com.github.gcestaro.designpatterns.strategy;

import java.lang.reflect.InvocationTargetException;

public enum Context {
  WARM_RAINING(GoToWorkWithOwnCarStrategy.class),
  COULD_RAINING(GoToWorkFromHomeStrategy.class),
  WARM_SUN(GoToWorkWalkingStrategy.class),
  COLD_SUN(GoToWorkWithUberStrategy.class),
  WARM_CLOUDY(GoToWorkWithBusStrategy.class),
  COLD_CLOUDY(GoToWorkFromHomeStrategy.class);

  private final GoToWorkStrategy strategy;

  Context(Class<? extends GoToWorkStrategy> strategyClass) {
    try {
      this.strategy = strategyClass.getDeclaredConstructor().newInstance();
    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
             InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }

  public GoToWorkStrategy getStrategy() {
    return strategy;
  }
}
