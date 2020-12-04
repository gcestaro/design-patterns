package com.github.gcestaro.decorator;

import java.math.BigDecimal;
import java.util.Optional;

public class CityTax extends TaxDecorator {

	private static final BigDecimal TAX_PERCENT = BigDecimal.valueOf(0.05);

	public CityTax() {
	}

	public CityTax(TaxDecorator otherTax) {
		super(otherTax);
	}

	@Override
	public BigDecimal getValue(BigDecimal amount) {
		BigDecimal cityTaxValue = TAX_PERCENT.multiply(amount);

		Optional<BigDecimal> otherTax = getOtherTaxValue(amount);

		if (otherTax.isPresent()) {
			return cityTaxValue.add(otherTax.get());
		}

		return cityTaxValue;
	}
}
