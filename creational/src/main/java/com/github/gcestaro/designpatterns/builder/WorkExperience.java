package com.github.gcestaro.designpatterns.builder;

import java.time.LocalDate;

public class WorkExperience {

  private String title;

  private String description;

  private LocalDate start;

  private LocalDate end;

  public WorkExperience(String title, String description, LocalDate start, LocalDate end) {
    this.title = title;
    this.description = description;
    this.start = start;
    this.end = end;
  }
}
