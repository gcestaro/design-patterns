package com.github.gcestaro.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Team {

  private Set<Player> players = new HashSet<>();

  private Object state;

  public void add(Player player) {
    players.add(player);
  }

  public void remove(Player player) {
    players.remove(player);
  }

  public void notifyPlayers() {
    players.forEach(player -> player.update(this));
  }

  public void update() {
    state = new Object();
    notifyPlayers();
  }
}
