package com.github.gcestaro.state;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Order {

	protected OrderState state;

	protected final Set<OrderItem> items;

	private final LocalDate createdAt;

	public Order() {
		items = new LinkedHashSet<>();
		state = new PendingState();
		createdAt = LocalDate.now();
	}

	public Set<OrderItem> getItems() {
		return Collections.unmodifiableSet(items);
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void applyDiscount() {
		state.applyDiscount(this);
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public BigDecimal getTotalPrice() {
		return items.stream()
				.map(OrderItem::getFinalPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public void approve() {
		state.approve(this);
	}

	public void reprove() {
		state.reprove(this);
	}

	public void finish() {
		state.finish(this);
	}
}
