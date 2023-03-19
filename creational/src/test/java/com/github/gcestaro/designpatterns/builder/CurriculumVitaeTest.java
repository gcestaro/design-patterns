package com.github.gcestaro.designpatterns.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.gcestaro.designpatterns.builder.CurriculumVitae.Builder;
import org.junit.jupiter.api.Test;

class CurriculumVitaeTest {

  @Test
  void cvBuilderTest() {
    CurriculumVitae cv = new Builder("Duke", "Developer")
        .withIdiom("English")
        .withIdiom("French")
        .withSkill("Java", "Programming", 5)
        .build();

    assertEquals("Duke", cv.getName());
    assertEquals("Developer", cv.getGoal());
    assertEquals(2, cv.getIdioms().size());
    assertEquals(1, cv.getSkills().size());
    assertTrue(cv.getCertifications().isEmpty());
    assertTrue(cv.getExperiences().isEmpty());
  }
}