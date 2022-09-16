package com.github.gcestaro.designpatterns.adapter;

public class Client {

  private final EmailAdapter emailAdapter;

  public Client(EmailAdapter emailAdapter) {
    this.emailAdapter = emailAdapter;
  }

  public void sendEmail(String subject, String message) {
    emailAdapter.send("admin@mysystem.com", subject, message);
  }
}
