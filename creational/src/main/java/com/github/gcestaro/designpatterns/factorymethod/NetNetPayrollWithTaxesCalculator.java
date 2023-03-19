package com.github.gcestaro.designpatterns.factorymethod;

import java.math.BigDecimal;

public class NetNetPayrollWithTaxesCalculator implements NetPayrollCalculator {

  @Override
  public BigDecimal calculate(BigDecimal monthlySalary) {
    return monthlySalary.multiply(BigDecimal.valueOf(0.3));
  }
}
