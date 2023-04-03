package com.github.gcestaro.designpatterns.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class PlanetEarthThreadSafeInnerClassTest {

  /**
   * This implementation will always have only one instance, so this test won't fail.
   */
  @Test
  void threadSafetyTest() throws InterruptedException {
    int threadsAmount = 500;
    Set<PlanetEarthThreadSafe> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

    ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

    for (int i = 0; i < threadsAmount; i++) {
      executorService.execute(() -> {
        PlanetEarthThreadSafe singleton = PlanetEarthThreadSafe.getInstance();
        singletonSet.add(singleton);
      });
    }

    executorService.shutdown();
    executorService.awaitTermination(1, TimeUnit.MINUTES);

    assertEquals(1, singletonSet.size());
  }
}