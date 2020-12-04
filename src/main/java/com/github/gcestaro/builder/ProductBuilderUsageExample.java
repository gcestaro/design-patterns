package com.github.gcestaro.builder;

public class ProductBuilderUsageExample {

	public void example() {
		Product.builder()
				.addBarCode("1234567890")
				.addBarCode("654321")
				.category("Category A")
				.name("Product ABC")
				.build();
	}

}
