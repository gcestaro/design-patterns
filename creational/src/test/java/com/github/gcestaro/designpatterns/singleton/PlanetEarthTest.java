package com.github.gcestaro.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class PlanetEarthTest {

  @Test
  void singletonPlanetEarthTest() {
    PlanetEarth instance = PlanetEarth.getInstance();
    PlanetEarth instance2 = PlanetEarth.getInstance();

    assertEquals(instance, instance2); // equals
    assertSame(instance, instance2); // ==
  }

  /**
   * Sometimes, this test will pass, sometimes it won't. So, the solution isn't thread-safe
   */
  @Test
  void threadSafetyTest() throws InterruptedException {
    int threadsAmount = 500;
    Set<PlanetEarth> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

    ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

    for (int i = 0; i < threadsAmount; i++) {
      executorService.execute(() -> {
        PlanetEarth singleton = PlanetEarth.getInstance();
        singletonSet.add(singleton);
      });
    }

    executorService.shutdown();
    executorService.awaitTermination(1, TimeUnit.MINUTES);

    assertEquals(2, singletonSet.size());
  }
}