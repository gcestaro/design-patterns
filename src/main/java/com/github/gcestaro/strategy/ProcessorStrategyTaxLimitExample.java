package com.github.gcestaro.strategy;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;

import com.github.gcestaro.chain.Tax;

public class ProcessorStrategyTaxLimitExample implements ProcessorStrategy<BigDecimal, BigDecimal> {

	private static final BigDecimal MAX_PERCENT = BigDecimal.valueOf(0.3);

	private final Tax tax;

	public ProcessorStrategyTaxLimitExample(Tax tax) {
		this.tax = requireNonNull(tax);
	}

	@Override
	public BigDecimal process(BigDecimal amount) {
		BigDecimal value = tax.getValue(amount);

		BigDecimal maxTaxAmount = amount.multiply(MAX_PERCENT);

		if (value.compareTo(maxTaxAmount) > 0) {
			return maxTaxAmount;
		}

		return value;
	}
}
