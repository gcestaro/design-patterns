package com.github.gcestaro.designpatterns.factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class PayrollCalculatorFactoryTest {

  @Test
  void thousandMonthlySalaryFactoryMethodTest() {
    PayrollCalculatorFactory thousandMonthlyCalc = new PayrollCalculatorFactory(
        new BigDecimal(1_000));
    NetPayrollCalculator calculator = thousandMonthlyCalc.getBillingCalculator();

    assertEquals(NetNetPayrollTaxFreeCalculator.class, calculator.getClass());
  }

  @Test
  void lessThanThousandMonthlySalaryFactoryMethodTest() {
    PayrollCalculatorFactory thousandMonthlyCalc = new PayrollCalculatorFactory(
        new BigDecimal(999));
    NetPayrollCalculator calculator = thousandMonthlyCalc.getBillingCalculator();

    assertEquals(NetNetPayrollTaxFreeCalculator.class, calculator.getClass());
  }

  @Test
  void greaterThanThousandMonthlySalaryFactoryMethodTest() {
    PayrollCalculatorFactory thousandMonthlyCalc = new PayrollCalculatorFactory(
        new BigDecimal(1_001));
    NetPayrollCalculator calculator = thousandMonthlyCalc.getBillingCalculator();

    assertEquals(NetNetPayrollWithTaxesCalculator.class, calculator.getClass());
  }
}