package com.github.gcestaro.designpatterns.builder;

public class SkillExperience {

  private Skill skill;

  private int yearsOfExperience;

  public SkillExperience(Skill skill, int yearsOfExperience) {
    this.skill = skill;
    this.yearsOfExperience = yearsOfExperience;
  }
}
