package com.github.gcestaro.state;

public interface OrderState {

	void applyDiscount(Order order);

	void approve(Order order);

	void reprove(Order order);

	void finish(Order order);
}
