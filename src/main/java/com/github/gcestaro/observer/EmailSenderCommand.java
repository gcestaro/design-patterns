package com.github.gcestaro.observer;

import com.github.gcestaro.builder.Product;

public class EmailSenderCommand implements ProductCreationObserver {

	@Override
	public void execute(Product product) {
		System.out.println("Sending e-mail");
	}
}
