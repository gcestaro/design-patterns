package com.github.gcestaro.designpatterns.memento;

import java.time.LocalDateTime;

public class Person {

  private String name;

  private String hairColor;

  private String mood;

  public Selfie takeSelfie() {
    return new Selfie(name, hairColor, mood, LocalDateTime.now());
  }
}
