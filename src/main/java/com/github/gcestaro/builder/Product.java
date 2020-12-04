package com.github.gcestaro.builder;

import static java.util.Objects.requireNonNull;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.github.gcestaro.observer.ProductCreationObserver;

public class Product {

	private String name;

	private Set<BarCode> barCodes;

	private ProductCategory category;

	private final LocalDate createdAt;

	private Product(String name, Set<BarCode> barCodes, ProductCategory category, LocalDate createdAt) {
		this.name = name;
		this.barCodes = barCodes;
		this.category = category;
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BarCode> getBarCodes() {
		return Collections.unmodifiableSet(barCodes);
	}

	protected void setBarCodes(Set<BarCode> barCodes) {
		this.barCodes = barCodes;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public static ProductBuilder builder() {
		return new ProductBuilder();
	}

	public static class ProductBuilder {

		private String name;

		private Set<BarCode> barCodes = new HashSet<>();

		private ProductCategory category;

		private LocalDate createdAt = LocalDate.now();

		private Set<ProductCreationObserver> creationActions = new LinkedHashSet<>();

		public ProductBuilder runAfterCreation(ProductCreationObserver action) {
			requireNonNull(action, "Action must not be null");
			this.creationActions.add(action);
			return this;
		}

		public ProductBuilder name(String name) {
			this.name = requireNonNull(name, "Name must not be null");
			return this;
		}

		public ProductBuilder category(String name) {
			this.category = new ProductCategory(name);
			return this;
		}

		public ProductBuilder addBarCode(String code) {
			barCodes.add(new BarCode(code));
			return this;
		}

		public ProductBuilder createdAt(LocalDate createdAt) {
			requireNonNull(createdAt, "Creation date must be provided.");

			if (createdAt.isAfter(LocalDate.now())) {
				throw new IllegalArgumentException("Creation date can not be after current date.");
			}

			this.createdAt = createdAt;

			return this;
		}

		public Product build() {
			Product product = new Product(this.name, this.barCodes, this.category, this.createdAt);

			creationActions.forEach(action -> action.execute(product));

			return product;
		}
	}
}
