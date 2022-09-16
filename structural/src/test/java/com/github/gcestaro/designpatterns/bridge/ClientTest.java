package com.github.gcestaro.designpatterns.bridge;

import org.junit.jupiter.api.Test;

class ClientTest {

  @Test
  void testDevice() {
    var client = new Client();
    var radio = new Radio();
    var tv = new Tv();
    client.use(radio);
    client.use(tv);
  }
}