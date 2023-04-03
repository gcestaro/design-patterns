package com.github.gcestaro.designpatterns.iterator;

import java.util.Collection;

public class City {

  private Collection<TouristAttraction> attractions;

  public void visit() {
    CityIterator iterator = new CityIterator(this);
    while (iterator.hasNext()) {
      TouristAttraction attraction = iterator.next();
      System.out.println("visiting " + attraction);
    }
  }

  public Collection<TouristAttraction> getAttractions() {
    return attractions;
  }
}
