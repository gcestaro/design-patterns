package com.github.gcestaro.templatemethod;

import java.math.BigDecimal;

public class CreativeTax extends TaxTemplate {

	private static final BigDecimal MAX_TAX_PERCENT = BigDecimal.valueOf(0.275);

	private static final BigDecimal MIN_TAX_PERCENT = BigDecimal.valueOf(0.075);

	private static final BigDecimal MAX_TAX_BASE = BigDecimal.valueOf(5000);

	@Override
	protected BigDecimal minTax(BigDecimal amount) {
		return amount.multiply(MIN_TAX_PERCENT);
	}

	@Override
	protected BigDecimal maxTax(BigDecimal amount) {
		return amount.multiply(MAX_TAX_PERCENT);
	}

	@Override
	protected boolean useMaxTaxBasedOn(BigDecimal amount) {
		return MAX_TAX_BASE.compareTo(amount) < 0;
	}
}
