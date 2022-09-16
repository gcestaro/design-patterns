package com.github.gcestaro.designpatterns.adapter;

public interface EmailAdapter {

  void send(String destination, String subject, String message);
}
