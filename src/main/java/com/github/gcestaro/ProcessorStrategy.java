package com.github.gcestaro;

public interface ProcessorStrategy<D, R> {

    R process(D data);
}
