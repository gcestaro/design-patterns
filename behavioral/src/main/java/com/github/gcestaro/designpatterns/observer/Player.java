package com.github.gcestaro.designpatterns.observer;

public class Player {

  private Team team;

  public void update(Team team) {
    this.team = team;
  }
}
