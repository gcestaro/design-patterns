package com.github.gcestaro.observer;

import com.github.gcestaro.builder.Product;

public class CreateStockCommand implements ProductCreationObserver {

	@Override
	public void execute(Product product) {
		System.out.println("Creating stock for product " + product.getName());
	}
}
