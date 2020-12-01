package com.github.gcestaro.strategy;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;

import com.github.gcestaro.chain.Tax;

public class ProcessorStrategyMinTaxExample implements ProcessorStrategy<BigDecimal, BigDecimal> {

	private static final BigDecimal MIN_PERCENT = BigDecimal.valueOf(0.075);

	private final Tax tax;

	public ProcessorStrategyMinTaxExample(Tax tax) {
		this.tax = requireNonNull(tax);
	}

	@Override
	public BigDecimal process(BigDecimal amount) {
		BigDecimal value = tax.getValue(amount);

		BigDecimal minTaxAmount = amount.multiply(MIN_PERCENT);

		if (value.compareTo(minTaxAmount) > 0) {
			return value;
		}

		return minTaxAmount;
	}
}
