package com.github.gcestaro.templatemethod;

import java.math.BigDecimal;

public class UnfortunateTax extends TaxTemplate {

	private static final BigDecimal REDUCE_AMOUNT_PERCENT = BigDecimal.valueOf(0.9);

	private static final BigDecimal MAX_TAX_PERCENT = BigDecimal.valueOf(0.4);

	private static final BigDecimal MIN_TAX_PERCENT = BigDecimal.valueOf(0.1);

	private static final BigDecimal MAX_TAX_BASE = BigDecimal.valueOf(2000);

	@Override
	protected BigDecimal minTax(BigDecimal amount) {
		return amount
				.multiply(REDUCE_AMOUNT_PERCENT)
				.multiply(MIN_TAX_PERCENT);
	}

	@Override
	protected BigDecimal maxTax(BigDecimal amount) {
		return amount
				.multiply(REDUCE_AMOUNT_PERCENT)
				.multiply(MAX_TAX_PERCENT);
	}

	@Override
	protected boolean useMaxTaxBasedOn(BigDecimal amount) {
		return MAX_TAX_BASE.compareTo(amount) < 0 && amount.intValue() % 2 == 1;
	}
}
