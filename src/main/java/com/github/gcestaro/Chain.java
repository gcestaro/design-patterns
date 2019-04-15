package com.github.gcestaro;

import java.util.Optional;

public class Chain<D, R> implements ProcessorStrategy<D, R> {

    private Optional<Chain<R, ?>> next;

    private final ProcessorStrategy<D, R> strategy;

    public Chain(ProcessorStrategy<D, R> strategy) {
        this(strategy, null);
    }

    public Chain(ProcessorStrategy<D, R> strategy, Chain<R, ?> nextProcessor) {
        this.strategy = strategy;
        this.next = Optional.ofNullable(nextProcessor);
    }

    @Override
    public R process(D data) {
        R processedData = strategy.process(data);

        next.ifPresent(next -> next.process(processedData));

        return processedData;
    }
}