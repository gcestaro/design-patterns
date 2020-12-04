package com.github.gcestaro.builder;

import static java.util.Objects.requireNonNull;

public class ProductCategory {

	private String name;

	public ProductCategory(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = requireNonNull(name, "Category name is mandatory");
	}
}
