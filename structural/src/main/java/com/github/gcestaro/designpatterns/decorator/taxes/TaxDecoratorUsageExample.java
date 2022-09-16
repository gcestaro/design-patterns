package com.github.gcestaro.designpatterns.decorator.taxes;

import java.math.BigDecimal;

public class TaxDecoratorUsageExample {

  public void decorateTaxesWithOtherTaxes() {
    CityTax cityTax = new CityTax(new ProvinceTax(new FederalTax()));

    cityTax.getValue(BigDecimal.valueOf(1045));
  }
}
