package com.github.gcestaro.state;

import java.math.BigDecimal;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(this.product, this.price, this.discount, this.quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderItem)) {
			return false;
		}

		OrderItem other = (OrderItem) obj;
		return Objects.equals(this.product, other.product)
				&& Objects.equals(this.price, other.price)
				&& Objects.equals(this.discount, other.discount)
				&& Objects.equals(this.quantity, other.quantity);
	}
}
