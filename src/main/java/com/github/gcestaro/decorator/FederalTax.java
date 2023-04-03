package com.github.gcestaro.decorator;

import java.math.BigDecimal;

public class FederalTax extends TaxDecorator {

  private static final BigDecimal TAX_PERCENT = BigDecimal.valueOf(0.15);

  public FederalTax() {
  }

  public FederalTax(TaxDecorator otherTax) {
    super(otherTax);
  }

  @Override
  public BigDecimal getValue(BigDecimal amount) {
    return TAX_PERCENT.multiply(amount);
  }
}
