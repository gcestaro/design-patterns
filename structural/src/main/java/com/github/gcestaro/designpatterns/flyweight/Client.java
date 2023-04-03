package com.github.gcestaro.designpatterns.flyweight;

import java.util.Set;

public class Client {

  public static void main(String[] args) {
    Set<MusicalNote> music = Set.of(
        NoteFlyweight.notes.get("sol"),
        NoteFlyweight.notes.get("la"),
        NoteFlyweight.notes.get("si"),
        NoteFlyweight.notes.get("la"),
        NoteFlyweight.notes.get("sol"),
        NoteFlyweight.notes.get("la"),
        NoteFlyweight.notes.get("re")
    );
  }
}
