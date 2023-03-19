package com.github.gcestaro.designpatterns.factorymethod;

import java.math.BigDecimal;

public class NetNetPayrollTaxFreeCalculator implements NetPayrollCalculator {

  @Override
  public BigDecimal calculate(BigDecimal monthlySalary) {
    return monthlySalary;
  }
}
