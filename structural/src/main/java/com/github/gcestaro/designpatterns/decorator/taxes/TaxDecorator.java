package com.github.gcestaro.designpatterns.decorator.taxes;

import java.math.BigDecimal;
import java.util.Optional;

public abstract class TaxDecorator {

  private final TaxDecorator otherTax;

  public TaxDecorator(TaxDecorator otherTax) {
    this.otherTax = otherTax;
  }

  public TaxDecorator() {
    this(null);
  }

  public abstract BigDecimal getValue(BigDecimal amount);

  protected Optional<TaxDecorator> getOtherTax() {
    return Optional.ofNullable(otherTax);
  }

  protected Optional<BigDecimal> getOtherTaxValue(BigDecimal amount) {
    return getOtherTax()
        .map(other -> other.getValue(amount));
  }
}
