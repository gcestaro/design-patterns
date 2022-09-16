package com.github.gcestaro.designpatterns.facade;

import java.time.LocalDateTime;
import java.util.Set;

public class HospitalService {

  public Set<Doctor> listAvailableDoctors(ClinicalSpecialty clinicalSpecialty,
      LocalDateTime dateTime) {
    System.out.println(
        "Finding a Doctor available for the informed time: " + dateTime + ", and specialty: "
            + clinicalSpecialty);

    return Set.of(new Doctor("Julian", "12345"),
        new Doctor("Julia", "23445"));
  }

  public void schedule(Doctor doctor, Client client, LocalDateTime dateTime) {
    System.out.println("Scheduling an appointment for: " + client.getName()
        + " with Doctor " + doctor.getName()
        + " at " + dateTime);
  }
}
