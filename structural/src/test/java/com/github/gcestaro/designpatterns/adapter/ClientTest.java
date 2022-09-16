package com.github.gcestaro.designpatterns.adapter;

import static org.mockito.ArgumentMatchers.eq;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClientTest {

  @Mock
  private EmailAdapter emailAdapter;

  @Test
  void sendEmail() {
    var mySystem = new Client(emailAdapter);
    var subject = "Test email";
    var message = "This is a test";
    mySystem.sendEmail(subject, message);

    Mockito.verify(emailAdapter).send(eq("admin@mysystem.com"), eq(subject), eq(message));
  }
}