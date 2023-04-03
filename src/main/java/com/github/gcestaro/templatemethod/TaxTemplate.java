package com.github.gcestaro.templatemethod;

import com.github.gcestaro.chain.Tax;
import java.math.BigDecimal;

public abstract class TaxTemplate implements Tax {

  @Override
  public final BigDecimal getValue(BigDecimal amount) {

    if (useMaxTaxBasedOn(amount)) {
      return maxTax(amount);
    }

    return minTax(amount);
  }

  protected abstract BigDecimal minTax(BigDecimal amount);

  protected abstract BigDecimal maxTax(BigDecimal amount);

  protected abstract boolean useMaxTaxBasedOn(BigDecimal amount);
}
