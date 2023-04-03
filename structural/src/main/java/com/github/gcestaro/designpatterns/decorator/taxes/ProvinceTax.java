package com.github.gcestaro.designpatterns.decorator.taxes;

import java.math.BigDecimal;
import java.util.Optional;

public class ProvinceTax extends TaxDecorator {

  private static final BigDecimal TAX_PERCENT = BigDecimal.valueOf(0.065);

  private static final BigDecimal LIMIT_PERCENT_TO_ADD_OTHER_TAXES = BigDecimal.valueOf(2000);

  public ProvinceTax() {
  }

  public ProvinceTax(TaxDecorator otherTax) {
    super(otherTax);
  }

  @Override
  public BigDecimal getValue(BigDecimal amount) {

    BigDecimal provinceTaxValue = TAX_PERCENT.multiply(amount);

    if (LIMIT_PERCENT_TO_ADD_OTHER_TAXES.compareTo(amount) < 0) {

      Optional<BigDecimal> otherTax = getOtherTaxValue(amount);

      if (otherTax.isPresent()) {
        return provinceTaxValue.add(otherTax.get());
      }
    }

    return provinceTaxValue;
  }
}
