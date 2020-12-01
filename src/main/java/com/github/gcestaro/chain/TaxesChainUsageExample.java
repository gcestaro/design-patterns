package com.github.gcestaro.chain;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;

import com.github.gcestaro.strategy.ProcessorStrategyMinTaxExample;
import com.github.gcestaro.strategy.ProcessorStrategyTaxLimitExample;

public class TaxesChainUsageExample {

	private final BigDecimal amount;

	public TaxesChainUsageExample(BigDecimal amount) {
		this.amount = requireNonNull(amount);
	}

	public BigDecimal calculateTax() {

		BigDecimal taxesAmount = new Chain<>(new ProcessorStrategyTaxLimitExample(new UnfairTax()),
				new Chain<>(new ProcessorStrategyMinTaxExample(new FairTax())))
						.process(amount);

		return amount.subtract(taxesAmount);
	}
}
