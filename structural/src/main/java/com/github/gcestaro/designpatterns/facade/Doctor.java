package com.github.gcestaro.designpatterns.facade;

import java.util.HashSet;
import java.util.Set;

public class Doctor {

  private String name;

  private String license;

  private Set<ClinicalSpecialty> specialties;

  public Doctor(String name, String license) {
    this.name = name;
    this.license = license;
    this.specialties = new HashSet<>();
    this.specialties.add(ClinicalSpecialty.GENERAL);
  }

  public String getName() {
    return name;
  }
}
