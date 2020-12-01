package com.github.gcestaro.chain;

import java.util.Optional;

import com.github.gcestaro.strategy.ProcessorStrategy;

public class Chain<D, R> implements ProcessorStrategy<D, R> {

	private final Chain<R, ?> next;

	private final ProcessorStrategy<D, R> strategy;

	public Chain(ProcessorStrategy<D, R> strategy) {
		this(strategy, null);
	}

	public Chain(ProcessorStrategy<D, R> strategy, Chain<R, ?> nextProcessor) {
		this.strategy = strategy;
		this.next = nextProcessor;
	}

	@Override
	public R process(D data) {
		R processedData = strategy.process(data);

		Optional.ofNullable(next)
				.ifPresent(next -> next.process(processedData));

		return processedData;
	}
}