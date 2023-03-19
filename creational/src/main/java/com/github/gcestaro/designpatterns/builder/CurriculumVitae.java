package com.github.gcestaro.designpatterns.builder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CurriculumVitae {

  private String name;

  private String goal;

  private Set<WorkExperience> experiences;

  private Set<SkillExperience> skills;

  private Set<Skill> idioms;

  private Set<String> certifications;

  public static class Builder {

    private final CurriculumVitae cv = new CurriculumVitae();

    public Builder(String name, String goal) {
      cv.name = name;
      cv.goal = goal;
      cv.skills = new HashSet<>();
      cv.idioms = new HashSet<>();
      cv.certifications = new HashSet<>();
      cv.experiences = new LinkedHashSet<>();
    }

    public Builder withExperience(WorkExperience experience) {
      cv.experiences.add(experience);
      return this;
    }

    public Builder withExperience(String title, String description, LocalDate start,
        LocalDate end) {
      cv.experiences.add(new WorkExperience(title, description, start, end));
      return this;
    }

    public Builder withCertification(String certification) {
      cv.certifications.add(certification);
      return this;
    }

    public Builder withIdiom(Skill idiomSkill) {
      cv.idioms.add(idiomSkill);
      return this;
    }

    public Builder withIdiom(String name) {
      cv.idioms.add(new Skill(name, "Idiom"));
      return this;
    }

    public Builder withSkill(SkillExperience skill) {
      cv.skills.add(skill);
      return this;
    }

    public Builder withSkill(Skill skill, int yearsOfExperience) {
      cv.skills.add(new SkillExperience(skill, yearsOfExperience));
      return this;
    }

    public Builder withSkill(String name, String category, int yearsOfExperience) {
      cv.skills.add(new SkillExperience(new Skill(name, category), yearsOfExperience));
      return this;
    }

    public CurriculumVitae build() {
      return cv;
    }
  }

  public String getName() {
    return name;
  }

  public String getGoal() {
    return goal;
  }

  public Set<WorkExperience> getExperiences() {
    return experiences;
  }

  public Set<SkillExperience> getSkills() {
    return skills;
  }

  public Set<Skill> getIdioms() {
    return idioms;
  }

  public Set<String> getCertifications() {
    return certifications;
  }
}
