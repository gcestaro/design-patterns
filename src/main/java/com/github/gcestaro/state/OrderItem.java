package com.github.gcestaro.state;

import java.math.BigDecimal;

public class OrderItem {

	private final Product product;

	private final BigDecimal price;

	protected BigDecimal discount;

	private int quantity;

	public OrderItem(Product product, BigDecimal price) {
		this(product, price, 0, BigDecimal.ZERO);
	}

	public OrderItem(Product product, BigDecimal price, int quantity, BigDecimal discount) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}

	public Product getProduct() {
		return product;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getFinalPrice() {
		return price.subtract(discount);
	}
}
