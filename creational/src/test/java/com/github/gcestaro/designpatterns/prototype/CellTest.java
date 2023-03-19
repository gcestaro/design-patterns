package com.github.gcestaro.designpatterns.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CellTest {

  @Test
  void prototypeTest() {
    Cell cell = new Cell("Plasma membrane", "DNA");

    Prototype clone = cell.clone();

    assertEquals(Cell.class, clone.getClass());

    Cell cloneAsCell = (Cell) clone;
    assertEquals(cell.getPlasmaMembrane(), cloneAsCell.getPlasmaMembrane());
    assertEquals(cell.getDna(), cloneAsCell.getDna());
  }
}