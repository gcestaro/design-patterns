package com.github.gcestaro.designpatterns.facade;

import java.time.LocalDateTime;
import java.util.Set;

public class Receptionist {

  private HospitalService hospitalService;

  public void scheduleMedicalAppointment(Client client, ClinicalSpecialty clinicalSpecialty,
      LocalDateTime dateTime) {
    Set<Doctor> doctors = hospitalService.listAvailableDoctors(clinicalSpecialty, dateTime);

    hospitalService.schedule(doctors.stream().findAny().orElseThrow(), client, dateTime);
  }
}
