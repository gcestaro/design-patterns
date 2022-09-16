package com.github.gcestaro.designpatterns.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class BudgetTest {

  @Test
  void compositeTest() {
    Budget gamesBudget = new Budget();
    gamesBudget.add(new BudgetItem(new BigDecimal(100)));

    Budget selfDevelopmentBudget = new Budget();
    selfDevelopmentBudget.add(new BudgetItem(new BigDecimal(400)));
    selfDevelopmentBudget.add(new BudgetItem(new BigDecimal(150)));

    Budget billsBudget = new Budget();
    billsBudget.add(new BudgetItem(new BigDecimal(1000)));
    billsBudget.add(new BudgetItem(new BigDecimal(850)));

    BudgetItem coffee = new BudgetItem(new BigDecimal(10));
    BudgetItem movies = new BudgetItem(new BigDecimal(50));

    var monthBudget = new Budget();
    monthBudget.add(billsBudget);
    monthBudget.add(selfDevelopmentBudget);
    monthBudget.add(gamesBudget);
    monthBudget.add(movies);
    monthBudget.add(coffee);

    BigDecimal monthBudgetValue = monthBudget.getValue();
    assertEquals(new BigDecimal(2560), monthBudgetValue);
  }
}