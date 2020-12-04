package com.github.gcestaro.state;

public class ReprovedState implements OrderState {

	@Override
	public void applyDiscount(Order order) {
		throw new RuntimeException("This order has been reproved and can not have a discount applied.");
	}

	@Override
	public void approve(Order order) {
		order.state = new ApprovedState();
	}

	@Override
	public void reprove(Order order) {
		throw new RuntimeException("This order has been reproved already.");
	}

	@Override
	public void finish(Order order) {
		order.state = new FinishedState();
	}
}
