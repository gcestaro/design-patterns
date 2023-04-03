package com.github.gcestaro.strategy;

public interface ProcessorStrategy<D, R> {

  R process(D data);
}
