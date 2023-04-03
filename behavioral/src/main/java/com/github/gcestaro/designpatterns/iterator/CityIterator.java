package com.github.gcestaro.designpatterns.iterator;

import java.util.Collection;
import java.util.Iterator;

public class CityIterator implements Iterator<TouristAttraction> {

  private final Collection<TouristAttraction> attractions;

  public CityIterator(City city) {
    this.attractions = city.getAttractions();
  }

  @Override
  public boolean hasNext() {
    return !attractions.isEmpty();
  }

  @Override
  public TouristAttraction next() {
    TouristAttraction any = attractions.stream().findAny()
        .orElse(null);

    attractions.remove(any);

    return any;
  }
}
