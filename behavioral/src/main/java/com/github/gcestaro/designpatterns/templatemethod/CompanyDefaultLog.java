package com.github.gcestaro.designpatterns.templatemethod;

public class CompanyDefaultLog extends
    Log {

  protected CompanyDefaultLog(String user) {
    super(user);
  }

  @Override
  public void generateBodyLog() {
    System.out.println("Generating Company's default body log..");
  }
}
