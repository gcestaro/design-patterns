package com.github.gcestaro.designpatterns.templatemethod;

import java.time.LocalDateTime;

public abstract class Log {

  private String user;

  private boolean created;

  protected Log(String user) {
    createLogFile();
    this.user = user;
  }

  private void generateHeaderLog() {
    System.out.println("Log Date:" + LocalDateTime.now());
  }

  public abstract void generateBodyLog();

  private void generateBottomLog() {
    System.out.println("Action executed by:" + user);
  }

  public void generateLog() {
    generateHeaderLog();
    generateBodyLog();
    generateBottomLog();
    verifyLogFile();
  }

  private void createLogFile() {
    System.out.println("Creating log file....");
  }

  private void verifyLogFile() {
    System.out.println("Verifying if the file and log was created.");
    created = true;
  }

  public boolean isCreated() {
    return created;
  }
}
