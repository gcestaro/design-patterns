package com.github.gcestaro.observer;

import com.github.gcestaro.builder.Product;

public interface ProductCreationObserver {

	void execute(Product product);
}
