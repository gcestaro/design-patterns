package com.github.gcestaro.designpatterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ComputerFactoryTest {

  @Test
  void pcFactoryTest() {
    PCFactory pcFactory = new PCFactory("16 GB", "1 TB", "3.6 GHz");
    Computer pc = ComputerFactory.getComputer(pcFactory);

    assertEquals(PC.class, pc.getClass());
  }

  @Test
  void serverFactoryTest() {
    ServerFactory serverFactory = new ServerFactory("64 GB", "2 TB", "3.6 GHz");
    Computer server = ComputerFactory.getComputer(serverFactory);

    assertEquals(Server.class, server.getClass());
  }
}