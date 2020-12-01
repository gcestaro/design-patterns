package com.github.gcestaro.templatemethod;

import java.math.BigDecimal;

import com.github.gcestaro.chain.Tax;

public abstract class TaxTemplate implements Tax {

	@Override
	public BigDecimal getValue(BigDecimal amount) {

		if (useMaxTaxBasedOn(amount)) {
			return maxTax(amount);
		}

		return minTax(amount);
	}

	protected abstract BigDecimal minTax(BigDecimal amount);

	protected abstract BigDecimal maxTax(BigDecimal amount);

	protected abstract boolean useMaxTaxBasedOn(BigDecimal amount);
}
