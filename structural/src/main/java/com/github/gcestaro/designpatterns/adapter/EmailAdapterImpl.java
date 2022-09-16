package com.github.gcestaro.designpatterns.adapter;

/**
 * this class will Wrap email complexity, so the other objects don't need to know what is used to
 * handle it here. Also, we can have multiple adapters for email implementations.
 */
public class EmailAdapterImpl implements EmailAdapter {

  @Override
  public void send(String destination, String subject, String message) {
    var email = new Email(destination, subject, message);

    System.out.println("Send the email: " + email);
  }
}
