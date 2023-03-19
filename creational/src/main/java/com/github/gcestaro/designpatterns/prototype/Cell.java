package com.github.gcestaro.designpatterns.prototype;

public class Cell implements Prototype {

  private String plasmaMembrane;

  private String dna;

  public Cell(String plasmaMembrane, String dna) {
    this.plasmaMembrane = plasmaMembrane;
    this.dna = dna;
  }

  @Override
  public Prototype clone() {
    return new Cell(this.plasmaMembrane, this.dna);
  }

  public String getPlasmaMembrane() {
    return plasmaMembrane;
  }

  public String getDna() {
    return dna;
  }
}
