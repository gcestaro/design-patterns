package com.github.gcestaro.designpatterns.factorymethod;

import java.math.BigDecimal;

public class PayrollCalculatorFactory {

  private final BigDecimal monthlySalary;

  public PayrollCalculatorFactory(BigDecimal monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public NetPayrollCalculator getBillingCalculator() {
    if (monthlySalary.compareTo(new BigDecimal(1_000)) > 0) {
      return new NetNetPayrollWithTaxesCalculator();
    }

    return new NetNetPayrollTaxFreeCalculator();
  }
}
