package com.github.gcestaro.designpatterns.flyweight;

public class MusicalNote {

  private final String name;

  public MusicalNote(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "MusicalNote{" +
        "name='" + name + '\'' +
        '}';
  }
}
