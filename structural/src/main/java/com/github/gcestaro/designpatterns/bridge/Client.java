package com.github.gcestaro.designpatterns.bridge;

public class Client {

  public void use(Device device) {
    var basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();
  }
}
