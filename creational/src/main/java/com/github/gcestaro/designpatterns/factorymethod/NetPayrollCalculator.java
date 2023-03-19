package com.github.gcestaro.designpatterns.factorymethod;

import java.math.BigDecimal;

public interface NetPayrollCalculator {

  BigDecimal calculate(BigDecimal monthlySalary);
}
