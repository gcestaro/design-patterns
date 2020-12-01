package com.github.gcestaro.chain;

import java.math.BigDecimal;

public class UnfairTax implements Tax {

	private static final BigDecimal TAX_PERCENT = BigDecimal.valueOf(0.99);

	@Override
	public BigDecimal getValue(BigDecimal amount) {
		return amount.multiply(TAX_PERCENT);
	}
}
