package com.github.gcestaro.designpatterns.state;

public interface OrderState {

  void open();

  void waitingPayment();

  void pay();

  void cancel();

  void finish();
}
