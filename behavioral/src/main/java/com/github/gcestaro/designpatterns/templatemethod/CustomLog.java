package com.github.gcestaro.designpatterns.templatemethod;

public class CustomLog extends Log {

  public CustomLog(String user) {
    super(user);
  }

  @Override
  public void generateBodyLog() {
    System.out.println("Generating my custom body log..");
  }
}
