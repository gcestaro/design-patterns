package com.github.gcestaro.observer;

import com.github.gcestaro.builder.Product;

public class ObserverUsageExample {

	public void example() {
		Product.builder()
				.addBarCode("123234")
				.category("Category A")
				.name("Product A")
				.runAfterCreation(new CreateStockCommand())
				.runAfterCreation(new EmailSenderCommand())
				.build();
	}
}
